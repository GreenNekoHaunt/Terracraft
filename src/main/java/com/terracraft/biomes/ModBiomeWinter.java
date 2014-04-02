package com.terracraft.biomes;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import java.util.Random;

import com.terracraft.worldGen.WorldGenUndergroundReplacement;
import com.terracraft.worldGen.WorldGenReplaceForSlush;
import com.terracraft.worldGen.WorldGenIce;
import com.terracraft.blocks.ModBlock;

public class ModBiomeWinter extends ModBiome
{
    public ModBiomeWinter(String name, int color)
    {
        super(name, color);
        this.setEnableSnow();
        this.setTemperatureRainfall(0.0F, 1.0F);
        this.topBlock = (Block)Blocks.snow;
        this.fillerBlock = (Block)Blocks.snow;
        this.waterColorMultiplier = color;
    }

    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
        (new WorldGenIce()).generate(par2Random, par3, par4, par1World, null, null);
        (new WorldGenReplaceForSlush(ModBlock.silt)).generate(par2Random, par3, par4, par1World, null, null);
    }
}
