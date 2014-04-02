package src.terracraft.items;

import src.terracraft.blocks.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ModItemKey extends ModItem
{
    public ModItemKey(String name)
    {
        super(name);
        this.setMaxStackSize(99);
    }
}
