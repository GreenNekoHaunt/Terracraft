package src.terracraft.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class ModBiome extends BiomeGenBase
{
    public static BiomeGenBase corruption;
    public static BiomeGenBase desertCorruption;
    public static BiomeGenBase crimson;
    public static BiomeGenBase desertCrimson;
    public static BiomeGenBase winter;
    public static BiomeGenBase tropicalJungle;
    public static int biomeCount = 16;

    public ModBiome(String name, int color)
    {
        super(biomeCount);
        this.setBiomeName(name);
        this.setColor(0xFF0000);
        biomeCount++;
    }

    public static void initBiomes()
    {
        corruption = new ModBiomeCorruption("corruption", 0xAE3050);
        desertCorruption = new ModBiomeDesertCorruption("desertCorruption", 0xAE3050);
        crimson = new ModBiomeCrimson("crimson", 0xAE1000);
        desertCrimson = new ModBiomeDesertCrimson("desertCrimson", 0xAE1000);
        winter = new ModBiomeWinter("winter", 16579839);
        tropicalJungle = new ModBiomeTropicalJungle("troplicalJungle", 0x33CC33);
    }
}
