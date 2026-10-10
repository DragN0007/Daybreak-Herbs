package com.dragn0007.daybreak_herbs.util;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class DBHTags {

    public static class Items {
        public static final TagKey<Item> SIMPLE_ROTTERS = tag("simple_rotters"); //plants that just spoil into Rotted Plant Matter
        public static final TagKey<Item> DRIED_ROTTERS = tag("dried_rotters"); //dried items that spoil slower
        public static final TagKey<Item> LEAVES = tag("leaves"); //leaves that can be used for crafting

        public static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        public static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(DaybreakHerbs.MODID, name));
        }
    }

}
