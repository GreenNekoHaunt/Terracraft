package Terracraft.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.Icon;

public class ModBlockModLog extends ModBlock
{
    @SideOnly(Side.CLIENT)
    private Icon iconLogTop;
    @SideOnly(Side.CLIENT)
    private Icon iconLogSide;
    private static String blockName;

    public ModBlockModLog(String name)
    {
        super(name, Material.wood);
        this.blockName = name;
    }

    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.iconLogTop : (par1 == 0 ? Block.dirt.getBlockTextureFromSide(par1) : this.blockIcon);
    }

    @SideOnly(Side.CLIENT)

    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par5 == 0 || par5 == 1)
        {
            return this.iconLogTop;
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
        this.iconLogTop = par1IconRegister.registerIcon(this.getTextureName());
        this.iconLogSide = par1IconRegister.registerIcon(this.getTextureName() + "Side");
    }

    @SideOnly(Side.CLIENT)
    public static Icon getIconSideOverlay()
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

