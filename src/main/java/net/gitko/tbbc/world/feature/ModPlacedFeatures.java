package net.gitko.tbbc.world.feature;

import net.gitko.tbbc.BelowBedrockCaves;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ROCKSLATE_COAL_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_coal_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_IRON_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_iron_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_GOLD_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_gold_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_COPPER_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_copper_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_DIAMOND_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_diamond_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_REDSTONE_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_redstone_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_LAPIS_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_lapis_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_EMERALD_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_emerald_ore_placed"));

    // TR ores
    public static final RegistryKey<PlacedFeature> ROCKSLATE_BAUXITE_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_bauxite_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_GALENA_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_galena_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_IRIDIUM_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_iridium_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_LEAD_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_lead_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_RUBY_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_ruby_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_SAPPHIRE_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_sapphire_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_SILVER_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_silver_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_TIN_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_tin_ore_placed"));

    // Powah ores
    public static final RegistryKey<PlacedFeature> ROCKSLATE_URANINITE_POOR_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_uraninite_poor_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_URANINITE_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_uraninite_ore_placed"));
    public static final RegistryKey<PlacedFeature> ROCKSLATE_URANINITE_DENSE_ORE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_uraninite_dense_ore_placed"));
    public static final RegistryKey<PlacedFeature> BBC_DRY_ICE_PLACED = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "bbc_dry_ice_placed"));

    public static void bootstrap(Registerable<PlacedFeature> placedFeatureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup = placedFeatureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        placedFeatureRegisterable.register(
                ROCKSLATE_COAL_ORE_PLACED,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(ModConfiguredFeatures.ROCKSLATE_COAL_ORE),
                        ModOreFeatures.modifiersWithCount(60,
                                HeightRangePlacementModifier.uniform(YOffset.fixed(136), YOffset.getTop()))
                )
        );

        placedFeatureRegisterable.register(
                ROCKSLATE_IRON_ORE_PLACED,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(ModConfiguredFeatures.ROCKSLATE_IRON_ORE),
                        ModOreFeatures.modifiersWithCount(180,
                                HeightRangePlacementModifier.trapezoid(YOffset.fixed(80), YOffset.fixed(384)))
                )
        );

        placedFeatureRegisterable.register(
                ROCKSLATE_COPPER_ORE_PLACED,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(ModConfiguredFeatures.ROCKSLATE_COPPER_ORE),
                        ModOreFeatures.modifiersWithCount(32,
                                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112)))
                )
        );

        placedFeatureRegisterable.register(
                ROCKSLATE_GOLD_ORE_PLACED,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(ModConfiguredFeatures.ROCKSLATE_GOLD_ORE),
                        ModOreFeatures.modifiersWithCount(60,
                                HeightRangePlacementModifier.uniform(YOffset.fixed(136), YOffset.getTop()))
                )
        );

        placedFeatureRegisterable.register(
                ROCKSLATE_DIAMOND_ORE_PLACED,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(ModConfiguredFeatures.ROCKSLATE_DIAMOND_ORE),
                        ModOreFeatures.modifiersWithCount(18,
                                HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80)))
                )
        );

        placedFeatureRegisterable.register(
                ROCKSLATE_REDSTONE_ORE_PLACED,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(ModConfiguredFeatures.ROCKSLATE_REDSTONE_ORE),
                        ModOreFeatures.modifiersWithCount(16,
                                HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(32)))
                )
        );

        placedFeatureRegisterable.register(
                ROCKSLATE_LAPIS_ORE_PLACED,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(ModConfiguredFeatures.ROCKSLATE_LAPIS_ORE),
                        ModOreFeatures.modifiersWithCount(8,
                                HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)))
                )
        );

        placedFeatureRegisterable.register(
                ROCKSLATE_EMERALD_ORE_PLACED,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(ModConfiguredFeatures.ROCKSLATE_EMERALD_ORE),
                        ModOreFeatures.modifiersWithCount(200,
                                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(480)))
                )
        );

        // TR ores (veins per chunk increased to 2.5 times the original and rounded to the nearest whole number)
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_BAUXITE_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_BAUXITE_ORE, 30, YOffset.aboveBottom(0), 20);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_GALENA_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_GALENA_ORE, 30, YOffset.aboveBottom(25), 40);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_IRIDIUM_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_IRIDIUM_ORE, 10, YOffset.aboveBottom(0), 0);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_LEAD_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_LEAD_ORE, 40, YOffset.aboveBottom(40), 40);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_RUBY_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_RUBY_ORE, 20, YOffset.fixed(20), 120);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_SAPPHIRE_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_SAPPHIRE_ORE, 18, YOffset.fixed(20), 120);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_SILVER_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_SILVER_ORE, 40, YOffset.aboveBottom(40), 60);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_TIN_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_TIN_ORE, 40, YOffset.fixed(25), 80);

        // Powah ores (same veins per chunk increase as TR)
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_URANINITE_POOR_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_URANINITE_POOR_ORE, 20, YOffset.BOTTOM, 64);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_URANINITE_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_URANINITE_ORE, 15, YOffset.BOTTOM, 20);
        registerUniformOre(placedFeatureRegisterable, registryEntryLookup, ROCKSLATE_URANINITE_DENSE_ORE_PLACED, ModConfiguredFeatures.ROCKSLATE_URANINITE_DENSE_ORE, 8, YOffset.BOTTOM, 0);
    }

    public static void registerUniformOre(Registerable<PlacedFeature> placedFeatureRegisterable, RegistryEntryLookup<ConfiguredFeature<?, ?>> registryEntryLookup, RegistryKey<PlacedFeature> placedFeature, RegistryKey<ConfiguredFeature<?, ?>> configuredFeature, int veinsPerChunk, YOffset minOffset, int maxY) {
        placedFeatureRegisterable.register(
                placedFeature,
                new PlacedFeature(
                        registryEntryLookup.getOrThrow(configuredFeature),
                        ModOreFeatures.modifiersWithCount(veinsPerChunk,
                                HeightRangePlacementModifier.uniform(minOffset, YOffset.fixed(maxY)))
                )
        );
    }
}
