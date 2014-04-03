package src.terracraft.worldGen;

import java.util.Random;

import src.terracraft.blocks.ModBlock;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.block.Block;

public class WorldGenerator implements IWorldGenerator
{
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
         switch(world.provider.dimensionId)
         {
              case -1: generateNether(world, random, chunkX * 16, chunkZ * 16, chunkGenerator, chunkProvider);
              case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16, chunkGenerator, chunkProvider);
              case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16, chunkGenerator, chunkProvider);
         }
    }

    private void generateEnd(World world, Random random, int x, int z,  IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {

    }

    private void generateSurface(World world, Random random, int x, int z,  IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        addOreSpawn(ModBlock.silt, world, random, x, z, 18, 6, 1, 64);
        addOreSpawn(ModBlock.mud, world, random, x, z, 32, 4, 1, 64);
        addOreSpawn(ModBlock.redClay, world, random, x, z, 32, 3, 1, 128);
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
        if(random.nextFloat() < 0.33)
        {
        	(new WorldGenChests()).generate(random, x, z, world, chunkGenerator, chunkProvider);
        }
    }

    private void generateNether(World world, Random random, int x, int z,  IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
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
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}
