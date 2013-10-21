package Terracraft.WorldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.block.Block;

import Terracraft.ModBlocks.ModBlock;

public class WorldGenerator implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
         switch(world.provider.dimensionId)
         {
              case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
              case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
              case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
         }
    }

    private void generateEnd(World world, Random random, int x, int z)
    {

    }    
     
    private void generateSurface(World world, Random random, int x, int z)
    {
        int alternateChance = random.nextInt(1);
        switch(alternateChance)
        {
            case 0:
                addOreSpawn(ModBlock.oreCopper, world, random, x, z, 11, 8, 1, 96);
                addOreSpawn(ModBlock.oreLead, world, random, x, z, 10, 8, 1, 96);
                addOreSpawn(ModBlock.oreSilver, world, random, x, z, 9, 6, 1, 64);
                addOreSpawn(ModBlock.orePlatinum, world, random, x, z, 8, 3, 1, 32);
                addOreSpawn(ModBlock.oreDemonite, world, random, x, z, 3, 1, 1, 48);
                break;
            case 1:
                addOreSpawn(ModBlock.oreTin, world, random, x, z, 11, 8, 1, 96);
                addOreSpawn(ModBlock.oreLead, world, random, x, z, 10, 8, 1, 96);
                addOreSpawn(ModBlock.oreTungsten, world, random, x, z, 9, 6, 1, 64);
                addOreSpawn(ModBlock.orePlatinum, world, random, x, z, 8, 3, 1, 32);
                addOreSpawn(ModBlock.oreCrimtane, world, random, x, z, 3, 1, 1, 48);
                break;
        }



    }

    private void generateNether(World world, Random random, int x, int z)
    {
         
    }

    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        int maxPosY = minY + (maxY - 1);
            
        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(16);
            (new WorldGenMinable(block.blockID, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}
