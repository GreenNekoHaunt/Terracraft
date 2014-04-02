package src.terracraft.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import src.terracraft.blocks.ModBlock;

public class ModBiomeCorruption extends ModBiome
{
    public ModBiomeCorruption(String name, int color)
    {
        super(name, color);
        this.setTemperatureRainfall(1F, 0.25F);
        this.topBlock = (Block)ModBlock.grassCorrupted;
        this.fillerBlock = (Block)Blocks.dirt;
        this.waterColorMultiplier = color;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }
}
