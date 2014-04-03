package src.terracraft.items;

import src.terracraft.blocks.ModBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemRope extends ModItem
{
	public ModItemRope(String name)
	{
		super(name);
	}

	public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int posX, int posY, int posZ, int meta, float par8, float par9, float par10)
    {
		if(entityPlayer.isSneaking())
		{
			int i = 1;
			for(; world.getBlock(posX, posY - i, posZ) == ModBlock.ropeBlock; i++) { }
			if(world.isAirBlock(posX, posY - i, posZ))
			{
				world.setBlock(posX, posY - i, posZ, ModBlock.ropeBlock);
				itemStack.stackSize -= 1;
				return true;
			}
		}
		else
		{
			int i = 1;
			for(; world.getBlock(posX, posY + i, posZ) == ModBlock.ropeBlock; i++) { }
			if(world.isAirBlock(posX, posY + i, posZ))
			{
				world.setBlock(posX, posY + i, posZ, ModBlock.ropeBlock);
				itemStack.stackSize -= 1;
				return true;
			}
		}
		return false;
    }
}
