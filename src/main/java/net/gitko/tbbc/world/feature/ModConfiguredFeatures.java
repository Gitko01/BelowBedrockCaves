package net.gitko.tbbc.world.feature;

import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryEntryList;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RuleTest ROCKSLATE = new BlockMatchRuleTest(ModBlocks.ROCKSLATE_BLOCK);

    // Ore Feature Configs

    public static final List<OreFeatureConfig.Target> BBC_COAL_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_COAL_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_IRON_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_IRON_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_GOLD_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_GOLD_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_COPPER_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_COPPER_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_DIAMOND_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_DIAMOND_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_REDSTONE_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_REDSTONE_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_EMERALD_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_EMERALD_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_LAPIS_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_LAPIS_ORE.getDefaultState())
    );

    // TR ores
    public static final List<OreFeatureConfig.Target> BBC_BAUXITE_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_BAUXITE_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_GALENA_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_GALENA_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_IRIDIUM_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_IRIDIUM_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_LEAD_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_LEAD_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_RUBY_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_RUBY_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_SAPPHIRE_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_SAPPHIRE_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_SILVER_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_SILVER_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_TIN_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_TIN_ORE.getDefaultState())
    );

    // Powah ores
    public static final List<OreFeatureConfig.Target> BBC_URANINITE_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_URANINITE_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_URANINITE_POOR_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_URANINITE_POOR_ORE.getDefaultState())
    );

    public static final List<OreFeatureConfig.Target> BBC_URANINITE_DENSE_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_URANINITE_DENSE_ORE.getDefaultState())
    );

    // Create ores
    public static final List<OreFeatureConfig.Target> BBC_ZINC_ORES = List.of(
            OreFeatureConfig.createTarget(ModConfiguredFeatures.ROCKSLATE,
                    ModBlocks.ROCKSLATE_ZINC_ORE.getDefaultState())
    );

    // Registry Entries

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_COAL_ORE =
            ConfiguredFeatures.register("rockslate_coal_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_COAL_ORES, 17));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_COPPER_ORE =
            ConfiguredFeatures.register("rockslate_copper_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_COPPER_ORES, 20));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_IRON_ORE =
            ConfiguredFeatures.register("rockslate_iron_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_IRON_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_GOLD_ORE =
            ConfiguredFeatures.register("rockslate_gold_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_GOLD_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_REDSTONE_ORE =
            ConfiguredFeatures.register("rockslate_redstone_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_REDSTONE_ORES, 8));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_DIAMOND_ORE =
            ConfiguredFeatures.register("rockslate_diamond_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_DIAMOND_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_LAPIS_ORE =
            ConfiguredFeatures.register("rockslate_lapis_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_LAPIS_ORES, 7));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_EMERALD_ORE =
            ConfiguredFeatures.register("rockslate_emerald_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_EMERALD_ORES, 3));

    // TR ores
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_BAUXITE_ORE =
            ConfiguredFeatures.register("rockslate_bauxite_ore", Feature.ORE,
                new OreFeatureConfig(BBC_BAUXITE_ORES, 6));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_GALENA_ORE =
            ConfiguredFeatures.register("rockslate_galena_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_GALENA_ORES, 8));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_IRIDIUM_ORE =
            ConfiguredFeatures.register("rockslate_iridium_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_IRIDIUM_ORES, 3));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_LEAD_ORE =
            ConfiguredFeatures.register("rockslate_lead_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_LEAD_ORES, 6));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_RUBY_ORE =
            ConfiguredFeatures.register("rockslate_ruby_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_RUBY_ORES, 6));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_SAPPHIRE_ORE =
            ConfiguredFeatures.register("rockslate_sapphire_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_SAPPHIRE_ORES, 6));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_SILVER_ORE =
            ConfiguredFeatures.register("rockslate_silver_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_SILVER_ORES, 6));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_TIN_ORE =
            ConfiguredFeatures.register("rockslate_tin_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_TIN_ORES, 8));


    // Powah ores
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_URANINITE_POOR_ORE =
            ConfiguredFeatures.register("rockslate_uraninite_poor_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_URANINITE_POOR_ORES, 5));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_URANINITE_ORE =
            ConfiguredFeatures.register("rockslate_uraninite_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_URANINITE_ORES, 4));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_URANINITE_DENSE_ORE =
            ConfiguredFeatures.register("rockslate_uraninite_dense_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_URANINITE_DENSE_ORES, 3));

    // Create ores
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> ROCKSLATE_ZINC_ORE =
            ConfiguredFeatures.register("rockslate_zinc_ore", Feature.ORE,
                    new OreFeatureConfig(BBC_ZINC_ORES, 12));
}
