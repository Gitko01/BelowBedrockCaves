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

    // Registry Entries
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_COAL_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_coal_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_COPPER_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_copper_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_IRON_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_iron_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_GOLD_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_gold_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_REDSTONE_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_redstone_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_DIAMOND_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_diamond_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_LAPIS_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_lapis_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_EMERALD_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_emerald_ore"));

    // TR ores
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_BAUXITE_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_bauxite_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_GALENA_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_galena_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_IRIDIUM_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_iridium_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_LEAD_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_lead_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_RUBY_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_ruby_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_SAPPHIRE_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_sapphire_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_SILVER_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_silver_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_TIN_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_tin_ore"));

    // Powah ores
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_URANINITE_POOR_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_uraninite_poor_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_URANINITE_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_uraninite_ore"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> ROCKSLATE_URANINITE_DENSE_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BelowBedrockCaves.MOD_ID, "rockslate_uraninite_dense_ore"));

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> configuredFeatureRegisterable) {
        configuredFeatureRegisterable.register(ROCKSLATE_COAL_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_COAL_ORES, 17)));
        configuredFeatureRegisterable.register(ROCKSLATE_COPPER_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_COPPER_ORES, 20)));
        configuredFeatureRegisterable.register(ROCKSLATE_IRON_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_IRON_ORES, 9)));
        configuredFeatureRegisterable.register(ROCKSLATE_GOLD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_GOLD_ORES, 9)));
        configuredFeatureRegisterable.register(ROCKSLATE_REDSTONE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_REDSTONE_ORES, 8)));
        configuredFeatureRegisterable.register(ROCKSLATE_DIAMOND_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_DIAMOND_ORES, 12)));
        configuredFeatureRegisterable.register(ROCKSLATE_LAPIS_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_LAPIS_ORES, 7)));
        configuredFeatureRegisterable.register(ROCKSLATE_EMERALD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_EMERALD_ORES, 3)));

        // TR ores
        configuredFeatureRegisterable.register(ROCKSLATE_BAUXITE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_BAUXITE_ORES, 6)));
        configuredFeatureRegisterable.register(ROCKSLATE_GALENA_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_GALENA_ORES, 8)));
        configuredFeatureRegisterable.register(ROCKSLATE_IRIDIUM_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_IRIDIUM_ORES, 3)));
        configuredFeatureRegisterable.register(ROCKSLATE_LEAD_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_LEAD_ORES, 6)));
        configuredFeatureRegisterable.register(ROCKSLATE_RUBY_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_RUBY_ORES, 6)));
        configuredFeatureRegisterable.register(ROCKSLATE_SAPPHIRE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_SAPPHIRE_ORES, 6)));
        configuredFeatureRegisterable.register(ROCKSLATE_SILVER_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_SILVER_ORES, 6)));
        configuredFeatureRegisterable.register(ROCKSLATE_TIN_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_TIN_ORES, 8)));

        // Powah ores
        configuredFeatureRegisterable.register(ROCKSLATE_URANINITE_POOR_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_URANINITE_POOR_ORES, 5)));
        configuredFeatureRegisterable.register(ROCKSLATE_URANINITE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_URANINITE_ORES, 4)));
        configuredFeatureRegisterable.register(ROCKSLATE_URANINITE_DENSE_ORE, new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(BBC_URANINITE_DENSE_ORES, 3)));
    }
}
