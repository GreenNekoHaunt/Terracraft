package Terracraft.ModRecipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import Terracraft.ModBlocks.ModBlock;
import Terracraft.ModItems.ModItem;

public class ModRecipesFurnace
{
    public ModRecipesFurnace()
    {
        
    }

    public static void initRecipes()
    {
        GameRegistry.addSmelting(ModBlock.oreCopper.blockID, new ItemStack(ModItem.ingotCopper), 0.7f);
        GameRegistry.addSmelting(ModBlock.oreTin.blockID, new ItemStack(ModItem.ingotTin), 0.7f);
        GameRegistry.addSmelting(ModBlock.oreLead.blockID, new ItemStack(ModItem.ingotLead), 0.7f);
        GameRegistry.addSmelting(ModBlock.oreSilver.blockID, new ItemStack(ModItem.ingotSilver), 0.7f);
        GameRegistry.addSmelting(ModBlock.oreTungsten.blockID, new ItemStack(ModItem.ingotTungsten), 0.7f);
        GameRegistry.addSmelting(ModBlock.orePlatinum.blockID, new ItemStack(ModItem.ingotPlatinum), 1.0f);
        GameRegistry.addSmelting(ModBlock.oreDemonite.blockID, new ItemStack(ModItem.ingotDemonite), 1.0f);
        GameRegistry.addSmelting(ModBlock.oreCrimtane.blockID, new ItemStack(ModItem.ingotCrimtane), 1.0f);
        GameRegistry.addSmelting(ModBlock.oreMeteorite.blockID, new ItemStack(ModItem.ingotMeteorite), 1.0f);
    }
}
