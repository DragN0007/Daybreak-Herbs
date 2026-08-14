package com.dragn0007.daybreak_herbs;

import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.items.DBHItemGroupModifier;
import com.dragn0007.daybreak_herbs.items.DBHItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(DaybreakHerbs.MODID)
public class DaybreakHerbs
{
    public static final String MODID = "daybreak_herbs";

    public DaybreakHerbs() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DBHBlocks.register(eventBus);
        DBHItems.register(eventBus);
        DBHItemGroupModifier.register(eventBus);
        DBHBlocks.TILE_ENTITIES.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}