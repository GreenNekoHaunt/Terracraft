package src.terracraft.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

import src.terracraft.blocks.ModBlock;

public class ModBiomeDesertCrimson extends ModBiome
{
    public ModBiomeDesertCrimson(String name, int color)
    {
        super(name, color);
        this.setTemperatureRainfall(1F, 0F);
        this.topBlock = (Block)ModBlock.crimsand;
        this.fillerBlock = (Block)ModBlock.crimsand;
        this.waterColorMultiplier = color;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }
}
