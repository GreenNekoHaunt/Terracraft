package src.terracraft;

import java.util.Random;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

import src.terracraft.blocks.ModBlock;
import src.terracraft.items.ModItem;

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
    public static CreativeTabs tabConsumable;
    public static CreativeTabs tabCreatures;

    public ModCreativeTabs()
    {
    }

    public static void initTabs()
    {
        tabBlocks = new CreativeTabs("tabBlocks") {
            public Item getTabIconItem() {
                return ModItem.gel;
            }
        };
        tabTileEntities = new CreativeTabs("tabTileEntities") {
            public Item getTabIconItem() {
                return ModItem.gel;
            }
        };
        tabScenery = new CreativeTabs("tabScenery") {
            public Item getTabIconItem() {
                return ModItem.gel;
            }
        };
        tabMaterial = new CreativeTabs("tabMaterial") {
            public Item getTabIconItem() {
                return ModItem.ingotHellstone;
            }
        };
        tabTools = new CreativeTabs("tabTools") {
            public Item getTabIconItem() {
                return ModItem.hammerTin;
            }
        };
        tabWeapons = new CreativeTabs("tabWeapons") {
            public Item getTabIconItem() {
                return ModItem.swordEbonwood;
            }
        };
        tabArmor = new CreativeTabs("tabArmor") {
            public Item getTabIconItem() {
                return ModItem.gel;
            }
        };
        tabAccessories = new CreativeTabs("tabAccessories") {
            public Item getTabIconItem() {
                return ModItem.gel;
            }
        };

        tabConsumable = new CreativeTabs("tabConsumable") {
            public Item getTabIconItem() {
                return ModItem.potionGreaterHealing;
            }
        };
        tabCreatures = new CreativeTabs("tabCreatures") {
            public Item getTabIconItem() {
                return ModItem.gel;
            }
        };
    }
}
