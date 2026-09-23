package com.dragn0007.daybreak_herbs.datagen;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.items.DBHItems;
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
        advancedBlockItem(DBHBlocks.WILD_GOLDENROD, "goldenrod_stage3");
        simpleItem(DBHItems.GOLDENROD);
        simpleItem(DBHItems.GOLDENROD_PETALS);
        simpleItem(DBHItems.GOLDENROD_POULTICE);
        advancedItem(DBHItems.DRIED_GOLDENROD_PETALS, "dried_petals");

        advancedBlockItem(DBHBlocks.WILD_HORSE_MINT, "horse_mint_stage3");
        simpleItem(DBHItems.HORSE_MINT);
        simpleItem(DBHItems.HORSE_MINT_PETALS);
        advancedItem(DBHItems.DRIED_HORSE_MINT_PETALS, "dried_petals");

        advancedBlockItem(DBHBlocks.WILD_ELDERBERRY, "elderberry_stage3");
        simpleItem(DBHItems.ELDERBERRY);
        simpleItem(DBHItems.DRIED_ELDERBERRY);

        advancedBlockItem(DBHBlocks.WILD_CATMINT, "catmint_stage3");
        simpleItem(DBHItems.CATMINT);
        simpleItem(DBHItems.DRIED_CATMINT);

        advancedBlockItem(DBHBlocks.WILD_YARROW, "yarrow_stage3");
        simpleItem(DBHItems.YARROW);
        simpleItem(DBHItems.DRIED_YARROW);

        advancedBlockItem(DBHBlocks.WILD_ECHINACEA, "echinacea_stage3");
        simpleItem(DBHItems.ECHINACEA_ROOTS);
        simpleItem(DBHItems.DRIED_ECHINACEA_ROOTS);

        advancedBlockItem(DBHBlocks.WILD_WHITE_SAGEBRUSH, "white_sagebrush_stage3");
        simpleItem(DBHItems.WHITE_SAGEBRUSH);
        simpleItem(DBHItems.WHITE_SAGEBRUSH_LEAF);
        advancedItem(DBHItems.DRIED_WHITE_SAGEBRUSH_LEAF, "dried_leaf");

        advancedBlockItem(DBHBlocks.WILD_RIBWORT, "ribwort_stage3");
        simpleItem(DBHItems.RIBWORT);
        simpleItem(DBHItems.RIBWORT_LEAF);
        simpleItem(DBHItems.RIBWORT_POULTICE);
        advancedItem(DBHItems.DRIED_RIBWORT_LEAF, "dried_leaf");

        advancedBlockItem(DBHBlocks.WILD_SWEETROOT, "sweetroot_stage3");
        simpleItem(DBHItems.SWEETROOT);
        simpleItem(DBHItems.DRIED_SWEETROOT);
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
    private ItemModelBuilder simpleSpriteBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DaybreakHerbs.MODID,"block/" + block.getId().getPath()));
    }
    private ItemModelBuilder advancedSpriteBlock(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DaybreakHerbs.MODID,"item/" + block.getId().getPath()));
    }
}