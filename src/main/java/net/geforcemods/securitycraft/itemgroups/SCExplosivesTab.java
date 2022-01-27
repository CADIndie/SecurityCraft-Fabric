package net.geforcemods.securitycraft.itemgroups;

import net.geforcemods.securitycraft.SCContent;
import net.geforcemods.securitycraft.SecurityCraft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class SCExplosivesTab extends ItemGroup {
	public SCExplosivesTab() {
		super(SecurityCraft.MODID);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack makeIcon() {
		return new ItemStack(SCContent.MINE.get().asItem());
	}

	@Override
	public String getLangId() {
		return super.getLangId() + ".explosives";
	}
}