package com.terracraft.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.IIcon;

public class ModBlockModLog extends ModBlock
{
    @SideOnly(Side.CLIENT)
    private IIcon iconLogTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconLogSide;
    private static String blockName;

    public ModBlockModLog(String name)
    {
        super(name, Material.wood);
        this.blockName = name;
        this.setHardness(2.5F);
        this.setStepSound(soundTypeWood);
        this.setHarvestLevel("axe", 2);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.iconLogTop : (par1 == 0 ? Blocks.dirt.getBlockTextureFromSide(par1) : this.blockIcon);
    }

    @SideOnly(Side.CLIENT)

    public IIcon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 == 0 || par5 == 1)
        {
            return this.iconLogTop;
        }
        else
        {
            Material material = par1IBlockAccess.getBlock(par2, par3 + 1, par4).getMaterial();
            return this.blockIcon;
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(this.getTextureName() + "Side");
        this.iconLogTop = par1IconRegister.registerIcon(this.getTextureName());
        this.iconLogSide = par1IconRegister.registerIcon(this.getTextureName() + "Side");
    }

    @SideOnly(Side.CLIENT)
    public static IIcon getIconSideOverlay()
    {
        if(blockName == "logRichMahogany")
        {
            return ((ModBlockModLog)ModBlock.logRichMahogany).iconLogSide;
        }
        else if(blockName == "logEbon")
        {
            return ((ModBlockModLog)ModBlock.logEbon).iconLogSide;
        }
        else if(blockName == "logShade")
        {
            return ((ModBlockModLog)ModBlock.logShade).iconLogSide;
        }
        else
        {
            return ((ModBlockModLog)ModBlock.logPearl).iconLogSide;
        }
    }
}

