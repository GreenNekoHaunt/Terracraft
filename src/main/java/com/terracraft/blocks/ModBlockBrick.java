package com.terracraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import java.util.Random;

public class ModBlockBrick extends ModBlockFalling
{
    public ModBlockBrick(String name)
    {
        super(name, Material.rock);
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGravel);
        this.setBlockProperties(name);
    }

    public ModBlock setBlockProperties(String block)
    {
        if(block == "brickBlue" || block == "brickGreen" || block == "brickPink")
        {
        	this.setHardness(4.0F);
        	this.setResistance(15.0F);
            this.setHarvestLevel("pickaxe", 6);
            this.setHarvestLevel("pickaxe", 6);
            this.setHarvestLevel("pickaxe", 6);
        }
        else if(block == "brickLihzahrd")
        {
        	this.setHardness(10.0F);
        	this.setResistance(20.0F);
            this.setHarvestLevel("pickaxe", 10);
        }
        else
        {
        	if(block == "brickDemonite") this.setLightLevel(0.625F);
        	this.setHardness(3.0F);
        	this.setResistance(10.0F);
            this.setHarvestLevel("pickaxe", 3);
        }
		return this;
    }
}
