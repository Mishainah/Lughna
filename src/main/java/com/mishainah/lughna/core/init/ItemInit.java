package com.mishainah.lughna.core.init;

import com.mishainah.lughna.Lughna;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Lughna.MOD_ID);

    public static final RegistryObject<Item> LEYMULETF = ITEMS.register("leymulet_full", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LEYMULETE = ITEMS.register("leymulet_empty", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> CXOUSIA = ITEMS.register("condensed_exousia", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> RXOUSIA = ITEMS.register("raw_exousia", () -> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

}