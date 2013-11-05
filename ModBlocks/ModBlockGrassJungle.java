package Terracraft.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.util.Icon;

public class ModBlockGrassJungle extends ModBlockGrassCorrupted
{
    @SideOnly(Side.CLIENT)
    private Icon iconGrassTop;
    @SideOnly(Side.CLIENT)
    private Icon iconGrassSideOverlay;

    public ModBlockGrassJungle(String name)
    {
        super(name);
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, ModBlock.mud.blockID);
            }
            else
            {
                for (int l = 0; l < 8; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);

                    if (par1World.getBlockId(i1, j1, k1) == ModBlock.mud.blockID 
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassJungle.blockID);
                    }
                    if (par1World.getBlockId(i1, j1, k1) == ModBlock.mud.blockID 
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassJungle.blockID);
                    }
                }
            }
        }
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return ModBlock.mud.idDropped(0, par2Random, par3);
    }
}

