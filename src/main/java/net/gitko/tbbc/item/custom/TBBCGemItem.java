package net.gitko.tbbc.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TBBCGemItem extends Item {
    public TBBCGemItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip_shift_1.tbbc.tbbc_gem"));
            tooltip.add(Text.translatable("tooltip_shift_2.tbbc.tbbc_gem"));
        } else {
            tooltip.add(Text.translatable("tooltip.tbbc.hold_shift"));
        }
    }
}
