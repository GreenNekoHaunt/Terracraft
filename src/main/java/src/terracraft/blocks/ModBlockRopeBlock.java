package src.terracraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

import java.util.Random;

import src.terracraft.items.ModItem;

public class ModBlockRopeBlock extends ModBlock
{
	private boolean stable = true;
	private int checkDirection = 0;
    public ModBlockRopeBlock(String name)
    {
        super(name, Material.plants);
        this.setHardness(0.2F);
        this.setModCreativeTabScenery();
        this.setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 1.0F, 0.6F);
        this.setStepSound(soundTypeRope);
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int posX, int posY, int posZ)
    {
        this.setBlockBoundsBasedOnState(world, posX, posY, posZ);
        return super.getCollisionBoundingBoxFromPool(world, posX, posY, posZ);
    }

    public boolean canBlockStay(World world, int posX, int posY, int posZ)
    {
    	if(world.isAirBlock(posX, posY - 1, posZ))
    	{
    		int i = 0;
    		for(; world.getBlock(posX, posY + i, posZ) == ModBlock.ropeBlock; i++) { }
    		if(world.isAirBlock(posX, posY + i, posZ))
    		{
    			return false;
    		}
    	}
    	if(world.isAirBlock(posX, posY + 1, posZ))
    	{
    		int i = 0;
    		for(; world.getBlock(posX, posY - i, posZ) == ModBlock.ropeBlock; i++) { }
    		if(world.isAirBlock(posX, posY - i, posZ))
    		{
    			return false;
    		}
    	}
    	return true;

    }

    public void onEntityCollidedWithBlock(World world, int posX, int posY, int posZ, Entity entity)
    {

    }

    public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity)
    {
        return true;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 0;
    }

    public void onNeighborBlockChange(World world, int posX, int posY, int posZ, Block block)
    {
        if (!canBlockStay(world, posX, posY, posZ))
        {
            this.dropBlockAsItem(world, posX, posY, posZ, 0, 0);
            world.setBlockToAir(posX, posY, posZ);
        }

        super.onNeighborBlockChange(world, posX, posY, posZ, block);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ModItem.rope;
    }

    public boolean isStable()
    {
    	return this.stable;
    }
}
