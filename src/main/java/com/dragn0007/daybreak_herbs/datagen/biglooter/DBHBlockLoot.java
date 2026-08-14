package com.dragn0007.daybreak_herbs.datagen.biglooter;

import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class DBHBlockLoot extends BlockLootSubProvider {
    public DBHBlockLoot() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    public void generate() {

    }

    @Override
    public Iterable<Block> getKnownBlocks() {
        return DBHBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
