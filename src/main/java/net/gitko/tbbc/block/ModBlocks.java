package net.gitko.tbbc.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ModBlocks {
    // Blocks
    public static final Block ROCKSLATE_BLOCK = registerBlock("rockslate_block",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(6f, 6f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block IRONSLATE_BLOCK = registerBlock("ironslate_block",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(4.5f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB, "tooltip.tbbc.ironslate_block", 2, true);

    public static final Block ROCKSLATE_COAL_ORE = registerBlock("rockslate_coal_ore",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_IRON_ORE = registerBlock("rockslate_iron_ore",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_GOLD_ORE = registerBlock("rockslate_gold_ore",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_DIAMOND_ORE = registerBlock("rockslate_diamond_ore",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_REDSTONE_ORE = registerBlock("rockslate_redstone_ore",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_LAPIS_ORE = registerBlock("rockslate_lapis_ore",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_EMERALD_ORE = registerBlock("rockslate_emerald_ore",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    public static final Block ROCKSLATE_COPPER_ORE = registerBlock("rockslate_copper_ore",
            new Block(FabricBlockSettings.create()
                    .mapColor(MapColor.STONE_GRAY)
                    .strength(7f, 3f)
                    .requiresTool()
            ), ModItemGroup.TAB);

    // TR ores
    public static Block ROCKSLATE_BAUXITE_ORE;
    public static Block ROCKSLATE_GALENA_ORE;
    public static Block ROCKSLATE_IRIDIUM_ORE;
    public static Block ROCKSLATE_LEAD_ORE;
    public static Block ROCKSLATE_RUBY_ORE;
    public static Block ROCKSLATE_SAPPHIRE_ORE;
    public static Block ROCKSLATE_SILVER_ORE;
    public static Block ROCKSLATE_TIN_ORE;

    // Powah ores
    public static Block ROCKSLATE_URANINITE_POOR_ORE;
    public static Block ROCKSLATE_URANINITE_ORE;
    public static Block ROCKSLATE_URANINITE_DENSE_ORE;

    // Create ores
    public static Block ROCKSLATE_ZINC_ORE;

    public static void registerDependentBlocks() {
        // Tech Reborn
        // only overworld ores (pyrite, cinnabar, sphalerite, tungsten, sheldonite, peridot, and sodalite EXCLUDED)
        ROCKSLATE_BAUXITE_ORE = registerDependentOre("rockslate_bauxite_ore", "techreborn");
        ROCKSLATE_GALENA_ORE = registerDependentOre("rockslate_galena_ore", "techreborn");
        ROCKSLATE_IRIDIUM_ORE = registerDependentOre("rockslate_iridium_ore", "techreborn");
        ROCKSLATE_LEAD_ORE = registerDependentOre("rockslate_lead_ore", "techreborn");
        ROCKSLATE_RUBY_ORE = registerDependentOre("rockslate_ruby_ore", "techreborn");
        ROCKSLATE_SAPPHIRE_ORE = registerDependentOre("rockslate_sapphire_ore", "techreborn");
        ROCKSLATE_SILVER_ORE = registerDependentOre("rockslate_silver_ore", "techreborn");
        ROCKSLATE_TIN_ORE = registerDependentOre("rockslate_tin_ore", "techreborn");

        // Powah
        ROCKSLATE_URANINITE_POOR_ORE = registerDependentOre("rockslate_uraninite_poor_ore", "powah");
        ROCKSLATE_URANINITE_ORE = registerDependentOre("rockslate_uraninite_ore", "powah");
        ROCKSLATE_URANINITE_DENSE_ORE = registerDependentOre("rockslate_uraninite_dense_ore", "powah");

        // Create
        ROCKSLATE_ZINC_ORE = registerDependentOre("rockslate_zinc_ore", "create");

        // Ad Astra

        // Modern Industrialization

    }

    private static Block registerDependentOre(String name, String modid) {
        if (!FabricLoader.getInstance().isModLoaded(modid)) {
            return registerHiddenBlock(name,
                    new Block(FabricBlockSettings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .strength(7f, 3f)
                            .requiresTool()
                    ));
        } else {
            return registerBlock(name,
                    new Block(FabricBlockSettings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .strength(7f, 3f)
                            .requiresTool()
                    ), ModItemGroup.TAB, "tooltip.tbbc." + modid, 1, false);
        }
    }

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group, String tooltipKey, Integer tooltipLineAmount, Boolean holdDownShift) {
        registerBlockItem(name, block, group, tooltipKey, tooltipLineAmount, holdDownShift);
        return Registry.register(Registries.BLOCK, new Identifier(BelowBedrockCaves.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group, String tooltipKey, Integer tooltipLineAmount, Boolean holdDownShift) {
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings()) {
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
        };

        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(blockItem);
        });

        return Registry.register(Registries.ITEM, new Identifier(BelowBedrockCaves.MOD_ID, name),
                blockItem);
    }

    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(BelowBedrockCaves.MOD_ID, name), block);
    }

    private static Block registerHiddenBlock(String name, Block block) {
        registerHiddenBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(BelowBedrockCaves.MOD_ID, name), block);
    }

    private static void registerHiddenBlockItem(String name, Block block) {
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings()) {
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable("tooltip.tbbc.placeholder"));
            }
        };

        Registry.register(Registries.ITEM, new Identifier(BelowBedrockCaves.MOD_ID, name),
                blockItem);
    }

    private static void registerBlockItem(String name, Block block, RegistryKey<ItemGroup> group) {
        BlockItem blockItem = new BlockItem(block, new FabricItemSettings());

        ItemGroupEvents.modifyEntriesEvent(group).register(content -> {
            content.add(blockItem);
        });

        Registry.register(Registries.ITEM, new Identifier(BelowBedrockCaves.MOD_ID, name),
                blockItem);
    }
}
