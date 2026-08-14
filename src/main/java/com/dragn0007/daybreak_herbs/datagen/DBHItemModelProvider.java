package com.dragn0007.daybreak_herbs.datagen;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class DBHItemModelProvider extends ItemModelProvider {
    public DBHItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DaybreakHerbs.MODID, existingFileHelper);
    }

    @Override
    public void registerModels() {

    }

    public ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DaybreakHerbs.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder advancedItem(RegistryObject<Item> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DaybreakHerbs.MODID,"item/" + getTextureName));
    }
    public ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DaybreakHerbs.MODID,"block/" + item.getId().getPath()));
    }
    public ItemModelBuilder advancedBlockItem(RegistryObject<Block> item, String getTextureName) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DaybreakHerbs.MODID,"block/" + getTextureName));
    }
}