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
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(DBHItems.GOLDENROD.get())).title(Component.translatable("itemGroup.daybreak_herbs"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(DBHItems.WHITE_WILLOW.get());
                        output.accept(DBHItems.GOLDENROD.get());
                        output.accept(DBHItems.GOLDENROD_PETALS.get());
                        output.accept(DBHItems.HORSE_MINT.get());
                        output.accept(DBHItems.HORSE_MINT_PETALS.get());
                        output.accept(DBHItems.ELDERBERRY.get());
                        output.accept(DBHItems.CATMINT.get());
                        output.accept(DBHItems.YARROW.get());
                        output.accept(DBHItems.ECHINACEA_ROOTS.get());
                        output.accept(DBHItems.WHITE_SAGEBRUSH.get());
                        output.accept(DBHItems.WHITE_SAGEBRUSH_LEAF.get());
                        output.accept(DBHItems.RIBWORT.get());
                        output.accept(DBHItems.RIBWORT_LEAF.get());
                        output.accept(DBHItems.SWEETROOT.get());
                        output.accept(DBHItems.SUNDROPS.get());
                        output.accept(DBHItems.SUNDROPS_BUDS.get());
                        output.accept(DBHItems.BONESET.get());
                        output.accept(DBHItems.MARSH_MALLOW.get());
                        output.accept(DBHItems.MARSH_MALLOW_ROOTS.get());
                        output.accept(DBHItems.CALAMUS.get());
                        output.accept(DBHItems.JEWELWEED.get());
                        output.accept(DBHItems.WINTERBLOOM.get());
                        output.accept(DBHItems.BULRUSH.get());
                        output.accept(DBHItems.GOLDENSEAL.get());
                        output.accept(DBHItems.ARNICA.get());
                        output.accept(DBHItems.RATTLEWEED.get());
                        output.accept(DBHItems.USNEA.get());
                        output.accept(DBHItems.JUNIPER_BERRY.get());
                        output.accept(DBHItems.DEATH_CAMAS.get());
                        output.accept(DBHItems.LARKSPUR.get());
                        output.accept(DBHItems.DEADLY_NIGHTSHADE_BERRY.get());
                        output.accept(DBHItems.POISON_IVY.get());
                        output.accept(DBHItems.DEVILS_TRUMPET.get());
                        output.accept(DBHItems.POKEWEED.get());
                        output.accept(DBHItems.GOLDENROD_POULTICE.get());
                        output.accept(DBHItems.COBWEB.get());
                        output.accept(DBHItems.MOSS_CLUMP.get());
                        output.accept(DBHItems.PINE_RESIN.get());
                        output.accept(DBHItems.DRIED_ARNICA.get());
                        output.accept(DBHItems.DRIED_BULRUSH.get());
                        output.accept(DBHItems.DRIED_CATMINT.get());
                        output.accept(DBHItems.DRIED_JEWELWEED.get());
                        output.accept(DBHItems.DRIED_HORSE_MINT_PETALS.get());
                        output.accept(DBHItems.DRIED_JUNIPER_BERRY.get());
                        output.accept(DBHItems.DRIED_MARSH_MALLOW.get());
                        output.accept(DBHItems.DRIED_MOSS_CLUMP.get());
                        output.accept(DBHItems.DRIED_USNEA.get());
                        output.accept(DBHItems.DRIED_WHITE_SAGEBRUSH_LEAF.get());
                        output.accept(DBHItems.DRIED_WINTERBLOOM.get());
                        output.accept(DBHItems.DRIED_YARROW.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


