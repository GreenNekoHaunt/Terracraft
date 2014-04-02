package src.terracraft.worldGen;

import java.util.Random;
import net.minecraft.world.gen.ChunkProviderGenerate;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import src.terracraft.biomes.ModBiome;
import src.terracraft.blocks.ModBlock;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.*;
import static net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.*;
import net.minecraftforge.common.*;
import net.minecraftforge.event.terraingen.*;

public class ModChunkProvider extends ChunkProviderGenerate
{
    private Random rand;
    private NoiseGeneratorOctaves noiseGen1;
    private NoiseGeneratorOctaves noiseGen2;
    private NoiseGeneratorOctaves noiseGen3;
    private NoiseGeneratorOctaves noiseGen4;
    private World worldObj;
    private final boolean mapFeaturesEnabled;
    private double[] noiseArray;
    private double[] stoneNoise = new double[256];
    private MapGenBase caveGenerator = new MapGenCaves();
    private MapGenStronghold strongholdGenerator = new MapGenStronghold();
    private MapGenVillage villageGenerator = new MapGenVillage();
    private MapGenMineshaft mineshaftGenerator = new MapGenMineshaft();
//    private MapGenScatteredFeature scatteredFeatureGenerator = new MapGenScatteredFeature();
    private MapGenBase ravineGenerator = new MapGenRavine();
    private BiomeGenBase[] biomesForGeneration;

    public ModChunkProvider(World world, long seed, boolean hasFeatures)
    {
        super(world, seed, hasFeatures);
        this.worldObj = world;
        this.mapFeaturesEnabled = hasFeatures;
        this.rand = new Random(seed);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.rand, 16);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.rand, 8);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.rand, 4);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, 10);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, 16);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, 8);

        NoiseGeneratorOctaves[] noiseGens = {noiseGen1, noiseGen2, noiseGen3, noiseGen4, noiseGen5, noiseGen6, mobSpawnerNoise};
    }

/*    public void replaceBlocksForJungle(int i, int j, Block blocks, BiomeGenBase abiomegenbase[])
    {
        for(int x = 0; x < 16; x++)
        {
            for(int z = 0; z < 16; z++)
            {
                BiomeGenBase biomegenbase = abiomegenbase[z + x * 16];
                if(biomegenbase != ModBiome.tropicalJungle)
                {
                    continue;
                }
                for(int y = 0; y < worldObj.getHeight(); y++)
                {
                    int posInt = (z * 16 + x) * worldObj.getHeight() + y;
                    Block prevBlock = blocks[posInt];
                    if(prevBlock != null && prevBlock != Blocks.waterStill)
                    {
                        int posAbove = posInt + 1;
                        int posBelow = posInt - 1;
                        boolean airAbove = y >= worldObj.getHeight() - 1;
                        boolean airBelow = y <= 0;
                        if(!airAbove)
                        {
                            byte block = blocks[posInt + 1];
                            airAbove = block == 0 || block == Blocks.waterStill;
                        }
                        if(!airBelow)
                        {
                            byte block = blocks[posInt - 1];
                            airBelow = block == 0 || block == Blocks.waterStill;
                        }

                        if(airAbove || airBelow)
                        {
                            blocks[posInt] = (byte)ModBlock.grassJungle;
                        } else
                        {
                            blocks[posInt] = (byte)ModBlock.mud;
                        }
                    }
                }
            }
        }
    }*/
}
