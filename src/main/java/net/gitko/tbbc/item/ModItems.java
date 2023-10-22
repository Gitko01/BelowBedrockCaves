package net.gitko.tbbc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Items
    public static final Item TBBC_GEM = registerItem("tbbc_gem",
            new TBBCGemItem(new FabricItemSettings()
                    .maxCount(1)
            ), ModItemGroup.TAB);

    // Registry stuff

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(item);
        });

        return Registry.register(Registries.ITEM, new Identifier(BelowBedrockCaves.MOD_ID, name), item);
    }
}
