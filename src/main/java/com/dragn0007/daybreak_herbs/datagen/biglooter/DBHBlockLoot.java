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
    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return DBHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
