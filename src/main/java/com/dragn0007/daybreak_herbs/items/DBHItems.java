package com.dragn0007.daybreak_herbs.items;

import com.dragn0007.daybreak_herbs.DaybreakHerbs;
import com.dragn0007.daybreak_herbs.blocks.DBHBlocks;
import com.dragn0007.daybreak_herbs.items.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DBHItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DaybreakHerbs.MODID);

    //Plants
    public static final RegistryObject<Item> GOLDENROD = ITEMS.register("goldenrod",
            () -> new GoldenrodItem(DBHBlocks.GOLDENROD.get(), (new Item.Properties())));

    public static final RegistryObject<Item> GOLDENROD_PETALS = ITEMS.register("goldenrod_petals",
            () -> new GoldenrodPetalsItem(new Item.Properties()));

    public static final RegistryObject<Item> HORSE_MINT = ITEMS.register("horse_mint",
            () -> new HorseMintItem(DBHBlocks.HORSE_MINT.get(), (new Item.Properties())));

    public static final RegistryObject<Item> HORSE_MINT_PETALS = ITEMS.register("horse_mint_petals",
            () -> new HorseMintPetalsItem(new Item.Properties()));

    public static final RegistryObject<Item> ELDERBERRY = ITEMS.register("elderberry",
            () -> new ElderberryItem(DBHBlocks.ELDERBERRY.get(), (new Item.Properties())));

    public static final RegistryObject<Item> CATMINT = ITEMS.register("catmint",
            () -> new CatmintItem(DBHBlocks.CATMINT.get(), (new Item.Properties())));

    public static final RegistryObject<Item> YARROW = ITEMS.register("yarrow",
            () -> new YarrowItem(DBHBlocks.YARROW.get(), (new Item.Properties())));

    public static final RegistryObject<Item> ECHINACEA_ROOTS = ITEMS.register("echinacea_roots",
            () -> new EchinaceaItem(DBHBlocks.ECHINACEA.get(), (new Item.Properties())));

    public static final RegistryObject<Item> WHITE_SAGEBRUSH = ITEMS.register("white_sagebrush",
            () -> new WhiteSagebrushItem(DBHBlocks.WHITE_SAGEBRUSH.get(), (new Item.Properties())));

    public static final RegistryObject<Item> WHITE_SAGEBRUSH_LEAF = ITEMS.register("white_sagebrush_leaf",
            () -> new WhiteSagebrushLeafItem(new Item.Properties()));

    public static final RegistryObject<Item> RIBWORT = ITEMS.register("ribwort",
            () -> new RibwortItem(DBHBlocks.RIBWORT.get(), (new Item.Properties())));

    public static final RegistryObject<Item> RIBWORT_LEAF = ITEMS.register("ribwort_leaf",
            () -> new RibwortLeafItem(new Item.Properties()));

    public static final RegistryObject<Item> SWEETROOT = ITEMS.register("sweetroot",
            () -> new SweetrootItem(DBHBlocks.SWEETROOT.get(), (new Item.Properties())));

    public static final RegistryObject<Item> SUNDROPS = ITEMS.register("sundrops",
            () -> new SundropsItem(DBHBlocks.SUNDROPS.get(), (new Item.Properties())));

    public static final RegistryObject<Item> SUNDROPS_BUDS = ITEMS.register("sundrops_buds",
            () -> new SundropsBudsItem(new Item.Properties()));

    public static final RegistryObject<Item> BONESET = ITEMS.register("boneset",
            () -> new BonesetItem(DBHBlocks.BONESET.get(), (new Item.Properties())));

    public static final RegistryObject<Item> MARSH_MALLOW = ITEMS.register("marsh_mallow",
            () -> new MarshMallowItem(DBHBlocks.MARSH_MALLOW.get(), (new Item.Properties())));

    public static final RegistryObject<Item> MARSH_MALLOW_ROOTS = ITEMS.register("marsh_mallow_roots",
            () -> new MarshMallowRootsItem(new Item.Properties()));

    public static final RegistryObject<Item> CALAMUS = ITEMS.register("calamus",
            () -> new CalamusItem(DBHBlocks.CALAMUS.get(), (new Item.Properties())));

    public static final RegistryObject<Item> JEWELWEED = ITEMS.register("jewelweed",
            () -> new JewelweedItem(DBHBlocks.JEWELWEED.get(), (new Item.Properties())));

    public static final RegistryObject<Item> WINTERBLOOM = ITEMS.register("winterbloom",
            () -> new WinterbloomItem(DBHBlocks.WINTERBLOOM.get(), (new Item.Properties())));

    public static final RegistryObject<Item> WINTERBLOOM_LEAF = ITEMS.register("winterbloom_leaf",
            () -> new WinterbloomLeafItem(new Item.Properties()));

    public static final RegistryObject<Item> BULRUSH = ITEMS.register("bulrush",
            () -> new BulrushItem(DBHBlocks.BULRUSH.get(), (new Item.Properties())));

    public static final RegistryObject<Item> BULRUSH_FLUFF = ITEMS.register("bulrush_fluff",
            () -> new BulrushFluffItem(new Item.Properties()));

    public static final RegistryObject<Item> BULRUSH_ROOTS = ITEMS.register("bulrush_roots",
            () -> new BulrushRootsItem(new Item.Properties()));

    public static final RegistryObject<Item> GOLDENSEAL = ITEMS.register("goldenseal",
            () -> new GoldensealItem(DBHBlocks.GOLDENSEAL.get(), (new Item.Properties())));

    public static final RegistryObject<Item> ARNICA = ITEMS.register("arnica",
            () -> new ArnicaItem(DBHBlocks.ARNICA.get(), (new Item.Properties())));

    public static final RegistryObject<Item> ARNICA_PETALS = ITEMS.register("arnica_petals",
            () -> new ArnicaPetalsItem(new Item.Properties()));

    public static final RegistryObject<Item> RATTLEWEED = ITEMS.register("rattleweed",
            () -> new RattleweedItem(DBHBlocks.RATTLEWEED.get(), (new Item.Properties())));

    public static final RegistryObject<Item> USNEA = ITEMS.register("usnea",
            () -> new UsneaItem(DBHBlocks.USNEA.get(), (new Item.Properties())));

    public static final RegistryObject<Item> JUNIPER_BERRY = ITEMS.register("juniper_berry",
            () -> new JuniperBerryItem(DBHBlocks.JUNIPER.get(), (new Item.Properties())));

    public static final RegistryObject<Item> DEATH_CAMAS = ITEMS.register("death_camas",
            () -> new DeathCamasItem(new Item.Properties()));

    public static final RegistryObject<Item> LARKSPUR = ITEMS.register("larkspur",
            () -> new LarkspurItem(new Item.Properties()));

    public static final RegistryObject<Item> DEADLY_NIGHTSHADE_BERRY = ITEMS.register("deadly_nightshade_berry",
            () -> new NightshadeItem(new Item.Properties()));

    public static final RegistryObject<Item> POISON_IVY = ITEMS.register("poison_ivy",
            () -> new PoisonIvyItem(new Item.Properties()));

    public static final RegistryObject<Item> DEVILS_TRUMPET = ITEMS.register("devils_trumpet",
            () -> new DevilsTrumpetItem(new Item.Properties()));

    public static final RegistryObject<Item> POKEWEED = ITEMS.register("pokeweed",
            () -> new PokeweedItem(new Item.Properties()));

    //Pastes
    public static final RegistryObject<Item> GOLDENROD_POULTICE = ITEMS.register("goldenrod_poultice",
            () -> new GoldenrodPasteItem(new Item.Properties()));

    public static final RegistryObject<Item> RIBWORT_POULTICE = ITEMS.register("ribwort_poultice",
            () -> new RibwortPasteItem(new Item.Properties()));

    public static final RegistryObject<Item> SUNDROPS_POULTICE = ITEMS.register("sundrops_poultice",
            () -> new SundropsPasteItem(new Item.Properties()));

    public static final RegistryObject<Item> GOLDENSEAL_POULTICE = ITEMS.register("goldenseal_poultice",
            () -> new GoldensealPasteItem(new Item.Properties()));

    //Materials
    public static final RegistryObject<Item> WHITE_WILLOW = ITEMS.register("white_willow",
            () -> new WhiteWillowItem(new Item.Properties()));

    public static final RegistryObject<Item> COBWEB = ITEMS.register("cobweb",
            () -> new CobwebItem(new Item.Properties()));

    public static final RegistryObject<Item> MOSS_CLUMP = ITEMS.register("moss_clump",
            () -> new MossItem(new Item.Properties()));

    public static final RegistryObject<Item> PINE_RESIN = ITEMS.register("pine_resin",
            () -> new PineResinItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_GOLDENROD_PETALS = ITEMS.register("dried_goldenrod_petals",
            () -> new GoldenrodPetalsItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_HORSE_MINT_PETALS = ITEMS.register("dried_horse_mint_petals",
            () -> new HorseMintPetalsItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_ELDERBERRY = ITEMS.register("dried_elderberry",
            () -> new DriedElderberryItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_CATMINT = ITEMS.register("dried_catmint",
            () -> new DriedCatmintItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_YARROW = ITEMS.register("dried_yarrow",
            () -> new DriedYarrowItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_ECHINACEA_ROOTS = ITEMS.register("dried_echinacea_roots",
            () -> new DriedEchinaceaItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_WHITE_SAGEBRUSH_LEAF = ITEMS.register("dried_white_sagebrush_leaf",
            () -> new WhiteSagebrushLeafItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_RIBWORT_LEAF = ITEMS.register("dried_ribwort_leaf",
            () -> new RibwortLeafItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_SWEETROOT = ITEMS.register("dried_sweetroot",
            () -> new DriedSweetrootItem(new Item.Properties()));

   public static final RegistryObject<Item> DRIED_SUNDROPS_BUDS = ITEMS.register("dried_sundrops_buds",
            () -> new SundropsBudsItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_BONESET = ITEMS.register("dried_boneset",
            () -> new DriedBonesetItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_MARSH_MALLOW_ROOTS = ITEMS.register("dried_marsh_mallow_roots",
            () -> new MarshMallowRootsItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_CALAMUS = ITEMS.register("dried_calamus",
            () -> new DriedCalamusItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_JEWELWEED = ITEMS.register("dried_jewelweed",
            () -> new DriedJewelweedItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_WINTERBLOOM_LEAF = ITEMS.register("dried_winterbloom_leaf",
            () -> new WinterbloomLeafItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_BULRUSH_FLUFF = ITEMS.register("dried_bulrush_fluff",
            () -> new BulrushFluffItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_BULRUSH_ROOTS = ITEMS.register("dried_bulrush_roots",
            () -> new BulrushRootsItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_GOLDENSEAL = ITEMS.register("dried_goldenseal",
            () -> new DriedGoldensealItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_ARNICA_PETALS = ITEMS.register("dried_arnica_petals",
            () -> new ArnicaPetalsItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_RATTLEWEED = ITEMS.register("dried_rattleweed",
            () -> new DriedRattleweedItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_USNEA = ITEMS.register("dried_usnea",
            () -> new DriedUsneaItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_JUNIPER_BERRY = ITEMS.register("dried_juniper_berry",
            () -> new DriedJuniperBerryItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_DEATH_CAMAS = ITEMS.register("dried_death_camas",
            () -> new DeathCamasItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_LARKSPUR = ITEMS.register("dried_larkspur",
            () -> new LarkspurItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_DEADLY_NIGHTSHADE_BERRY = ITEMS.register("dried_deadly_nightshade_berry",
            () -> new NightshadeItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_POISON_IVY = ITEMS.register("dried_poison_ivy",
            () -> new PoisonIvyItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_DEVILS_TRUMPET = ITEMS.register("dried_devils_trumpet",
            () -> new DevilsTrumpetItem(new Item.Properties()));

    public static final RegistryObject<Item> DRIED_POKEWEED = ITEMS.register("dried_pokeweed",
            () -> new PokeweedItem(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}