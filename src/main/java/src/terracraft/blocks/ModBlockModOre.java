package src.terracraft.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import src.terracraft.items.ModItem;

public class ModBlockModOre extends ModBlock
{
    public ModBlockModOre(String name)
    {
        super(name, Material.rock);
        this.setHardness(3.0F);
        this.setModCreativeTabBlock();
        this.setResistance(5.0F);
        this.setBlockProperties(name);
        this.setHarvestLevel("pickaxe", 1);
    }

    public ModBlock setBlockProperties(String block)
    {
        if(block == "oreDemonite" || block == "oreCrimtane")
        {
        	this.setLightLevel(0.625F);
        	this.setResistance(12.0F);
        	this.setHarvestLevel("pickaxe", 3);
        }
        else if(block == "oreMeteorite")
        {
        	this.setLightLevel(0.8F);
        	this.setHardness(3.0F);
        	this.setResistance(10.0F);
        	this.setHarvestLevel("pickaxe", 3);
        }
        else if(block == "oreHellstone")
        {
        	this.setLightLevel(0.8F);
        	this.setHardness(5.0F);
        	this.setResistance(15.0F);
        	this.setHarvestLevel("pickaxe", 5);
        }
        else if(block == "oreCobalt" || block == "orePalladium")
        {
        	this.setHardness(6.0F);
        	this.setResistance(17.5F);
        	this.setHarvestLevel("pickaxe", 6);
        }
        else if(block == "oreMythril" || block == "oreOrichalcum")
        {
        	this.setHardness(7.0F);
        	this.setResistance(20.0F);
        	this.setHarvestLevel("pickaxe", 7);
        }
        else if(block == "oreAdamantite" || block == "oreTitanium")
        {
        	this.setHardness(8.0F);
        	this.setResistance(22.5F);
        	this.setHarvestLevel("pickaxe", 8);
        }
        else if(block == "oreChlorophyte")
        {
        	this.setHardness(8.0F);
        	this.setResistance(15.0F);
        	this.setHarvestLevel("pickaxe", 9);
        }
        return this;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        if(this == ModBlock.oreAmethyst)
        {
            return ModItem.amethyst;
        }
        else if(this == ModBlock.oreTopaz)
        {
            return ModItem.topaz;
        }
        else if(this == ModBlock.oreSapphire)
        {
            return ModItem.sapphire;
        }
        else if(this == ModBlock.oreRuby)
        {
            return ModItem.ruby;
        }
        return Item.getItemFromBlock(this);
    }


    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.getItemDropped(par5, par1World.rand, par7) != Item.getItemFromBlock(this))
        {
            int j1 = 0;

            if (this == ModBlock.oreAmethyst)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this == ModBlock.oreTopaz)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this == ModBlock.oreSapphire)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this == ModBlock.oreRuby)
            {
                j1 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }

            this.dropXpOnBlockBreak(par1World, par2, par3, par4, j1);
        }
    }
}
