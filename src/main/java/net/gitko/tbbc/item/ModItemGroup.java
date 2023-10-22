package net.gitko.tbbc.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TAB = FabricItemGroup.builder(new Identifier(BelowBedrockCaves.MOD_ID, "tab"))
            .icon(() -> new ItemStack(ModBlocks.ROCKSLATE_BLOCK.asItem()))
            .build();
}
