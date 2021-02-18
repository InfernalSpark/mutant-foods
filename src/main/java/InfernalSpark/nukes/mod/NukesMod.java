package InfernalSpark.nukes.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.fabricmc.fabric.impl.registry.sync.RegistrySyncManager;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class NukesMod implements ModInitializer {

	public static final Block URANIUM_ORE = new Block(FabricBlockSettings.of(Material.SOIL).strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));


	private static ConfiguredFeature<?, ?> URANIUM_ORE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, URANIUM_ORE.getDefaultState(), 9)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(20);

	public static final Item URANIUM = new Item(new Item.Settings().group(ItemGroup.MISC).food(UraniumFoodComponents.URANIUM));

	public static final Item URANIUM_CORE = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Item UNSTABLE_URANIUM = new Item(new Item.Settings().group(ItemGroup.MISC));

	public static final Item MUTANT_APPLE = new Item(new Item.Settings().group(ItemGroup.FOOD).food(MutantApple.MUTANT_APPLE));
	public static final Item MUTANT_CARROT = new Item(new Item.Settings().group(ItemGroup.FOOD).food(MutantCarrot.MUTANT_CARROT));
	public static final Item MUTANT_STEAK = new Item(new Item.Settings().group(ItemGroup.FOOD).food(MutantSteak.MUTANT_STEAK));
	public static final Item MUTANT_COD = new Item(new Item.Settings().group(ItemGroup.FOOD).food(MutantCod.MUTANT_COD));

	public void onInitialize() {
		Registry.register(Registry.BLOCK, new Identifier("nukesmod", "uranium_ore"), URANIUM_ORE);
		Registry.register(Registry.ITEM, new Identifier("nukesmod", "uranium_ore"), new BlockItem(URANIUM_ORE, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

		Registry.register(Registry.ITEM, new Identifier("nukesmod", "mutant_apple"), MUTANT_APPLE);
		Registry.register(Registry.ITEM, new Identifier("nukesmod", "mutant_carrot"), MUTANT_CARROT);
		Registry.register(Registry.ITEM, new Identifier("nukesmod", "mutant_steak"), MUTANT_STEAK);
		Registry.register(Registry.ITEM, new Identifier("nukesmod", "mutant_cod"), MUTANT_COD);

		RegistryKey<ConfiguredFeature<?, ?>> uraniumOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("nukesmod", "uranium_ore"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, uraniumOreOverworld.getValue(), URANIUM_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, uraniumOreOverworld);

		Registry.register(Registry.ITEM, new Identifier("nukesmod", "uranium_item"), URANIUM);
		Registry.register(Registry.ITEM, new Identifier("nukesmod", "uranium_core"), URANIUM_CORE);
		Registry.register(Registry.ITEM, new Identifier("nukesmod", "unstable_uranium"), UNSTABLE_URANIUM);

		System.out.println("Hello world!");
	}
}
