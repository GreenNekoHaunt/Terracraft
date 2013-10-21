package Terracraft.ModBiomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.Block;
import Terracraft.ModBlocks.ModBlock;
import net.minecraft.world.World;
import java.util.Random;

public class ModBiomeWinter extends ModBiome
{
    public ModBiomeWinter()
    {
        super();
        this.topBlock = (byte)Block.blockSnow.blockID;
        this.fillerBlock = (byte)Block.blockSnow.blockID;
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
    }
}
