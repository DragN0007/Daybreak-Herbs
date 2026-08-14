package com.dragn0007.daybreak_herbs.blocks;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DBHBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DaybreakHerbs.MODID);
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DaybreakHerbs.MODID);



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
