package com.dragn0007.daybreak_herbs.datagen.biglooter;

import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.blocks.base.HerbCropBlock;
import com.dragn0007.daybreak_herbs.items.DBHItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class DBHBlockLoot extends BlockLootSubProvider {
    public DBHBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {
        LootItemCondition.Builder cB1 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.GOLDENROD.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.GOLDENROD.get(),
                this.applyExplosionDecay(DBHBlocks.GOLDENROD.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.GOLDENROD.get())))
                                .withPool(LootPool.lootPool().when(cB1).add(LootItem.lootTableItem(DBHItems.GOLDENROD.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_GOLDENROD.get(), DBHItems.GOLDENROD.get());

        LootItemCondition.Builder cB2 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.HORSE_MINT.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.HORSE_MINT.get(),
                this.applyExplosionDecay(DBHBlocks.HORSE_MINT.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.HORSE_MINT.get())))
                                .withPool(LootPool.lootPool().when(cB2).add(LootItem.lootTableItem(DBHItems.HORSE_MINT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_HORSE_MINT.get(), DBHItems.HORSE_MINT.get());

        LootItemCondition.Builder cB3 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.ELDERBERRY.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.ELDERBERRY.get(),
                this.applyExplosionDecay(DBHBlocks.ELDERBERRY.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.ELDERBERRY.get())))
                                .withPool(LootPool.lootPool().when(cB3).add(LootItem.lootTableItem(DBHItems.ELDERBERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_ELDERBERRY.get(), DBHItems.ELDERBERRY.get());

        LootItemCondition.Builder cB4 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.CATMINT.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.CATMINT.get(),
                this.applyExplosionDecay(DBHBlocks.CATMINT.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.CATMINT.get())))
                                .withPool(LootPool.lootPool().when(cB4).add(LootItem.lootTableItem(DBHItems.CATMINT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_CATMINT.get(), DBHItems.CATMINT.get());

        LootItemCondition.Builder cB5 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.YARROW.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.YARROW.get(),
                this.applyExplosionDecay(DBHBlocks.YARROW.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.YARROW.get())))
                                .withPool(LootPool.lootPool().when(cB5).add(LootItem.lootTableItem(DBHItems.YARROW.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_YARROW.get(), DBHItems.YARROW.get());

        LootItemCondition.Builder cB6 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.ECHINACEA.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.ECHINACEA.get(),
                this.applyExplosionDecay(DBHBlocks.ECHINACEA.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.ECHINACEA_ROOTS.get())))
                                .withPool(LootPool.lootPool().when(cB6).add(LootItem.lootTableItem(DBHItems.ECHINACEA_ROOTS.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_ECHINACEA.get(), DBHItems.ECHINACEA_ROOTS.get());

        LootItemCondition.Builder cB7 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.WHITE_SAGEBRUSH.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.WHITE_SAGEBRUSH.get(),
                this.applyExplosionDecay(DBHBlocks.WHITE_SAGEBRUSH.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.WHITE_SAGEBRUSH.get())))
                                .withPool(LootPool.lootPool().when(cB7).add(LootItem.lootTableItem(DBHItems.WHITE_SAGEBRUSH.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_WHITE_SAGEBRUSH.get(), DBHItems.WHITE_SAGEBRUSH.get());

        LootItemCondition.Builder cB8 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.RIBWORT.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.RIBWORT.get(),
                this.applyExplosionDecay(DBHBlocks.RIBWORT.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.RIBWORT.get())))
                                .withPool(LootPool.lootPool().when(cB8).add(LootItem.lootTableItem(DBHItems.RIBWORT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_RIBWORT.get(), DBHItems.RIBWORT.get());

        LootItemCondition.Builder cB9 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.SWEETROOT.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.SWEETROOT.get(),
                this.applyExplosionDecay(DBHBlocks.SWEETROOT.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.SWEETROOT.get())))
                                .withPool(LootPool.lootPool().when(cB9).add(LootItem.lootTableItem(DBHItems.SWEETROOT.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_SWEETROOT.get(), DBHItems.SWEETROOT.get());

        LootItemCondition.Builder cB10 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.SUNDROPS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.SUNDROPS.get(),
                this.applyExplosionDecay(DBHBlocks.SUNDROPS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.SUNDROPS.get())))
                                .withPool(LootPool.lootPool().when(cB10).add(LootItem.lootTableItem(DBHItems.SUNDROPS.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_SUNDROPS.get(), DBHItems.SUNDROPS.get());

        LootItemCondition.Builder cB11 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.BONESET.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.BONESET.get(),
                this.applyExplosionDecay(DBHBlocks.BONESET.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.BONESET.get())))
                                .withPool(LootPool.lootPool().when(cB11).add(LootItem.lootTableItem(DBHItems.BONESET.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_BONESET.get(), DBHItems.BONESET.get());

        LootItemCondition.Builder cB12 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.MARSH_MALLOW.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.MARSH_MALLOW.get(),
                this.applyExplosionDecay(DBHBlocks.MARSH_MALLOW.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.MARSH_MALLOW.get())))
                                .withPool(LootPool.lootPool().when(cB12).add(LootItem.lootTableItem(DBHItems.MARSH_MALLOW.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_MARSH_MALLOW.get(), DBHItems.MARSH_MALLOW.get());

        LootItemCondition.Builder cB13 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.CALAMUS.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.CALAMUS.get(),
                this.applyExplosionDecay(DBHBlocks.CALAMUS.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.CALAMUS.get())))
                                .withPool(LootPool.lootPool().when(cB13).add(LootItem.lootTableItem(DBHItems.CALAMUS.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_CALAMUS.get(), DBHItems.CALAMUS.get());

        LootItemCondition.Builder cB14 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.JEWELWEED.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.JEWELWEED.get(),
                this.applyExplosionDecay(DBHBlocks.JEWELWEED.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.JEWELWEED.get())))
                                .withPool(LootPool.lootPool().when(cB14).add(LootItem.lootTableItem(DBHItems.JEWELWEED.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_JEWELWEED.get(), DBHItems.JEWELWEED.get());

        LootItemCondition.Builder cB15 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.WINTERBLOOM.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.WINTERBLOOM.get(),
                this.applyExplosionDecay(DBHBlocks.WINTERBLOOM.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.WINTERBLOOM.get())))
                                .withPool(LootPool.lootPool().when(cB15).add(LootItem.lootTableItem(DBHItems.WINTERBLOOM.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_WINTERBLOOM.get(), DBHItems.WINTERBLOOM.get());

        LootItemCondition.Builder cB16 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.BULRUSH.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.BULRUSH.get(),
                this.applyExplosionDecay(DBHBlocks.BULRUSH.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.BULRUSH.get())))
                                .withPool(LootPool.lootPool().when(cB16).add(LootItem.lootTableItem(DBHItems.BULRUSH.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_BULRUSH.get(), DBHItems.BULRUSH.get());

        LootItemCondition.Builder cB17 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.GOLDENSEAL.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.GOLDENSEAL.get(),
                this.applyExplosionDecay(DBHBlocks.GOLDENSEAL.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.GOLDENSEAL.get())))
                                .withPool(LootPool.lootPool().when(cB17).add(LootItem.lootTableItem(DBHItems.GOLDENSEAL.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_GOLDENSEAL.get(), DBHItems.GOLDENSEAL.get());

        LootItemCondition.Builder cB18 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.ARNICA.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.ARNICA.get(),
                this.applyExplosionDecay(DBHBlocks.ARNICA.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.ARNICA.get())))
                                .withPool(LootPool.lootPool().when(cB18).add(LootItem.lootTableItem(DBHItems.ARNICA.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_ARNICA.get(), DBHItems.ARNICA.get());

        LootItemCondition.Builder cB19 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.RATTLEWEED.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.RATTLEWEED.get(),
                this.applyExplosionDecay(DBHBlocks.RATTLEWEED.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.RATTLEWEED.get())))
                                .withPool(LootPool.lootPool().when(cB19).add(LootItem.lootTableItem(DBHItems.RATTLEWEED.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_RATTLEWEED.get(), DBHItems.RATTLEWEED.get());

        LootItemCondition.Builder cB20 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.USNEA.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.USNEA.get(),
                this.applyExplosionDecay(DBHBlocks.USNEA.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.USNEA.get())))
                                .withPool(LootPool.lootPool().when(cB20).add(LootItem.lootTableItem(DBHItems.USNEA.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_USNEA.get(), DBHItems.USNEA.get());

        LootItemCondition.Builder cB21 = LootItemBlockStatePropertyCondition.hasBlockStateProperties(DBHBlocks.JUNIPER.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(HerbCropBlock.AGE, 7));
        this.add(DBHBlocks.JUNIPER.get(),
                this.applyExplosionDecay(DBHBlocks.JUNIPER.get(),
                        LootTable.lootTable().withPool(LootPool.lootPool().add(LootItem.lootTableItem(DBHItems.JUNIPER_BERRY.get())))
                                .withPool(LootPool.lootPool().when(cB21).add(LootItem.lootTableItem(DBHItems.JUNIPER_BERRY.get())
                                        .apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 2))))));
        dropOther(DBHBlocks.WILD_JUNIPER.get(), DBHItems.JUNIPER_BERRY.get());

        dropOther(DBHBlocks.WILD_DEATH_CAMAS.get(), DBHItems.DEATH_CAMAS.get());
        dropOther(DBHBlocks.WILD_LARKSPUR.get(), DBHItems.LARKSPUR.get());
        dropOther(DBHBlocks.WILD_DEADLY_NIGHTSHADE.get(), DBHItems.DEADLY_NIGHTSHADE_BERRY.get());
        dropOther(DBHBlocks.WILD_POISON_IVY.get(), DBHItems.POISON_IVY.get());
        dropOther(DBHBlocks.WILD_DEVILS_TRUMPET.get(), DBHItems.DEVILS_TRUMPET.get());
        dropOther(DBHBlocks.WILD_POKEWEED.get(), DBHItems.POKEWEED.get());
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return DBHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
