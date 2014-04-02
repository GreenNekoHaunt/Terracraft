package src.terracraft.recipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import src.terracraft.blocks.ModBlock;
import src.terracraft.items.ModItem;

public class ModRecipesFurnace
{
    public ModRecipesFurnace()
    {

    }

    public static void initRecipes()
    {
        GameRegistry.addSmelting(ModBlock.oreCopper, new ItemStack(ModItem.ingotCopper), 0.7f);
        GameRegistry.addSmelting(ModBlock.oreTin, new ItemStack(ModItem.ingotTin), 0.7f);
        GameRegistry.addSmelting(ModBlock.oreLead, new ItemStack(ModItem.ingotLead), 0.7f);
        GameRegistry.addSmelting(ModBlock.oreSilver, new ItemStack(ModItem.ingotSilver), 0.7f);
        GameRegistry.addSmelting(ModBlock.oreTungsten, new ItemStack(ModItem.ingotTungsten), 0.7f);
        GameRegistry.addSmelting(ModBlock.orePlatinum, new ItemStack(ModItem.ingotPlatinum), 1.0f);
        GameRegistry.addSmelting(ModBlock.oreDemonite, new ItemStack(ModItem.ingotDemonite), 1.0f);
        GameRegistry.addSmelting(ModBlock.oreCrimtane, new ItemStack(ModItem.ingotCrimtane), 1.0f);
        GameRegistry.addSmelting(ModBlock.oreMeteorite, new ItemStack(ModItem.ingotMeteorite), 1.0f);
    }
}
