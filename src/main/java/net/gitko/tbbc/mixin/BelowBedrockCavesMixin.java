package net.gitko.tbbc.mixin;

import net.gitko.tbbc.BelowBedrockCaves;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class BelowBedrockCavesMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		BelowBedrockCaves.LOGGER.info("TBBC (The Below Bedrock Caves) Mixin loaded");
	}
	// Nothing here yet!
}
