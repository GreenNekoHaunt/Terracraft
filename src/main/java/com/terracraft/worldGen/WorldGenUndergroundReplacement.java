package com.terracraft.worldGen;

import java.lang.System;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class WorldGenUndergroundReplacement implements IWorldGenerator
{
    private Block replacement;
    private Block replacementAirAbove;
    private Block replacementAirBelow;

    public WorldGenUndergroundReplacement(Block block)
    {
        replacement = block;
        replacementAirAbove = block;
        replacementAirBelow = block;
    }

    public WorldGenUndergroundReplacement(Block block, Block alt1)
    {
        replacement = block;
        replacementAirAbove = alt1;
        replacementAirBelow = block;
    }

    public WorldGenUndergroundReplacement(Block block, Block alt1, Block alt2)
    {
        replacement = block;
        replacementAirAbove = alt1;
        replacementAirBelow = alt2;
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        for(int x = 0; x < 16; x++)
        {
            for(int z = 0; z < 16; z++)
            {
                for(int y = 0; y < 128; y++)
                {
                    if(world.getBlock(x*chunkX, y, z*chunkZ) == Blocks.stone)
                    {
                        world.setBlock(x*chunkX, y, z*chunkZ, replacement);
                        System.out.println("Replacing Block (" + Blocks.stone + ") with " + replacement + " @x:" + x + "y:" + y + "z:" + z);
                    }

                }
            }
        }
    }
}
