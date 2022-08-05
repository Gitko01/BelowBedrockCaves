package net.gitko.tbbc;

import net.fabricmc.api.ModInitializer;
import net.gitko.tbbc.block.ModBlocks;
import net.gitko.tbbc.item.ModItems;
import net.gitko.tbbc.world.biome.ModBiomes;
import net.gitko.tbbc.world.dimension.ModDimensions;
import net.gitko.tbbc.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BelowBedrockCaves implements ModInitializer {
	public static final String MOD_ID = "tbbc";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("TBBC (The Below Bedrock Caves) loaded");

		ModItems.registerItems();
		ModBlocks.registerModBlocks();
		ModDimensions.register();
		ModWorldGen.generateModWorldGen();
		ModBiomes.register();
	}
}
