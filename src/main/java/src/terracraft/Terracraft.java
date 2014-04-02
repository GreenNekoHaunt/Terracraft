package src.terracraft;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.world.WorldType;

import src.terracraft.blocks.ModBlock;
import src.terracraft.items.ModItem;
import src.terracraft.recipes.ModRecipes;
import src.terracraft.biomes.ModBiome;
import src.terracraft.ModCreativeTabs;
import src.terracraft.worldGen.WorldGenerator;

@Mod(modid="terracraft", name="Terracraft", version="0.1.0")
public class Terracraft
{
    @Instance(value = "Terracraft")
    public static Terracraft instance;

    @SidedProxy(clientSide="src.terracraft.ClientProxy",
                serverSide="src.terracraft.CommonProxy")
    public static CommonProxy proxy;
    public static WorldGenerator worldGenerator = new WorldGenerator();
    public static WorldType terracraftWorld;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ModCreativeTabs.initTabs();
        ModBlock.initBlockSounds();
        ModBlock.initBlocks();
        ModItem.initItems();
        ModBiome.initBiomes();
//        terracraftWorld = new WorldTypeTerracraft(3, "Terracraft");
    }

    @EventHandler
    public void load(FMLInitializationEvent event)
    {
//        LanguageRegistry.instance().addStringLocalization("generator.Terracraft", "Terracraft");
        proxy.registerRenderers();
//        GameRegistry.registerWorldGenerator(worldGenerator, 3);
        ModRecipes.initAll();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
