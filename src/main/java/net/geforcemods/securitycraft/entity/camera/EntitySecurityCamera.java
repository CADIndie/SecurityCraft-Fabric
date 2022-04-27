package net.geforcemods.securitycraft.entity.camera;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import net.geforcemods.securitycraft.ConfigHandler;
import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.SecurityCraft;
import net.geforcemods.securitycraft.api.IModuleInventory;
import net.geforcemods.securitycraft.blocks.BlockSecurityCamera;
import net.geforcemods.securitycraft.misc.EnumModuleType;
import net.geforcemods.securitycraft.network.client.SetCameraView;
import net.geforcemods.securitycraft.network.server.GiveNightVision;
import net.geforcemods.securitycraft.network.server.SetCameraPowered;
import net.geforcemods.securitycraft.tileentity.TileEntitySecurityCamera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityTrackerEntry;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;

public class EntitySecurityCamera extends Entity {
	protected final float cameraSpeed = ConfigHandler.cameraSpeed;
	public int screenshotSoundCooldown = 0;
	protected int redstoneCooldown = 0;
	protected int toggleNightVisionCooldown = 0;
	protected boolean shouldProvideNightVision = false;
	protected float zoomAmount = 1F;
	protected boolean zooming = false;
	private Ticket chunkTicket;

	public EntitySecurityCamera(World world) {
		super(world);
		noClip = true;
		forceSpawn = true;
		height = 0.0001F;
		width = 0.0001F;
	}

	public EntitySecurityCamera(World world, double x, double y, double z) {
		this(world);

		TileEntity te = world.getTileEntity(new BlockPos(x, y, z));

		if (!(te instanceof TileEntitySecurityCamera)) {
			setDead();
			return;
		}

		TileEntitySecurityCamera cam = (TileEntitySecurityCamera) te;

		x += 0.5D;
		y += 0.5D;
		z += 0.5D;

		if (cam.down)
			y += 0.25D;

		setPosition(x, y, z);
		setInitialPitchYaw(cam);
	}

	public EntitySecurityCamera(World world, double x, double y, double z, EntitySecurityCamera oldCamera) {
		this(world, x, y, z);
		oldCamera.discardCamera();
	}

	private void setInitialPitchYaw(TileEntitySecurityCamera te) {
		rotationPitch = 30F;

		EnumFacing facing = world.getBlockState(new BlockPos(posX, posY, posZ)).getValue(BlockSecurityCamera.FACING);

		if (facing == EnumFacing.NORTH)
			rotationYaw = 180F;
		else if (facing == EnumFacing.WEST)
			rotationYaw = 90F;
		else if (facing == EnumFacing.SOUTH)
			rotationYaw = 0F;
		else if (facing == EnumFacing.EAST)
			rotationYaw = 270F;
		else if (facing == EnumFacing.DOWN)
			rotationPitch = 75F;
	}

	@Override
	protected boolean shouldSetPosAfterLoading() {
		return false;
	}

	@Override
	public void onUpdate() {
		if (world.isRemote) {
			if (screenshotSoundCooldown > 0)
				screenshotSoundCooldown -= 1;

			if (redstoneCooldown > 0)
				redstoneCooldown -= 1;

			if (toggleNightVisionCooldown > 0)
				toggleNightVisionCooldown -= 1;

			if (shouldProvideNightVision)
				SecurityCraft.network.sendToServer(new GiveNightVision());
		}
		else if (world.getBlockState(new BlockPos(posX, posY, posZ)).getBlock() != SCContent.securityCamera)
			setDead();
	}

	public void toggleRedstonePower() {
		BlockPos pos = new BlockPos(posX, posY, posZ);

		if (((IModuleInventory) world.getTileEntity(pos)).hasModule(EnumModuleType.REDSTONE))
			SecurityCraft.network.sendToServer(new SetCameraPowered(pos, !world.getBlockState(pos).getValue(BlockSecurityCamera.POWERED)));
	}

	public void toggleNightVision() {
		toggleNightVisionCooldown = 30;
		shouldProvideNightVision = !shouldProvideNightVision;
	}

	public float getZoomAmount() {
		return zoomAmount;
	}

	public boolean isCameraDown() {
		BlockPos pos = new BlockPos(posX, posY, posZ);

		return world.getTileEntity(pos) instanceof TileEntitySecurityCamera && ((TileEntitySecurityCamera) world.getTileEntity(pos)).down;
	}

	//here to make this method accessible to CameraController
	@Override
	protected void setRotation(float yaw, float pitch) {
		super.setRotation(yaw, pitch);
	}

	public void stopViewing(EntityPlayerMP player) {
		if (!world.isRemote) {
			WorldServer serverWorld = (WorldServer) world;
			BlockPos pos = new BlockPos(posX, posY, posZ);
			Chunk chunk = serverWorld.getChunk(pos);
			ChunkPos chunkPos = chunk.getPos();
			int viewDistance = player.server.getPlayerList().getViewDistance();

			discardCamera();

			for (int cx = chunkPos.x - viewDistance; cx <= chunkPos.x + viewDistance; cx++) {
				for (int cz = chunkPos.z - viewDistance; cz <= chunkPos.z + viewDistance; cz++) {
					serverWorld.getPlayerChunkMap().getOrCreateEntry(cx, cz).removePlayer(player);
				}
			}

			serverWorld.getPlayerChunkMap().addPlayer(player);
			player.spectatingEntity = player;
			SecurityCraft.network.sendTo(new SetCameraView(player), player);
			Executors.newSingleThreadScheduledExecutor().schedule(() -> {
				//update which entities the player is tracking to allow for the correct ones to show up
				for (EntityTrackerEntry entry : serverWorld.getEntityTracker().entries) {
					if (entry.getTrackedEntity() != player)
						entry.updatePlayerEntity(player);
				}
			}, 1, TimeUnit.SECONDS);
		}
	}

	public void discardCamera() {
		if (!world.isRemote) {
			TileEntity te = world.getTileEntity(new BlockPos(posX, posY, posZ));

			if (te instanceof TileEntitySecurityCamera)
				((TileEntitySecurityCamera) te).stopViewing();

			if (chunkTicket != null) {
				ForgeChunkManager.releaseTicket(chunkTicket);
				chunkTicket = null;
			}
		}

		setDead();
	}

	public void setChunkTicket(Ticket chunkTicket) {
		this.chunkTicket = chunkTicket;
	}

	@Override
	protected void entityInit() {}

	@Override
	public void writeEntityToNBT(NBTTagCompound tag) {}

	@Override
	public void readEntityFromNBT(NBTTagCompound tag) {}
}