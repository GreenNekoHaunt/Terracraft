package src.terracraft.worldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.block.Block;

import src.terracraft.blocks.ModBlock;

public class WorldGenReplaceForSlush implements IWorldGenerator
{
    private Block replace;

    public WorldGenReplaceForSlush(Block block)
    {
        replace = block;
    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
	for(int x = 0; x < chunkX; x++)
        {
            for(int z = 0; z < chunkZ; z++)
            {
                for(int y = 0; y < 64; y++)
                {
                    if(world.getBlock(x, y, z) == replace)
                    {
                        world.setBlock(x, y, z, ModBlock.slush);
                    }
                }
            }
        }
    }
}
