package src.terracraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ModBlockGrassCorrupted extends ModBlock
{
    @SideOnly(Side.CLIENT)
    private IIcon iconGrassSide;

    public ModBlockGrassCorrupted(String name)
    {
        super(name, Material.grass);
        this.setTickRandomly(true);
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGrass);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if (par1 == 1)
        {
            return this.blockIcon;
        }
        else if (par1 == 0)
        {
            return Blocks.dirt.getBlockTextureFromSide(par1);
        }
        else
        {
        	return this.iconGrassSide;
        }
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
                        par1World.setBlock(i1, j1, k1, ModBlock.grassCorrupted);
                    }
                    if (par1World.getBlock(i1, j1, k1) == Blocks.grass
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassCorrupted);
                    }
                }
            }
        }
    }

    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return Blocks.dirt.getItemDropped(0, par2Random, par3);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 == 1)
        {
            return this.blockIcon;
        }
        else if (par5 == 0)
        {
            return Blocks.dirt.getBlockTextureFromSide(par5);
        }
        else
        {
        	return this.iconGrassSide;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(this.getTextureName());
        this.iconGrassSide = par1IconRegister.registerIcon(this.getTextureName() + "Side");
        System.out.println(this.getTextureName());
    }

    @SideOnly(Side.CLIENT)
    public static IIcon getIconSideOverlay()
    {
        return ((ModBlockGrassCorrupted)ModBlock.grassCorrupted).iconGrassSide;
    }
}

