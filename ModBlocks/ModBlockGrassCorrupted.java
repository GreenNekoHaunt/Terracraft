package Terracraft.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class ModBlockGrassCorrupted extends ModBlock
{
    @SideOnly(Side.CLIENT)
    private Icon iconGrassTop;
    @SideOnly(Side.CLIENT)
    private Icon iconGrassSideOverlay;

    public ModBlockGrassCorrupted(String name)
    {
        super(name, Material.grass);
        this.setTickRandomly(true);
    }

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.iconGrassTop : (par1 == 0 ? Block.dirt.getBlockTextureFromSide(par1) : this.blockIcon);
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, Block.dirt.blockID);
            }
            else
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);

                    if (par1World.getBlockId(i1, j1, k1) == Block.dirt.blockID 
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassCorrupted.blockID);
                    }
                    if (par1World.getBlockId(i1, j1, k1) == Block.grass.blockID 
                        && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, ModBlock.grassCorrupted.blockID);
                    }
                }
            }
        }
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.dirt.idDropped(0, par2Random, par3);
    }

    @SideOnly(Side.CLIENT)

    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 == 1)
        {
            return this.iconGrassTop;
        }
        else if (par5 == 0)
        {
            return Block.dirt.getBlockTextureFromSide(par5);
        }
        else
        {
            Material material = par1IBlockAccess.getBlockMaterial(par2, par3 + 1, par4);
            return this.blockIcon;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(this.getTextureName() + "Side");
        this.iconGrassTop = par1IconRegister.registerIcon(this.getTextureName());
        this.iconGrassSideOverlay = par1IconRegister.registerIcon(this.getTextureName() + "Side");
    }

    @SideOnly(Side.CLIENT)
    public static Icon getIconSideOverlay()
    {
        return ((ModBlockGrassCorrupted)ModBlock.grassCorrupted).iconGrassSideOverlay;
    }
}

