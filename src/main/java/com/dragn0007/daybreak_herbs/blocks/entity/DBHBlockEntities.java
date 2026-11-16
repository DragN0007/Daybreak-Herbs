package com.dragn0007.daybreak_herbs.blocks.entity;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.blocks.base.PreyPileBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DBHBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DaybreakHerbs.MODID);

    public static final RegistryObject<BlockEntityType<PreyPileBlockEntity>> PREY_PILE =
            BLOCK_ENTITIES.register("prey_pile_entity", () ->
                    BlockEntityType.Builder.of(PreyPileBlockEntity::new,
                            DBHBlocks.WHARF_PREY_PILE.get()
                            ).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}