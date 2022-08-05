package net.gitko.tbbc.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TAB = FabricItemGroupBuilder.build(new Identifier(BelowBedrockCaves.MOD_ID, "tab"),
            () -> new ItemStack(ModBlocks.ROCKSLATE_BLOCK)
    );
}
