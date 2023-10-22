package net.gitko.tbbc.world.feature;

import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
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
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_COAL_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_coal_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_COPPER_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_copper_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_IRON_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_iron_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_GOLD_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_gold_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_REDSTONE_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_redstone_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_DIAMOND_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_diamond_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_LAPIS_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_lapis_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_EMERALD_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_emerald_ore"));

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> configuredFeatureRegisterable) {
        configuredFeatureRegisterable.register(ROCKSLATE_COAL_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_COAL_ORES, 17)));
        configuredFeatureRegisterable.register(ROCKSLATE_COPPER_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_COPPER_ORES, 20)));
        configuredFeatureRegisterable.register(ROCKSLATE_IRON_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_IRON_ORES, 9)));
        configuredFeatureRegisterable.register(ROCKSLATE_GOLD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_GOLD_ORES, 9)));
        configuredFeatureRegisterable.register(ROCKSLATE_REDSTONE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_REDSTONE_ORES, 8)));
        configuredFeatureRegisterable.register(ROCKSLATE_DIAMOND_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_DIAMOND_ORES, 12)));
        configuredFeatureRegisterable.register(ROCKSLATE_LAPIS_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_LAPIS_ORES, 7)));
        configuredFeatureRegisterable.register(ROCKSLATE_EMERALD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_EMERALD_ORES, 3)));
    }
}
