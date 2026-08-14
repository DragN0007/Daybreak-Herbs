package com.dragn0007.daybreak_herbs.items;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DBHItemGroupModifier {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DaybreakHerbs.MODID);

    public static final RegistryObject<CreativeModeTab> GROUP = CREATIVE_MODE_TABS.register("daybreak_herbs",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DBHItems.ICON.get())).title(Component.translatable("itemGroup.daybreak_herbs"))
                    .displayItems((displayParameters, output) -> {

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


