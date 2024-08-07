package net.zorme.tutorial_mod.Item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.zorme.tutorial_mod.Item.custom.*;

import net.zorme.tutorial_mod.blocks.ModBlocks;
import net.zorme.tutorial_mod.tutorial_mod;

public class Moditems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, tutorial_mod.MOD_ID);
    //log listof items. when added it loads items?

    /*  ITEM TODO's
    *   add functionality for Sapphire Staff
    *   add effects to Blue_Bean
    *       remember, very gaseous bean (launching where looking when eaten; burp for a bit after consuming)
    *
    *
    *
    * */

    /*regular Items (non-custom / crafting)*/
    public static final RegistryObject <Item> SAPPHIRE =  ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
    public static final RegistryObject <Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new  Item(new Item.Properties()));
    public static final RegistryObject <Item> DEBIT_CARD = ITEMS.register("debit_card", () -> new  Item(new Item.Properties()));
    public static final RegistryObject <Item> SAPPHIRE_STAFF = ITEMS.register("sapphire_staff", () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject <Item> PINE_CONE = ITEMS.register("pine_cone", () -> new FuelItem(new Item.Properties(), 400));

    /*custom Items*/
    public static final RegistryObject <Item> METAL_DETECTOR = ITEMS.register("metal_detector", () -> new MetalDetectorItem(new Item.Properties().durability(100)));
 ;

    /*Foods/plant related*/
    public static final RegistryObject <Item> BEAPER = ITEMS.register("beaper", () -> new BeaperItem(new Item.Properties().food(ModFoods.BEAPER))); //FIXME NEEDS seeds
    public static final RegistryObject <Item>  BEAPER_SEED = ITEMS.register("beaper_seed", () -> new ItemNameBlockItem(ModBlocks.BEAPER_CROP.get(), new Item.Properties()));

    public static final RegistryObject <Item> BLUE_BEAN = ITEMS.register("blue_bean", () -> new Blue_BeanItem(new Item.Properties().food(ModFoods.BLUE_BEAN))); //FIXME needs seeds

    public static final RegistryObject <Item> STRAWBERRY = ITEMS.register("strawberry", () -> new Item(new Item.Properties().food(ModFoods.STRAWBERRY)));
                                                                                                                        //needs to be ItemNameBlopckItem because its simplier
    public static final RegistryObject <Item>   STRAWBERRY_SEEDS = ITEMS.register("strawberry_seeds", () -> new ItemNameBlockItem(ModBlocks.STRAWBERRY_CROP.get(), new Item.Properties()));


    /*Tools*/
    public static final RegistryObject <Item> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () -> new SwordItem(ModToolTeirs.SAPPHIRE, 4, 2,new Item.Properties()));
    public static final RegistryObject <Item> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () -> new PickaxeItem(ModToolTeirs.SAPPHIRE, 2, 1,new Item.Properties()));
    public static final RegistryObject <Item> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () -> new ShovelItem(ModToolTeirs.SAPPHIRE, 1, 1,new Item.Properties()));
    public static final RegistryObject <Item> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () -> new HoeItem(ModToolTeirs.SAPPHIRE, 2, 1,new Item.Properties()));
    public static final RegistryObject <Item> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () -> new AxeItem(ModToolTeirs.SAPPHIRE, 5, 1,new Item.Properties()));

   /*Armor*/ //only need one armor peice to be the ModArmorItem
    public static final RegistryObject <Item> SAPPHIRE_HELMET = ITEMS.register("sapphire_helmet", () -> new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET,new  Item.Properties()));
    public static final RegistryObject <Item> SAPPHIRE_CHESTPLATE = ITEMS.register("sapphire_chestplate", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE,new  Item.Properties()));
    public static final RegistryObject <Item> SAPPHIRE_LEGGINGS = ITEMS.register("sapphire_leggings", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS,new  Item.Properties()));
    public static final RegistryObject <Item> SAPPHIRE_BOOTS = ITEMS.register("sapphire_boots", () -> new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS,new  Item.Properties()));


    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
