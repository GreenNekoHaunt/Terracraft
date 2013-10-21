package Terracraft.ModBiomes;

import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.World;
import java.util.Random;

public class ModBiome extends BiomeGenBase
{
    public static int baseId = 50;
    public static int biomeCount = 0;
    public static BiomeGenBase corruption;
    public static BiomeGenBase desertCorruption;
    public static BiomeGenBase crimson;
    public static BiomeGenBase desertCrimson;
    public static BiomeGenBase winter;
    public static BiomeGenBase tropicalJungle;

    public ModBiome()
    {
        super(baseId + biomeCount);
        biomeCount++;
    }

    public static void initBiomes()
    {
        corruption = new ModBiomeCorruption().setColor(8272766).setBiomeName("corruption").setTemperatureRainfall(1F, 0.25F);
        desertCorruption = new ModBiomeDesertCorruption().setColor(8272766).setBiomeName("desertCorruption").setTemperatureRainfall(1F, 0F);
        crimson = new ModBiomeCrimson().setColor(8126505).setBiomeName("crimson").setTemperatureRainfall(1F, 0.25F);
        desertCrimson = new ModBiomeDesertCrimson().setColor(8126505).setBiomeName("desertCrimson").setTemperatureRainfall(1F, 0F);
        winter = new ModBiomeWinter().setColor(16579839).setBiomeName("winter").setMinMaxHeight(0.1F, 0.6F).setEnableSnow().setTemperatureRainfall(0.0F, 1.0F);
        tropicalJungle = new ModBiomeTropicalJungle().setColor(1680153).setBiomeName("tropicalJungle").setTemperatureRainfall(0.5F, 0.7F);

        GameRegistry.addBiome(corruption);
        GameRegistry.addBiome(desertCorruption);
        GameRegistry.addBiome(crimson);
        GameRegistry.addBiome(desertCrimson);
        GameRegistry.addBiome(winter);
        GameRegistry.addBiome(tropicalJungle);
    }
}
