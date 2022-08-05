package net.gitko.tbbc.world.feature;

import net.gitko.tbbc.BelowBedrockCaves;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> ROCKSLATE_COAL_ORE_PLACED = PlacedFeatures.register("rockslate_coal_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_COAL_ORE, ModOreFeatures.modifiersWithCount(60,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(136), YOffset.getTop())));

    public static final RegistryEntry<PlacedFeature> ROCKSLATE_IRON_ORE_PLACED = PlacedFeatures.register("rockslate_iron_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_IRON_ORE, ModOreFeatures.modifiersWithCount(180,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(80), YOffset.fixed(384))));

    public static final RegistryEntry<PlacedFeature> ROCKSLATE_GOLD_ORE_PLACED = PlacedFeatures.register("rockslate_gold_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_GOLD_ORE, ModOreFeatures.modifiersWithCount(100,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(32), YOffset.fixed(256))));

    public static final RegistryEntry<PlacedFeature> ROCKSLATE_COPPER_ORE_PLACED = PlacedFeatures.register("rockslate_copper_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_COPPER_ORE, ModOreFeatures.modifiersWithCount(32,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(112))));

    public static final RegistryEntry<PlacedFeature> ROCKSLATE_DIAMOND_ORE_PLACED = PlacedFeatures.register("rockslate_diamond_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_DIAMOND_ORE, ModOreFeatures.modifiersWithCount(18,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));

    public static final RegistryEntry<PlacedFeature> ROCKSLATE_REDSTONE_ORE_PLACED = PlacedFeatures.register("rockslate_redstone_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_REDSTONE_ORE, ModOreFeatures.modifiersWithCount(16,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-32), YOffset.aboveBottom(32))));

    public static final RegistryEntry<PlacedFeature> ROCKSLATE_LAPIS_ORE_PLACED = PlacedFeatures.register("rockslate_lapis_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_LAPIS_ORE, ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64))));

    public static final RegistryEntry<PlacedFeature> ROCKSLATE_EMERALD_ORE_PLACED = PlacedFeatures.register("rockslate_emerald_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_LAPIS_ORE, ModOreFeatures.modifiersWithCount(200,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(480))));
}
