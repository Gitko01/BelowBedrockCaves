package net.gitko.tbbc.world.biome;

import net.gitko.tbbc.BelowBedrockCaves;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.OverworldBiomeCreator;

public class ModBiomes {
    public static final RegistryKey<Biome> BBCPLAINS_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcplains"));

    public static final RegistryKey<Biome> BBCDRIPSTONECAVES_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcdripstonecaves"));

    public static final RegistryKey<Biome> BBCSAVANNAPLATEAU_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcsavannaplateau"));

    public static final RegistryKey<Biome> BBCFROZENPEAKS_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcfrozenpeaks"));

    public static final RegistryKey<Biome> BBCLUSHCAVES_BIOME_KEY = RegistryKey.of(Registry.BIOME_KEY,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbclushcaves"));

    public static void register() {
        BelowBedrockCaves.LOGGER.debug("Registering ModBiomes for " + BelowBedrockCaves.MOD_ID);

        Registry.register(BuiltinRegistries.BIOME, BBCPLAINS_BIOME_KEY.getValue(), OverworldBiomeCreator.createPlains(false,false,false));
        Registry.register(BuiltinRegistries.BIOME, BBCDRIPSTONECAVES_BIOME_KEY.getValue(), OverworldBiomeCreator.createDripstoneCaves());
        Registry.register(BuiltinRegistries.BIOME, BBCSAVANNAPLATEAU_BIOME_KEY.getValue(), OverworldBiomeCreator.createSavanna(false, true));
        Registry.register(BuiltinRegistries.BIOME, BBCFROZENPEAKS_BIOME_KEY.getValue(), OverworldBiomeCreator.createFrozenPeaks());
        Registry.register(BuiltinRegistries.BIOME, BBCLUSHCAVES_BIOME_KEY.getValue(), OverworldBiomeCreator.createLushCaves());
    }
}
