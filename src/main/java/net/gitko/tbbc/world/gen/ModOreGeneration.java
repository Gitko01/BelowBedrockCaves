package net.gitko.tbbc.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.world.feature.ModPlacedFeatures;
import net.minecraft.world.gen.GenerationStep;

import java.util.function.Predicate;

public class ModOreGeneration {
    
    public static Predicate<BiomeSelectionContext> bbcDimBiomes() {
        return context -> {
            return context.getBiomeKey().getValue().getNamespace().equals(BelowBedrockCaves.MOD_ID);
        };
    }

    public static void generateOres() {
        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_COAL_ORE_PLACED);

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_IRON_ORE_PLACED);

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_GOLD_ORE_PLACED);

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_COPPER_ORE_PLACED);

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_REDSTONE_ORE_PLACED);

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_DIAMOND_ORE_PLACED);

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_LAPIS_ORE_PLACED);

        BiomeModifications.addFeature(bbcDimBiomes(),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ROCKSLATE_EMERALD_ORE_PLACED);
    }
}
