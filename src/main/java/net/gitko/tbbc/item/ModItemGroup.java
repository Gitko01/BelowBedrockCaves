package net.gitko.tbbc.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final RegistryKey<ItemGroup> TAB = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(BelowBedrockCaves.MOD_ID, "tab"));

    public static void initItemGroup() {
        Registry.register(Registries.ITEM_GROUP, TAB, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.ROCKSLATE_BLOCK.asItem()))
                .displayName(Text.translatable("itemGroup.tbbc.tab"))
                .build());
    }
}
