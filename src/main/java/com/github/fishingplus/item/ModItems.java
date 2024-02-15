package com.github.fishingplus.item;

import com.github.fishingplus.FishingPlus;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FishingPlus.MOD_ID);
    public static final RegistryObject<Item> PIKE = ITEMS.register("pike", () -> new Item(
            new Item.Properties()
                    .stacksTo(64)
                    .setNoRepair()));
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
