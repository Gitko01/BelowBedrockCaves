package net.gitko.tbbc.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.loader.api.FabricLoader;
import net.gitko.tbbc.world.feature.ModPlacedFeatures;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.gen.GenerationStep;

import java.util.function.Predicate;

public class ModOreGeneration {
    
    public static Predicate<BiomeSelectionContext> bbcDimBiomes() {
        return context -> {
            return context.getBiomeKey().getValue().getNamespace().equals("tbbc");
        };
    }

    public static void generateOres() {
        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_COAL_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_IRON_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_GOLD_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_COPPER_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_REDSTONE_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_DIAMOND_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_LAPIS_ORE_PLACED.getKey().get());

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_EMERALD_ORE_PLACED.getKey().get());

        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_BAUXITE_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_GALENA_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_IRIDIUM_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_LEAD_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_RUBY_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_SAPPHIRE_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_SILVER_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_TIN_ORE_PLACED.getKey().get());
        }

        if (FabricLoader.getInstance().isModLoaded("powah")) {
            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_URANINITE_POOR_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_URANINITE_ORE_PLACED.getKey().get());

            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_URANINITE_DENSE_ORE_PLACED.getKey().get());
        }

        if (FabricLoader.getInstance().isModLoaded("create")) {
            BiomeModifications.addFeature(bbcDimBiomes(),
                    GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_ZINC_ORE_PLACED.getKey().get());
        }
    }
}
