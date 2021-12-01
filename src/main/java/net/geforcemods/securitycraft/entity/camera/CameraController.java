package net.geforcemods.securitycraft.entity.camera;

import net.geforcemods.securitycraft.SecurityCraft;
import net.geforcemods.securitycraft.blocks.BlockSecurityCamera;
import net.geforcemods.securitycraft.misc.KeyBindings;
import net.geforcemods.securitycraft.misc.SCSounds;
import net.geforcemods.securitycraft.network.server.DismountCamera;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.client.CPacketPlayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(modid=SecurityCraft.MODID, value=Side.CLIENT)
public class CameraController
{
	public static int previousCameraType;

	@SubscribeEvent
	public static void onClientTick(ClientTickEvent event)
	{
		Entity renderViewEntity = Minecraft.getMinecraft().getRenderViewEntity();

		if(renderViewEntity instanceof EntitySecurityCamera)
		{
			EntitySecurityCamera cam = (EntitySecurityCamera)renderViewEntity;
			GameSettings options = Minecraft.getMinecraft().gameSettings;

			if(event.phase == Phase.START && options.keyBindSneak.isKeyDown())
			{
				dismount();
				KeyBinding.setKeyBindState(options.keyBindSneak.getKeyCode(), false);
			}
			else if(event.phase == Phase.END)
			{
				if(options.keyBindForward.isKeyDown())
					moveViewUp(cam);

				if(options.keyBindBack.isKeyDown())
					moveViewDown(cam);

				if(options.keyBindLeft.isKeyDown())
					moveViewHorizontally(cam, cam.rotationYaw, cam.rotationYaw - cam.cameraSpeed * cam.zoomAmount);

				if(options.keyBindRight.isKeyDown())
					moveViewHorizontally(cam, cam.rotationYaw, cam.rotationYaw + cam.cameraSpeed * cam.zoomAmount);

				if(KeyBindings.cameraZoomIn.isKeyDown())
					zoomIn(cam);
				else if(KeyBindings.cameraZoomOut.isKeyDown())
					zoomOut(cam);
				else
					cam.zooming = false;

				if(KeyBindings.cameraEmitRedstone.isPressed())
					emitRedstone(cam);

				if(KeyBindings.cameraActivateNightVision.isPressed())
					giveNightVision(cam);

				//update other players with the head rotation
				EntityPlayerSP player = Minecraft.getMinecraft().player;
				double yRotChange = player.rotationYaw - player.lastReportedYaw;
				double xRotChange = player.rotationPitch - player.lastReportedPitch;

				if(yRotChange != 0.0D || xRotChange != 0.0D)
					player.connection.sendPacket(new CPacketPlayer.Rotation(player.rotationYaw, player.rotationPitch, player.onGround));
			}
		}
	}

	private static void dismount()
	{
		SecurityCraft.network.sendToServer(new DismountCamera());
	}

	public static void moveViewUp(EntitySecurityCamera cam)
	{
		float next = cam.rotationPitch - cam.cameraSpeed * cam.zoomAmount;

		if(cam.isCameraDown())
		{
			if(next > 40F)
				cam.setRotation(cam.rotationYaw, next);
		}
		else if(next > -25F)
			cam.setRotation(cam.rotationYaw, next);
	}

	public static void moveViewDown(EntitySecurityCamera cam)
	{
		float next = cam.rotationPitch + cam.cameraSpeed * cam.zoomAmount;

		if(cam.isCameraDown())
		{
			if(next < 90F)
				cam.setRotation(cam.rotationYaw, next);
		}
		else if(next < 60F)
			cam.setRotation(cam.rotationYaw, next);
	}

	public static void moveViewHorizontally(EntitySecurityCamera cam, float yRot, float next)
	{
		IBlockState state = cam.world.getBlockState(new BlockPos(cam.posX, cam.posY, cam.posZ));

		if (state.getProperties().containsKey(BlockSecurityCamera.FACING)) {
			float checkNext = next;

			if(checkNext < 0)
				checkNext += 360;

			boolean shouldSetRotation = false;

			switch(state.getValue(BlockSecurityCamera.FACING)) {
				case NORTH: shouldSetRotation = checkNext > 90F && checkNext < 270F; break;
				case SOUTH: shouldSetRotation = checkNext > 270F || checkNext < 90F; break;
				case EAST: shouldSetRotation = checkNext > 180F && checkNext < 360F; break;
				case WEST: shouldSetRotation = checkNext > 0F && checkNext < 180F; break;
				case DOWN: shouldSetRotation = true; break;
				default: shouldSetRotation = false; break;
			}

			if(shouldSetRotation)
				cam.rotationYaw = next;
		}
	}

	public static void zoomIn(EntitySecurityCamera cam)
	{
		if(!cam.zooming)
			Minecraft.getMinecraft().world.playSound(new BlockPos(cam.posX, cam.posY, cam.posZ), SCSounds.CAMERAZOOMIN.event, SoundCategory.BLOCKS, 1.0F, 1.0F, true);

		cam.zooming = true;
		cam.zoomAmount = Math.max(cam.zoomAmount - 0.1F, 0.1F);
	}

	public static void zoomOut(EntitySecurityCamera cam)
	{
		if(!cam.zooming)
			Minecraft.getMinecraft().world.playSound(new BlockPos(cam.posX, cam.posY, cam.posZ), SCSounds.CAMERAZOOMIN.event, SoundCategory.BLOCKS, 1.0F, 1.0F, true);

		cam.zooming = true;
		cam.zoomAmount = Math.min(cam.zoomAmount + 0.1F, 1.4F);
	}

	public static void emitRedstone(EntitySecurityCamera cam)
	{
		if(cam.redstoneCooldown == 0)
		{
			cam.toggleRedstonePower();
			cam.redstoneCooldown = 30;
		}
	}

	public static void giveNightVision(EntitySecurityCamera cam)
	{
		if(cam.toggleNightVisionCooldown == 0)
			cam.toggleNightVision();
	}
}
