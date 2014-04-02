package src.terracraft.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import src.terracraft.blocks.ModBlock;
import src.terracraft.items.ModItem;

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
    	GameRegistry.addRecipe(new ItemStack(ModBlock.chestEbonwood), "xxx", "x x", "xxx", 'x', ModBlock.plankEbon);
    	GameRegistry.addRecipe(new ItemStack(ModBlock.chestPearlwood), "xxx", "x x", "xxx", 'x', ModBlock.plankPearl);
    	GameRegistry.addRecipe(new ItemStack(ModBlock.chestRichMahogany), "xxx", "x x", "xxx", 'x', ModBlock.plankRichMahogany);
    	GameRegistry.addRecipe(new ItemStack(ModBlock.chestShadewood), "xxx", "x x", "xxx", 'x', ModBlock.plankShade);
    }
}
