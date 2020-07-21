package adudecalledleo.multibossbarfix.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.hud.BossBarHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(BossBarHud.class)
public class MixinBossBarHud {
    @Redirect(method = "renderBossBar", at = @At(value = "INVOKE",
                                                 target = "Lnet/minecraft/client/gui/hud/BossBarHud;blit(IIIIII)V",
                                                 ordinal = 1))
    private void multibossbarfix$blitOverlay(BossBarHud bossBarHud, int x, int y, int u, int v, int width, int height) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        bossBarHud.blit(x, y, u, v, width, height);
        RenderSystem.disableBlend();
    }

    @Redirect(method = "renderBossBar", at = @At(value = "INVOKE",
                                                 target = "Lnet/minecraft/client/gui/hud/BossBarHud;blit(IIIIII)V",
                                                 ordinal = 3))
    private void multibossbarfix$blitOverlayFill(BossBarHud bossBarHud, int x, int y, int u, int v, int width, int height) {
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        bossBarHud.blit(x, y, u, v, width, height);
        RenderSystem.disableBlend();
    }
}
