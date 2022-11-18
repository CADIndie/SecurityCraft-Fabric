package net.geforcemods.securitycraft.blocks.reinforced;

import java.util.function.Supplier;

import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.SCTags;
import net.geforcemods.securitycraft.blocks.OwnableBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BreakableBlock;
import net.minecraft.block.BushBlock;
import net.minecraft.block.DeadBushBlock;
import net.minecraft.block.FungusBlock;
import net.minecraft.block.LilyPadBlock;
import net.minecraft.block.NetherRootsBlock;
import net.minecraft.block.NetherSproutsBlock;
import net.minecraft.block.WitherRoseBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class BaseReinforcedBlock extends OwnableBlock implements IReinforcedBlock {
	private final Supplier<Block> vanillaBlockSupplier;

	public BaseReinforcedBlock(Block.Properties properties, Block vB) {
		this(properties, () -> vB);
	}

	public BaseReinforcedBlock(Block.Properties properties, Supplier<Block> vB) {
		super(properties);

		vanillaBlockSupplier = vB;
	}

	@Override
	public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
		BlockState plant = plantable.getPlant(world, pos.relative(facing));
		PlantType type = plantable.getPlantType(world, pos.relative(facing));

		if (super.canSustainPlant(state, world, pos, facing, plantable))
			return true;

		if (plant.getBlock() == Blocks.CACTUS)
			return this == SCContent.REINFORCED_SAND.get() || this == SCContent.REINFORCED_RED_SAND.get();

		if (plantable instanceof BushBlock) { //a nasty workaround because BaseReinforcedBlock can't use BushBlock#mayPlaceOn because it is protected
			boolean bushCondition = state.is(SCContent.REINFORCED_GRASS_BLOCK.get()) || state.is(SCContent.REINFORCED_DIRT.get()) || state.is(SCContent.REINFORCED_COARSE_DIRT.get()) || state.is(SCContent.REINFORCED_PODZOL.get());
			boolean condition = false;

			if (plantable instanceof NetherSproutsBlock || plantable instanceof NetherRootsBlock)
				condition = state.is(SCContent.REINFORCED_SOUL_SOIL.get()) || bushCondition;
			else if (plantable instanceof FungusBlock)
				condition = state.is(SCContent.REINFORCED_MYCELIUM.get()) || state.is(SCContent.REINFORCED_SOUL_SOIL.get()) || bushCondition;
			else if (plantable instanceof LilyPadBlock)
				condition = world.getFluidState(pos).getType() == SCContent.FAKE_WATER.get() && world.getFluidState(pos.above()).getType() == Fluids.EMPTY;
			else if (plantable instanceof WitherRoseBlock)
				condition = state.is(SCContent.REINFORCED_NETHERRACK.get()) || state.is(SCContent.REINFORCED_SOUL_SOIL.get()) || bushCondition;
			else if (plantable instanceof DeadBushBlock)
				condition = state.is(SCTags.Blocks.REINFORCED_SAND) || state.is(SCContent.REINFORCED_TERRACOTTA.get()) || state.is(SCTags.Blocks.REINFORCED_TERRACOTTA) || state.is(SCContent.REINFORCED_DIRT.get()) || state.is(SCContent.REINFORCED_COARSE_DIRT.get()) || state.is(SCContent.REINFORCED_PODZOL.get());

			if (condition)
				return true;
		}

		if (PlantType.DESERT.equals(type))
			return this == SCContent.REINFORCED_SAND.get() || this == SCContent.REINFORCED_TERRACOTTA.get() || this instanceof ReinforcedGlazedTerracottaBlock;
		else if (PlantType.PLAINS.equals(type))
			return state.is(SCTags.Blocks.REINFORCED_DIRT);
		else if (type == PlantType.BEACH) {
			boolean isBeach = state.is(SCTags.Blocks.REINFORCED_DIRT) || state.is(SCTags.Blocks.REINFORCED_SAND);
			boolean hasWater = false;

			for (Direction face : Direction.Plane.HORIZONTAL) {
				BlockState blockState = world.getBlockState(pos.relative(face));
				FluidState fluidState = world.getFluidState(pos.relative(face));

				hasWater |= blockState.is(Blocks.FROSTED_ICE);
				hasWater |= fluidState.is(FluidTags.WATER);

				if (hasWater)
					break; //No point continuing.
			}
			return isBeach && hasWater;
		}
		return false;
	}

	@Override
	public boolean isConduitFrame(BlockState state, IWorldReader world, BlockPos pos, BlockPos conduit) {
		return this == SCContent.REINFORCED_PRISMARINE.get() || this == SCContent.REINFORCED_PRISMARINE_BRICKS.get() || this == SCContent.REINFORCED_SEA_LANTERN.get() || this == SCContent.REINFORCED_DARK_PRISMARINE.get();
	}

	@Override
	public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
		if (this.getVanillaBlock() instanceof BreakableBlock)
			return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);

		return false;
	}

	@Override
	public Block getVanillaBlock() {
		return vanillaBlockSupplier.get();
	}
}
