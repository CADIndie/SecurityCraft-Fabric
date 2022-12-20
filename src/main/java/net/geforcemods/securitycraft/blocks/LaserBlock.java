package net.geforcemods.securitycraft.blocks;

import java.util.Random;

import net.geforcemods.securitycraft.ConfigHandler;
import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.api.IOwnable;
import net.geforcemods.securitycraft.api.LinkableBlockEntity;
import net.geforcemods.securitycraft.blockentities.LaserBlockBlockEntity;
import net.geforcemods.securitycraft.misc.ModuleType;
import net.geforcemods.securitycraft.util.BlockUtils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class LaserBlock extends DisguisableBlock {
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

	public LaserBlock(Block.Properties properties) {
		super(properties);
		registerDefaultState(stateDefinition.any().setValue(POWERED, false).setValue(WATERLOGGED, false));
	}

	@Override
	public void setPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack) {
		super.setPlacedBy(world, pos, state, entity, stack);

		if (!world.isClientSide)
			setLaser(world, pos);
	}

	public void setLaser(World world, BlockPos pos) {
		LaserBlockBlockEntity thisTe = (LaserBlockBlockEntity) world.getBlockEntity(pos);

		for (Direction facing : Direction.values()) {
			int boundType = facing == Direction.UP || facing == Direction.DOWN ? 1 : (facing == Direction.NORTH || facing == Direction.SOUTH ? 2 : 3);

			inner: for (int i = 1; i <= ConfigHandler.SERVER.laserBlockRange.get(); i++) {
				BlockPos offsetPos = pos.relative(facing, i);
				BlockState offsetState = world.getBlockState(offsetPos);
				Block offsetBlock = offsetState.getBlock();

				if (!offsetState.isAir(world, offsetPos) && !offsetState.getMaterial().isReplaceable() && offsetBlock != SCContent.LASER_BLOCK.get())
					break inner;
				else if (offsetBlock == SCContent.LASER_BLOCK.get()) {
					LaserBlockBlockEntity thatTe = (LaserBlockBlockEntity) world.getBlockEntity(offsetPos);

					if (thisTe.getOwner().owns(thatTe)) {
						LinkableBlockEntity.link(thisTe, thatTe);

						for (ModuleType type : thatTe.getInsertedModules()) {
							thisTe.insertModule(thatTe.getModule(type), false);
						}

						if (thisTe.isEnabled() && thatTe.isEnabled()) {
							for (int j = 1; j < i; j++) {
								offsetPos = pos.relative(facing, j);
								offsetState = world.getBlockState(offsetPos);

								if (offsetState.isAir(world, offsetPos) || offsetState.getMaterial().isReplaceable()) {
									world.setBlockAndUpdate(offsetPos, SCContent.LASER_FIELD.get().defaultBlockState().setValue(LaserFieldBlock.BOUNDTYPE, boundType));

									TileEntity te = world.getBlockEntity(offsetPos);

									if (te instanceof IOwnable)
										((IOwnable) te).setOwner(thisTe.getOwner().getUUID(), thisTe.getOwner().getName());
								}
							}
						}
					}

					break inner;
				}
			}
		}
	}

	@Override
	public void destroy(IWorld world, BlockPos pos, BlockState state) {
		if (!world.isClientSide())
			destroyAdjacentLasers(world, pos);
	}

	public static void destroyAdjacentLasers(IWorld world, BlockPos pos) {
		BlockUtils.destroyInSequence(SCContent.LASER_FIELD.get(), world, pos, Direction.values());
	}

	@Override
	public void neighborChanged(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean flag) {
		setLaser(world, pos);
	}

	@Override
	public boolean isSignalSource(BlockState state) {
		return true;
	}

	@Override
	public boolean shouldCheckWeakPower(BlockState state, IWorldReader world, BlockPos pos, Direction side) {
		return false;
	}

	@Override
	public int getSignal(BlockState state, IBlockReader level, BlockPos pos, Direction side) {
		if (state.getValue(POWERED)) {
			TileEntity te = level.getBlockEntity(pos);

			if (te instanceof LaserBlockBlockEntity && ((LaserBlockBlockEntity) te).isModuleEnabled(ModuleType.REDSTONE))
				return 15;
		}

		return 0;
	}

	@Override
	public int getDirectSignal(BlockState state, IBlockReader level, BlockPos pos, Direction side) {
		return getSignal(state, level, pos, side);
	}

	@Override
	public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (!world.isClientSide && state.getValue(POWERED)) {
			world.setBlockAndUpdate(pos, state.setValue(POWERED, false));
			BlockUtils.updateIndirectNeighbors(world, pos, SCContent.LASER_BLOCK.get());
		}
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void animateTick(BlockState state, World world, BlockPos pos, Random rand) {
		if (state.getValue(POWERED)) {
			double x = pos.getX() + 0.5F + (rand.nextFloat() - 0.5F) * 0.2D;
			double y = pos.getY() + 0.7F + (rand.nextFloat() - 0.5F) * 0.2D;
			double z = pos.getZ() + 0.5F + (rand.nextFloat() - 0.5F) * 0.2D;
			double magicNumber1 = 0.2199999988079071D;
			double magicNumber2 = 0.27000001072883606D;
			float f1 = 0.6F + 0.4F;
			float f2 = Math.max(0.0F, 0.7F - 0.5F);
			float f3 = Math.max(0.0F, 0.6F - 0.7F);

			world.addParticle(new RedstoneParticleData(f1, f2, f3, 1), false, x - magicNumber2, y + magicNumber1, z, 0.0D, 0.0D, 0.0D);
			world.addParticle(new RedstoneParticleData(f1, f2, f3, 1), false, x + magicNumber2, y + magicNumber1, z, 0.0D, 0.0D, 0.0D);
			world.addParticle(new RedstoneParticleData(f1, f2, f3, 1), false, x, y + magicNumber1, z - magicNumber2, 0.0D, 0.0D, 0.0D);
			world.addParticle(new RedstoneParticleData(f1, f2, f3, 1), false, x, y + magicNumber1, z + magicNumber2, 0.0D, 0.0D, 0.0D);
			world.addParticle(new RedstoneParticleData(f1, f2, f3, 1), false, x, y, z, 0.0D, 0.0D, 0.0D);
		}
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(POWERED, WATERLOGGED);
	}

	@Override
	public TileEntity createTileEntity(BlockState state, IBlockReader world) {
		return new LaserBlockBlockEntity();
	}
}
