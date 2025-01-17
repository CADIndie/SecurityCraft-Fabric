package net.geforcemods.securitycraft.blockentities;

import java.util.function.Consumer;

import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.api.INameSetter;
import net.geforcemods.securitycraft.api.IPasswordProtected;
import net.geforcemods.securitycraft.api.Option;
import net.geforcemods.securitycraft.api.Option.SmartModuleCooldownOption;
import net.geforcemods.securitycraft.blocks.KeypadDoorBlock;
import net.geforcemods.securitycraft.misc.ModuleType;
import net.geforcemods.securitycraft.util.Utils;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;

public class KeypadDoorBlockEntity extends SpecialDoorBlockEntity implements IPasswordProtected {
	private SmartModuleCooldownOption smartModuleCooldown = new SmartModuleCooldownOption(this::getBlockPos);
	private long cooldownEnd = 0;
	private String passcode;

	public KeypadDoorBlockEntity(BlockPos pos, BlockState state) {
		super(SCContent.KEYPAD_DOOR_BLOCK_ENTITY.get(), pos, state);
	}

	@Override
	public void saveAdditional(CompoundTag tag) {
		super.saveAdditional(tag);

		if (passcode != null && !passcode.isEmpty())
			tag.putString("passcode", passcode);

		tag.putLong("cooldownLeft", getCooldownEnd() - System.currentTimeMillis());
	}

	@Override
	public void load(CompoundTag tag) {
		super.load(tag);

		passcode = tag.getString("passcode");
		cooldownEnd = System.currentTimeMillis() + tag.getLong("cooldownLeft");
	}

	@Override
	public void activate(Player player) {
		if (!level.isClientSide && getBlockState().getBlock() instanceof KeypadDoorBlock block)
			block.activate(getBlockState(), level, worldPosition, player, getSignalLength());
	}

	@Override
	public boolean shouldAttemptCodebreak(BlockState state, Player player) {
		if (isDisabled()) {
			player.displayClientMessage(Utils.localize("gui.securitycraft:scManual.disabled"), true);
			return false;
		}

		return !state.getValue(DoorBlock.OPEN) && IPasswordProtected.super.shouldAttemptCodebreak(state, player);
	}

	@Override
	public String getPassword() {
		return (passcode != null && !passcode.isEmpty()) ? passcode : null;
	}

	@Override
	public void setPassword(String password) {
		passcode = password;
		runForOtherHalf(otherHalf -> otherHalf.setPasswordExclusively(password));
		setChanged();
	}

	//only set the password for this door half
	public void setPasswordExclusively(String password) {
		passcode = password;
		setChanged();
	}

	@Override
	public void startCooldown() {
		long start = System.currentTimeMillis();

		startCooldown(start);
		runForOtherHalf(otherHalf -> otherHalf.startCooldown(start));
	}

	public void startCooldown(long start) {
		if (!isOnCooldown()) {
			cooldownEnd = start + smartModuleCooldown.get() * 50;
			level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), 2);
			setChanged();
		}
	}

	@Override
	public long getCooldownEnd() {
		return cooldownEnd;
	}

	@Override
	public boolean isOnCooldown() {
		return System.currentTimeMillis() < getCooldownEnd();
	}

	@Override
	public ModuleType[] acceptedModules() {
		return new ModuleType[] {
				ModuleType.ALLOWLIST, ModuleType.DENYLIST, ModuleType.SMART, ModuleType.HARMING
		};
	}

	@Override
	public Option<?>[] customOptions() {
		return new Option[] {
				sendMessage, signalLength, disabled, smartModuleCooldown
		};
	}

	@Override
	public int defaultSignalLength() {
		return 60;
	}

	@Override
	public void setCustomName(Component customName) {
		super.setCustomName(customName);

		if (getBlockState().getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER)
			((INameSetter) level.getBlockEntity(worldPosition.above())).setCustomName(customName);
	}

	public void runForOtherHalf(Consumer<KeypadDoorBlockEntity> action) {
		BlockEntity be = null;

		if (getBlockState().getValue(DoorBlock.HALF) == DoubleBlockHalf.LOWER)
			be = level.getBlockEntity(worldPosition.above());
		else if (getBlockState().getValue(DoorBlock.HALF) == DoubleBlockHalf.UPPER)
			be = level.getBlockEntity(worldPosition.below());

		if (be instanceof KeypadDoorBlockEntity otherHalf)
			action.accept(otherHalf);
	}
}
