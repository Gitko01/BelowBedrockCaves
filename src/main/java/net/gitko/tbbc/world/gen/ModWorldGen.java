package net.gitko.tbbc.world.gen;

import net.gitko.tbbc.BelowBedrockCaves;

public class ModWorldGen {
    public static void generateModWorldGen() {
        // THIS HAS AN ORDER!!
        BelowBedrockCaves.LOGGER.info("TBBC generating features");
        ModOreGeneration.generateOres();
    }
}
