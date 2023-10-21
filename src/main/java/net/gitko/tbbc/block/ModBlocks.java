package net.gitko.tbbc.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {
    // Blocks
    public static final Block ROCKSLATE_BLOCK = registerBlock("rockslate_block",
            new Block(FabricBlockSettings.of(
                    Material.STONE)
                    .strength(6f, 6f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block IRONSLATE_BLOCK = registerBlock("ironslate_block",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(4.5f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB, "tooltip.tbbc.ironslate_block", 2, true);

    public static final Block ROCKSLATE_COAL_ORE = registerBlock("rockslate_coal_ore",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_IRON_ORE = registerBlock("rockslate_iron_ore",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_GOLD_ORE = registerBlock("rockslate_gold_ore",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_DIAMOND_ORE = registerBlock("rockslate_diamond_ore",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_REDSTONE_ORE = registerBlock("rockslate_redstone_ore",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_LAPIS_ORE = registerBlock("rockslate_lapis_ore",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_EMERALD_ORE = registerBlock("rockslate_emerald_ore",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_COPPER_ORE = registerBlock("rockslate_copper_ore",
            new Block(FabricBlockSettings.of(
                            Material.STONE)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    // Registry stuff

    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey, Integer tooltipLineAmount, Boolean holdDownShift) {
        registerBlockItem(name, block, group, tooltipKey, tooltipLineAmount, holdDownShift);
        return Registry.register(Registry.BLOCK, new Identifier(BelowBedrockCaves.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey, Integer tooltipLineAmount, Boolean holdDownShift) {
        return Registry.register(Registry.ITEM, new Identifier(BelowBedrockCaves.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings().group(group)) {
                @Override
                public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                    // Mojang. Why is it so hard to add \n?
                    if (holdDownShift) {
                        if (Screen.hasShiftDown()) {
                            Integer currentLine = 1;

                            while (tooltipLineAmount >= currentLine) {
                                tooltip.add(Text.translatable(tooltipKey + "_" + currentLine.toString()));
                                currentLine += 1;
                            }
                        } else {
                            tooltip.add(Text.translatable("tooltip.tbbc.hold_shift"));
                        }
                    } else {
                        Integer currentLine = 1;

                        while (tooltipLineAmount >= currentLine) {
                            tooltip.add(Text.translatable(tooltipKey + "_" + currentLine.toString()));
                            currentLine += 1;
                        }
                    }
                }
            });
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(BelowBedrockCaves.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(BelowBedrockCaves.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        BelowBedrockCaves.LOGGER.info("Registering ModBlocks for " + BelowBedrockCaves.MOD_ID);
    }
}
