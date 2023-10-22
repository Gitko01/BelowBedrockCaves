package net.gitko.tbbc.world.biome;

import net.gitko.tbbc.BelowBedrockCaves;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.OverworldBiomeCreator;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.PlacedFeature;

public class ModBiomes {
    public static final RegistryKey<Biome> BBCPLAINS_BIOME_KEY = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcplains"));

    public static final RegistryKey<Biome> BBCDRIPSTONECAVES_BIOME_KEY = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcdripstonecaves"));

    public static final RegistryKey<Biome> BBCSAVANNAPLATEAU_BIOME_KEY = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcsavannaplateau"));

    public static final RegistryKey<Biome> BBCFROZENPEAKS_BIOME_KEY = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcfrozenpeaks"));

    public static final RegistryKey<Biome> BBCLUSHCAVES_BIOME_KEY = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbclushcaves"));

    public static void bootstrap(Registerable<Biome> biomeRegisterable) {
        RegistryEntryLookup<PlacedFeature> registryEntryLookup = biomeRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        RegistryEntryLookup<ConfiguredCarver<?>> registryEntryLookup2 = biomeRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER);

        biomeRegisterable.register(BBCPLAINS_BIOME_KEY, OverworldBiomeCreator.createPlains(registryEntryLookup, registryEntryLookup2, false, false, false));
        biomeRegisterable.register(BBCDRIPSTONECAVES_BIOME_KEY, OverworldBiomeCreator.createDripstoneCaves(registryEntryLookup, registryEntryLookup2));
        biomeRegisterable.register(BBCSAVANNAPLATEAU_BIOME_KEY, OverworldBiomeCreator.createSavanna(registryEntryLookup, registryEntryLookup2,false, true));
        biomeRegisterable.register(BBCFROZENPEAKS_BIOME_KEY, OverworldBiomeCreator.createFrozenPeaks(registryEntryLookup, registryEntryLookup2));
        biomeRegisterable.register(BBCLUSHCAVES_BIOME_KEY, OverworldBiomeCreator.createLushCaves(registryEntryLookup, registryEntryLookup2));
    }
}
