package src.terracraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.util.IIcon;

public class ModBlockGrassCrimson extends ModBlockGrassCorrupted
{
    public ModBlockGrassCrimson(String name)
    {
        super(name);
        this.setTickRandomly(true);
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGrass);
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, Blocks.dirt);
            }
            else
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    Block l1 = par1World.getBlock(i1, j1 + 1, k1);

                    if (par1World.getBlock(i1, j1, k1) == Blocks.dirt
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassCrimson);
                    }
                    if (par1World.getBlock(i1, j1, k1) == Blocks.grass
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassCrimson);
                    }
                }
            }
        }
    }
}

