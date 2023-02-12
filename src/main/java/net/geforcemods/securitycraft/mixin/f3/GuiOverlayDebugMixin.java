package net.geforcemods.securitycraft.mixin.f3;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import net.geforcemods.securitycraft.blocks.DisguisableBlock;
import net.geforcemods.securitycraft.blocks.mines.BaseFullMineBlock;
import net.geforcemods.securitycraft.blocks.mines.FurnaceMineBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiOverlayDebug;
import net.minecraft.init.Blocks;

@Mixin(GuiOverlayDebug.class)
public class GuiOverlayDebugMixin {
	@ModifyVariable(method = "getDebugInfoRight", at = @At(value = "INVOKE_ASSIGN", target = "Lnet/minecraft/client/multiplayer/WorldClient;getBlockState(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/block/state/IBlockState;"))
	public IBlockState spoofBlockState(IBlockState originalState) {
		Block originalBlock = originalState.getBlock();

		if (originalBlock instanceof DisguisableBlock) {
			IBlockState disguisedState = ((DisguisableBlock) originalBlock).getDisguisedBlockState(Minecraft.getMinecraft().world, Minecraft.getMinecraft().objectMouseOver.getBlockPos());

			return disguisedState != null ? disguisedState : originalState;
		}
		else if (originalBlock instanceof BaseFullMineBlock)
			return ((BaseFullMineBlock) originalBlock).getBlockDisguisedAs().getDefaultState();
		else if (originalBlock instanceof FurnaceMineBlock)
			return Blocks.FURNACE.getDefaultState().withProperty(BlockFurnace.FACING, originalState.getValue(BlockFurnace.FACING));

		return originalState;
	}
}