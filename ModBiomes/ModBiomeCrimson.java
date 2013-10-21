package Terracraft.ModBiomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.Block;

import Terracraft.ModBlocks.ModBlock;

public class ModBiomeCrimson extends ModBiome
{
    public ModBiomeCrimson()
    {
        super();
        this.topBlock = (byte)ModBlock.grassCrimson.blockID;
        this.fillerBlock = (byte)Block.dirt.blockID;
        this.waterColorMultiplier = 8126505;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }
}
