package Terracraft;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import Terracraft.ModBlocks.ModBlock;
import Terracraft.ModItems.ModItem;

public class ModCreativeTabs 
{
    public static CreativeTabs tabBlocks;
    public static CreativeTabs tabTileEntities;
    public static CreativeTabs tabScenery;
    public static CreativeTabs tabMaterial;
    public static CreativeTabs tabTools;
    public static CreativeTabs tabWeapons;
    public static CreativeTabs tabArmor;
    public static CreativeTabs tabAccessories;
    public static CreativeTabs tabPotions;
    public static CreativeTabs tabCreatures;
    
    public ModCreativeTabs()
    {
    }

    public static void initTabs()
    {
        tabBlocks = new CreativeTabs("tabBlocks") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModBlock.grassCorrupted);
            }
        };
        tabTileEntities = new CreativeTabs("tabTileEntities") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.gel);
            }
        };
        tabScenery = new CreativeTabs("tabScenery") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.gel);
            }
        };
        tabMaterial = new CreativeTabs("tabMaterial") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.ingotMythril);
            }
        };
        tabTools = new CreativeTabs("tabTools") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.gel);
            }
        };
        tabWeapons = new CreativeTabs("tabWeapons") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.terrablade);
            }
        };
        tabArmor = new CreativeTabs("tabArmor") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.gel);
            }
        };
        tabAccessories = new CreativeTabs("tabAccessories") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.gel);
            }
        };

        tabPotions = new CreativeTabs("tabPotions") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.potionGreaterHealing);
            }
        };
        tabCreatures = new CreativeTabs("tabCreatures") {
            public ItemStack getIconItemStack() {
                return new ItemStack(ModItem.gel);
            }
        };
    }

    private static void addLocalization()
    {
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabBlocks", "en_US", "Terracraft Blocks");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabTileEntities", "en_US", "Terracraft Tile Entities");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabMaterial", "en_US", "Terracraft Materials");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabTools", "en_US", "Terracraft Tools");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabWeapons", "en_US", "Terracraft Weapons");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabArmor", "en_US", "Terracraft Armor");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabAccessories", "en_US", "Terracraft Accessories");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabScenery", "en_US", "Terracraft Scenery");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabPotions", "en_US", "Terracraft Potions");
        LanguageRegistry.instance().addStringLocalization("itemGroup.tabCreatures", "en_US", "Terracraft Creatures");
    }
}
