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
import net.minecraft.world.gen.feature.PlacedFeatures;
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
    }
}
