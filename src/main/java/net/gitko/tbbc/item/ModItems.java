package net.gitko.tbbc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Items
    public static final Item TBBC_GEM = registerItem("tbbc_gem",
            new TBBCGemItem(new FabricItemSettings()
                    .maxCount(1)
                    .group(ModItemGroup.TAB)
            ));

    // Registry stuff

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(BelowBedrockCaves.MOD_ID, name), item);
    }

    public static void registerItems() {
        BelowBedrockCaves.LOGGER.info("Registering ModItems for " + BelowBedrockCaves.MOD_ID);
    }
}
