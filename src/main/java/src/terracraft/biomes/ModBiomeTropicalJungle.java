package src.terracraft.biomes;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

import src.terracraft.blocks.ModBlock;

public class ModBiomeTropicalJungle extends ModBiome
{
    public ModBiomeTropicalJungle(String name, int color)
    {
        super(name, color);
        this.setTemperatureRainfall(0.5F, 0.7F);
        this.topBlock = (Block)ModBlock.grassJungle;
        this.fillerBlock = (Block)ModBlock.mud;
        this.waterColorMultiplier = color;
    }
}
