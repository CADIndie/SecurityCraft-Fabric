package net.geforcemods.securitycraft.renderers;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Quaternion;
import com.mojang.math.Vector3f;

import net.geforcemods.securitycraft.ClientHandler;
import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.blockentities.SecurityCameraBlockEntity;
import net.geforcemods.securitycraft.blocks.SecurityCameraBlock;
import net.geforcemods.securitycraft.models.SecurityCameraModel;
import net.geforcemods.securitycraft.util.PlayerUtils;
import net.minecraft.client.CameraType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SecurityCameraRenderer implements BlockEntityRenderer<SecurityCameraBlockEntity> {

	private static final Quaternion POSITIVE_Y_180 = Vector3f.YP.rotationDegrees(180.0F);
	private static final Quaternion POSITIVE_Y_90 = Vector3f.YP.rotationDegrees(90.0F);
	private static final Quaternion NEGATIVE_Y_90 = Vector3f.YN.rotationDegrees(90.0F);
	private static final Quaternion POSITIVE_X_180 = Vector3f.XP.rotationDegrees(180.0F);
	private static final ResourceLocation TEXTURE = new ResourceLocation("securitycraft:textures/block/security_camera.png");
	private static final ResourceLocation BEING_VIEWED_TEXTURE = new ResourceLocation("securitycraft:textures/block/security_camera_viewing.png");
	private final SecurityCameraModel model;

	public SecurityCameraRenderer(BlockEntityRendererProvider.Context ctx)
	{
		model = new SecurityCameraModel(ctx.bakeLayer(ClientHandler.SECURITY_CAMERA_LOCATION));
	}

	@Override
	public void render(SecurityCameraBlockEntity te, float partialTicks, PoseStack matrix, MultiBufferSource buffer, int packedLight, int packedOverlay)
	{
		if(te.down || (Minecraft.getInstance().options.getCameraType() == CameraType.FIRST_PERSON && PlayerUtils.isPlayerMountedOnCamera(Minecraft.getInstance().player) && Minecraft.getInstance().cameraEntity.blockPosition().equals(te.getBlockPos())))
			return;

		matrix.translate(0.5D, 1.5D, 0.5D);

		if(te.hasLevel())
		{
			BlockState state = te.getLevel().getBlockState(te.getBlockPos());

			if(state.getBlock() == SCContent.SECURITY_CAMERA.get())
			{
				Direction side = state.getValue(SecurityCameraBlock.FACING);

				if(side == Direction.NORTH)
					matrix.mulPose(POSITIVE_Y_180);
				else if(side == Direction.EAST)
					matrix.mulPose(POSITIVE_Y_90);
				else if(side == Direction.WEST)
					matrix.mulPose(NEGATIVE_Y_90);
			}
		}

		matrix.mulPose(POSITIVE_X_180);
		model.cameraRotationPoint.yRot = (float)te.cameraRotation;
		model.renderToBuffer(matrix, buffer.getBuffer(RenderType.entitySolid(te.getBlockState().getValue(SecurityCameraBlock.BEING_VIEWED) ? BEING_VIEWED_TEXTURE : TEXTURE)), packedLight, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
	}
}
