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
            ModConfiguredFeatures.ROCKSLATE_EMERALD_ORE, ModOreFeatures.modifiersWithCount(200,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-16), YOffset.fixed(480))));

    // TR ores
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_BAUXITE_ORE_PLACED = PlacedFeatures.register("rockslate_bauxite_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_BAUXITE_ORE, ModOreFeatures.modifiersWithCount(30,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.fixed(20))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_GALENA_ORE_PLACED = PlacedFeatures.register("rockslate_galena_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_GALENA_ORE, ModOreFeatures.modifiersWithCount(30,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(25), YOffset.fixed(40))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_IRIDIUM_ORE_PLACED = PlacedFeatures.register("rockslate_iridium_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_IRIDIUM_ORE, ModOreFeatures.modifiersWithCount(10,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(0), YOffset.fixed(0))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_LEAD_ORE_PLACED = PlacedFeatures.register("rockslate_lead_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_LEAD_ORE, ModOreFeatures.modifiersWithCount(40,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(40), YOffset.fixed(40))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_RUBY_ORE_PLACED = PlacedFeatures.register("rockslate_ruby_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_RUBY_ORE, ModOreFeatures.modifiersWithCount(20,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(20), YOffset.fixed(120))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_SAPPHIRE_ORE_PLACED = PlacedFeatures.register("rockslate_sapphire_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_SAPPHIRE_ORE, ModOreFeatures.modifiersWithCount(18,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(20), YOffset.fixed(120))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_SILVER_ORE_PLACED = PlacedFeatures.register("rockslate_silver_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_SILVER_ORE, ModOreFeatures.modifiersWithCount(40,
                    HeightRangePlacementModifier.uniform(YOffset.aboveBottom(40), YOffset.fixed(60))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_TIN_ORE_PLACED = PlacedFeatures.register("rockslate_tin_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_TIN_ORE, ModOreFeatures.modifiersWithCount(40,
                    HeightRangePlacementModifier.uniform(YOffset.fixed(25), YOffset.fixed(80))));

    // Powah ores
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_URANINITE_POOR_ORE_PLACED = PlacedFeatures.register("rockslate_uraninite_poor_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_URANINITE_POOR_ORE, ModOreFeatures.modifiersWithCount(20,
                    HeightRangePlacementModifier.uniform(YOffset.BOTTOM, YOffset.fixed(64))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_URANINITE_ORE_PLACED = PlacedFeatures.register("rockslate_uraninite_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_URANINITE_ORE, ModOreFeatures.modifiersWithCount(15,
                    HeightRangePlacementModifier.uniform(YOffset.BOTTOM, YOffset.fixed(20))));
    public static final RegistryEntry<PlacedFeature> ROCKSLATE_URANINITE_DENSE_ORE_PLACED = PlacedFeatures.register("rockslate_uraninite_dense_ore_placed",
            ModConfiguredFeatures.ROCKSLATE_URANINITE_DENSE_ORE, ModOreFeatures.modifiersWithCount(8,
                    HeightRangePlacementModifier.uniform(YOffset.BOTTOM, YOffset.fixed(0))));
}
