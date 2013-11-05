package Terracraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

import Terracraft.ModBlocks.ModBlock;
import Terracraft.ModItems.ModItem;
import Terracraft.ModRecipes.ModRecipes;
import Terracraft.ModBiomes.ModBiome;
import Terracraft.ModCreativeTabs;
import Terracraft.WorldGen.WorldGenerator;

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
    public static WorldGenerator worldGenerator = new WorldGenerator();

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
        ModBiome.initBiomes();
        GameRegistry.registerWorldGenerator(worldGenerator);
        ModRecipes.initAll();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
