package com.dragn0007.daybreak_herbs.items;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DBHItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DaybreakHerbs.MODID);



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}