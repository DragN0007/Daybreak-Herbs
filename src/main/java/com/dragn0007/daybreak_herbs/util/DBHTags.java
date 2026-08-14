package com.dragn0007.daybreak_herbs.util;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class DBHTags {

    public static class Items {


        public static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        public static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(DaybreakHerbs.MODID, name));
        }
    }

}
