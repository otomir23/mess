package me.otomir23.mess.mixin;

import me.otomir23.mess.Mess;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void mess$onInit(CallbackInfo ci) {
		Mess.INSTANCE.getLOGGER().info("Mixins are working!");
	}
}
