package com.terracraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ModBlockGrassMushroom extends ModBlockGrassJungle
{
    @SideOnly(Side.CLIENT)
    private IIcon iconGrassTop;

    public ModBlockGrassMushroom(String name)
    {
        super(name);
        this.setHardness(0.8F);
        this.setStepSound(soundTypeGrass);
        this.setLightLevel(0.5F);
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, ModBlock.mud);
            }
            else
            {
                for (int l = 0; l < 6; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    Block l1 = par1World.getBlock(i1, j1 + 1, k1);

                    if (par1World.getBlock(i1, j1, k1) == ModBlock.mud
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassMushroom);
                    }
                    if (par1World.getBlock(i1, j1, k1) == ModBlock.mud
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassMushroom);
                    }
                }
            }
        }
    }
}

