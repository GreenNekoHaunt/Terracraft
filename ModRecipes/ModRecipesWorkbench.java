package Terracraft.ModRecipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import Terracraft.ModBlocks.ModBlock;
import Terracraft.ModItems.ModItem;

public class ModRecipesWorkbench
{
    public ModRecipesWorkbench()
    {
        
    }

    public static void initRecipes()
    {
        initShapeless();
        initShaped();
    }
  
    private static void initShapeless()
    {
        ModRecipesPlayer.initRecipes();
    }

    private static void initShaped()
    {
//        GameRegistry.addRecipe(new ItemStack(Block.cobblestone), "xy", "yx", 'x', dirtStack, 'y', gravelStack);
    }
}