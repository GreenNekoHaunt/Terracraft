package src.terracraft.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

import src.terracraft.blocks.ModBlock;

public class ModBiomeDesertCorruption extends ModBiome
{
    public ModBiomeDesertCorruption(String name, int color)
    {
        super(name, color);
        this.setTemperatureRainfall(1F, 0F);
        this.topBlock = (Block)ModBlock.ebonsand;
        this.fillerBlock = (Block)ModBlock.ebonsand;
        this.waterColorMultiplier = color;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }
}
