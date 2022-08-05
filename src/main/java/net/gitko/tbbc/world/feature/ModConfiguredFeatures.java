package net.gitko.tbbc.world.feature;

import net.gitko.tbbc.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.registry.RegistryEntry;
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
}
