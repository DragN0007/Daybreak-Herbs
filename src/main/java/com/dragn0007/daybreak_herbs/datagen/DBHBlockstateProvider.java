package com.dragn0007.daybreak_herbs.datagen;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.blocks.base.HerbCropBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collections;

public class DBHBlockstateProvider extends BlockStateProvider {
    public DBHBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DaybreakHerbs.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        createCrossCrop((HerbCropBlock) DBHBlocks.GOLDENROD.get(), "goldenrod", "goldenrod",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_GOLDENROD.get(), models().cross(DBHBlocks.WILD_GOLDENROD.getId().getPath(),
                wildPlantTexture("goldenrod_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.HORSE_MINT.get(), "horse_mint", "horse_mint",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_HORSE_MINT.get(), models().cross(DBHBlocks.WILD_HORSE_MINT.getId().getPath(),
                wildPlantTexture("horse_mint_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.ELDERBERRY.get(), "elderberry", "elderberry",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_ELDERBERRY.get(), models().cross(DBHBlocks.WILD_ELDERBERRY.getId().getPath(),
                wildPlantTexture("elderberry_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.CATMINT.get(), "catmint", "catmint",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_CATMINT.get(), models().cross(DBHBlocks.WILD_CATMINT.getId().getPath(),
                wildPlantTexture("catmint_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.YARROW.get(), "yarrow", "yarrow",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_YARROW.get(), models().cross(DBHBlocks.WILD_YARROW.getId().getPath(),
                wildPlantTexture("yarrow_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.ECHINACEA.get(), "echinacea", "echinacea",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_ECHINACEA.get(), models().cross(DBHBlocks.WILD_ECHINACEA.getId().getPath(),
                wildPlantTexture("echinacea_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.WHITE_SAGEBRUSH.get(), "white_sagebrush", "white_sagebrush",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_WHITE_SAGEBRUSH.get(), models().cross(DBHBlocks.WILD_WHITE_SAGEBRUSH.getId().getPath(),
                wildPlantTexture("white_sagebrush_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.RIBWORT.get(), "ribwort", "ribwort",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_RIBWORT.get(), models().cross(DBHBlocks.WILD_RIBWORT.getId().getPath(),
                wildPlantTexture("ribwort_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.SWEETROOT.get(), "sweetroot", "sweetroot",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_SWEETROOT.get(), models().cross(DBHBlocks.WILD_SWEETROOT.getId().getPath(),
                wildPlantTexture("sweetroot_stage3")).renderType("cutout"));

        createCrossCrop((HerbCropBlock) DBHBlocks.SUNDROPS.get(), "sundrops", "sundrops",
                0, 0, 1, 1, 2, 2, 2, 3);
        simpleBlock(DBHBlocks.WILD_SUNDROPS.get(), models().cross(DBHBlocks.WILD_SUNDROPS.getId().getPath(),
                wildPlantTexture("sundrops_stage3")).renderType("cutout"));
    }

    public ResourceLocation wildPlantTexture(String getTextureName) {
        return new ResourceLocation(DaybreakHerbs.MODID,"block/" + getTextureName);
    }

    public void createCrossCrop(HerbCropBlock block, String modelNamePrefix, String textureNamePrefix, int... stageMap) {
        Property<Integer> ageProperty = block.getAgeProperty();
        int maxAge = Collections.max(ageProperty.getPossibleValues());

        if (stageMap == null || stageMap.length == 0) {
            stageMap = new int[maxAge + 1];
            for (int i = 0; i <= maxAge; i++) {
                stageMap[i] = i;
            }
        }

        final int[] finalStageMap = stageMap;

        getVariantBuilder(block).forAllStates(state -> {
            int age = state.getValue(ageProperty);
            int stage = finalStageMap[age];
            String modelName = modelNamePrefix + "_stage" + stage;
            String texturePath = textureNamePrefix + "_stage" + stage;

            return ConfiguredModel.builder()
                    .modelFile(models().cross(modelName, new ResourceLocation(DaybreakHerbs.MODID, "block/" + texturePath))
                            .renderType("cutout"))
                    .build();
        });
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(DaybreakHerbs.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
