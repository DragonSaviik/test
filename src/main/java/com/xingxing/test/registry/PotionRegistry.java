package com.xingxing.test.registry;

import com.xingxing.test.Test ;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PotionRegistry {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(ForgeRegistries.POTIONS, Test.MOD_ID);

    public static final RegistryObject<Potion> MY_POTION = POTIONS.register("dragon_breath", () -> new Potion(new MobEffectInstance(EffectsRegistry.MY_EFFECTS.get(), 30*20)));
}
