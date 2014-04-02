package src.terracraft.worldGen;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Random;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;

import src.terracraft.biomes.ModBiome;

public class ModWorldChunkManager extends WorldChunkManager
{
    private World world;
    private List biomesToSpawnIn;
    private BiomeCache biomeCache;
    private GenLayer biomeIndexLayer;
    private GenLayer genBiomes;

    public ModWorldChunkManager()
    {
        biomeCache = new BiomeCache(this);
        biomesToSpawnIn = new ArrayList();
        biomesToSpawnIn.addAll(allowedBiomes);
    }

    public ModWorldChunkManager(World pWorld)
    {
        this();
        this.world = pWorld;
    }

    public ModWorldChunkManager(long par1, WorldType worldType)
    {
        this();
        GenLayer[] agenlayer = GenLayer.initializeAllBiomeGenerators(par1, worldType);
        agenlayer = getModdedBiomeGenerators(worldType, par1, agenlayer);
        this.genBiomes = agenlayer[0];
        this.biomeIndexLayer = agenlayer[1];
    }
}
