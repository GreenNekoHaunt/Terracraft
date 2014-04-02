package src.terracraft.worldGen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;

import src.terracraft.blocks.ModBlock;

public class WorldGenIce implements IWorldGenerator
{
    public WorldGenIce()
    {

    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        addIceSpawn(world, random, (chunkX*16), (chunkZ*16), 48, 2, 1, 32);
        addIceSpawn(world, random, (chunkX*16), (chunkZ*16), 24, 3, 33, 64);
    }

    public void addIceSpawn(World world, Random random, int blockXPos, int blockZPos, int maxVeinSize, int chancesToSpawn, int minY, int maxY)
    {
        int maxPosY = minY + (maxY - 1);

        int diffBtwnMinMaxY = maxY - minY;
        for(int x = 0; x < chancesToSpawn; x++)
        {
            int posX = blockXPos + random.nextInt(16);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(16);
            (new WorldGenMinable(ModBlock.iceBlue, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}
