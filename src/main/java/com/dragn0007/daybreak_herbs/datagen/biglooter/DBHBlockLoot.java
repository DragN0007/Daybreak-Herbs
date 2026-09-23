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
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return DBHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
