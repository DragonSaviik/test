package com.xingxing.test.registry;

import com.xingxing.test.Test ;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksRegistry {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "examplemod");
    public static DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "examplemod");

    public static RegistryObject<Block> MY_BLOCK = BLOCKS.register("my_block", () -> new Block(BlockBehaviour.Properties.of(Material.ICE).color(MaterialColor.COLOR_BLACK).strength(1.0F).requiresCorrectToolForDrops()));
    public static RegistryObject<BlockItem> MY_BLOCK_ITEM = BLOCK_ITEMS.register("my_block", () -> new BlockItem(MY_BLOCK.get(), new Item.Properties().tab(Test.CreativeTab)));
}
