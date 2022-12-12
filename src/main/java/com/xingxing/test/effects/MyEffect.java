package com.xingxing.test.effects;

import com.xingxing.test.Test ;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;

public class MyEffect extends MobEffect {
    public MyEffect(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
    }
    @Override
    public boolean isBeneficial() {
        return false;
    }

    @Override
    public boolean isInstantenous() {
        return false;
    }

    @Override
    public boolean isDurationEffectTick(int remainingTicks, int level) {
        return true;
    }

    @Override
    public @NotNull Component getDisplayName() {
        return new TranslatableComponent(Test.MOD_ID + ".effect.dragon_breath");
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int level) {

    }
}
