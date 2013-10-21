package Terracraft.ModRecipes;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import Terracraft.ModBlocks.ModBlock;
import Terracraft.ModItems.ModItem;

public class ModRecipesPlayer
{
    public ModRecipesPlayer()
    {
        
    }

    public static void initRecipes()
    {
        initShapeless();
        initShaped();
    }
  
    private static void initShapeless()
    {
          GameRegistry.addShapelessRecipe(new ItemStack(Block.torchWood), new ItemStack(Item.stick), new ItemStack(ModItem.gel));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.mud), new ItemStack(Block.dirt), new ItemStack(Item.bucketWater));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.plankRichMahogany, 4), new ItemStack(ModBlock.logRichMahogany));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.plankEbon, 4), new ItemStack(ModBlock.logEbon));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.plankShade, 4), new ItemStack(ModBlock.logShade));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.plankPearl, 4), new ItemStack(ModBlock.logPearl));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickRed, 1), new ItemStack(ModBlock.redClay), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickObsidian, 1), new ItemStack(Block.obsidian), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickEbonstone, 1), new ItemStack(ModBlock.ebonstone), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickMudstone, 1), new ItemStack(ModBlock.mud), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickIridescent, 1), new ItemStack(ModBlock.ash), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickCopper, 1), new ItemStack(ModBlock.oreCopper), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickTin, 1), new ItemStack(ModBlock.oreTin), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickSilver, 1), new ItemStack(ModBlock.oreSilver), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickTungsten, 1), new ItemStack(ModBlock.oreTungsten), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickGold, 1), new ItemStack(Block.oreGold), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickPlatinum, 1), new ItemStack(ModBlock.orePlatinum), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickHellstone, 1), new ItemStack(ModBlock.oreHellstone), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickCobalt, 1), new ItemStack(ModBlock.oreCobalt), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickPalladium, 1), new ItemStack(ModBlock.orePalladium), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickMythril, 1), new ItemStack(ModBlock.oreMythril), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickPearlstone, 1), new ItemStack(ModBlock.pearlsand), new ItemStack(ModBlock.pearlstone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickSandstone, 1), new ItemStack(Block.sand), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickSnow, 1), new ItemStack(Block.blockSnow), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModBlock.brickIce, 1), new ItemStack(ModBlock.iceBlue), new ItemStack(Block.cobblestone));
          GameRegistry.addShapelessRecipe(new ItemStack(ModItem.coinCopper, 100), new ItemStack(ModItem.coinSilver));
          GameRegistry.addShapelessRecipe(new ItemStack(ModItem.coinSilver, 100), new ItemStack(ModItem.coinGold));
          GameRegistry.addShapelessRecipe(new ItemStack(ModItem.coinGold, 100), new ItemStack(ModItem.coinPlatin));
          GameRegistry.addShapelessRecipe(new ItemStack(ModItem.coinSilver), new ItemStack(ModItem.coinCopper, 100));
          GameRegistry.addShapelessRecipe(new ItemStack(ModItem.coinGold), new ItemStack(ModItem.coinSilver, 100));
          GameRegistry.addShapelessRecipe(new ItemStack(ModItem.coinPlatin), new ItemStack(ModItem.coinGold, 100));
    }

    private static void initShaped()
    {
        GameRegistry.addRecipe(new ItemStack(ModItem.crystalMana), "xx", "xx", 'x', new ItemStack(ModItem.fallenStar));
    }
}
