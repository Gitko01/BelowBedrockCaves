package net.gitko.tbbc.world.dimension;

import net.gitko.tbbc.BelowBedrockCaves;
import net.gitko.tbbc.block.ModBlocks;
import net.gitko.tbbc.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> BBCDIM_DIMENSION_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(BelowBedrockCaves.MOD_ID, "bbcdim"));
    public static final RegistryKey<DimensionType> BBCDIM_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE,
            BBCDIM_DIMENSION_KEY.getValue());

    public static void register() {
        BelowBedrockCaves.LOGGER.debug("Registering ModDimensions for " + BelowBedrockCaves.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.IRONSLATE_BLOCK)
                .lightWithItem(ModItems.TBBC_GEM)
                .destDimID(new Identifier(BelowBedrockCaves.MOD_ID, "bbcdim"))
                .tintColor(58,141,228)
                .flatPortal()
                .forcedSize(3,3)
                .registerPortal();
    }
}
