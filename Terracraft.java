package Terracraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
<<<<<<< HEAD
import cpw.mods.fml.common.registry.GameRegistry;
=======
>>>>>>> 1d908db81065a13cb092415a639b8cc7fd44bb99

import Terracraft.ModBlocks.ModBlock;
import Terracraft.ModItems.ModItem;
import Terracraft.ModRecipes.ModRecipes;
import Terracraft.ModBiomes.ModBiome;
import Terracraft.ModCreativeTabs;
<<<<<<< HEAD
import Terracraft.WorldGen.WorldGenerator;
=======
>>>>>>> 1d908db81065a13cb092415a639b8cc7fd44bb99

@Mod(modid="TC", name="Terracraft", version="0.0.1")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class Terracraft
{
    // The instance of your mod that Forge uses.
    @Instance(value = "Terracraft")
    public static Terracraft instance;  

    @SidedProxy(clientSide="Terracraft.ClientProxy",                  
                serverSide="Terracraft.CommonProxy")
    public static CommonProxy proxy;
<<<<<<< HEAD
    public static WorldGenerator worldGenerator = new WorldGenerator();
=======
>>>>>>> 1d908db81065a13cb092415a639b8cc7fd44bb99

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) 
    {
        ModEnumToolMaterial.initModEnumToolMaterial();
        ModCreativeTabs.initTabs();
        ModBlock.initBlocks("TC");
        ModBlock.initHarvestLevel();
        ModItem.initItems("TC");
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderers();
<<<<<<< HEAD
        ModBiome.initBiomes();
        GameRegistry.registerWorldGenerator(worldGenerator);
        ModRecipes.initAll();
=======
        ModRecipes.initAll();
        ModBiome.initBiomes();
>>>>>>> 1d908db81065a13cb092415a639b8cc7fd44bb99
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
