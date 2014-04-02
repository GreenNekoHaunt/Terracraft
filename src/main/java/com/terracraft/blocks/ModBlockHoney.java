package com.terracraft.blocks;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;

public class ModBlockHoney extends ModBlock
{
    public ModBlockHoney(String name)
    {
        super(name, Material.rock);
        this.setHardness(1.5F);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float f = 0.125F;
        return AxisAlignedBB.getAABBPool().getAABB((double)par2, (double)par3, (double)par4, (double)(par2 + 1), (double)((float)(par3 + 1) - f), (double)(par4 + 1));
    }

    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.motionX *= 0.2D;
        par5Entity.motionZ *= 0.2D;
    }
}
