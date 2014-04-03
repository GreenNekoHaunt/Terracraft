package src.terracraft.items;

import src.terracraft.blocks.ModBlock;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class ModItemMagicMirror extends ModItem
{
	public ModItemMagicMirror(String name)
	{
		super(name);
	}

    public int getMaxItemUseDuration(ItemStack itemStack)
    {
        return 32;
    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
        entityPlayer.setItemInUse(itemStack, this.getMaxItemUseDuration(itemStack));
        // Costs 20 mana
        /*ChunkCoordinates portCoords = entityPlayer.getBedLocation(entityPlayer.dimension);
        if(portCoords != null)
        {
        	entityPlayer.setPosition(portCoords.posX, portCoords.posY, portCoords.posZ);
        }
        else
        {
        	portCoords = world.getSpawnPoint();
        	entityPlayer.setPosition(portCoords.posX, portCoords.posY, portCoords.posZ);
        }*/
        entityPlayer.respawnPlayer();
        return itemStack;
    }
}
