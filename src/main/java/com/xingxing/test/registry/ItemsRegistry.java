package com.xingxing.test.registry;

import com.xingxing.test.Test ;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Test.MOD_ID);

    public static final RegistryObject<Item> MY_FOOD = ITEMS.register("my_food", ()->new Item(new Item.Properties().stacksTo(64).food(new FoodProperties.Builder().nutrition(10).saturationMod(10).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 60*20, 9), 1.0F).build()).rarity(Rarity.UNCOMMON).tab(Test.CreativeTab)));
}
