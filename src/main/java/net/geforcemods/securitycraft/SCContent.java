package net.geforcemods.securitycraft;

import net.geforcemods.securitycraft.api.NamedBlockEntity;
import net.geforcemods.securitycraft.api.OwnableBlockEntity;
import net.geforcemods.securitycraft.blockentities.AlarmBlockEntity;
import net.geforcemods.securitycraft.blockentities.AllowlistOnlyBlockEntity;
import net.geforcemods.securitycraft.blockentities.BlockPocketBlockEntity;
import net.geforcemods.securitycraft.blockentities.BlockPocketManagerBlockEntity;
import net.geforcemods.securitycraft.blockentities.CageTrapBlockEntity;
import net.geforcemods.securitycraft.blockentities.ClaymoreBlockEntity;
import net.geforcemods.securitycraft.blockentities.IMSBlockEntity;
import net.geforcemods.securitycraft.blockentities.InventoryScannerBlockEntity;
import net.geforcemods.securitycraft.blockentities.KeyPanelBlockEntity;
import net.geforcemods.securitycraft.blockentities.KeycardReaderBlockEntity;
import net.geforcemods.securitycraft.blockentities.KeypadBlastFurnaceBlockEntity;
import net.geforcemods.securitycraft.blockentities.KeypadBlockEntity;
import net.geforcemods.securitycraft.blockentities.KeypadChestBlockEntity;
import net.geforcemods.securitycraft.blockentities.KeypadDoorBlockEntity;
import net.geforcemods.securitycraft.blockentities.KeypadFurnaceBlockEntity;
import net.geforcemods.securitycraft.blockentities.KeypadSmokerBlockEntity;
import net.geforcemods.securitycraft.blockentities.LaserBlockBlockEntity;
import net.geforcemods.securitycraft.blockentities.MotionActivatedLightBlockEntity;
import net.geforcemods.securitycraft.blockentities.PortableRadarBlockEntity;
import net.geforcemods.securitycraft.blockentities.ProjectorBlockEntity;
import net.geforcemods.securitycraft.blockentities.ProtectoBlockEntity;
import net.geforcemods.securitycraft.blockentities.ReinforcedCauldronBlockEntity;
import net.geforcemods.securitycraft.blockentities.ReinforcedHopperBlockEntity;
import net.geforcemods.securitycraft.blockentities.ReinforcedIronBarsBlockEntity;
import net.geforcemods.securitycraft.blockentities.ReinforcedPistonMovingBlockEntity;
import net.geforcemods.securitycraft.blockentities.RetinalScannerBlockEntity;
import net.geforcemods.securitycraft.blockentities.ScannerDoorBlockEntity;
import net.geforcemods.securitycraft.blockentities.SecretSignBlockEntity;
import net.geforcemods.securitycraft.blockentities.SecurityCameraBlockEntity;
import net.geforcemods.securitycraft.blockentities.SonicSecuritySystemBlockEntity;
import net.geforcemods.securitycraft.blockentities.TrackMineBlockEntity;
import net.geforcemods.securitycraft.blockentities.TrophySystemBlockEntity;
import net.geforcemods.securitycraft.blockentities.UsernameLoggerBlockEntity;
import net.geforcemods.securitycraft.blockentities.ValidationOwnableBlockEntity;
import net.geforcemods.securitycraft.blocks.AbstractKeypadFurnaceBlock;
import net.geforcemods.securitycraft.blocks.AlarmBlock;
import net.geforcemods.securitycraft.blocks.BlockPocketBlock;
import net.geforcemods.securitycraft.blocks.BlockPocketManagerBlock;
import net.geforcemods.securitycraft.blocks.BlockPocketWallBlock;
import net.geforcemods.securitycraft.blocks.CageTrapBlock;
import net.geforcemods.securitycraft.blocks.DisguisableBlock;
import net.geforcemods.securitycraft.blocks.FakeLavaBlock;
import net.geforcemods.securitycraft.blocks.FakeWaterBlock;
import net.geforcemods.securitycraft.blocks.FrameBlock;
import net.geforcemods.securitycraft.blocks.InventoryScannerBlock;
import net.geforcemods.securitycraft.blocks.InventoryScannerFieldBlock;
import net.geforcemods.securitycraft.blocks.IronFenceBlock;
import net.geforcemods.securitycraft.blocks.KeyPanelBlock;
import net.geforcemods.securitycraft.blocks.KeycardReaderBlock;
import net.geforcemods.securitycraft.blocks.KeypadBlastFurnaceBlock;
import net.geforcemods.securitycraft.blocks.KeypadBlock;
import net.geforcemods.securitycraft.blocks.KeypadChestBlock;
import net.geforcemods.securitycraft.blocks.KeypadDoorBlock;
import net.geforcemods.securitycraft.blocks.KeypadFurnaceBlock;
import net.geforcemods.securitycraft.blocks.KeypadSmokerBlock;
import net.geforcemods.securitycraft.blocks.LaserBlock;
import net.geforcemods.securitycraft.blocks.LaserFieldBlock;
import net.geforcemods.securitycraft.blocks.MotionActivatedLightBlock;
import net.geforcemods.securitycraft.blocks.PanicButtonBlock;
import net.geforcemods.securitycraft.blocks.PortableRadarBlock;
import net.geforcemods.securitycraft.blocks.ProjectorBlock;
import net.geforcemods.securitycraft.blocks.ProtectoBlock;
import net.geforcemods.securitycraft.blocks.RetinalScannerBlock;
import net.geforcemods.securitycraft.blocks.ScannerDoorBlock;
import net.geforcemods.securitycraft.blocks.SecretStandingSignBlock;
import net.geforcemods.securitycraft.blocks.SecretWallSignBlock;
import net.geforcemods.securitycraft.blocks.SecurityCameraBlock;
import net.geforcemods.securitycraft.blocks.SonicSecuritySystemBlock;
import net.geforcemods.securitycraft.blocks.TrophySystemBlock;
import net.geforcemods.securitycraft.blocks.UsernameLoggerBlock;
import net.geforcemods.securitycraft.blocks.mines.BaseFullMineBlock;
import net.geforcemods.securitycraft.blocks.mines.BouncingBettyBlock;
import net.geforcemods.securitycraft.blocks.mines.ClaymoreBlock;
import net.geforcemods.securitycraft.blocks.mines.DeepslateMineBlock;
import net.geforcemods.securitycraft.blocks.mines.FallingBlockMineBlock;
import net.geforcemods.securitycraft.blocks.mines.FurnaceMineBlock;
import net.geforcemods.securitycraft.blocks.mines.IMSBlock;
import net.geforcemods.securitycraft.blocks.mines.MineBlock;
import net.geforcemods.securitycraft.blocks.mines.RedstoneOreMineBlock;
import net.geforcemods.securitycraft.blocks.mines.TrackMineBlock;
import net.geforcemods.securitycraft.blocks.reinforced.BaseReinforcedBlock;
import net.geforcemods.securitycraft.blocks.reinforced.HorizontalReinforcedIronBars;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedAmethystBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedBookshelfBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedButtonBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedCarpetBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedCauldronBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedCauldronBlock.IReinforcedCauldronInteraction;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedChainBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedCobwebBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedCryingObsidianBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedDirtPathBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedDoorBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedFallingBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedFenceGateBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedGlassBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedHopperBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedIceBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedIronBarsBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedIronTrapDoorBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedLanternBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedLavaCauldronBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedLayeredCauldronBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedLeverBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedMovingPistonBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedNyliumBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedObserverBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedObsidianBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedPaneBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedPistonBaseBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedPistonHeadBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedPressurePlateBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedRedstoneBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedRedstoneLampBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedRootedDirtBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedRotatedCrystalQuartzPillar;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedRotatedPillarBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedSlabBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedSnowyDirtBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedStainedGlassBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedStainedGlassPaneBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedStairsBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedTintedGlassBlock;
import net.geforcemods.securitycraft.blocks.reinforced.ReinforcedWallBlock;
import net.geforcemods.securitycraft.entity.BouncingBetty;
import net.geforcemods.securitycraft.entity.Bullet;
import net.geforcemods.securitycraft.entity.IMSBomb;
import net.geforcemods.securitycraft.entity.Sentry;
import net.geforcemods.securitycraft.entity.camera.SecurityCamera;
import net.geforcemods.securitycraft.fluids.FakeLavaFluid;
import net.geforcemods.securitycraft.fluids.FakeWaterFluid;
import net.geforcemods.securitycraft.inventory.BlockPocketManagerMenu;
import net.geforcemods.securitycraft.inventory.BlockReinforcerMenu;
import net.geforcemods.securitycraft.inventory.BriefcaseMenu;
import net.geforcemods.securitycraft.inventory.CustomizeBlockMenu;
import net.geforcemods.securitycraft.inventory.DisguiseModuleMenu;
import net.geforcemods.securitycraft.inventory.GenericMenu;
import net.geforcemods.securitycraft.inventory.GenericTEMenu;
import net.geforcemods.securitycraft.inventory.InventoryScannerMenu;
import net.geforcemods.securitycraft.inventory.KeycardReaderMenu;
import net.geforcemods.securitycraft.inventory.KeypadBlastFurnaceMenu;
import net.geforcemods.securitycraft.inventory.KeypadFurnaceMenu;
import net.geforcemods.securitycraft.inventory.KeypadSmokerMenu;
import net.geforcemods.securitycraft.inventory.ProjectorMenu;
import net.geforcemods.securitycraft.items.AdminToolItem;
import net.geforcemods.securitycraft.items.BriefcaseItem;
import net.geforcemods.securitycraft.items.CameraMonitorItem;
import net.geforcemods.securitycraft.items.CodebreakerItem;
import net.geforcemods.securitycraft.items.FakeLiquidBucketItem;
import net.geforcemods.securitycraft.items.KeyPanelItem;
import net.geforcemods.securitycraft.items.KeycardItem;
import net.geforcemods.securitycraft.items.KeypadChestItem;
import net.geforcemods.securitycraft.items.MineRemoteAccessToolItem;
import net.geforcemods.securitycraft.items.ModuleItem;
import net.geforcemods.securitycraft.items.PortableTunePlayerItem;
import net.geforcemods.securitycraft.items.ReinforcedDoorItem;
import net.geforcemods.securitycraft.items.SCManualItem;
import net.geforcemods.securitycraft.items.SecretSignItem;
import net.geforcemods.securitycraft.items.SentryItem;
import net.geforcemods.securitycraft.items.SentryRemoteAccessToolItem;
import net.geforcemods.securitycraft.items.SonicSecuritySystemItem;
import net.geforcemods.securitycraft.items.SpecialDoorItem;
import net.geforcemods.securitycraft.items.TaserItem;
import net.geforcemods.securitycraft.items.UniversalBlockModifierItem;
import net.geforcemods.securitycraft.items.UniversalBlockReinforcerItem;
import net.geforcemods.securitycraft.items.UniversalBlockRemoverItem;
import net.geforcemods.securitycraft.items.UniversalKeyChangerItem;
import net.geforcemods.securitycraft.items.UniversalOwnerChangerItem;
import net.geforcemods.securitycraft.misc.ModuleType;
import net.geforcemods.securitycraft.util.HasManualPage;
import net.geforcemods.securitycraft.util.OwnableBE;
import net.geforcemods.securitycraft.util.RegisterItemBlock;
import net.geforcemods.securitycraft.util.RegisterItemBlock.SCItemGroup;
import net.geforcemods.securitycraft.util.Reinforced;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LayeredCauldronBlock;
import net.minecraft.world.level.block.PressurePlateBlock.Sensitivity;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.piston.PistonBaseBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;

