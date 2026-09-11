package com.dragn0007.daybreak_herbs.blocks;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import com.dragn0007.daybreak_herbs.blocks.crop.*;
import com.dragn0007.daybreak_herbs.items.DBHItems;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PlaceOnWaterBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DBHBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DaybreakHerbs.MODID);
    public static final DeferredRegister<BlockEntityType<?>> TILE_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, DaybreakHerbs.MODID);

    public static final RegistryObject<Block> GOLDENROD = registerBlockWithoutItem("goldenrod",
            () -> new GoldenrodBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_GOLDENROD = registerBlock("wild_goldenrod",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HORSE_MINT = registerBlockWithoutItem("horse_mint",
            () -> new HorseMintBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_HORSE_MINT = registerBlock("wild_horse_mint",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ELDERBERRY = registerBlockWithoutItem("elderberry",
            () -> new ElderberryBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ELDERBERRY = registerBlock("wild_elderberry",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CATMINT = registerBlockWithoutItem("catmint",
            () -> new CatmintBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_CATMINT = registerBlock("wild_catmint",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> YARROW = registerBlockWithoutItem("yarrow",
            () -> new YarrowBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_YARROW = registerBlock("wild_yarrow",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ECHINACEA = registerBlockWithoutItem("echinacea",
            () -> new EchinaceaBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ECHINACEA = registerBlock("wild_echinacea",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WHITE_SAGEBRUSH = registerBlockWithoutItem("white_sagebrush",
            () -> new WhiteSagebrushBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_WHITE_SAGEBRUSH = registerBlock("wild_white_sagebrush",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> RIBWORT = registerBlockWithoutItem("ribwort",
            () -> new RibwortBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_RIBWORT = registerBlock("wild_ribwort",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SWEETROOT = registerBlockWithoutItem("sweetroot",
            () -> new SweetrootBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_SWEETROOT = registerBlock("wild_sweetroot",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SUNDROPS = registerBlockWithoutItem("sundrops",
            () -> new SundropsBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_SUNDROPS = registerBlock("wild_sundrops",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BONESET = registerBlockWithoutItem("boneset",
            () -> new BonesetBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_BONESET = registerBlock("wild_boneset",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> MARSH_MALLOW = registerBlockWithoutItem("marsh_mallow",
            () -> new MarshMallowBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_MARSH_MALLOW = registerBlock("wild_marsh_mallow",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CALAMUS = registerBlockWithoutItem("calamus",
            () -> new CalamusBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_CALAMUS = registerBlock("wild_calamus",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> JEWELWEED = registerBlockWithoutItem("jewelweed",
            () -> new JewelweedBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_JEWELWEED = registerBlock("wild_jewelweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WINTERBLOOM = registerBlockWithoutItem("winterbloom",
            () -> new WinterbloomBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_WINTERBLOOM = registerBlock("wild_winterbloom",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BULRUSH = registerBlockWithoutItem("bulrush",
            () -> new BulrushBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_BULRUSH = registerBlock("wild_bulrush",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> GOLDENSEAL = registerBlockWithoutItem("goldenseal",
            () -> new GoldensealBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_GOLDENSEAL = registerBlock("wild_goldenseal",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ARNICA = registerBlockWithoutItem("arnica",
            () -> new ArnicaBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ARNICA = registerBlock("wild_arnica",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> RATTLEWEED = registerBlockWithoutItem("rattleweed",
            () -> new RattleweedBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_RATTLEWEED = registerBlock("wild_rattleweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> USNEA = registerBlockWithoutItem("usnea",
            () -> new UsneaBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_USNEA = registerBlock("wild_usnea",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> JUNIPER = registerBlockWithoutItem("juniper",
            () -> new JuniperBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_JUNIPER = registerBlock("wild_juniper",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DEATH_CAMAS = registerBlock("death_camas",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> LARKSPUR = registerBlock("larkspur",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DEADLY_NIGHTSHADE = registerBlock("deadly_nightshade",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> POISON_IVY = registerBlock("poison_ivy",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DEVILS_TRUMPET = registerBlock("devils_trumpet",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> POKEWEED = registerBlock("pokeweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));


    public static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }
    public static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        DBHItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static <T extends Block>RegistryObject<T> registerWaterBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerWaterBlockItem(name, toReturn);
        return toReturn;
    }
    public static <T extends Block> void registerWaterBlockItem(String name, RegistryObject<T> block) {
        DBHItems.ITEMS.register(name, () -> new PlaceOnWaterBlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
