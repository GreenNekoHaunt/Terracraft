package Terracraft.ModBiomes;

import net.minecraft.world.biome.BiomeGenBase;

import Terracraft.ModBlocks.ModBlock;

public class ModBiomeDesertCrimson extends ModBiome
{
    public ModBiomeDesertCrimson()
    {
        super();
        this.topBlock = (byte)ModBlock.crimsand.blockID;
        this.fillerBlock = (byte)ModBlock.crimsand.blockID;
        this.waterColorMultiplier = 8126505;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }
}
