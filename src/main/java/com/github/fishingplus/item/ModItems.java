package com.github.fishingplus.item;

import com.github.fishingplus.FishingPlus;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            FishingPlus.MOD_ID);

    // Raw pike
    public static final RegistryObject<Item> RAW_PIKE = ITEMS.register("raw_pike",
            () -> new Item(new Item.Properties()));

    // Cooked pike
    public static final RegistryObject<Item> COOKED_PIKE = ITEMS.register("cooked_pike",
            () -> new Item(new Item.Properties().food(
                    new FoodProperties.Builder()
                            .alwaysEat()
                            .nutrition(2)
                            .build())));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
