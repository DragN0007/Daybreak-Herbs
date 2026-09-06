package com.dragn0007.daybreak_herbs.blocks;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
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
    public static final RegistryObject<Block> WILD_GOLDENROD = registerBlockWithoutItem("wild_goldenrod",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> HORSE_MINT = registerBlockWithoutItem("horse_mint",
            () -> new HorseMintBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_HORSE_MINT = registerBlockWithoutItem("wild_horse_mint",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ELDERBERRY = registerBlockWithoutItem("elderberry",
            () -> new ElderberryBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ELDERBERRY = registerBlockWithoutItem("wild_elderberry",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CATMINT = registerBlockWithoutItem("catmint",
            () -> new CatmintBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_CATMINT = registerBlockWithoutItem("wild_catmint",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> YARROW = registerBlockWithoutItem("yarrow",
            () -> new YarrowBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_YARROW = registerBlockWithoutItem("wild_yarrow",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ECHINACEA = registerBlockWithoutItem("echinacea",
            () -> new EchinaceaBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ECHINACEA = registerBlockWithoutItem("wild_echinacea",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WHITE_SAGEBRUSH = registerBlockWithoutItem("white_sagebrush",
            () -> new WhiteSagebrushBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_WHITE_SAGEBRUSH = registerBlockWithoutItem("wild_white_sagebrush",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> RIBWORT = registerBlockWithoutItem("ribwort",
            () -> new RibwortBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_RIBWORT = registerBlockWithoutItem("wild_ribwort",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SWEETROOT = registerBlockWithoutItem("sweetroot",
            () -> new SweetrootBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_SWEETROOT = registerBlockWithoutItem("wild_sweetroot",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> SUNDROPS = registerBlockWithoutItem("sundrops",
            () -> new SundropsBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_SUNDROPS = registerBlockWithoutItem("wild_sundrops",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BONESET = registerBlockWithoutItem("boneset",
            () -> new BonesetBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_BONESET = registerBlockWithoutItem("wild_boneset",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> MARSH_MALLOW = registerBlockWithoutItem("marsh_mallow",
            () -> new MarshMallowBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_MARSH_MALLOW = registerBlockWithoutItem("wild_marsh_mallow",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> CALAMUS = registerBlockWithoutItem("calamus",
            () -> new CalamusBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_CALAMUS = registerBlockWithoutItem("wild_calamus",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> JEWELWEED = registerBlockWithoutItem("jewelweed",
            () -> new JewelweedBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_JEWELWEED = registerBlockWithoutItem("wild_jewelweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> WINTERBLOOM = registerBlockWithoutItem("winterbloom",
            () -> new WinterbloomBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_WINTERBLOOM = registerBlockWithoutItem("wild_winterbloom",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> BULRUSH = registerBlockWithoutItem("bulrush",
            () -> new BulrushBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_BULRUSH = registerBlockWithoutItem("wild_bulrush",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> GOLDENSEAL = registerBlockWithoutItem("goldenseal",
            () -> new GoldensealBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_GOLDENSEAL = registerBlockWithoutItem("wild_goldenseal",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> ARNICA = registerBlockWithoutItem("arnica",
            () -> new ArnicaBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_ARNICA = registerBlockWithoutItem("wild_arnica",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> RATTLEWEED = registerBlockWithoutItem("rattleweed",
            () -> new RattleweedBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_RATTLEWEED = registerBlockWithoutItem("wild_rattleweed",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> USNEA = registerBlockWithoutItem("usnea",
            () -> new UsneaBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_USNEA = registerBlockWithoutItem("wild_usnea",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> JUNIPER = registerBlockWithoutItem("juniper",
            () -> new JuniperBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_JUNIPER = registerBlockWithoutItem("wild_juniper",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DEATH_CAMAS = registerBlockWithoutItem("death_camas",
            () -> new DeathCamasBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_DEATH_CAMAS = registerBlockWithoutItem("wild_death_camas",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> LARKSPUR = registerBlockWithoutItem("larkspur",
            () -> new LarkspurBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_LARKSPUR = registerBlockWithoutItem("wild_larkspur",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DEADLY_NIGHTSHADE = registerBlockWithoutItem("deadly_nightshade",
            () -> new DeadlyNightshadeBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_DEADLY_NIGHTSHADE = registerBlockWithoutItem("wild_deadly_nightshade",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> POISON_IVY = registerBlockWithoutItem("poison_ivy",
            () -> new PoisonIvyBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_POISON_IVY = registerBlockWithoutItem("wild_poison_ivy",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> DEVILS_TRUMPET = registerBlockWithoutItem("devils_trumpet",
            () -> new DevilsTrumpetBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_DEVILS_TRUMPET = registerBlockWithoutItem("wild_devils_trumpet",
            () -> new FlowerBlock(MobEffects.REGENERATION, 7, BlockBehaviour.Properties.copy(Blocks.POPPY)));

    public static final RegistryObject<Block> POKEWEED = registerBlockWithoutItem("pokeweed",
            () -> new PokeweedBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS).noCollission()));
    public static final RegistryObject<Block> WILD_POKEWEED = registerBlockWithoutItem("wild_pokeweed",
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
