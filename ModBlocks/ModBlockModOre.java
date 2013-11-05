package Terracraft.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import Terracraft.ModItems.ModItem;

public class ModBlockModOre extends ModBlock
{
    public ModBlockModOre(String name)
    {
        super(name, Material.rock);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        if(this.blockID == ModBlock.oreAmethyst.blockID)
        {
            return ModItem.amethyst.itemID;
        }
        else if(this.blockID == ModBlock.oreTopaz.blockID)
        {
            return ModItem.topaz.itemID;
        }
        else if(this.blockID == ModBlock.oreSapphire.blockID)
        {
            return ModItem.sapphire.itemID;
        }
        else if(this.blockID == ModBlock.oreRuby.blockID)
        {
            return ModItem.ruby.itemID;
        }
        return this.blockID;
    }

    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int j1 = 0;

            if (this.blockID == ModBlock.oreAmethyst.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this.blockID == ModBlock.oreTopaz.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this.blockID == ModBlock.oreSapphire.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this.blockID == ModBlock.oreRuby.blockID)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }

            this.dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
        }
    }
}