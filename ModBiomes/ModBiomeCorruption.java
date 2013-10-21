package Terracraft.ModBiomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.Block;

import Terracraft.ModBlocks.ModBlock;

public class ModBiomeCorruption extends ModBiome
{
    public ModBiomeCorruption()
    {
        super();
        this.topBlock = (byte)ModBlock.grassCorrupted.blockID;
        this.fillerBlock = (byte)Block.dirt.blockID;
        this.waterColorMultiplier = 8272766;
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
    }
}