public class SCContent {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SecurityCraft.MODID);
	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, SecurityCraft.MODID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SecurityCraft.MODID);
	public static final String KEYPAD_CHEST_PATH = "keypad_chest";

	//fluids
	public static final RegistryObject<FlowingFluid> FLOWING_FAKE_WATER = FLUIDS.register("flowing_fake_water", () -> new FakeWaterFluid.Flowing());
	public static final RegistryObject<FlowingFluid> FAKE_WATER = FLUIDS.register("fake_water", () -> new FakeWaterFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_FAKE_LAVA = FLUIDS.register("flowing_fake_lava", () -> new FakeLavaFluid.Flowing());
	public static final RegistryObject<FlowingFluid> FAKE_LAVA = FLUIDS.register("fake_lava", () -> new FakeLavaFluid.Source());

	//blocks
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> ALARM = BLOCKS.register("alarm", () -> new AlarmBlock(prop(Material.METAL).randomTicks().lightLevel(state -> state.getValue(AlarmBlock.LIT) ? 15 : 0)));
	@HasManualPage(designedBy = "Henzoid")
	@RegisterItemBlock
	public static final RegistryObject<Block> BLOCK_POCKET_MANAGER = BLOCKS.register("block_pocket_manager", () -> new BlockPocketManagerBlock(prop()));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.DECORATION)
	public static final RegistryObject<Block> BLOCK_POCKET_WALL = BLOCKS.register("block_pocket_wall", () -> new BlockPocketWallBlock(prop().noCollission().isRedstoneConductor((s, w, p) -> false).isSuffocating(BlockPocketWallBlock::causesSuffocation).isViewBlocking(BlockPocketWallBlock::causesSuffocation)));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> BOUNCING_BETTY = BLOCKS.register("bouncing_betty", () -> new BouncingBettyBlock(prop(Material.DECORATION, 1.0F)));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> CAGE_TRAP = BLOCKS.register("cage_trap", () -> new CageTrapBlock(propDisguisable(Material.METAL).sound(SoundType.METAL).noCollission()));
	@RegisterItemBlock(SCItemGroup.DECORATION)
	public static final RegistryObject<Block> CHISELED_CRYSTAL_QUARTZ = BLOCKS.register("chiseled_crystal_quartz", () -> new Block(Block.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops()));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.DECORATION)
	public static final RegistryObject<Block> CRYSTAL_QUARTZ = BLOCKS.register("crystal_quartz", () -> new Block(Block.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops()));
	@RegisterItemBlock(SCItemGroup.DECORATION)
	public static final RegistryObject<Block> CRYSTAL_QUARTZ_PILLAR = BLOCKS.register("crystal_quartz_pillar", () -> new RotatedPillarBlock(Block.Properties.of(Material.STONE).strength(0.8F).requiresCorrectToolForDrops()));
	@RegisterItemBlock(SCItemGroup.DECORATION)
	public static final RegistryObject<Block> CRYSTAL_QUARTZ_SLAB = BLOCKS.register("crystal_quartz_slab", () -> new SlabBlock(Block.Properties.of(Material.STONE).strength(2.0F, 6.0F).requiresCorrectToolForDrops()));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> CLAYMORE = BLOCKS.register("claymore", () -> new ClaymoreBlock(prop(Material.DECORATION)));
	@HasManualPage
	@OwnableBE
	@RegisterItemBlock
	public static final RegistryObject<Block> FRAME = BLOCKS.register("keypad_frame", () -> new FrameBlock(prop().sound(SoundType.METAL)));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> IMS = BLOCKS.register("ims", () -> new IMSBlock(prop(Material.METAL, 0.7F).sound(SoundType.METAL)));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> INVENTORY_SCANNER = BLOCKS.register("inventory_scanner", () -> new InventoryScannerBlock(propDisguisable()));
	public static final RegistryObject<Block> INVENTORY_SCANNER_FIELD = BLOCKS.register("inventory_scanner_field", () -> new InventoryScannerFieldBlock(prop(Material.GLASS)));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.DECORATION)
	public static final RegistryObject<Block> IRON_FENCE = BLOCKS.register("electrified_iron_fence", () -> new IronFenceBlock(prop(Material.METAL, MaterialColor.METAL).sound(SoundType.METAL)));
	public static final RegistryObject<Block> KEY_PANEL_BLOCK = BLOCKS.register("key_panel", () -> new KeyPanelBlock(prop(Material.METAL)));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> KEYCARD_READER = BLOCKS.register("keycard_reader", () -> new KeycardReaderBlock(propDisguisable(Material.METAL).sound(SoundType.METAL)));
	@HasManualPage(hasRecipeDescription = true)
	@RegisterItemBlock
	public static final RegistryObject<Block> KEYPAD = BLOCKS.register("keypad", () -> new KeypadBlock(propDisguisable(Material.METAL)));
	@HasManualPage(hasRecipeDescription = true)
	public static final RegistryObject<Block> KEYPAD_CHEST = BLOCKS.register(KEYPAD_CHEST_PATH, () -> new KeypadChestBlock(prop(Material.WOOD).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> KEYPAD_DOOR = BLOCKS.register("keypad_door", () -> new KeypadDoorBlock(prop(Material.METAL).sound(SoundType.METAL).noOcclusion()));
	@HasManualPage(hasRecipeDescription = true)
	@RegisterItemBlock
	public static final RegistryObject<AbstractKeypadFurnaceBlock> KEYPAD_FURNACE = BLOCKS.register("keypad_furnace", () -> new KeypadFurnaceBlock(prop(Material.METAL).sound(SoundType.METAL).lightLevel(state -> state.getValue(AbstractKeypadFurnaceBlock.LIT) ? 13 : 0)));
	@HasManualPage(hasRecipeDescription = true)
	@RegisterItemBlock
	public static final RegistryObject<AbstractKeypadFurnaceBlock> KEYPAD_SMOKER = BLOCKS.register("keypad_smoker", () -> new KeypadSmokerBlock(prop(Material.METAL).sound(SoundType.METAL).lightLevel(state -> state.getValue(AbstractKeypadFurnaceBlock.LIT) ? 13 : 0)));
	@HasManualPage(hasRecipeDescription = true)
	@RegisterItemBlock
	public static final RegistryObject<AbstractKeypadFurnaceBlock> KEYPAD_BLAST_FURNACE = BLOCKS.register("keypad_blast_furnace", () -> new KeypadBlastFurnaceBlock(prop(Material.METAL).sound(SoundType.METAL).lightLevel(state -> state.getValue(AbstractKeypadFurnaceBlock.LIT) ? 13 : 0)));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> LASER_BLOCK = BLOCKS.register("laser_block", () -> new LaserBlock(propDisguisable(Material.METAL).randomTicks().sound(SoundType.METAL)));
	public static final RegistryObject<Block> LASER_FIELD = BLOCKS.register("laser", () -> new LaserFieldBlock(prop()));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> MOTION_ACTIVATED_LIGHT = BLOCKS.register("motion_activated_light", () -> new MotionActivatedLightBlock(prop(Material.GLASS).sound(SoundType.GLASS).lightLevel(state -> state.getValue(MotionActivatedLightBlock.LIT) ? 15 : 0)));
	@HasManualPage
	@OwnableBE
	@RegisterItemBlock
	public static final RegistryObject<Block> PANIC_BUTTON = BLOCKS.register("panic_button", () -> new PanicButtonBlock(false, prop().lightLevel(state -> state.getValue(PanicButtonBlock.POWERED) ? 4 : 0)));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> PORTABLE_RADAR = BLOCKS.register("portable_radar", () -> new PortableRadarBlock(prop(Material.DECORATION)));
	@HasManualPage
	@OwnableBE
	@RegisterItemBlock
	public static final RegistryObject<Block> PROJECTOR = BLOCKS.register("projector", () -> new ProjectorBlock(propDisguisable(Material.METAL).sound(SoundType.METAL).randomTicks()));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> PROTECTO = BLOCKS.register("protecto", () -> new ProtectoBlock(propDisguisable(Material.METAL).sound(SoundType.METAL).lightLevel(state -> 7)));
	@OwnableBE
	public static final RegistryObject<Block> REINFORCED_DOOR = BLOCKS.register("iron_door_reinforced", () -> new ReinforcedDoorBlock(prop(Material.METAL).sound(SoundType.METAL).noOcclusion()));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.DECORATION)
	public static final RegistryObject<Block> REINFORCED_FENCEGATE = BLOCKS.register("reinforced_fence_gate", () -> new ReinforcedFenceGateBlock(prop(Material.METAL).sound(SoundType.METAL)));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> RETINAL_SCANNER = BLOCKS.register("retinal_scanner", () -> new RetinalScannerBlock(propDisguisable(Material.METAL).sound(SoundType.METAL)));
	public static final RegistryObject<Block> SCANNER_DOOR = BLOCKS.register("scanner_door", () -> new ScannerDoorBlock(prop(Material.METAL).sound(SoundType.METAL).noOcclusion()));
	public static final RegistryObject<Block> SECRET_OAK_SIGN = BLOCKS.register("secret_sign_standing", () -> new SecretStandingSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.OAK));
	public static final RegistryObject<Block> SECRET_OAK_WALL_SIGN = BLOCKS.register("secret_sign_wall", () -> new SecretWallSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.OAK));
	public static final RegistryObject<Block> SECRET_SPRUCE_SIGN = BLOCKS.register("secret_spruce_sign_standing", () -> new SecretStandingSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.SPRUCE));
	public static final RegistryObject<Block> SECRET_SPRUCE_WALL_SIGN = BLOCKS.register("secret_spruce_sign_wall", () -> new SecretWallSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.SPRUCE));
	public static final RegistryObject<Block> SECRET_BIRCH_SIGN = BLOCKS.register("secret_birch_sign_standing", () -> new SecretStandingSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.BIRCH));
	public static final RegistryObject<Block> SECRET_BIRCH_WALL_SIGN = BLOCKS.register("secret_birch_sign_wall", () -> new SecretWallSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.BIRCH));
	public static final RegistryObject<Block> SECRET_JUNGLE_SIGN = BLOCKS.register("secret_jungle_sign_standing", () -> new SecretStandingSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.JUNGLE));
	public static final RegistryObject<Block> SECRET_JUNGLE_WALL_SIGN = BLOCKS.register("secret_jungle_sign_wall", () -> new SecretWallSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.JUNGLE));
	public static final RegistryObject<Block> SECRET_ACACIA_SIGN = BLOCKS.register("secret_acacia_sign_standing", () -> new SecretStandingSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.ACACIA));
	public static final RegistryObject<Block> SECRET_ACACIA_WALL_SIGN = BLOCKS.register("secret_acacia_sign_wall", () -> new SecretWallSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.ACACIA));
	public static final RegistryObject<Block> SECRET_DARK_OAK_SIGN = BLOCKS.register("secret_dark_oak_sign_standing", () -> new SecretStandingSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.DARK_OAK));
	public static final RegistryObject<Block> SECRET_DARK_OAK_WALL_SIGN = BLOCKS.register("secret_dark_oak_sign_wall", () -> new SecretWallSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.DARK_OAK));
	public static final RegistryObject<Block> SECRET_CRIMSON_SIGN = BLOCKS.register("secret_crimson_sign_standing", () -> new SecretStandingSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.CRIMSON));
	public static final RegistryObject<Block> SECRET_CRIMSON_WALL_SIGN = BLOCKS.register("secret_crimson_sign_wall", () -> new SecretWallSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.CRIMSON));
	public static final RegistryObject<Block> SECRET_WARPED_SIGN = BLOCKS.register("secret_warped_sign_standing", () -> new SecretStandingSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.WARPED));
	public static final RegistryObject<Block> SECRET_WARPED_WALL_SIGN = BLOCKS.register("secret_warped_sign_wall", () -> new SecretWallSignBlock(prop(Material.WOOD).sound(SoundType.WOOD), WoodType.WARPED));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> SECURITY_CAMERA = BLOCKS.register("security_camera", () -> new SecurityCameraBlock(prop(Material.METAL)));
	@HasManualPage
	public static final RegistryObject<Block> SONIC_SECURITY_SYSTEM = BLOCKS.register("sonic_security_system", () -> new SonicSecuritySystemBlock(prop(Material.METAL).sound(SoundType.METAL).isRedstoneConductor(SonicSecuritySystemBlock::isNormalCube).noCollission()));
	@RegisterItemBlock(SCItemGroup.DECORATION)
	public static final RegistryObject<Block> STAIRS_CRYSTAL_QUARTZ = BLOCKS.register("crystal_quartz_stairs", () -> new StairBlock(() -> CRYSTAL_QUARTZ.get().defaultBlockState(), Block.Properties.copy(CRYSTAL_QUARTZ.get())));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> TRACK_MINE = BLOCKS.register("track_mine", () -> new TrackMineBlock(prop(Material.METAL, 0.7F).noCollission().sound(SoundType.METAL)));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.TECHNICAL)
	public static final RegistryObject<Block> TROPHY_SYSTEM = BLOCKS.register("trophy_system", () -> new TrophySystemBlock(propDisguisable(Material.METAL).sound(SoundType.METAL)));
	@HasManualPage
	@RegisterItemBlock
	public static final RegistryObject<Block> USERNAME_LOGGER = BLOCKS.register("username_logger", () -> new UsernameLoggerBlock(propDisguisable()));
	@HasManualPage
	@OwnableBE
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> MINE = BLOCKS.register("mine", () -> new MineBlock(prop(Material.DECORATION, 1.0F)));
	public static final RegistryObject<Block> FAKE_WATER_BLOCK = BLOCKS.register("fake_water_block", () -> new FakeWaterBlock(prop(Material.WATER).noCollission(), FAKE_WATER));
	public static final RegistryObject<Block> FAKE_LAVA_BLOCK = BLOCKS.register("fake_lava_block", () -> new FakeLavaBlock(prop(Material.LAVA).noCollission().randomTicks().lightLevel(state -> 15), FAKE_LAVA));

	//block mines
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> STONE_MINE = BLOCKS.register("stone_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 1.5F), Blocks.STONE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_MINE = BLOCKS.register("deepslate_mine", () -> new DeepslateMineBlock(prop(Material.STONE, 3.0F).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> COBBLED_DEEPSLATE_MINE = BLOCKS.register("cobbled_deepslate_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.5F).sound(SoundType.DEEPSLATE), Blocks.COBBLED_DEEPSLATE));
	@HasManualPage
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DIRT_MINE = BLOCKS.register("dirt_mine", () -> new BaseFullMineBlock(prop(Material.DIRT, 0.5F).sound(SoundType.GRAVEL), Blocks.DIRT));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> COBBLESTONE_MINE = BLOCKS.register("cobblestone_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 2.0F), Blocks.COBBLESTONE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> SAND_MINE = BLOCKS.register("sand_mine", () -> new FallingBlockMineBlock(prop(Material.SAND, 0.5F).sound(SoundType.SAND), Blocks.SAND));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> GRAVEL_MINE = BLOCKS.register("gravel_mine", () -> new FallingBlockMineBlock(prop(Material.DIRT, 0.6F).sound(SoundType.GRAVEL), Blocks.GRAVEL));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> COAL_ORE_MINE = BLOCKS.register("coal_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F), Blocks.COAL_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_COAL_ORE_MINE = BLOCKS.register("deepslate_coal_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 4.5F).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE_COAL_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> IRON_ORE_MINE = BLOCKS.register("iron_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F), Blocks.IRON_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_IRON_ORE_MINE = BLOCKS.register("deepslate_iron_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 4.5F).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE_IRON_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> GOLD_ORE_MINE = BLOCKS.register("gold_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F), Blocks.GOLD_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_GOLD_ORE_MINE = BLOCKS.register("deepslate_gold_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 4.5F).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE_GOLD_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> COPPER_ORE_MINE = BLOCKS.register("copper_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F), Blocks.COPPER_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_COPPER_ORE_MINE = BLOCKS.register("deepslate_copper_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 4.5F).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE_COPPER_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> REDSTONE_ORE_MINE = BLOCKS.register("redstone_mine", () -> new RedstoneOreMineBlock(prop(Material.STONE, 3.0F).randomTicks().lightLevel(state -> state.getValue(RedstoneOreMineBlock.LIT) ? 9 : 0), Blocks.REDSTONE_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_REDSTONE_ORE_MINE = BLOCKS.register("deepslate_redstone_mine", () -> new RedstoneOreMineBlock(prop(Material.STONE, 4.5F).randomTicks().lightLevel(state -> state.getValue(RedstoneOreMineBlock.LIT) ? 9 : 0).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE_REDSTONE_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> EMERALD_ORE_MINE = BLOCKS.register("emerald_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F), Blocks.EMERALD_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_EMERALD_ORE_MINE = BLOCKS.register("deepslate_emerald_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 4.5F).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE_EMERALD_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> LAPIS_ORE_MINE = BLOCKS.register("lapis_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F), Blocks.LAPIS_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_LAPIS_ORE_MINE = BLOCKS.register("deepslate_lapis_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 4.5F).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE_LAPIS_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DIAMOND_ORE_MINE = BLOCKS.register("diamond_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F), Blocks.DIAMOND_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> DEEPSLATE_DIAMOND_ORE_MINE = BLOCKS.register("deepslate_diamond_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 4.5F).sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE_DIAMOND_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> NETHER_GOLD_ORE_MINE = BLOCKS.register("nether_gold_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F).sound(SoundType.NETHER_GOLD_ORE), Blocks.NETHER_GOLD_ORE));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> QUARTZ_ORE_MINE = BLOCKS.register("quartz_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 3.0F).sound(SoundType.NETHER_ORE), Blocks.NETHER_QUARTZ_ORE));
	public static final RegistryObject<Block> ANCIENT_DEBRIS_MINE = BLOCKS.register("ancient_debris_mine", () -> new BaseFullMineBlock(prop(Material.METAL, 30.0F).sound(SoundType.ANCIENT_DEBRIS), Blocks.ANCIENT_DEBRIS));
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> GILDED_BLACKSTONE_MINE = BLOCKS.register("gilded_blackstone_mine", () -> new BaseFullMineBlock(prop(Material.STONE, 1.5F).sound(SoundType.GILDED_BLACKSTONE), Blocks.GILDED_BLACKSTONE));
	@HasManualPage
	@OwnableBE
	@RegisterItemBlock(SCItemGroup.EXPLOSIVES)
	public static final RegistryObject<Block> FURNACE_MINE = BLOCKS.register("furnace_mine", () -> new FurnaceMineBlock(prop(Material.STONE, 3.5F)));

	//reinforced blocks (ordered by vanilla building blocks creative tab order)
	@HasManualPage(specialInfoKey = "securitycraft:reinforced.info")
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STONE = BLOCKS.register("reinforced_stone", () -> new BaseReinforcedBlock(prop(), Blocks.STONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRANITE = BLOCKS.register("reinforced_granite", () -> new BaseReinforcedBlock(prop(), Blocks.GRANITE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_GRANITE = BLOCKS.register("reinforced_polished_granite", () -> new BaseReinforcedBlock(prop(), Blocks.POLISHED_GRANITE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DIORITE = BLOCKS.register("reinforced_diorite", () -> new BaseReinforcedBlock(prop(), Blocks.DIORITE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_DIORITE = BLOCKS.register("reinforced_polished_diorite", () -> new BaseReinforcedBlock(prop(), Blocks.POLISHED_DIORITE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ANDESITE = BLOCKS.register("reinforced_andesite", () -> new BaseReinforcedBlock(prop(), Blocks.ANDESITE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_ANDESITE = BLOCKS.register("reinforced_polished_andesite", () -> new BaseReinforcedBlock(prop(), Blocks.POLISHED_ANDESITE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE = BLOCKS.register("reinforced_deepslate", () -> new ReinforcedRotatedPillarBlock(prop().sound(SoundType.DEEPSLATE), Blocks.DEEPSLATE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBBLED_DEEPSLATE = BLOCKS.register("reinforced_cobbled_deepslate", () -> new BaseReinforcedBlock(prop().sound(SoundType.DEEPSLATE), Blocks.COBBLED_DEEPSLATE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_DEEPSLATE = BLOCKS.register("reinforced_polished_deepslate", () -> new BaseReinforcedBlock(prop().sound(SoundType.POLISHED_DEEPSLATE), Blocks.POLISHED_DEEPSLATE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CALCITE = BLOCKS.register("reinforced_calcite", () -> new BaseReinforcedBlock(prop().sound(SoundType.CALCITE), Blocks.CALCITE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_TUFF = BLOCKS.register("reinforced_tuff", () -> new BaseReinforcedBlock(prop().sound(SoundType.TUFF), Blocks.TUFF));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DRIPSTONE_BLOCK = BLOCKS.register("reinforced_dripstone_block", () -> new BaseReinforcedBlock(prop().sound(SoundType.DRIPSTONE_BLOCK), Blocks.DRIPSTONE_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRASS_BLOCK = BLOCKS.register("reinforced_grass_block", () -> new ReinforcedSnowyDirtBlock(prop(Material.GRASS).sound(SoundType.GRASS), Blocks.GRASS_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DIRT = BLOCKS.register("reinforced_dirt", () -> new BaseReinforcedBlock(prop(Material.DIRT).sound(SoundType.GRAVEL), Blocks.DIRT));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COARSE_DIRT = BLOCKS.register("reinforced_coarse_dirt", () -> new BaseReinforcedBlock(prop(Material.DIRT).sound(SoundType.GRAVEL), Blocks.COARSE_DIRT));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PODZOL = BLOCKS.register("reinforced_podzol", () -> new ReinforcedSnowyDirtBlock(prop(Material.DIRT).sound(SoundType.GRAVEL), Blocks.PODZOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRIMSON_NYLIUM = BLOCKS.register("reinforced_crimson_nylium", () -> new ReinforcedNyliumBlock(prop().sound(SoundType.NYLIUM), Blocks.CRIMSON_NYLIUM));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_NYLIUM = BLOCKS.register("reinforced_warped_nylium", () -> new ReinforcedNyliumBlock(prop().sound(SoundType.NYLIUM), Blocks.WARPED_NYLIUM));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ROOTED_DIRT = BLOCKS.register("reinforced_rooted_dirt", () -> new ReinforcedRootedDirtBlock(prop(Material.DIRT).sound(SoundType.ROOTED_DIRT), Blocks.ROOTED_DIRT));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBBLESTONE = BLOCKS.register("reinforced_cobblestone", () -> new BaseReinforcedBlock(prop(), Blocks.COBBLESTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OAK_PLANKS = BLOCKS.register("reinforced_oak_planks", () -> new BaseReinforcedBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.OAK_PLANKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SPRUCE_PLANKS = BLOCKS.register("reinforced_spruce_planks", () -> new BaseReinforcedBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.SPRUCE_PLANKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BIRCH_PLANKS = BLOCKS.register("reinforced_birch_planks", () -> new BaseReinforcedBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.BIRCH_PLANKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_JUNGLE_PLANKS = BLOCKS.register("reinforced_jungle_planks", () -> new BaseReinforcedBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.JUNGLE_PLANKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ACACIA_PLANKS = BLOCKS.register("reinforced_acacia_planks", () -> new BaseReinforcedBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.ACACIA_PLANKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_OAK_PLANKS = BLOCKS.register("reinforced_dark_oak_planks", () -> new BaseReinforcedBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.DARK_OAK_PLANKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRIMSON_PLANKS = BLOCKS.register("reinforced_crimson_planks", () -> new BaseReinforcedBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.CRIMSON_PLANKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_PLANKS = BLOCKS.register("reinforced_warped_planks", () -> new BaseReinforcedBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.WARPED_PLANKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SAND = BLOCKS.register("reinforced_sand", () -> new ReinforcedFallingBlock(prop(Material.SAND).sound(SoundType.SAND), Blocks.SAND));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_SAND = BLOCKS.register("reinforced_red_sand", () -> new ReinforcedFallingBlock(prop(Material.SAND).sound(SoundType.SAND), Blocks.RED_SAND));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRAVEL = BLOCKS.register("reinforced_gravel", () -> new ReinforcedFallingBlock(prop(Material.DIRT).sound(SoundType.GRAVEL), Blocks.GRAVEL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COAL_BLOCK = BLOCKS.register("reinforced_coal_block", () -> new BaseReinforcedBlock(prop(), Blocks.COAL_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RAW_IRON_BLOCK = BLOCKS.register("reinforced_raw_iron_block", () -> new BaseReinforcedBlock(prop(), Blocks.RAW_IRON_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RAW_COPPER_BLOCK = BLOCKS.register("reinforced_raw_copper_block", () -> new BaseReinforcedBlock(prop(), Blocks.RAW_COPPER_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RAW_GOLD_BLOCK = BLOCKS.register("reinforced_raw_gold_block", () -> new BaseReinforcedBlock(prop(), Blocks.RAW_GOLD_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_AMETHYST_BLOCK = BLOCKS.register("reinforced_amethyst_block", () -> new ReinforcedAmethystBlock(prop().sound(SoundType.AMETHYST), Blocks.AMETHYST_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_IRON_BLOCK = BLOCKS.register("reinforced_iron_block", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.METAL), Blocks.IRON_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COPPER_BLOCK = BLOCKS.register("reinforced_copper_block", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.COPPER), Blocks.COPPER_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GOLD_BLOCK = BLOCKS.register("reinforced_gold_block", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.METAL), Blocks.GOLD_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DIAMOND_BLOCK = BLOCKS.register("reinforced_diamond_block", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.METAL), Blocks.DIAMOND_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_NETHERITE_BLOCK = BLOCKS.register("reinforced_netherite_block", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.NETHERITE_BLOCK), Blocks.NETHERITE_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_EXPOSED_COPPER = BLOCKS.register("reinforced_exposed_copper", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.COPPER), Blocks.EXPOSED_COPPER));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WEATHERED_COPPER = BLOCKS.register("reinforced_weathered_copper", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.COPPER), Blocks.WEATHERED_COPPER));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OXIDIZED_COPPER = BLOCKS.register("reinforced_oxidized_copper", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.COPPER), Blocks.OXIDIZED_COPPER));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CUT_COPPER = BLOCKS.register("reinforced_cut_copper", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.COPPER), Blocks.CUT_COPPER));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_EXPOSED_CUT_COPPER = BLOCKS.register("reinforced_exposed_cut_copper", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.COPPER), Blocks.EXPOSED_CUT_COPPER));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WEATHERED_CUT_COPPER = BLOCKS.register("reinforced_weathered_cut_copper", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.COPPER), Blocks.WEATHERED_CUT_COPPER));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OXIDIZED_CUT_COPPER = BLOCKS.register("reinforced_oxidized_cut_copper", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.COPPER), Blocks.OXIDIZED_CUT_COPPER));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CUT_COPPER_STAIRS = BLOCKS.register("reinforced_cut_copper_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.COPPER), Blocks.CUT_COPPER_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_EXPOSED_CUT_COPPER_STAIRS = BLOCKS.register("reinforced_exposed_cut_copper_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.COPPER), Blocks.EXPOSED_CUT_COPPER_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WEATHERED_CUT_COPPER_STAIRS = BLOCKS.register("reinforced_weathered_cut_copper_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.COPPER), Blocks.WEATHERED_CUT_COPPER_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OXIDIZED_CUT_COPPER_STAIRS = BLOCKS.register("reinforced_oxidized_cut_copper_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.COPPER), Blocks.OXIDIZED_CUT_COPPER_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CUT_COPPER_SLAB = BLOCKS.register("reinforced_cut_copper_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.COPPER), Blocks.CUT_COPPER_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_EXPOSED_CUT_COPPER_SLAB = BLOCKS.register("reinforced_exposed_cut_copper_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.COPPER), Blocks.EXPOSED_CUT_COPPER_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WEATHERED_CUT_COPPER_SLAB = BLOCKS.register("reinforced_weathered_cut_copper_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.COPPER), Blocks.WEATHERED_CUT_COPPER_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OXIDIZED_CUT_COPPER_SLAB = BLOCKS.register("reinforced_oxidized_cut_copper_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.COPPER), Blocks.OXIDIZED_CUT_COPPER_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OAK_LOG = BLOCKS.register("reinforced_oak_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.OAK_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SPRUCE_LOG = BLOCKS.register("reinforced_spruce_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.SPRUCE_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BIRCH_LOG = BLOCKS.register("reinforced_birch_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.BIRCH_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_JUNGLE_LOG = BLOCKS.register("reinforced_jungle_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.JUNGLE_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ACACIA_LOG = BLOCKS.register("reinforced_acacia_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.ACACIA_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_OAK_LOG = BLOCKS.register("reinforced_dark_oak_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.DARK_OAK_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRIMSON_STEM = BLOCKS.register("reinforced_crimson_stem", () -> new ReinforcedRotatedPillarBlock(prop(Material.NETHER_WOOD).sound(SoundType.STEM), Blocks.CRIMSON_STEM));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_STEM = BLOCKS.register("reinforced_warped_stem", () -> new ReinforcedRotatedPillarBlock(prop(Material.NETHER_WOOD).sound(SoundType.STEM), Blocks.WARPED_STEM));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_OAK_LOG = BLOCKS.register("reinforced_stripped_oak_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_OAK_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_SPRUCE_LOG = BLOCKS.register("reinforced_stripped_spruce_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_SPRUCE_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_BIRCH_LOG = BLOCKS.register("reinforced_stripped_birch_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_BIRCH_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_JUNGLE_LOG = BLOCKS.register("reinforced_stripped_jungle_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_JUNGLE_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_ACACIA_LOG = BLOCKS.register("reinforced_stripped_acacia_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_ACACIA_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_DARK_OAK_LOG = BLOCKS.register("reinforced_stripped_dark_oak_log", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_DARK_OAK_LOG));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_CRIMSON_STEM = BLOCKS.register("reinforced_stripped_crimson_stem", () -> new ReinforcedRotatedPillarBlock(prop(Material.NETHER_WOOD).sound(SoundType.STEM), Blocks.STRIPPED_CRIMSON_STEM));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_WARPED_STEM = BLOCKS.register("reinforced_stripped_warped_stem", () -> new ReinforcedRotatedPillarBlock(prop(Material.NETHER_WOOD).sound(SoundType.STEM), Blocks.STRIPPED_WARPED_STEM));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_OAK_WOOD = BLOCKS.register("reinforced_stripped_oak_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_OAK_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_SPRUCE_WOOD = BLOCKS.register("reinforced_stripped_spruce_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_SPRUCE_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_BIRCH_WOOD = BLOCKS.register("reinforced_stripped_birch_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_BIRCH_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_JUNGLE_WOOD = BLOCKS.register("reinforced_stripped_jungle_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_JUNGLE_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_ACACIA_WOOD = BLOCKS.register("reinforced_stripped_acacia_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_ACACIA_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_DARK_OAK_WOOD = BLOCKS.register("reinforced_stripped_dark_oak_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.STRIPPED_DARK_OAK_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_CRIMSON_HYPHAE = BLOCKS.register("reinforced_stripped_crimson_hyphae", () -> new ReinforcedRotatedPillarBlock(prop(Material.NETHER_WOOD).sound(SoundType.STEM), Blocks.STRIPPED_CRIMSON_HYPHAE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STRIPPED_WARPED_HYPHAE = BLOCKS.register("reinforced_stripped_warped_hyphae", () -> new ReinforcedRotatedPillarBlock(prop(Material.NETHER_WOOD).sound(SoundType.STEM), Blocks.STRIPPED_WARPED_HYPHAE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OAK_WOOD = BLOCKS.register("reinforced_oak_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.OAK_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SPRUCE_WOOD = BLOCKS.register("reinforced_spruce_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.SPRUCE_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BIRCH_WOOD = BLOCKS.register("reinforced_birch_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.BIRCH_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_JUNGLE_WOOD = BLOCKS.register("reinforced_jungle_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.JUNGLE_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ACACIA_WOOD = BLOCKS.register("reinforced_acacia_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.ACACIA_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_OAK_WOOD = BLOCKS.register("reinforced_dark_oak_wood", () -> new ReinforcedRotatedPillarBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.DARK_OAK_WOOD));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRIMSON_HYPHAE = BLOCKS.register("reinforced_crimson_hyphae", () -> new ReinforcedRotatedPillarBlock(prop(Material.NETHER_WOOD).sound(SoundType.STEM), Blocks.CRIMSON_HYPHAE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_HYPHAE = BLOCKS.register("reinforced_warped_hyphae", () -> new ReinforcedRotatedPillarBlock(prop(Material.NETHER_WOOD).sound(SoundType.STEM), Blocks.WARPED_HYPHAE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_GLASS = BLOCKS.register("reinforced_glass", () -> new ReinforcedGlassBlock(glassProp(), Blocks.GLASS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_TINTED_GLASS = BLOCKS.register("reinforced_tinted_glass", () -> new ReinforcedTintedGlassBlock(glassProp(), Blocks.TINTED_GLASS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LAPIS_BLOCK = BLOCKS.register("reinforced_lapis_block", () -> new BaseReinforcedBlock(prop(), Blocks.LAPIS_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SANDSTONE = BLOCKS.register("reinforced_sandstone", () -> new BaseReinforcedBlock(prop(), Blocks.SANDSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CHISELED_SANDSTONE = BLOCKS.register("reinforced_chiseled_sandstone", () -> new BaseReinforcedBlock(prop(), Blocks.CHISELED_SANDSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CUT_SANDSTONE = BLOCKS.register("reinforced_cut_sandstone", () -> new BaseReinforcedBlock(prop(), Blocks.CUT_SANDSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WHITE_WOOL = BLOCKS.register("reinforced_white_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.WHITE_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ORANGE_WOOL = BLOCKS.register("reinforced_orange_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.ORANGE_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MAGENTA_WOOL = BLOCKS.register("reinforced_magenta_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.MAGENTA_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIGHT_BLUE_WOOL = BLOCKS.register("reinforced_light_blue_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.LIGHT_BLUE_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_YELLOW_WOOL = BLOCKS.register("reinforced_yellow_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.YELLOW_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIME_WOOL = BLOCKS.register("reinforced_lime_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.LIME_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PINK_WOOL = BLOCKS.register("reinforced_pink_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.PINK_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRAY_WOOL = BLOCKS.register("reinforced_gray_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.GRAY_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIGHT_GRAY_WOOL = BLOCKS.register("reinforced_light_gray_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.LIGHT_GRAY_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CYAN_WOOL = BLOCKS.register("reinforced_cyan_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.CYAN_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PURPLE_WOOL = BLOCKS.register("reinforced_purple_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.PURPLE_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLUE_WOOL = BLOCKS.register("reinforced_blue_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.BLUE_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BROWN_WOOL = BLOCKS.register("reinforced_brown_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.BROWN_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GREEN_WOOL = BLOCKS.register("reinforced_green_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.GREEN_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_WOOL = BLOCKS.register("reinforced_red_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.RED_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLACK_WOOL = BLOCKS.register("reinforced_black_wool", () -> new BaseReinforcedBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.BLACK_WOOL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OAK_SLAB = BLOCKS.register("reinforced_oak_slab", () -> new ReinforcedSlabBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.OAK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SPRUCE_SLAB = BLOCKS.register("reinforced_spruce_slab", () -> new ReinforcedSlabBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.SPRUCE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BIRCH_SLAB = BLOCKS.register("reinforced_birch_slab", () -> new ReinforcedSlabBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.BIRCH_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_JUNGLE_SLAB = BLOCKS.register("reinforced_jungle_slab", () -> new ReinforcedSlabBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.JUNGLE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ACACIA_SLAB = BLOCKS.register("reinforced_acacia_slab", () -> new ReinforcedSlabBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.ACACIA_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_OAK_SLAB = BLOCKS.register("reinforced_dark_oak_slab", () -> new ReinforcedSlabBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.DARK_OAK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRIMSON_SLAB = BLOCKS.register("reinforced_crimson_slab", () -> new ReinforcedSlabBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.CRIMSON_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_SLAB = BLOCKS.register("reinforced_warped_slab", () -> new ReinforcedSlabBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.WARPED_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_NORMAL_STONE_SLAB = BLOCKS.register("reinforced_normal_stone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.STONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_STONE_SLAB = BLOCKS.register("reinforced_stone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.SMOOTH_STONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SANDSTONE_SLAB = BLOCKS.register("reinforced_sandstone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.SANDSTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CUT_SANDSTONE_SLAB = BLOCKS.register("reinforced_cut_sandstone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.CUT_SANDSTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBBLESTONE_SLAB = BLOCKS.register("reinforced_cobblestone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.COBBLESTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BRICK_SLAB = BLOCKS.register("reinforced_brick_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STONE_BRICK_SLAB = BLOCKS.register("reinforced_stone_brick_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.STONE_BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_NETHER_BRICK_SLAB = BLOCKS.register("reinforced_nether_brick_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.NETHER_BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_QUARTZ_SLAB = BLOCKS.register("reinforced_quartz_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.QUARTZ_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_SANDSTONE_SLAB = BLOCKS.register("reinforced_red_sandstone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.RED_SANDSTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CUT_RED_SANDSTONE_SLAB = BLOCKS.register("reinforced_cut_red_sandstone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.CUT_RED_SANDSTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PURPUR_SLAB = BLOCKS.register("reinforced_purpur_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.PURPUR_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PRISMARINE_SLAB = BLOCKS.register("reinforced_prismarine_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.PRISMARINE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PRISMARINE_BRICK_SLAB = BLOCKS.register("reinforced_prismarine_brick_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.PRISMARINE_BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_PRISMARINE_SLAB = BLOCKS.register("reinforced_dark_prismarine_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.DARK_PRISMARINE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_QUARTZ = BLOCKS.register("reinforced_smooth_quartz", () -> new BaseReinforcedBlock(prop(), Blocks.SMOOTH_QUARTZ));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_RED_SANDSTONE = BLOCKS.register("reinforced_smooth_red_sandstone", () -> new BaseReinforcedBlock(prop(), Blocks.SMOOTH_RED_SANDSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_SANDSTONE = BLOCKS.register("reinforced_smooth_sandstone", () -> new BaseReinforcedBlock(prop(), Blocks.SMOOTH_SANDSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_STONE = BLOCKS.register("reinforced_smooth_stone", () -> new BaseReinforcedBlock(prop(), Blocks.SMOOTH_STONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BRICKS = BLOCKS.register("reinforced_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BOOKSHELF = BLOCKS.register("reinforced_bookshelf", () -> new ReinforcedBookshelfBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.BOOKSHELF));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSSY_COBBLESTONE = BLOCKS.register("reinforced_mossy_cobblestone", () -> new BaseReinforcedBlock(prop(), Blocks.MOSSY_COBBLESTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OBSIDIAN = BLOCKS.register("reinforced_obsidian", () -> new ReinforcedObsidianBlock(prop(), Blocks.OBSIDIAN));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PURPUR_BLOCK = BLOCKS.register("reinforced_purpur_block", () -> new BaseReinforcedBlock(prop(), Blocks.PURPUR_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PURPUR_PILLAR = BLOCKS.register("reinforced_purpur_pillar", () -> new ReinforcedRotatedPillarBlock(prop(), Blocks.PURPUR_PILLAR));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PURPUR_STAIRS = BLOCKS.register("reinforced_purpur_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.PURPUR_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OAK_STAIRS = BLOCKS.register("reinforced_oak_stairs", () -> new ReinforcedStairsBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.OAK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBBLESTONE_STAIRS = BLOCKS.register("reinforced_cobblestone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.COBBLESTONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ICE = BLOCKS.register("reinforced_ice", () -> new ReinforcedIceBlock(prop(Material.ICE).friction(0.98F).sound(SoundType.GLASS).noOcclusion(), Blocks.ICE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SNOW_BLOCK = BLOCKS.register("reinforced_snow_block", () -> new BaseReinforcedBlock(prop(Material.SNOW).sound(SoundType.SNOW), Blocks.SNOW_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CLAY = BLOCKS.register("reinforced_clay", () -> new BaseReinforcedBlock(prop(Material.CLAY).sound(SoundType.GRAVEL), Blocks.CLAY));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_NETHERRACK = BLOCKS.register("reinforced_netherrack", () -> new BaseReinforcedBlock(prop().sound(SoundType.NETHERRACK), Blocks.NETHERRACK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SOUL_SOIL = BLOCKS.register("reinforced_soul_soil", () -> new BaseReinforcedBlock(prop(Material.DIRT).sound(SoundType.SOUL_SOIL), Blocks.SOUL_SOIL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BASALT = BLOCKS.register("reinforced_basalt", () -> new ReinforcedRotatedPillarBlock(prop().sound(SoundType.BASALT), Blocks.BASALT));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BASALT = BLOCKS.register("reinforced_polished_basalt", () -> new ReinforcedRotatedPillarBlock(prop().sound(SoundType.BASALT), Blocks.POLISHED_BASALT));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_BASALT = BLOCKS.register("reinforced_smooth_basalt", () -> new BaseReinforcedBlock(prop().sound(SoundType.BASALT), Blocks.SMOOTH_BASALT));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GLOWSTONE = BLOCKS.register("reinforced_glowstone", () -> new BaseReinforcedBlock(prop(Material.GLASS).sound(SoundType.GLASS).lightLevel(state -> 15), Blocks.GLOWSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STONE_BRICKS = BLOCKS.register("reinforced_stone_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.STONE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSSY_STONE_BRICKS = BLOCKS.register("reinforced_mossy_stone_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.MOSSY_STONE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRACKED_STONE_BRICKS = BLOCKS.register("reinforced_cracked_stone_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.CRACKED_STONE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CHISELED_STONE_BRICKS = BLOCKS.register("reinforced_chiseled_stone_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.CHISELED_STONE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE_BRICKS = BLOCKS.register("reinforced_deepslate_bricks", () -> new BaseReinforcedBlock(prop().sound(SoundType.DEEPSLATE_BRICKS), Blocks.DEEPSLATE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRACKED_DEEPSLATE_BRICKS = BLOCKS.register("reinforced_cracked_deepslate_bricks", () -> new BaseReinforcedBlock(prop().sound(SoundType.DEEPSLATE_BRICKS), Blocks.CRACKED_DEEPSLATE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE_TILES = BLOCKS.register("reinforced_deepslate_tiles", () -> new BaseReinforcedBlock(prop().sound(SoundType.DEEPSLATE_TILES), Blocks.DEEPSLATE_TILES));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRACKED_DEEPSLATE_TILES = BLOCKS.register("reinforced_cracked_deepslate_tiles", () -> new BaseReinforcedBlock(prop().sound(SoundType.DEEPSLATE_TILES), Blocks.CRACKED_DEEPSLATE_TILES));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CHISELED_DEEPSLATE = BLOCKS.register("reinforced_chiseled_deepslate", () -> new BaseReinforcedBlock(prop().sound(SoundType.DEEPSLATE_BRICKS), Blocks.CHISELED_DEEPSLATE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BRICK_STAIRS = BLOCKS.register("reinforced_brick_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STONE_BRICK_STAIRS = BLOCKS.register("reinforced_stone_brick_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.STONE_BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MYCELIUM = BLOCKS.register("reinforced_mycelium", () -> new ReinforcedSnowyDirtBlock(prop(Material.GRASS).sound(SoundType.GRASS), Blocks.MYCELIUM));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_NETHER_BRICKS = BLOCKS.register("reinforced_nether_bricks", () -> new BaseReinforcedBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.NETHER_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRACKED_NETHER_BRICKS = BLOCKS.register("reinforced_cracked_nether_bricks", () -> new BaseReinforcedBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.CRACKED_NETHER_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CHISELED_NETHER_BRICKS = BLOCKS.register("reinforced_chiseled_nether_bricks", () -> new BaseReinforcedBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.CHISELED_NETHER_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_NETHER_BRICK_STAIRS = BLOCKS.register("reinforced_nether_brick_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.NETHER_BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_END_STONE = BLOCKS.register("reinforced_end_stone", () -> new BaseReinforcedBlock(prop(), Blocks.END_STONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_END_STONE_BRICKS = BLOCKS.register("reinforced_end_stone_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.END_STONE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SANDSTONE_STAIRS = BLOCKS.register("reinforced_sandstone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.SANDSTONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_EMERALD_BLOCK = BLOCKS.register("reinforced_emerald_block", () -> new BaseReinforcedBlock(prop(Material.METAL).sound(SoundType.METAL), Blocks.EMERALD_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SPRUCE_STAIRS = BLOCKS.register("reinforced_spruce_stairs", () -> new ReinforcedStairsBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.SPRUCE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BIRCH_STAIRS = BLOCKS.register("reinforced_birch_stairs", () -> new ReinforcedStairsBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.BIRCH_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_JUNGLE_STAIRS = BLOCKS.register("reinforced_jungle_stairs", () -> new ReinforcedStairsBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.JUNGLE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRIMSON_STAIRS = BLOCKS.register("reinforced_crimson_stairs", () -> new ReinforcedStairsBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.CRIMSON_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_STAIRS = BLOCKS.register("reinforced_warped_stairs", () -> new ReinforcedStairsBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.WARPED_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CHISELED_QUARTZ = BLOCKS.register("reinforced_chiseled_quartz_block", () -> new BaseReinforcedBlock(prop(), Blocks.CHISELED_QUARTZ_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_QUARTZ = BLOCKS.register("reinforced_quartz_block", () -> new BaseReinforcedBlock(prop(), Blocks.QUARTZ_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_QUARTZ_BRICKS = BLOCKS.register("reinforced_quartz_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.QUARTZ_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_QUARTZ_PILLAR = BLOCKS.register("reinforced_quartz_pillar", () -> new ReinforcedRotatedPillarBlock(prop(), Blocks.QUARTZ_PILLAR));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_QUARTZ_STAIRS = BLOCKS.register("reinforced_quartz_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.QUARTZ_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WHITE_TERRACOTTA = BLOCKS.register("reinforced_white_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.WHITE_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ORANGE_TERRACOTTA = BLOCKS.register("reinforced_orange_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.ORANGE_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MAGENTA_TERRACOTTA = BLOCKS.register("reinforced_magenta_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.MAGENTA_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIGHT_BLUE_TERRACOTTA = BLOCKS.register("reinforced_light_blue_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.LIGHT_BLUE_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_YELLOW_TERRACOTTA = BLOCKS.register("reinforced_yellow_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.YELLOW_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIME_TERRACOTTA = BLOCKS.register("reinforced_lime_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.LIME_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PINK_TERRACOTTA = BLOCKS.register("reinforced_pink_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.PINK_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRAY_TERRACOTTA = BLOCKS.register("reinforced_gray_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.GRAY_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIGHT_GRAY_TERRACOTTA = BLOCKS.register("reinforced_light_gray_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.LIGHT_GRAY_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CYAN_TERRACOTTA = BLOCKS.register("reinforced_cyan_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.CYAN_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PURPLE_TERRACOTTA = BLOCKS.register("reinforced_purple_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.PURPLE_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLUE_TERRACOTTA = BLOCKS.register("reinforced_blue_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.BLUE_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BROWN_TERRACOTTA = BLOCKS.register("reinforced_brown_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.BROWN_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GREEN_TERRACOTTA = BLOCKS.register("reinforced_green_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.GREEN_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_TERRACOTTA = BLOCKS.register("reinforced_red_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.RED_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLACK_TERRACOTTA = BLOCKS.register("reinforced_black_terracotta", () -> new BaseReinforcedBlock(prop(), Blocks.BLACK_TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_TERRACOTTA = BLOCKS.register("reinforced_hardened_clay", () -> new BaseReinforcedBlock(prop(), Blocks.TERRACOTTA));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PACKED_ICE = BLOCKS.register("reinforced_packed_ice", () -> new BaseReinforcedBlock(prop(Material.ICE_SOLID).sound(SoundType.GLASS).friction(0.98F), Blocks.PACKED_ICE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ACACIA_STAIRS = BLOCKS.register("reinforced_acacia_stairs", () -> new ReinforcedStairsBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.ACACIA_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_OAK_STAIRS = BLOCKS.register("reinforced_dark_oak_stairs", () -> new ReinforcedStairsBlock(prop(Material.WOOD).sound(SoundType.WOOD), Blocks.DARK_OAK_STAIRS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_WHITE_STAINED_GLASS = BLOCKS.register("reinforced_white_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_ORANGE_STAINED_GLASS = BLOCKS.register("reinforced_orange_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_MAGENTA_STAINED_GLASS = BLOCKS.register("reinforced_magenta_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_LIGHT_BLUE_STAINED_GLASS = BLOCKS.register("reinforced_light_blue_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_YELLOW_STAINED_GLASS = BLOCKS.register("reinforced_yellow_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_LIME_STAINED_GLASS = BLOCKS.register("reinforced_lime_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.LIME, Blocks.LIME_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_PINK_STAINED_GLASS = BLOCKS.register("reinforced_pink_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.PINK, Blocks.PINK_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_GRAY_STAINED_GLASS = BLOCKS.register("reinforced_gray_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_LIGHT_GRAY_STAINED_GLASS = BLOCKS.register("reinforced_light_gray_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_CYAN_STAINED_GLASS = BLOCKS.register("reinforced_cyan_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_PURPLE_STAINED_GLASS = BLOCKS.register("reinforced_purple_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_BLUE_STAINED_GLASS = BLOCKS.register("reinforced_blue_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_BROWN_STAINED_GLASS = BLOCKS.register("reinforced_brown_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_GREEN_STAINED_GLASS = BLOCKS.register("reinforced_green_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_RED_STAINED_GLASS = BLOCKS.register("reinforced_red_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.RED, Blocks.RED_STAINED_GLASS));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_BLACK_STAINED_GLASS = BLOCKS.register("reinforced_black_stained_glass", () -> new ReinforcedStainedGlassBlock(glassProp(), DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PRISMARINE = BLOCKS.register("reinforced_prismarine", () -> new BaseReinforcedBlock(prop(), Blocks.PRISMARINE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PRISMARINE_BRICKS = BLOCKS.register("reinforced_prismarine_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.PRISMARINE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_PRISMARINE = BLOCKS.register("reinforced_dark_prismarine", () -> new BaseReinforcedBlock(prop(), Blocks.DARK_PRISMARINE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PRISMARINE_STAIRS = BLOCKS.register("reinforced_prismarine_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.PRISMARINE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PRISMARINE_BRICK_STAIRS = BLOCKS.register("reinforced_prismarine_brick_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.PRISMARINE_BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_PRISMARINE_STAIRS = BLOCKS.register("reinforced_dark_prismarine_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.DARK_PRISMARINE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SEA_LANTERN = BLOCKS.register("reinforced_sea_lantern", () -> new BaseReinforcedBlock(prop(Material.GLASS).sound(SoundType.GLASS).lightLevel(state -> 15), Blocks.SEA_LANTERN));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_SANDSTONE = BLOCKS.register("reinforced_red_sandstone", () -> new BaseReinforcedBlock(prop(), Blocks.RED_SANDSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CHISELED_RED_SANDSTONE = BLOCKS.register("reinforced_chiseled_red_sandstone", () -> new BaseReinforcedBlock(prop(), Blocks.CHISELED_RED_SANDSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CUT_RED_SANDSTONE = BLOCKS.register("reinforced_cut_red_sandstone", () -> new BaseReinforcedBlock(prop(), Blocks.CUT_RED_SANDSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_SANDSTONE_STAIRS = BLOCKS.register("reinforced_red_sandstone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.RED_SANDSTONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_NETHER_WART_BLOCK = BLOCKS.register("reinforced_nether_wart_block", () -> new BaseReinforcedBlock(prop(Material.GRASS).sound(SoundType.WART_BLOCK), Blocks.NETHER_WART_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_WART_BLOCK = BLOCKS.register("reinforced_warped_wart_block", () -> new BaseReinforcedBlock(prop(Material.GRASS).sound(SoundType.WART_BLOCK), Blocks.WARPED_WART_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_NETHER_BRICKS = BLOCKS.register("reinforced_red_nether_bricks", () -> new BaseReinforcedBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.RED_NETHER_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BONE_BLOCK = BLOCKS.register("reinforced_bone_block", () -> new ReinforcedRotatedPillarBlock(prop().sound(SoundType.BONE_BLOCK), Blocks.BONE_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WHITE_CONCRETE = BLOCKS.register("reinforced_white_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.WHITE_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ORANGE_CONCRETE = BLOCKS.register("reinforced_orange_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.ORANGE_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MAGENTA_CONCRETE = BLOCKS.register("reinforced_magenta_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.MAGENTA_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIGHT_BLUE_CONCRETE = BLOCKS.register("reinforced_light_blue_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.LIGHT_BLUE_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_YELLOW_CONCRETE = BLOCKS.register("reinforced_yellow_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.YELLOW_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIME_CONCRETE = BLOCKS.register("reinforced_lime_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.LIME_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PINK_CONCRETE = BLOCKS.register("reinforced_pink_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.PINK_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRAY_CONCRETE = BLOCKS.register("reinforced_gray_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.GRAY_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIGHT_GRAY_CONCRETE = BLOCKS.register("reinforced_light_gray_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.LIGHT_GRAY_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CYAN_CONCRETE = BLOCKS.register("reinforced_cyan_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.CYAN_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PURPLE_CONCRETE = BLOCKS.register("reinforced_purple_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.PURPLE_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLUE_CONCRETE = BLOCKS.register("reinforced_blue_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.BLUE_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BROWN_CONCRETE = BLOCKS.register("reinforced_brown_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.BROWN_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GREEN_CONCRETE = BLOCKS.register("reinforced_green_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.GREEN_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_CONCRETE = BLOCKS.register("reinforced_red_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.RED_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLACK_CONCRETE = BLOCKS.register("reinforced_black_concrete", () -> new BaseReinforcedBlock(prop(), Blocks.BLACK_CONCRETE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLUE_ICE = BLOCKS.register("reinforced_blue_ice", () -> new BaseReinforcedBlock(prop(Material.ICE_SOLID).sound(SoundType.GLASS).friction(0.989F), Blocks.BLUE_ICE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_GRANITE_STAIRS = BLOCKS.register("reinforced_polished_granite_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.POLISHED_GRANITE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_RED_SANDSTONE_STAIRS = BLOCKS.register("reinforced_smooth_red_sandstone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.SMOOTH_RED_SANDSTONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSSY_STONE_BRICK_STAIRS = BLOCKS.register("reinforced_mossy_stone_brick_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.MOSSY_STONE_BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_DIORITE_STAIRS = BLOCKS.register("reinforced_polished_diorite_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.POLISHED_DIORITE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSSY_COBBLESTONE_STAIRS = BLOCKS.register("reinforced_mossy_cobblestone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.MOSSY_COBBLESTONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_END_STONE_BRICK_STAIRS = BLOCKS.register("reinforced_end_stone_brick_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.END_STONE_BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STONE_STAIRS = BLOCKS.register("reinforced_stone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.STONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_SANDSTONE_STAIRS = BLOCKS.register("reinforced_smooth_sandstone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.SMOOTH_SANDSTONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_QUARTZ_STAIRS = BLOCKS.register("reinforced_smooth_quartz_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.SMOOTH_QUARTZ_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRANITE_STAIRS = BLOCKS.register("reinforced_granite_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.GRANITE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ANDESITE_STAIRS = BLOCKS.register("reinforced_andesite_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.ANDESITE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_NETHER_BRICK_STAIRS = BLOCKS.register("reinforced_red_nether_brick_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.RED_NETHER_BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_ANDESITE_STAIRS = BLOCKS.register("reinforced_polished_andesite_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.POLISHED_ANDESITE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DIORITE_STAIRS = BLOCKS.register("reinforced_diorite_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.DIORITE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBBLED_DEEPSLATE_STAIRS = BLOCKS.register("reinforced_cobbled_deepslate_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.DEEPSLATE), Blocks.COBBLED_DEEPSLATE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_DEEPSLATE_STAIRS = BLOCKS.register("reinforced_polished_deepslate_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.POLISHED_DEEPSLATE), Blocks.POLISHED_DEEPSLATE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE_BRICK_STAIRS = BLOCKS.register("reinforced_deepslate_brick_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.DEEPSLATE_BRICKS), Blocks.DEEPSLATE_BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE_TILE_STAIRS = BLOCKS.register("reinforced_deepslate_tile_stairs", () -> new ReinforcedStairsBlock(prop().sound(SoundType.DEEPSLATE_TILES), Blocks.DEEPSLATE_TILE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_GRANITE_SLAB = BLOCKS.register("reinforced_polished_granite_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.POLISHED_GRANITE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_RED_SANDSTONE_SLAB = BLOCKS.register("reinforced_smooth_red_sandstone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.SMOOTH_RED_SANDSTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSSY_STONE_BRICK_SLAB = BLOCKS.register("reinforced_mossy_stone_brick_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.MOSSY_STONE_BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_DIORITE_SLAB = BLOCKS.register("reinforced_polished_diorite_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.POLISHED_DIORITE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSSY_COBBLESTONE_SLAB = BLOCKS.register("reinforced_mossy_cobblestone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.MOSSY_COBBLESTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_END_STONE_BRICK_SLAB = BLOCKS.register("reinforced_end_stone_brick_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.END_STONE_BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_SANDSTONE_SLAB = BLOCKS.register("reinforced_smooth_sandstone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.SMOOTH_SANDSTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SMOOTH_QUARTZ_SLAB = BLOCKS.register("reinforced_smooth_quartz_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.SMOOTH_QUARTZ_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRANITE_SLAB = BLOCKS.register("reinforced_granite_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.GRANITE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ANDESITE_SLAB = BLOCKS.register("reinforced_andesite_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.ANDESITE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_NETHER_BRICK_SLAB = BLOCKS.register("reinforced_red_nether_brick_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.RED_NETHER_BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_ANDESITE_SLAB = BLOCKS.register("reinforced_polished_andesite_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.POLISHED_ANDESITE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DIORITE_SLAB = BLOCKS.register("reinforced_diorite_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.DIORITE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBBLED_DEEPSLATE_SLAB = BLOCKS.register("reinforced_cobbled_deepslate_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.DEEPSLATE), Blocks.COBBLED_DEEPSLATE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_DEEPSLATE_SLAB = BLOCKS.register("reinforced_polished_deepslate_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.POLISHED_DEEPSLATE), Blocks.POLISHED_DEEPSLATE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE_BRICK_SLAB = BLOCKS.register("reinforced_deepslate_brick_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.DEEPSLATE_BRICKS), Blocks.DEEPSLATE_BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE_TILE_SLAB = BLOCKS.register("reinforced_deepslate_tile_slab", () -> new ReinforcedSlabBlock(prop().sound(SoundType.DEEPSLATE_TILES), Blocks.DEEPSLATE_TILE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRYING_OBSIDIAN = BLOCKS.register("reinforced_crying_obsidian", () -> new ReinforcedCryingObsidianBlock(prop().lightLevel(state -> 10), Blocks.CRYING_OBSIDIAN));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLACKSTONE = BLOCKS.register("reinforced_blackstone", () -> new BaseReinforcedBlock(prop(), Blocks.BLACKSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLACKSTONE_SLAB = BLOCKS.register("reinforced_blackstone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.BLACKSTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLACKSTONE_STAIRS = BLOCKS.register("reinforced_blackstone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.BLACKSTONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE = BLOCKS.register("reinforced_polished_blackstone", () -> new BaseReinforcedBlock(prop(), Blocks.POLISHED_BLACKSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_SLAB = BLOCKS.register("reinforced_polished_blackstone_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.POLISHED_BLACKSTONE_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_STAIRS = BLOCKS.register("reinforced_polished_blackstone_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.POLISHED_BLACKSTONE_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CHISELED_POLISHED_BLACKSTONE = BLOCKS.register("reinforced_chiseled_polished_blackstone", () -> new BaseReinforcedBlock(prop(), Blocks.CHISELED_POLISHED_BLACKSTONE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("reinforced_polished_blackstone_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.POLISHED_BLACKSTONE_BRICKS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_BRICK_SLAB = BLOCKS.register("reinforced_polished_blackstone_brick_slab", () -> new ReinforcedSlabBlock(prop(), Blocks.POLISHED_BLACKSTONE_BRICK_SLAB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_BRICK_STAIRS = BLOCKS.register("reinforced_polished_blackstone_brick_stairs", () -> new ReinforcedStairsBlock(prop(), Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRACKED_POLISHED_BLACKSTONE_BRICKS = BLOCKS.register("reinforced_cracked_polished_blackstone_bricks", () -> new BaseReinforcedBlock(prop(), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS));
	//ordered by vanilla decoration blocks creative tab order
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBWEB = BLOCKS.register("reinforced_cobweb", () -> new ReinforcedCobwebBlock(Block.Properties.of(Material.WEB).noCollission(), Blocks.COBWEB));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSS_CARPET = BLOCKS.register("reinforced_moss_carpet", () -> new ReinforcedCarpetBlock(prop(Material.MOSS).sound(SoundType.MOSS), Blocks.MOSS_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSS_BLOCK = BLOCKS.register("reinforced_moss_block", () -> new BaseReinforcedBlock(prop(Material.MOSS).sound(SoundType.MOSS), Blocks.MOSS_BLOCK));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_IRON_BARS = BLOCKS.register("reinforced_iron_bars", () -> new ReinforcedIronBarsBlock(prop(Material.METAL).sound(SoundType.METAL), Blocks.IRON_BARS));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CHAIN = BLOCKS.register("reinforced_chain", () -> new ReinforcedChainBlock(prop(Material.METAL).sound(SoundType.CHAIN), Blocks.CHAIN));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_GLASS_PANE = BLOCKS.register("reinforced_glass_pane", () -> new ReinforcedPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), Blocks.GLASS_PANE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBBLESTONE_WALL = BLOCKS.register("reinforced_cobblestone_wall", () -> new ReinforcedWallBlock(prop(), Blocks.COBBLESTONE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSSY_COBBLESTONE_WALL = BLOCKS.register("reinforced_mossy_cobblestone_wall", () -> new ReinforcedWallBlock(prop(), Blocks.MOSSY_COBBLESTONE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BRICK_WALL = BLOCKS.register("reinforced_brick_wall", () -> new ReinforcedWallBlock(prop(), Blocks.BRICK_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PRISMARINE_WALL = BLOCKS.register("reinforced_prismarine_wall", () -> new ReinforcedWallBlock(prop(), Blocks.PRISMARINE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_SANDSTONE_WALL = BLOCKS.register("reinforced_red_sandstone_wall", () -> new ReinforcedWallBlock(prop(), Blocks.RED_SANDSTONE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MOSSY_STONE_BRICK_WALL = BLOCKS.register("reinforced_mossy_stone_brick_wall", () -> new ReinforcedWallBlock(prop(), Blocks.MOSSY_STONE_BRICK_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRANITE_WALL = BLOCKS.register("reinforced_granite_wall", () -> new ReinforcedWallBlock(prop(), Blocks.GRANITE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STONE_BRICK_WALL = BLOCKS.register("reinforced_stone_brick_wall", () -> new ReinforcedWallBlock(prop(), Blocks.STONE_BRICK_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_NETHER_BRICK_WALL = BLOCKS.register("reinforced_nether_brick_wall", () -> new ReinforcedWallBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.NETHER_BRICK_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ANDESITE_WALL = BLOCKS.register("reinforced_andesite_wall", () -> new ReinforcedWallBlock(prop(), Blocks.ANDESITE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_NETHER_BRICK_WALL = BLOCKS.register("reinforced_red_nether_brick_wall", () -> new ReinforcedWallBlock(prop().sound(SoundType.NETHER_BRICKS), Blocks.RED_NETHER_BRICK_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SANDSTONE_WALL = BLOCKS.register("reinforced_sandstone_wall", () -> new ReinforcedWallBlock(prop(), Blocks.SANDSTONE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_END_STONE_BRICK_WALL = BLOCKS.register("reinforced_end_stone_brick_wall", () -> new ReinforcedWallBlock(prop(), Blocks.END_STONE_BRICK_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DIORITE_WALL = BLOCKS.register("reinforced_diorite_wall", () -> new ReinforcedWallBlock(prop(), Blocks.DIORITE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLACKSTONE_WALL = BLOCKS.register("reinforced_blackstone_wall", () -> new ReinforcedWallBlock(prop(), Blocks.BLACKSTONE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_WALL = BLOCKS.register("reinforced_polished_blackstone_wall", () -> new ReinforcedWallBlock(prop(), Blocks.POLISHED_BLACKSTONE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_BRICK_WALL = BLOCKS.register("reinforced_polished_blackstone_brick_wall", () -> new ReinforcedWallBlock(prop(), Blocks.POLISHED_BLACKSTONE_BRICK_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_COBBLED_DEEPSLATE_WALL = BLOCKS.register("reinforced_cobbled_deepslate_wall", () -> new ReinforcedWallBlock(prop().sound(SoundType.DEEPSLATE), Blocks.COBBLED_DEEPSLATE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_DEEPSLATE_WALL = BLOCKS.register("reinforced_polished_deepslate_wall", () -> new ReinforcedWallBlock(prop().sound(SoundType.POLISHED_DEEPSLATE), Blocks.POLISHED_DEEPSLATE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE_BRICK_WALL = BLOCKS.register("reinforced_deepslate_brick_wall", () -> new ReinforcedWallBlock(prop().sound(SoundType.DEEPSLATE_BRICKS), Blocks.DEEPSLATE_BRICK_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DEEPSLATE_TILE_WALL = BLOCKS.register("reinforced_deepslate_tile_wall", () -> new ReinforcedWallBlock(prop().sound(SoundType.DEEPSLATE_TILES), Blocks.DEEPSLATE_TILE_WALL));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WHITE_CARPET = BLOCKS.register("reinforced_white_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.WHITE_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ORANGE_CARPET = BLOCKS.register("reinforced_orange_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.ORANGE_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_MAGENTA_CARPET = BLOCKS.register("reinforced_magenta_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.MAGENTA_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIGHT_BLUE_CARPET = BLOCKS.register("reinforced_light_blue_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.LIGHT_BLUE_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_YELLOW_CARPET = BLOCKS.register("reinforced_yellow_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.YELLOW_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIME_CARPET = BLOCKS.register("reinforced_lime_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.LIME_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PINK_CARPET = BLOCKS.register("reinforced_pink_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.PINK_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GRAY_CARPET = BLOCKS.register("reinforced_gray_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.GRAY_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LIGHT_GRAY_CARPET = BLOCKS.register("reinforced_light_gray_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.LIGHT_GRAY_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CYAN_CARPET = BLOCKS.register("reinforced_cyan_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.CYAN_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PURPLE_CARPET = BLOCKS.register("reinforced_purple_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.PURPLE_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLUE_CARPET = BLOCKS.register("reinforced_blue_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.BLUE_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BROWN_CARPET = BLOCKS.register("reinforced_brown_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.BROWN_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_GREEN_CARPET = BLOCKS.register("reinforced_green_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.GREEN_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_RED_CARPET = BLOCKS.register("reinforced_red_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.RED_CARPET));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BLACK_CARPET = BLOCKS.register("reinforced_black_carpet", () -> new ReinforcedCarpetBlock(prop(Material.WOOL).sound(SoundType.WOOL), Blocks.BLACK_CARPET));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_WHITE_STAINED_GLASS_PANE = BLOCKS.register("reinforced_white_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_ORANGE_STAINED_GLASS_PANE = BLOCKS.register("reinforced_orange_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_MAGENTA_STAINED_GLASS_PANE = BLOCKS.register("reinforced_magenta_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_LIGHT_BLUE_STAINED_GLASS_PANE = BLOCKS.register("reinforced_light_blue_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_YELLOW_STAINED_GLASS_PANE = BLOCKS.register("reinforced_yellow_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_LIME_STAINED_GLASS_PANE = BLOCKS.register("reinforced_lime_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.LIME, Blocks.LIME_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_PINK_STAINED_GLASS_PANE = BLOCKS.register("reinforced_pink_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.PINK, Blocks.PINK_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_GRAY_STAINED_GLASS_PANE = BLOCKS.register("reinforced_gray_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_LIGHT_GRAY_STAINED_GLASS_PANE = BLOCKS.register("reinforced_light_gray_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_CYAN_STAINED_GLASS_PANE = BLOCKS.register("reinforced_cyan_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_PURPLE_STAINED_GLASS_PANE = BLOCKS.register("reinforced_purple_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_BLUE_STAINED_GLASS_PANE = BLOCKS.register("reinforced_blue_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_BROWN_STAINED_GLASS_PANE = BLOCKS.register("reinforced_brown_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_GREEN_STAINED_GLASS_PANE = BLOCKS.register("reinforced_green_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_RED_STAINED_GLASS_PANE = BLOCKS.register("reinforced_red_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.RED, Blocks.RED_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_BLACK_STAINED_GLASS_PANE = BLOCKS.register("reinforced_black_stained_glass_pane", () -> new ReinforcedStainedGlassPaneBlock(prop(Material.GLASS).sound(SoundType.GLASS), DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS_PANE));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LANTERN = BLOCKS.register("reinforced_lantern", () -> new ReinforcedLanternBlock(prop(Material.METAL).sound(SoundType.LANTERN).lightLevel(state -> 15), Blocks.LANTERN));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SOUL_LANTERN = BLOCKS.register("reinforced_soul_lantern", () -> new ReinforcedLanternBlock(prop(Material.METAL).sound(SoundType.LANTERN).lightLevel(state -> 10), Blocks.SOUL_LANTERN));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SHROOMLIGHT = BLOCKS.register("reinforced_shroomlight", () -> new BaseReinforcedBlock(prop(Material.GRASS).sound(SoundType.SHROOMLIGHT).lightLevel(state -> 15), Blocks.SHROOMLIGHT));

	//ordered by vanilla redstone tab order
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_REDSTONE_BLOCK = BLOCKS.register("reinforced_redstone_block", () -> new ReinforcedRedstoneBlock(prop(Material.METAL).sound(SoundType.METAL), Blocks.REDSTONE_BLOCK));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_PISTON = BLOCKS.register("reinforced_piston", () -> new ReinforcedPistonBaseBlock(false, prop(Material.PISTON).isRedstoneConductor((s, w, p) -> false).isSuffocating((s, w, p) -> !s.getValue(PistonBaseBlock.EXTENDED)).isViewBlocking((s, w, p) -> !s.getValue(PistonBaseBlock.EXTENDED))));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STICKY_PISTON = BLOCKS.register("reinforced_sticky_piston", () -> new ReinforcedPistonBaseBlock(true, prop(Material.PISTON).isRedstoneConductor((s, w, p) -> false).isSuffocating((s, w, p) -> !s.getValue(PistonBaseBlock.EXTENDED)).isViewBlocking((s, w, p) -> !s.getValue(PistonBaseBlock.EXTENDED))));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OBSERVER = BLOCKS.register("reinforced_observer", () -> new ReinforcedObserverBlock(prop()));
	@HasManualPage
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_HOPPER = BLOCKS.register("reinforced_hopper", () -> new ReinforcedHopperBlock(prop(Material.METAL, MaterialColor.STONE).sound(SoundType.METAL).noOcclusion()));
	@HasManualPage
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_LEVER = BLOCKS.register("reinforced_lever", () -> new ReinforcedLeverBlock(prop(Material.WOOD).noCollission().sound(SoundType.WOOD)));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_REDSTONE_LAMP = BLOCKS.register("reinforced_redstone_lamp", () -> new ReinforcedRedstoneLampBlock(prop(Material.BUILDABLE_GLASS).sound(SoundType.GLASS).lightLevel(state -> state.getValue(ReinforcedRedstoneLampBlock.LIT) ? 15 : 0), Blocks.REDSTONE_LAMP));
	@HasManualPage
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STONE_BUTTON = BLOCKS.register("reinforced_stone_button", () -> new ReinforcedButtonBlock(false, prop(Material.STONE).noCollission(), Blocks.STONE_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_BUTTON = BLOCKS.register("reinforced_polished_blackstone_button", () -> new ReinforcedButtonBlock(false, prop(Material.STONE).noCollission(), Blocks.POLISHED_BLACKSTONE_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OAK_BUTTON = BLOCKS.register("reinforced_oak_button", () -> new ReinforcedButtonBlock(true, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.OAK_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SPRUCE_BUTTON = BLOCKS.register("reinforced_spruce_button", () -> new ReinforcedButtonBlock(true, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.SPRUCE_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BIRCH_BUTTON = BLOCKS.register("reinforced_birch_button", () -> new ReinforcedButtonBlock(true, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.BIRCH_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_JUNGLE_BUTTON = BLOCKS.register("reinforced_jungle_button", () -> new ReinforcedButtonBlock(true, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.JUNGLE_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ACACIA_BUTTON = BLOCKS.register("reinforced_acacia_button", () -> new ReinforcedButtonBlock(true, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.ACACIA_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_OAK_BUTTON = BLOCKS.register("reinforced_dark_oak_button", () -> new ReinforcedButtonBlock(true, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.DARK_OAK_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRIMSON_BUTTON = BLOCKS.register("reinforced_crimson_button", () -> new ReinforcedButtonBlock(true, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.CRIMSON_BUTTON));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_BUTTON = BLOCKS.register("reinforced_warped_button", () -> new ReinforcedButtonBlock(true, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.WARPED_BUTTON));
	@HasManualPage
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_STONE_PRESSURE_PLATE = BLOCKS.register("reinforced_stone_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.MOBS, prop().noCollission(), Blocks.STONE_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_POLISHED_BLACKSTONE_PRESSURE_PLATE = BLOCKS.register("reinforced_polished_blackstone_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.MOBS, prop().noCollission(), Blocks.POLISHED_BLACKSTONE_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_OAK_PRESSURE_PLATE = BLOCKS.register("reinforced_oak_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.EVERYTHING, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.OAK_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_SPRUCE_PRESSURE_PLATE = BLOCKS.register("reinforced_spruce_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.EVERYTHING, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.SPRUCE_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_BIRCH_PRESSURE_PLATE = BLOCKS.register("reinforced_birch_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.EVERYTHING, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.BIRCH_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_JUNGLE_PRESSURE_PLATE = BLOCKS.register("reinforced_jungle_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.EVERYTHING, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.JUNGLE_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_ACACIA_PRESSURE_PLATE = BLOCKS.register("reinforced_acacia_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.EVERYTHING, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.ACACIA_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DARK_OAK_PRESSURE_PLATE = BLOCKS.register("reinforced_dark_oak_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.EVERYTHING, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.DARK_OAK_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CRIMSON_PRESSURE_PLATE = BLOCKS.register("reinforced_crimson_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.EVERYTHING, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.CRIMSON_PRESSURE_PLATE));
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_WARPED_PRESSURE_PLATE = BLOCKS.register("reinforced_warped_pressure_plate", () -> new ReinforcedPressurePlateBlock(Sensitivity.EVERYTHING, prop(Material.WOOD).noCollission().sound(SoundType.WOOD), Blocks.WARPED_PRESSURE_PLATE));
	@HasManualPage(hasRecipeDescription = true)
	@OwnableBE
	@Reinforced(hasReinforcedTint = false)
	public static final RegistryObject<Block> REINFORCED_IRON_TRAPDOOR = BLOCKS.register("reinforced_iron_trapdoor", () -> new ReinforcedIronTrapDoorBlock(prop(Material.METAL).sound(SoundType.METAL).noOcclusion()));

	//ordered by vanilla brewing tab order
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_CAULDRON = BLOCKS.register("reinforced_cauldron", () -> new ReinforcedCauldronBlock(prop(Material.METAL, MaterialColor.STONE).noOcclusion(), IReinforcedCauldronInteraction.EMPTY));
	@Reinforced(registerBlockItem = false)
	public static final RegistryObject<Block> REINFORCED_WATER_CAULDRON = BLOCKS.register("reinforced_water_cauldron", () -> new ReinforcedLayeredCauldronBlock(prop(Material.METAL, MaterialColor.STONE).noOcclusion(), LayeredCauldronBlock.RAIN, IReinforcedCauldronInteraction.WATER, Blocks.WATER_CAULDRON));
	@Reinforced(registerBlockItem = false)
	public static final RegistryObject<Block> REINFORCED_LAVA_CAULDRON = BLOCKS.register("reinforced_lava_cauldron", () -> new ReinforcedLavaCauldronBlock(prop(Material.METAL, MaterialColor.STONE).noOcclusion().lightLevel(state -> 15)));
	@Reinforced(registerBlockItem = false)
	public static final RegistryObject<Block> REINFORCED_POWDER_SNOW_CAULDRON = BLOCKS.register("reinforced_powder_snow_cauldron", () -> new ReinforcedLayeredCauldronBlock(prop(Material.METAL, MaterialColor.STONE).noOcclusion(), LayeredCauldronBlock.SNOW, IReinforcedCauldronInteraction.POWDER_SNOW, Blocks.POWDER_SNOW_CAULDRON));

	//misc
	@Reinforced(customTint = 0x15B3A2)
	public static final RegistryObject<Block> REINFORCED_CHISELED_CRYSTAL_QUARTZ = BLOCKS.register("reinforced_chiseled_crystal_quartz_block", () -> new BlockPocketBlock(prop(), SCContent.CHISELED_CRYSTAL_QUARTZ));
	@Reinforced(customTint = 0x15B3A2)
	public static final RegistryObject<Block> REINFORCED_CRYSTAL_QUARTZ = BLOCKS.register("reinforced_crystal_quartz_block", () -> new BlockPocketBlock(prop(), SCContent.CRYSTAL_QUARTZ));
	@Reinforced(customTint = 0x15B3A2)
	public static final RegistryObject<Block> REINFORCED_CRYSTAL_QUARTZ_PILLAR = BLOCKS.register("reinforced_crystal_quartz_pillar", () -> new ReinforcedRotatedCrystalQuartzPillar(prop(), SCContent.CRYSTAL_QUARTZ_PILLAR));
	@Reinforced(customTint = 0x15B3A2)
	public static final RegistryObject<Block> REINFORCED_CRYSTAL_QUARTZ_SLAB = BLOCKS.register("reinforced_crystal_quartz_slab", () -> new ReinforcedSlabBlock(prop(), SCContent.CRYSTAL_QUARTZ_SLAB));
	@Reinforced(customTint = 0x15B3A2)
	public static final RegistryObject<Block> REINFORCED_CRYSTAL_QUARTZ_STAIRS = BLOCKS.register("reinforced_crystal_quartz_stairs", () -> new ReinforcedStairsBlock(prop(), SCContent.STAIRS_CRYSTAL_QUARTZ));
	@OwnableBE
	public static final RegistryObject<Block> HORIZONTAL_REINFORCED_IRON_BARS = BLOCKS.register("horizontal_reinforced_iron_bars", () -> new HorizontalReinforcedIronBars(prop(Material.METAL).sound(SoundType.METAL), Blocks.IRON_BLOCK));
	@OwnableBE
	@Reinforced
	public static final RegistryObject<Block> REINFORCED_DIRT_PATH = BLOCKS.register("reinforced_grass_path", () -> new ReinforcedDirtPathBlock(prop(Material.DIRT).sound(SoundType.GRASS), Blocks.DIRT_PATH));
	public static final RegistryObject<Block> REINFORCED_MOVING_PISTON = BLOCKS.register("reinforced_moving_piston", () -> new ReinforcedMovingPistonBlock(prop(Material.PISTON).dynamicShape().noDrops().noOcclusion().isRedstoneConductor((s, w, p) -> false).isSuffocating((s, w, p) -> false).isViewBlocking((s, w, p) -> false)));
	@Reinforced(registerBlockItem = false)
	public static final RegistryObject<Block> REINFORCED_PISTON_HEAD = BLOCKS.register("reinforced_piston_head", () -> new ReinforcedPistonHeadBlock(prop(Material.PISTON).noDrops()));

	//items
	@HasManualPage(hasRecipeDescription = true)
	public static final RegistryObject<Item> ADMIN_TOOL = ITEMS.register("admin_tool", () -> new AdminToolItem(itemProp(SecurityCraft.technicalTab).stacksTo(1).stacksTo(1)));
	public static final RegistryObject<Item> ANCIENT_DEBRIS_MINE_ITEM = ITEMS.register("ancient_debris_mine", () -> new BlockItem(SCContent.ANCIENT_DEBRIS_MINE.get(), itemProp(SecurityCraft.mineTab).fireResistant()));
	@HasManualPage
	public static final RegistryObject<Item> BRIEFCASE = ITEMS.register("briefcase", () -> new BriefcaseItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> CAMERA_MONITOR = ITEMS.register("camera_monitor", () -> new CameraMonitorItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> CODEBREAKER = ITEMS.register("codebreaker", () -> new CodebreakerItem(itemProp(SecurityCraft.technicalTab).stacksTo(1).defaultDurability(3)));
	@HasManualPage
	public static final RegistryObject<Item> CRYSTAL_QUARTZ_ITEM = ITEMS.register("crystal_quartz_item", () -> new Item(itemProp(SecurityCraft.decorationTab)));
	@HasManualPage
	public static final RegistryObject<Item> FAKE_LAVA_BUCKET = ITEMS.register("bucket_f_lava", () -> new FakeLiquidBucketItem(SCContent.FAKE_LAVA, itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> FAKE_WATER_BUCKET = ITEMS.register("bucket_f_water", () -> new FakeLiquidBucketItem(SCContent.FAKE_WATER, itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> KEYCARD_LVL_1 = ITEMS.register("keycard_lv1", () -> new KeycardItem(itemProp(SecurityCraft.technicalTab), 0));
	@HasManualPage
	public static final RegistryObject<Item> KEYCARD_LVL_2 = ITEMS.register("keycard_lv2", () -> new KeycardItem(itemProp(SecurityCraft.technicalTab), 1));
	@HasManualPage
	public static final RegistryObject<Item> KEYCARD_LVL_3 = ITEMS.register("keycard_lv3", () -> new KeycardItem(itemProp(SecurityCraft.technicalTab), 2));
	@HasManualPage
	public static final RegistryObject<Item> KEYCARD_LVL_4 = ITEMS.register("keycard_lv4", () -> new KeycardItem(itemProp(SecurityCraft.technicalTab), 3));
	@HasManualPage
	public static final RegistryObject<Item> KEYCARD_LVL_5 = ITEMS.register("keycard_lv5", () -> new KeycardItem(itemProp(SecurityCraft.technicalTab), 4));
	@HasManualPage
	public static final RegistryObject<Item> KEY_PANEL = ITEMS.register("keypad_item", () -> new KeyPanelItem(itemProp(SecurityCraft.technicalTab)));
	public static final RegistryObject<Item> KEYPAD_CHEST_ITEM = ITEMS.register(KEYPAD_CHEST_PATH, () -> new KeypadChestItem(SCContent.KEYPAD_CHEST.get(), itemProp(SecurityCraft.technicalTab)));
	@HasManualPage
	public static final RegistryObject<Item> KEYPAD_DOOR_ITEM = ITEMS.register("keypad_door_item", () -> new SpecialDoorItem(KEYPAD_DOOR.get(), itemProp(SecurityCraft.decorationTab)));
	@HasManualPage
	public static final RegistryObject<Item> LIMITED_USE_KEYCARD = ITEMS.register("limited_use_keycard", () -> new KeycardItem(itemProp(SecurityCraft.technicalTab), -1));
	@HasManualPage
	public static final RegistryObject<Item> PORTABLE_TUNE_PLAYER = ITEMS.register("portable_tune_player", () -> new PortableTunePlayerItem(itemProp(SecurityCraft.technicalTab)));
	@HasManualPage
	public static final RegistryObject<Item> REINFORCED_DOOR_ITEM = ITEMS.register("door_indestructible_iron_item", () -> new ReinforcedDoorItem(REINFORCED_DOOR.get(), itemProp(SecurityCraft.decorationTab)));
	@HasManualPage
	public static final RegistryObject<Item> REMOTE_ACCESS_MINE = ITEMS.register("remote_access_mine", () -> new MineRemoteAccessToolItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> REMOTE_ACCESS_SENTRY = ITEMS.register("remote_access_sentry", () -> new SentryRemoteAccessToolItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> SCANNER_DOOR_ITEM = ITEMS.register("scanner_door_item", () -> new SpecialDoorItem(SCANNER_DOOR.get(), itemProp(SecurityCraft.decorationTab)));
	@HasManualPage
	public static final RegistryObject<Item> SC_MANUAL = ITEMS.register("sc_manual", () -> new SCManualItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> SECRET_OAK_SIGN_ITEM = ITEMS.register("secret_sign_item", () -> new SecretSignItem(itemProp(SecurityCraft.decorationTab).stacksTo(16), SCContent.SECRET_OAK_SIGN.get(), SCContent.SECRET_OAK_WALL_SIGN.get(), "item.securitycraft.secret_sign_item"));
	public static final RegistryObject<Item> SECRET_SPRUCE_SIGN_ITEM = ITEMS.register("secret_spruce_sign_item", () -> new SecretSignItem(itemProp(SecurityCraft.decorationTab).stacksTo(16), SCContent.SECRET_SPRUCE_SIGN.get(), SCContent.SECRET_SPRUCE_WALL_SIGN.get(), "item.securitycraft.secret_spruce_sign_item"));
	public static final RegistryObject<Item> SECRET_BIRCH_SIGN_ITEM = ITEMS.register("secret_birch_sign_item", () -> new SecretSignItem(itemProp(SecurityCraft.decorationTab).stacksTo(16), SCContent.SECRET_BIRCH_SIGN.get(), SCContent.SECRET_BIRCH_WALL_SIGN.get(), "item.securitycraft.secret_birch_sign_item"));
	public static final RegistryObject<Item> SECRET_JUNGLE_SIGN_ITEM = ITEMS.register("secret_jungle_sign_item", () -> new SecretSignItem(itemProp(SecurityCraft.decorationTab).stacksTo(16), SCContent.SECRET_JUNGLE_SIGN.get(), SCContent.SECRET_JUNGLE_WALL_SIGN.get(), "item.securitycraft.secret_jungle_sign_item"));
	public static final RegistryObject<Item> SECRET_ACACIA_SIGN_ITEM = ITEMS.register("secret_acacia_sign_item", () -> new SecretSignItem(itemProp(SecurityCraft.decorationTab).stacksTo(16), SCContent.SECRET_ACACIA_SIGN.get(), SCContent.SECRET_ACACIA_WALL_SIGN.get(), "item.securitycraft.secret_acacia_sign_item"));
	public static final RegistryObject<Item> SECRET_DARK_OAK_SIGN_ITEM = ITEMS.register("secret_dark_oak_sign_item", () -> new SecretSignItem(itemProp(SecurityCraft.decorationTab).stacksTo(16), SCContent.SECRET_DARK_OAK_SIGN.get(), SCContent.SECRET_DARK_OAK_WALL_SIGN.get(), "item.securitycraft.secret_dark_oak_sign_item"));
	public static final RegistryObject<Item> SECRET_CRIMSON_SIGN_ITEM = ITEMS.register("secret_crimson_sign_item", () -> new SecretSignItem(itemProp(SecurityCraft.decorationTab).stacksTo(16), SCContent.SECRET_CRIMSON_SIGN.get(), SCContent.SECRET_CRIMSON_WALL_SIGN.get(), "item.securitycraft.secret_crimson_sign_item"));
	public static final RegistryObject<Item> SECRET_WARPED_SIGN_ITEM = ITEMS.register("secret_warped_sign_item", () -> new SecretSignItem(itemProp(SecurityCraft.decorationTab).stacksTo(16), SCContent.SECRET_WARPED_SIGN.get(), SCContent.SECRET_WARPED_WALL_SIGN.get(), "item.securitycraft.secret_warped_sign_item"));
	@HasManualPage(designedBy = "Henzoid")
	public static final RegistryObject<Item> SENTRY = ITEMS.register("sentry", () -> new SentryItem(itemProp(SecurityCraft.technicalTab)));
	public static final RegistryObject<Item> SONIC_SECURITY_SYSTEM_ITEM = ITEMS.register("sonic_security_system", () -> new SonicSecuritySystemItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> TASER = ITEMS.register("taser", () -> new TaserItem(itemProp(SecurityCraft.technicalTab).defaultDurability(151), false));
	public static final RegistryObject<Item> TASER_POWERED = ITEMS.register("taser_powered", () -> new TaserItem(itemProp(null).defaultDurability(151), true));
	@HasManualPage
	public static final RegistryObject<Item> UNIVERSAL_BLOCK_MODIFIER = ITEMS.register("universal_block_modifier", () -> new UniversalBlockModifierItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> UNIVERSAL_BLOCK_REINFORCER_LVL_1 = ITEMS.register("universal_block_reinforcer_lvl1", () -> new UniversalBlockReinforcerItem(itemProp(SecurityCraft.technicalTab).stacksTo(1).defaultDurability(300)));
	@HasManualPage
	public static final RegistryObject<Item> UNIVERSAL_BLOCK_REINFORCER_LVL_2 = ITEMS.register("universal_block_reinforcer_lvl2", () -> new UniversalBlockReinforcerItem(itemProp(SecurityCraft.technicalTab).stacksTo(1).defaultDurability(2700)));
	@HasManualPage
	public static final RegistryObject<Item> UNIVERSAL_BLOCK_REINFORCER_LVL_3 = ITEMS.register("universal_block_reinforcer_lvl3", () -> new UniversalBlockReinforcerItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> UNIVERSAL_BLOCK_REMOVER = ITEMS.register("universal_block_remover", () -> new UniversalBlockRemoverItem(itemProp(SecurityCraft.technicalTab).stacksTo(1).defaultDurability(476)));
	@HasManualPage
	public static final RegistryObject<Item> UNIVERSAL_KEY_CHANGER = ITEMS.register("universal_key_changer", () -> new UniversalKeyChangerItem(itemProp(SecurityCraft.technicalTab).stacksTo(1)));
	@HasManualPage
	public static final RegistryObject<Item> UNIVERSAL_OWNER_CHANGER = ITEMS.register("universal_owner_changer", () -> new UniversalOwnerChangerItem(itemProp(SecurityCraft.technicalTab).stacksTo(1).defaultDurability(48)));
	@HasManualPage
	public static final RegistryObject<Item> WIRE_CUTTERS = ITEMS.register("wire_cutters", () -> new Item(itemProp(SecurityCraft.technicalTab).stacksTo(1).defaultDurability(476)));

	//modules
	@HasManualPage
	public static final RegistryObject<ModuleItem> DENYLIST_MODULE = ITEMS.register("blacklist_module", () -> new ModuleItem(itemProp(SecurityCraft.technicalTab).stacksTo(1), ModuleType.DENYLIST, true, true));
	@HasManualPage
	public static final RegistryObject<ModuleItem> DISGUISE_MODULE = ITEMS.register("disguise_module", () -> new ModuleItem(itemProp(SecurityCraft.technicalTab).stacksTo(1), ModuleType.DISGUISE, false, true));
	@HasManualPage
	public static final RegistryObject<ModuleItem> HARMING_MODULE = ITEMS.register("harming_module", () -> new ModuleItem(itemProp(SecurityCraft.technicalTab).stacksTo(1), ModuleType.HARMING, false));
	@HasManualPage
	public static final RegistryObject<ModuleItem> REDSTONE_MODULE = ITEMS.register("redstone_module", () -> new ModuleItem(itemProp(SecurityCraft.technicalTab).stacksTo(1), ModuleType.REDSTONE, false));
	@HasManualPage
	public static final RegistryObject<ModuleItem> SMART_MODULE = ITEMS.register("smart_module", () -> new ModuleItem(itemProp(SecurityCraft.technicalTab).stacksTo(1), ModuleType.SMART, false));
	@HasManualPage
	public static final RegistryObject<ModuleItem> STORAGE_MODULE = ITEMS.register("storage_module", () -> new ModuleItem(itemProp(SecurityCraft.technicalTab).stacksTo(1), ModuleType.STORAGE, false));
	@HasManualPage
	public static final RegistryObject<ModuleItem> ALLOWLIST_MODULE = ITEMS.register("whitelist_module", () -> new ModuleItem(itemProp(SecurityCraft.technicalTab).stacksTo(1), ModuleType.ALLOWLIST, true, true));
	@HasManualPage
	public static final RegistryObject<ModuleItem> SPEED_MODULE = ITEMS.register("speed_module", () -> new ModuleItem(itemProp(SecurityCraft.technicalTab).stacksTo(1), ModuleType.SPEED, false));

	//tile entity types
	@ObjectHolder(SecurityCraft.MODID + ":ownable")
	public static BlockEntityType<OwnableBlockEntity> beTypeOwnable;
	@ObjectHolder(SecurityCraft.MODID + ":abstract")
	public static BlockEntityType<NamedBlockEntity> beTypeAbstract;
	@ObjectHolder(SecurityCraft.MODID + ":keypad")
	public static BlockEntityType<KeypadBlockEntity> beTypeKeypad;
	@ObjectHolder(SecurityCraft.MODID + ":laser_block")
	public static BlockEntityType<LaserBlockBlockEntity> beTypeLaserBlock;
	@ObjectHolder(SecurityCraft.MODID + ":cage_trap")
	public static BlockEntityType<CageTrapBlockEntity> beTypeCageTrap;
	@ObjectHolder(SecurityCraft.MODID + ":keycard_reader")
	public static BlockEntityType<KeycardReaderBlockEntity> beTypeKeycardReader;
	@ObjectHolder(SecurityCraft.MODID + ":inventory_scanner")
	public static BlockEntityType<InventoryScannerBlockEntity> beTypeInventoryScanner;
	@ObjectHolder(SecurityCraft.MODID + ":portable_radar")
	public static BlockEntityType<PortableRadarBlockEntity> beTypePortableRadar;
	@ObjectHolder(SecurityCraft.MODID + ":security_camera")
	public static BlockEntityType<SecurityCameraBlockEntity> beTypeSecurityCamera;
	@ObjectHolder(SecurityCraft.MODID + ":username_logger")
	public static BlockEntityType<UsernameLoggerBlockEntity> beTypeUsernameLogger;
	@ObjectHolder(SecurityCraft.MODID + ":retinal_scanner")
	public static BlockEntityType<RetinalScannerBlockEntity> beTypeRetinalScanner;
	@ObjectHolder(SecurityCraft.MODID + ":keypad_chest")
	public static BlockEntityType<KeypadChestBlockEntity> beTypeKeypadChest;
	@ObjectHolder(SecurityCraft.MODID + ":alarm")
	public static BlockEntityType<AlarmBlockEntity> beTypeAlarm;
	@ObjectHolder(SecurityCraft.MODID + ":claymore")
	public static BlockEntityType<ClaymoreBlockEntity> beTypeClaymore;
	@ObjectHolder(SecurityCraft.MODID + ":keypad_furnace")
	public static BlockEntityType<KeypadFurnaceBlockEntity> beTypeKeypadFurnace;
	@ObjectHolder(SecurityCraft.MODID + ":keypad_smoker")
	public static BlockEntityType<KeypadSmokerBlockEntity> beTypeKeypadSmoker;
	@ObjectHolder(SecurityCraft.MODID + ":keypad_blast_furnace")
	public static BlockEntityType<KeypadBlastFurnaceBlockEntity> beTypeKeypadBlastFurnace;
	@ObjectHolder(SecurityCraft.MODID + ":ims")
	public static BlockEntityType<IMSBlockEntity> beTypeIms;
	@ObjectHolder(SecurityCraft.MODID + ":protecto")
	public static BlockEntityType<ProtectoBlockEntity> beTypeProtecto;
	@ObjectHolder(SecurityCraft.MODID + ":scanner_door")
	public static BlockEntityType<ScannerDoorBlockEntity> beTypeScannerDoor;
	@ObjectHolder(SecurityCraft.MODID + ":secret_sign")
	public static BlockEntityType<SecretSignBlockEntity> beTypeSecretSign;
	@ObjectHolder(SecurityCraft.MODID + ":motion_light")
	public static BlockEntityType<MotionActivatedLightBlockEntity> beTypeMotionLight;
	@ObjectHolder(SecurityCraft.MODID + ":track_mine")
	public static BlockEntityType<TrackMineBlockEntity> beTypeTrackMine;
	@ObjectHolder(SecurityCraft.MODID + ":trophy_system")
	public static BlockEntityType<TrophySystemBlockEntity> beTypeTrophySystem;
	@ObjectHolder(SecurityCraft.MODID + ":block_pocket_manager")
	public static BlockEntityType<BlockPocketManagerBlockEntity> beTypeBlockPocketManager;
	@ObjectHolder(SecurityCraft.MODID + ":block_pocket")
	public static BlockEntityType<BlockPocketBlockEntity> beTypeBlockPocket;
	@ObjectHolder(SecurityCraft.MODID + ":reinforced_pressure_plate")
	public static BlockEntityType<AllowlistOnlyBlockEntity> beTypeAllowlistOnly;
	@ObjectHolder(SecurityCraft.MODID + ":reinforced_hopper")
	public static BlockEntityType<ReinforcedHopperBlockEntity> beTypeReinforcedHopper;
	@ObjectHolder(SecurityCraft.MODID + ":projector")
	public static BlockEntityType<ProjectorBlockEntity> beTypeProjector;
	@ObjectHolder(SecurityCraft.MODID + ":keypad_door")
	public static BlockEntityType<KeypadDoorBlockEntity> beTypeKeypadDoor;
	@ObjectHolder(SecurityCraft.MODID + ":reinforced_iron_bars")
	public static BlockEntityType<ReinforcedIronBarsBlockEntity> beTypeReinforcedIronBars;
	@ObjectHolder(SecurityCraft.MODID + ":reinforced_cauldron")
	public static BlockEntityType<ReinforcedCauldronBlockEntity> beTypeReinforcedCauldron;
	@ObjectHolder(SecurityCraft.MODID + ":reinforced_piston")
	public static BlockEntityType<ReinforcedPistonMovingBlockEntity> beTypeReinforcedPiston;
	@ObjectHolder(SecurityCraft.MODID + ":validation_ownable")
	public static BlockEntityType<ValidationOwnableBlockEntity> beTypeValidationOwnable;
	@ObjectHolder(SecurityCraft.MODID + ":key_panel")
	public static BlockEntityType<KeyPanelBlockEntity> beTypeKeyPanel;
	@ObjectHolder(SecurityCraft.MODID + ":sonic_security_system")
	public static BlockEntityType<SonicSecuritySystemBlockEntity> beTypeSonicSecuritySystem;

	//entity types
	@ObjectHolder(SecurityCraft.MODID + ":bouncingbetty")
	public static EntityType<BouncingBetty> eTypeBouncingBetty;
	@ObjectHolder(SecurityCraft.MODID + ":imsbomb")
	public static EntityType<IMSBomb> eTypeImsBomb;
	@ObjectHolder(SecurityCraft.MODID + ":securitycamera")
	public static EntityType<SecurityCamera> eTypeSecurityCamera;
	@ObjectHolder(SecurityCraft.MODID + ":sentry")
	public static EntityType<Sentry> eTypeSentry;
	@ObjectHolder(SecurityCraft.MODID + ":bullet")
	public static EntityType<Bullet> eTypeBullet;

	//container types
	@ObjectHolder(SecurityCraft.MODID + ":block_reinforcer")
	public static MenuType<BlockReinforcerMenu> mTypeBlockReinforcer;
	@ObjectHolder(SecurityCraft.MODID + ":briefcase")
	public static MenuType<GenericMenu> mTypeBriefcase;
	@ObjectHolder(SecurityCraft.MODID + ":briefcase_inventory")
	public static MenuType<BriefcaseMenu> mTypeBriefcaseInventory;
	@ObjectHolder(SecurityCraft.MODID + ":briefcase_setup")
	public static MenuType<GenericMenu> mTypeBriefcaseSetup;
	@ObjectHolder(SecurityCraft.MODID + ":customize_block")
	public static MenuType<CustomizeBlockMenu> mTypeCustomizeBlock;
	@ObjectHolder(SecurityCraft.MODID + ":disguise_module")
	public static MenuType<DisguiseModuleMenu> mTypeDisguiseModule;
	@ObjectHolder(SecurityCraft.MODID + ":inventory_scanner")
	public static MenuType<InventoryScannerMenu> mTypeInventoryScanner;
	@ObjectHolder(SecurityCraft.MODID + ":keypad_furnace")
	public static MenuType<KeypadFurnaceMenu> mTypeKeypadFurnace;
	@ObjectHolder(SecurityCraft.MODID + ":keypad_smoker")
	public static MenuType<KeypadSmokerMenu> mTypeKeypadSmoker;
	@ObjectHolder(SecurityCraft.MODID + ":keypad_blast_furnace")
	public static MenuType<KeypadBlastFurnaceMenu> mTypeKeypadBlastFurnace;
	@ObjectHolder(SecurityCraft.MODID + ":projector")
	public static MenuType<ProjectorMenu> mTypeProjector;
	@ObjectHolder(SecurityCraft.MODID + ":check_password")
	public static MenuType<GenericTEMenu> mTypeCheckPassword;
	@ObjectHolder(SecurityCraft.MODID + ":set_password")
	public static MenuType<GenericTEMenu> mTypeSetPassword;
	@ObjectHolder(SecurityCraft.MODID + ":username_logger")
	public static MenuType<GenericTEMenu> mTypeUsernameLogger;
	@ObjectHolder(SecurityCraft.MODID + ":ims")
	public static MenuType<GenericTEMenu> mTypeIMS;
	@ObjectHolder(SecurityCraft.MODID + ":keycard_setup")
	public static MenuType<KeycardReaderMenu> mTypeKeycardReader;
	@ObjectHolder(SecurityCraft.MODID + ":key_changer")
	public static MenuType<GenericTEMenu> mTypeKeyChanger;
	@ObjectHolder(SecurityCraft.MODID + ":trophy_system")
	public static MenuType<GenericTEMenu> mTypeTrophySystem;
	@ObjectHolder(SecurityCraft.MODID + ":block_pocket_manager")
	public static MenuType<BlockPocketManagerMenu> mTypeBlockPocketManager;

	private static final Block.Properties prop() {
		return prop(Material.STONE);
	}

	private static final Block.Properties prop(Material mat) {
		return Block.Properties.of(mat).strength(-1.0F, 6000000.0F);
	}

	private static final Block.Properties prop(Material mat, float hardness) {
		return Block.Properties.of(mat).strength(hardness, 6000000.0F);
	}

	private static final Block.Properties prop(Material mat, MaterialColor color) {
		return Block.Properties.of(mat, color).strength(-1.0F, 6000000.0F);
	}

	private static final Block.Properties propDisguisable() {
		return propDisguisable(Material.STONE);
	}

	private static final Block.Properties propDisguisable(Material mat) {
		return prop(mat).noOcclusion().isRedstoneConductor(DisguisableBlock::isNormalCube).isSuffocating(DisguisableBlock::isSuffocating);
	}

	private static final Block.Properties glassProp() {
		return prop(Material.GLASS).sound(SoundType.GLASS).noOcclusion().isValidSpawn(SCContent::never).isRedstoneConductor(SCContent::never).isSuffocating(SCContent::never).isViewBlocking(SCContent::never);
	}

	private static final Item.Properties itemProp(CreativeModeTab itemGroup) {
		return new Item.Properties().tab(itemGroup);
	}

	private static boolean never(BlockState state, BlockGetter level, BlockPos pos) {
		return false;
	}

	private static boolean never(BlockState state, BlockGetter level, BlockPos pos, EntityType<?> entityType) {
		return false;
	}
}
