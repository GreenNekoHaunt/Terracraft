package src.terracraft.worldGen;

import java.util.Random;

import net.minecraft.block.BlockChest;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;

import src.terracraft.blocks.ModBlock;
import src.terracraft.blocks.ModBlockModChest;
import src.terracraft.items.ModItem;

public class WorldGenChests implements IWorldGenerator
{
	private Random rand = new Random();

    public WorldGenChests()
    {

    }

    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
    	Block chestBlock;
    	IInventory iInventory;
    	int posX = (chunkX * 16) + random.nextInt(16);
        int posZ = (chunkZ * 16) + random.nextInt(16);
        int posY = random.nextInt(world.getActualHeight());

        boolean isCavern = (posY > 64);
        boolean validBlockBelow = (!world.isAirBlock(posX, posY - 1, posZ) && world.getBlock(posX, posY + 1, posZ).getMaterial() != Material.water)
        								&& world.getBlock(posX, posY + 1, posZ).getMaterial() != Material.lava;
    	boolean validBlockAbove = (world.isAirBlock(posX, posY + 1, posZ) || world.getBlock(posX, posY + 1, posZ).getMaterial() == Material.water);

    	if(validBlockAbove && validBlockBelow)
    	{
		    if(world.isAirBlock(posX, posY, posZ))
		    {
		    	//System.out.println("Position: " + posX + "," + posY + "," + posZ + " is an air block.");
		    	if(isCavern)
		    	{
		    		if(world.getTopSolidOrLiquidBlock(posX, posZ) > posY)
		    		{
		    			//System.out.println("Position: " + posX + "," + posY + "," + posZ + " has solid or liquid above.");
		    			if(rand.nextInt(posY) - 56 != 0)
		    			{
		    				System.out.println("Position: " + posX + "," + posY + "," + posZ + " set as normal chest");
		        			world.setBlock(posX, posY, posZ, Blocks.chest);
		        			chestBlock = world.getBlock(posX, posY, posZ);
		        			iInventory = ((BlockChest) chestBlock).func_149951_m(world, posX, posY, posZ);
		        			fillStandardChest(iInventory);
		    			}
		    			else
		    			{
		    				System.out.println("Position: " + posX + "," + posY + "," + posZ + " set as gold chest");
		    				world.setBlock(posX, posY, posZ, ModBlock.chestGold);
		    				chestBlock = world.getBlock(posX, posY, posZ);
		    				iInventory = ((ModBlockModChest)chestBlock).getIInventoryObject(world, posX, posY, posZ, true);
		        			fillGoldCavernChest(iInventory);
		    			}
		    		}
		    	}
		    	else
		    	{
		    		if(world.getTopSolidOrLiquidBlock(posX, posZ) > posY)
		    		{
		    			//System.out.println("Position: " + posX + "," + posY + "," + posZ + " has solid or liquid above.");
		    			int woodenChestChance = random.nextInt(posY);
		    			if(woodenChestChance == 0)
		    			{
		    				System.out.println("Position: " + posX + "," + posY + "," + posZ + " set as normal chest");
		        			world.setBlock(posX, posY, posZ, Blocks.chest);
		        			chestBlock = world.getBlock(posX, posY, posZ);
		        			iInventory = ((BlockChest) chestBlock).func_149951_m(world, posX, posY, posZ);
		        			fillStandardChest(iInventory);
		    			}
		    			else
		    			{
		    				System.out.println("Position: " + posX + "," + posY + "," + posZ + " set as gold chest");
		    				world.setBlock(posX, posY, posZ, ModBlock.chestGold);
		    				chestBlock = world.getBlock(posX, posY, posZ);
		    				iInventory = ((ModBlockModChest)chestBlock).getIInventoryObject(world, posX, posY, posZ, true);
		        			fillGoldUndergroundChest(iInventory);
		    			}
		    		}
		    	}
		    }
		    else if(world.getBlock(posX, posY, posZ).getMaterial() == Material.water)
		    {
		    	boolean oneAboveWater = (world.getBlock(posX, posY + 1, posZ).getMaterial() == Material.water);
		    	boolean twoAboveWater = (world.getBlock(posX, posY + 2, posZ).getMaterial() == Material.water);
		    	boolean threeAboveWater = (world.getBlock(posX, posY + 3, posZ).getMaterial() == Material.water);
		    	if(oneAboveWater && twoAboveWater && threeAboveWater)
		    	{
		    		world.setBlock(posX, posY, posZ, ModBlock.chestWater);
					chestBlock = world.getBlock(posX, posY, posZ);
					iInventory = ((ModBlockModChest)chestBlock).getIInventoryObject(world, posX, posY, posZ, true);
					fillWaterChest(iInventory);
		    	}
		    }
    	}
    }

    public void fillStandardChest(IInventory iInventory)
    {
    	int stackSize = 1;
    	int rareItem = rand.nextInt(9);
    	float chanceGrenade = rand.nextFloat();
    	float chanceIngot = rand.nextFloat();
    	int ingotType = rand.nextInt(3);
    	float chanceWeapon = rand.nextFloat();
    	int weaponType = rand.nextInt(1);
    	float chancePotion = rand.nextFloat();
    	float chanceAltPotion = rand.nextFloat();
    	int altPotionType = rand.nextInt(3);
    	float chanceUtility = rand.nextFloat();
    	int utilityType = rand.nextInt(1);
    	float chanceRope = rand.nextFloat();
    	float chanceCoin = rand.nextFloat();

    	switch(rareItem)
    	{
	    	case 1:
	    		// TODO: create Item "Wooden Boomerang" (1)
	    		break;
	    	case 2:
	    		// TODO: create Item "Blowpipe" (1)
	    		break;
	    	case 3:
	    		// TODO: create Item "Glowstick" (50-74)
	    		break;
	    	case 4:
	    		// TODO: create Item "Throwing Knife" (25-49)
	    		break;
	    	case 5:
	    		// TODO: create Item "Aglet" (1)
	    		break;
	    	case 6:
	    		// TODO: create Item "climbing claws" (1)
	    		break;
	    	case 7:
	    		// TODO: create Item "umbrella" (1)
	    		break;
	    	case 8:
	    		// TODO: create Item "robot hat" (1)
	    		break;
	    	default:
	    		// TODO: create Item "Spear" (1)
	    		break;
    	}
    	if(chanceGrenade < 0.33)
    	{
    		// TODO: create Item "Grenade" (3-5)
    	}
    	if(chanceIngot < 0.5)
    	{
			stackSize = rand.nextInt(8) + 3;
    		switch(ingotType)
    		{
    			case 1:
    				placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotCopper, stackSize));
    				break;
    			case 2:
    				placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotTin, stackSize));
    				break;
    			case 3:
    				placeStackInEmptySpace(iInventory, new ItemStack(Items.iron_ingot, stackSize));
    				break;
    			default:
    				placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotLead, stackSize));
    				break;
    		}
    	}
    	if(chanceWeapon < 0.67)
    	{
			stackSize = rand.nextInt(26) + 25;
    		switch(weaponType)
    		{
    			case 1:
    				placeStackInEmptySpace(iInventory, new ItemStack(Items.arrow, stackSize));
    				break;
    			default:
    				// TODO: create Item "shuriken" (25-50)
    				break;
    		}
    	}
    	if(chancePotion < 0.5)
    	{
    		stackSize = rand.nextInt(3) + 3;
    		placeStackInEmptySpace(iInventory, new ItemStack(ModItem.potionLesserHealing, stackSize));
    	}
    	if(chanceAltPotion < 0.5)
    	{
    		stackSize = rand.nextInt(3) + 1;
    		switch(altPotionType)
    		{
    			case 1:
    				// TODO: create item "ironskin potion" (1-3)
    				break;
    			case 2:
    				// TODO: create item "shine potion" (1-3)
    				break;
    			case 3:
    				// TODO: create item "night owl potion" (1-3)
    			default:
    				// TODO: create item "swiftness potion" (1-3)
    				break;
    		}
    	}
    	if(chanceUtility < 0.5)
    	{
    		stackSize = rand.nextInt(11) + 10;
    		switch(utilityType)
    		{
    			case 1:
    				placeStackInEmptySpace(iInventory, new ItemStack(Blocks.torch, stackSize));
    				break;
    			default:
    				placeStackInEmptySpace(iInventory, new ItemStack(Items.glass_bottle, stackSize));
    				break;
    		}
    	}
    	if(chanceRope < 0.5)
    	{
    		stackSize = rand.nextInt(51) + 50;
    		placeStackInEmptySpace(iInventory, new ItemStack(ModItem.rope, stackSize));
    	}
    	if(chanceCoin < 0.5)
    	{
    		stackSize = rand.nextInt(20) + 10;
    		placeStackInEmptySpace(iInventory, new ItemStack(ModItem.coinSilver, stackSize));
    	}
    }

    public void fillGoldUndergroundChest(IInventory iInventory)
    {
    	int stackSize = 1;
    	int rareItem = rand.nextInt(9);
    	float chanceBomb = rand.nextFloat();
    	float chanceStatue = rand.nextFloat();
    	float chanceRope = rand.nextFloat();
    	float chanceIngot = rand.nextFloat();
    	int ingotType = rand.nextInt(3);
    	float chanceWeapon = rand.nextFloat();
    	int weaponType = rand.nextInt(1);
    	float chancePotion = rand.nextFloat();
    	float chanceAltPotion = rand.nextFloat();
    	int altPotionType = rand.nextInt(7);
    	float chanceUtility = rand.nextFloat();
    	int utilityType = rand.nextInt(1);
    	float chanceCoin = rand.nextFloat();

    	switch(rareItem)
    	{
    		case 1:
    			placeStackInEmptySpace(iInventory, new ItemStack(ModItem.magicMirror, stackSize));
    			break;
    		case 2:
    			// TODO: create item "cloud in a bottle" (1)
    			break;
    		case 3:
    			// TODO: create item "hermes boots" (1)
    			break;
    		case 4:
    			// TODO: create item "enchanted boomerang" (1)
    			break;
    		case 5:
    			// TODO: create item "shoe spikes" (1)
    			break;
    		case 6:
    			// TODO: create item "flare gun" (1)
    			break;
    		case 7:
    			// TODO: create item "flare" (1)
    			break;
    		case 8:
    			// TODO: create item "extractinator" (1)
    			break;
    		default:
    			// TODO: create item "band of regeneration" (1)
    			break;
    	}
    	if(chanceBomb < 0.33)
    	{
    		// TODO: create item "bomb" (10-19)
    	}
    	if(chanceStatue < 0.2)
    	{
    		// TODO: create item "angel statue" (1)
    	}
    	if(chanceRope < 0.33)
    	{
    		stackSize = rand.nextInt(51) + 50;
    		placeStackInEmptySpace(iInventory, new ItemStack(ModItem.rope, stackSize));
    	}
    	if(chanceIngot < 0.5)
    	{
    		stackSize = rand.nextInt(10) + 5;
    		switch(ingotType)
    		{
    			case 1:
    				placeStackInEmptySpace(iInventory, new ItemStack(Items.iron_ingot, stackSize));
    				break;
    			case 2:
    				placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotLead, stackSize));
    				break;
    			case 3:
    				placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotSilver, stackSize));
    				break;
    			default:
    				placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotTungsten, stackSize));
    				break;
    		}
    	}
    	if(chanceWeapon < 0.5)
    	{
    		stackSize = rand.nextInt(25) + 25;
    		switch(weaponType)
    		{
    			case 1:
    				placeStackInEmptySpace(iInventory, new ItemStack(Items.arrow, stackSize));
    				break;
    			default:
    				// TODO: create item "shuriken"
    				break;
    		}
    	}
    	if(chancePotion < 0.5)
    	{
    		stackSize = rand.nextInt(3) + 3;
    		placeStackInEmptySpace(iInventory, new ItemStack(ModItem.potionLesserHealing, stackSize));
    	}
    	if(chanceAltPotion < 0.67)
    	{
    		stackSize = rand.nextInt(3) + 1;
    		switch(altPotionType)
    		{
    			case 1:
    				// TODO: create item "regeneration potion"
    				break;
    			case 2:
    				// TODO: create item "shine potion"
    				break;
    			case 3:
    				// TODO: create item "night owl potion"
    				break;
    			case 4:
    				// TODO: create item "swiftness potion"
    				break;
    			case 5:
    				// TODO: create item "archery potion"
    				break;
    			case 6:
    				// TODO: create item "gills potion"
    				break;
    			default:
    				// TODO: create item "hunter's potion"
    				break;
    		}
    	}
    	if(chanceUtility < 0.5)
    	{
    		stackSize = rand.nextInt(11) + 10;
    		placeStackInEmptySpace(iInventory, new ItemStack(Blocks.torch, stackSize));
    	}
    	if(chanceCoin < 0.5)
    	{
    		stackSize = rand.nextInt(40) + 50;
    		placeStackInEmptySpace(iInventory, new ItemStack(ModItem.coinSilver, stackSize));
    	}
    }

    public void fillGoldCavernChest(IInventory iInventory)
    {
    	int stackSize = 1;
    	int rareItem = rand.nextInt(10);
    	float chanceEyeBoss = rand.nextFloat();
    	float chanceDynamite = rand.nextFloat();
    	float chanceJester = rand.nextFloat();
    	float chanceIngot = rand.nextFloat();
    	int ingotType = rand.nextInt(3);
    	float chanceWeapon = rand.nextFloat();
    	int weaponType = rand.nextInt(1);
    	float chancePotion = rand.nextFloat();
    	float chanceAltPotionA = rand.nextFloat();
    	int altPotionTypeA = rand.nextInt(6);
    	float chanceAltPotionB = rand.nextFloat();
    	int altPotionTypeB = rand.nextInt(4);
    	float chanceUtility = rand.nextFloat();
    	int utilityType = rand.nextInt(1);
    	float chanceCoin = rand.nextFloat();

    	switch(rareItem)
    	{
    		case 1:
    			placeStackInEmptySpace(iInventory, new ItemStack(ModItem.magicMirror, stackSize));
    			break;
    		case 2:
    			// TODO: create item "cloud in a bottle" (1)
    			break;
    		case 3:
    			// TODO: create item "hermes boots" (1)
    			break;
    		case 4:
    			// TODO: create item "enchanted boomerang" (1)
    			break;
    		case 5:
    			// TODO: create item "shoe spikes" (1)
    			break;
    		case 6:
    			// TODO: create item "flare gun" (1)
    			break;
    		case 7:
    			// TODO: create item "flare" (1)
    			break;
    		case 8:
    			// TODO: create item "extractinator" (1)
    			break;
    		case 9:
    			// TODO: create item "lava charm" (1)
    			break;
    		default:
    			// TODO: create item "band of regeneration" (1)
    			break;
    	}
    	if(chanceEyeBoss < 0.2)
    	{
    		// TODO: create item "suspecious looking eye" (1)
    	}
    	if(chanceDynamite < 0.33)
    	{
    		// TODO: create item "dynamite" (1)
    	}
    	if(chanceJester < 0.25)
    	{
    		// TODO: create item "jesters arrow" (25-50)
    	}
    	if(chanceIngot < 0.5)
    	{
    		stackSize = rand.nextInt(8) + 3;
    		switch(ingotType)
    		{
    			case 1:
    				placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotTungsten, stackSize));
    				break;
    			case 2:
    				placeStackInEmptySpace(iInventory, new ItemStack(Items.gold_ingot, stackSize));
    				break;
    			case 3:
    				placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotPlatinum, stackSize));
    				break;
				default:
					placeStackInEmptySpace(iInventory, new ItemStack(ModItem.ingotSilver, stackSize));
					break;
    		}
    	}
    	if(chanceWeapon < 0.5)
    	{
    		stackSize = rand.nextInt(26) + 25;
    		switch(weaponType)
    		{
    			case 1:
    				// TODO: create item "flaming arrow"
    				break;
    			default:
    				// TODO: create item "throwing knife"
    				break;
    		}
    	}
    	if(chancePotion < 0.5)
    	{
    		stackSize = rand.nextInt(3) + 3;
    		placeStackInEmptySpace(iInventory, new ItemStack(ModItem.potionHealing, stackSize));
    	}
    	if(chanceAltPotionA < 0.67)
    	{
    		stackSize = rand.nextInt(3) + 1;
    		switch(altPotionTypeA)
    		{
    			case 1:
    				// TODO: create item "spelunker potion"
    				break;
    			case 2:
    				// TODO: create item "featherfall potion"
    				break;
    			case 3:
    				// TODO: create item "night owl potion"
    				break;
    			case 4:
    				// TODO: create item "water walking potion"
    				break;
    			case 5:
    				// TODO: create item "archery potion"
    				break;
    			default:
    				// TODO: create item "gravitation potion"
    				break;
    		}
    	}
    	if(chanceAltPotionB < 0.33)
    	{
    		stackSize = rand.nextInt(3) + 1;
    		switch(altPotionTypeB)
    		{
    			case 1:
    				// TODO: create item "thorns potion"
    				break;
    			case 2:
    				// TODO: create item "water walking potion"
    				break;
    			case 3:
    				// TODO: item invisibility potion?
    				break;
    			default:
    				// TODO: create item "hunters potion"
    				break;
    		}
    	}
    	if(chanceUtility < 0.5)
    	{
    		stackSize = rand.nextInt(15) + 15;
    		switch(utilityType)
    		{
    			case 1:
    				placeStackInEmptySpace(iInventory, new ItemStack(Blocks.torch, stackSize));
    				break;
    			default:
    				// TODO: create item "glowstick"
    				break;
    		}
    	}
    	if(chanceCoin < 0.5)
    	{
    		stackSize = rand.nextInt(1) + 1;
			placeStackInEmptySpace(iInventory, new ItemStack(ModItem.coinGold, stackSize));
    	}
    }

    public void fillWaterChest(IInventory iInventory)
    {
    	fillStandardChest(iInventory);
        int stackSize = 1;
        int rareItem = rand.nextInt(5);

        switch(rareItem)
        {
        	case 1:
        		// TODO: create item "trident"
        		break;
        	case 2:
        		// TODO: create item "breathing rod"
        		break;
        	case 3:
        		// TODO: create item "flipper"
        		break;
        	case 4:
        		// TODO: create item "water walking boots"
        		break;
        	default:
        		// TODO: create item "beach ball"
        		break;
        }
    }

    private void placeStackInEmptySpace(IInventory iInventory, ItemStack itemStack)
    {
    	int pos = rand.nextInt(iInventory.getSizeInventory());
    	if(iInventory.getStackInSlot(pos) == null)
    	{
    		iInventory.setInventorySlotContents(pos, itemStack);
    	}
    }
}
