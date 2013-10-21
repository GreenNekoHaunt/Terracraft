package Terracraft.ModBlocks;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import java.util.Random;

import Terracraft.ModCreativeTabs;

public class ModBlock extends Block
{
    public static int baseId = 176;
    public static int blockCount = 0;
    public static Block oreCopper;
    public static Block oreTin;
    public static Block oreLead;
    public static Block oreSilver;
    public static Block oreTungsten;
    public static Block orePlatinum;
    public static Block oreDemonite;
    public static Block oreCrimtane;
    public static Block oreMeteorite;
    public static Block oreHellstone;
    public static Block oreCobalt;
    public static Block orePalladium;
    public static Block oreMythril;
    public static Block oreOrichalcum;
    public static Block oreAdamantite;
    public static Block oreTitanium;
    public static Block oreChlorophyte;
    public static Block oreAmethyst;
    public static Block oreTopaz;
    public static Block oreSapphire;
    public static Block oreRuby;
    public static Block mud;
    public static Block silt;
    public static Block redClay;
    public static Block grassJungle;
    public static Block grassCorrupted;
    public static Block ebonstone;
    public static Block ebonsand;
    public static Block grassCrimson;
    public static Block crimstone;
    public static Block crimsand;
    public static Block grassHallowed;
    public static Block pearlstone;
    public static Block pearlsand;
    public static Block grassMushroom;
    public static Block logRichMahogany;
    public static Block plankRichMahogany;
    public static Block logEbon;
    public static Block plankEbon;
    public static Block logShade;
    public static Block plankShade;
    public static Block logPearl;
    public static Block plankPearl;
    public static Block livingWood;
    public static Block iceBlue;
    public static Block icePink;
    public static Block iceRed;
    public static Block icePurple;
    public static Block candyCaneRed;
    public static Block candyCaneGreen;
    public static Block ash;
    public static Block slime;
    public static Block asphalt;
    public static Block hive;
    public static Block honey;
    public static Block crispyHoney;
    public static Block bubbleGum;
    public static Block spike;
    public static Block sunPlate;
    public static Block brickRed;
    public static Block brickObsidian;
    public static Block brickMudstone;
    public static Block brickIridescent;
    public static Block brickCopper;
    public static Block brickTin;
    public static Block brickSilver;
    public static Block brickTungsten;
    public static Block brickGold;
    public static Block brickPlatinum;
    public static Block brickHellstone;
    public static Block brickCobalt;
    public static Block brickPalladium;
    public static Block brickMythril;
    public static Block brickDemonite;
    public static Block brickPearlstone;
    public static Block brickBlue;
    public static Block brickGreen;
    public static Block brickPink;
    public static Block brickSandstone;
    public static Block brickSnow;
    public static Block brickIce;
    public static Block brickLihzahrd;
    public static Block brickRainbow;
    public static Block brickEbonstone;
    public static Block cloud;
    public static Block raincloud;
    public static Block slush;
    public boolean canDrop = true;

    public ModBlock(int idShift, String name, Material material)
    {
        super(baseId + blockCount + idShift, material);
        GameRegistry.registerBlock(this, "TC" + name);
        this.setTextureName("terracraft/" + name);
        this.setUnlocalizedName(name);
        blockCount++;
    }

    public ModBlock(String name, Material material)
    {
        super(baseId + blockCount, material);
        GameRegistry.registerBlock(this, "TC" + name);
        this.setTextureName("terracraft/" + name);
        this.setUnlocalizedName(name);
        blockCount++;
    }

    public static void initBlocks(String modid)
    {
        // TODO: MISSING GFX: Block spike
        // TODO: MISSING GFX: Block sunPlate;
        // TODO: MISSING GFX: Block brickLihzahrd;
        // TODO: MISSING GFX: Block brickRainbow;
        // TODO: MISSING GFX: Block cloud;
        // TODO: MISSING GFX: Block raincloud;
        //************************************************************************************************************//
        //   THESE BLOCKS NEED ID'S BELOW 256 BUT ABOVE MIENCRAFTS LAST IMPLEMENTED BLOCK DUE TO GENERATION TROUBLE   //
        //************************************************************************************************************//
        oreCopper = new ModBlockModOre("oreCopper").setModCreativeTabBlock();
        oreTin = new ModBlockModOre("oreTin").setModCreativeTabBlock();
        oreLead = new ModBlockModOre("oreLead").setModCreativeTabBlock();
        oreSilver = new ModBlockModOre("oreSilver").setModCreativeTabBlock();
        oreTungsten = new ModBlockModOre("oreTungsten").setModCreativeTabBlock();
        orePlatinum = new ModBlockModOre("orePlatinum").setModCreativeTabBlock();
        oreDemonite = new ModBlockModOre("oreDemonite").setModCreativeTabBlock().setLightValue(0.625F);
        oreCrimtane = new ModBlockModOre("oreCrimtane").setModCreativeTabBlock().setLightValue(0.625F);
        oreMeteorite = new ModBlockModOre("oreMeteorite").setModCreativeTabBlock().setLightValue(0.8F);
        oreHellstone = new ModBlockModOre("oreHellstone").setModCreativeTabBlock().setLightValue(0.8F);
        oreCobalt = new ModBlockModOre("oreCobalt").setModCreativeTabBlock();
        orePalladium = new ModBlockModOre("orePalladium").setModCreativeTabBlock();
        oreMythril = new ModBlockModOre("oreMythril").setModCreativeTabBlock();
        oreOrichalcum = new ModBlockModOre("oreOrichalcum").setModCreativeTabBlock();
        oreAdamantite = new ModBlockModOre("oreAdamantite").setModCreativeTabBlock();
        oreTitanium = new ModBlockModOre("oreTitanium").setModCreativeTabBlock();
        oreChlorophyte = new ModBlockModOre("oreChlorophyte").setModCreativeTabBlock();
        oreAmethyst = new ModBlockModOre("oreAmethyst").setModCreativeTabBlock();
        oreTopaz = new ModBlockModOre("oreTopaz").setModCreativeTabBlock();
        oreSapphire = new ModBlockModOre("oreSapphire").setModCreativeTabBlock();
        oreRuby = new ModBlockModOre("oreRuby").setModCreativeTabBlock();
        mud = new ModBlock("mud", Material.ground).setModCreativeTabBlock().setStepSound(soundSandFootstep);
        silt = new ModBlockSilt("silt").setModCreativeTabBlock().setStepSound(soundGravelFootstep);
        slush = new ModBlockSilt("slush").setModCreativeTabBlock().setStepSound(soundGravelFootstep);
        iceBlue = new ModBlock("iceBlue", Material.ice).setSlippery().setModCreativeTabBlock().setStepSound(soundGlassFootstep);
        icePink = new ModBlock("icePink", Material.ice).setSlippery().setModCreativeTabBlock().setStepSound(soundGlassFootstep);
        iceRed = new ModBlock("iceRed", Material.ice).setSlippery().setModCreativeTabBlock().setStepSound(soundGlassFootstep);
        icePurple = new ModBlock("icePurple", Material.ice).setSlippery().setModCreativeTabBlock().setStepSound(soundGlassFootstep);
        redClay = new ModBlock("redClay", Material.clay).setModCreativeTabBlock().setStepSound(soundGravelFootstep);
        grassJungle = new ModBlockGrassJungle("grassJungle").setModCreativeTabBlock().setStepSound(soundGrassFootstep);
        grassCorrupted = new ModBlockGrassCorrupted("grassCorrupted").setModCreativeTabBlock().setStepSound(soundGrassFootstep);
        ebonstone = new ModBlock("ebonstone", Material.rock).setModCreativeTabBlock(); //ModBlockEbonstone
        ebonsand = new ModBlock("ebonsand", Material.sand).setModCreativeTabBlock(); //ModBlockEbonsand
        grassCrimson = new ModBlockGrassCrimson("grassCrimson").setModCreativeTabBlock().setStepSound(soundGrassFootstep);
        crimstone = new ModBlock("crimstone", Material.rock).setModCreativeTabBlock(); //ModBlockCrimstone
        crimsand = new ModBlock("crimsand", Material.ground).setModCreativeTabBlock(); //ModBlockCrimsand
        grassHallowed = new ModBlockGrassHallowed("grassHallowed").setModCreativeTabBlock().setStepSound(soundGrassFootstep);
        pearlstone = new ModBlock("pearlstone", Material.rock).setModCreativeTabBlock(); //ModBlockPearlstone
        pearlsand = new ModBlock("pearlsand", Material.ground).setModCreativeTabBlock(); //ModBlockPearlsand
        grassMushroom = new ModBlockGrassMushroom("grassMushroom").setModCreativeTabBlock().setStepSound(soundGrassFootstep).setLightValue(0.5F);
        logRichMahogany = new ModBlockModLog("logRichMahogany").setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        logEbon = new ModBlockModLog("logEbon").setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        logShade = new ModBlockModLog("logShade").setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        logPearl = new ModBlockModLog("logPearl").setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        livingWood = new ModBlock("livingWood", Material.wood).disableDrop().setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        ash = new ModBlock("ash", Material.ground).setModCreativeTabBlock().setStepSound(soundSandFootstep);
        hive = new ModBlock("hive", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep); //ModBlockHive
        cloud = new ModBlock("cloud", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        raincloud = new ModBlock("raincloud", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep); //ModBlockRaincloud

        //************************************************************************************************************//
        //   THE FOLLOWING BLOCKS USE ID'S ABOVE 3000 AS THEY ARE NOT USED IN WORLD GENERATION OR ANYTHING SIMILAR    //
        //************************************************************************************************************//
        honey = new ModBlock(3000, "honey", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep); //ModBlockHoney
        crispyHoney = new ModBlock(3000, "crispyHoney", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        bubbleGum = new ModBlock(3000, "bubbleGum", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        spike = new ModBlock(3000, "spike", Material.iron).setModCreativeTabBlock().setStepSound(soundMetalFootstep); //ModBlockSpike
        sunPlate = new ModBlock(3000, "sunPlate", Material.iron).setModCreativeTabBlock().setStepSound(soundMetalFootstep);
        brickRed = new ModBlock(3000, "brickRed", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickObsidian = new ModBlock(3000, "brickObsidian", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickMudstone = new ModBlock(3000, "brickMudstone", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickIridescent = new ModBlock(3000, "brickIridescent", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickCopper = new ModBlock(3000, "brickCopper", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickTin = new ModBlock(3000, "brickTin", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickSilver = new ModBlock(3000, "brickSilver", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickTungsten = new ModBlock(3000, "brickTungsten", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickGold = new ModBlock(3000, "brickGold", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickPlatinum = new ModBlock(3000, "brickPlatinum", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickHellstone = new ModBlock(3000, "brickHellstone", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep); //ModBlockBrickHellstone
        brickCobalt = new ModBlock(3000, "brickCobalt", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickPalladium = new ModBlock(3000, "brickPalladium", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickMythril = new ModBlock(3000, "brickMythril", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickDemonite = new ModBlock(3000, "brickDemonite", Material.rock).setModCreativeTabBlock().setLightValue(0.625F).setStepSound(soundStoneFootstep);
        brickPearlstone = new ModBlock(3000, "brickPearlstone", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickBlue = new ModBlock(3000, "brickBlue", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickGreen = new ModBlock(3000, "brickGreen", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickPink = new ModBlock(3000, "brickPink", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickSandstone = new ModBlock(3000, "brickSandstone", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickSnow = new ModBlock(3000, "brickSnow", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickIce = new ModBlock(3000, "brickIce", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickLihzahrd = new ModBlock(3000, "brickLihzahrd", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickRainbow = new ModBlock(3000, "brickRainbow", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        brickEbonstone = new ModBlock(3000, "brickEbonstone", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        plankPearl = new ModBlock(3000, "plankPearl", Material.wood).setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        plankEbon = new ModBlock(3000, "plankEbon", Material.wood).setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        plankShade = new ModBlock(3000, "plankShade", Material.wood).setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        plankRichMahogany = new ModBlock(3000, "plankRichMahogany", Material.wood).setModCreativeTabBlock().setStepSound(soundWoodFootstep);
        candyCaneRed = new ModBlock(3000, "candyCaneRed", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        candyCaneGreen = new ModBlock(3000, "candyCaneGreen", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        slime = new ModBlock(3000, "slime", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep);
        asphalt = new ModBlock(3000, "asphalt", Material.rock).setModCreativeTabBlock().setStepSound(soundStoneFootstep); //ModBlockAsphalt
        addNames();
    }

    public static void initHarvestLevel()
    {
        MinecraftForge.setBlockHarvestLevel(oreCopper, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreTin, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreLead, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreSilver, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreTungsten, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(orePlatinum, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreDemonite, "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(oreCrimtane, "pickaxe", 4);
        MinecraftForge.setBlockHarvestLevel(oreMeteorite, "pickaxe", 3);
        MinecraftForge.setBlockHarvestLevel(oreHellstone, "pickaxe", 5);
        MinecraftForge.setBlockHarvestLevel(oreCobalt, "pickaxe", 6);
        MinecraftForge.setBlockHarvestLevel(orePalladium, "pickaxe", 6);
        MinecraftForge.setBlockHarvestLevel(oreMythril, "pickaxe", 7);
        MinecraftForge.setBlockHarvestLevel(oreOrichalcum, "pickaxe", 7);
        MinecraftForge.setBlockHarvestLevel(oreAdamantite, "pickaxe", 8);
        MinecraftForge.setBlockHarvestLevel(oreTitanium, "pickaxe", 8);
        MinecraftForge.setBlockHarvestLevel(oreChlorophyte, "pickaxe", 9);
        MinecraftForge.setBlockHarvestLevel(oreAmethyst, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreSapphire, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreRuby, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(oreTopaz, "pickaxe", 1);
        MinecraftForge.setBlockHarvestLevel(logRichMahogany, "axe", 2);
        MinecraftForge.setBlockHarvestLevel(logEbon, "axe", 2);
        MinecraftForge.setBlockHarvestLevel(logShade, "axe", 2);
        MinecraftForge.setBlockHarvestLevel(logPearl, "axe", 2);
    }
    
    private static void addNames()
    {
        LanguageRegistry.addName(oreCopper, "Copper Ore");
        LanguageRegistry.addName(oreTin, "Tin Ore");
        LanguageRegistry.addName(oreLead, "Lead Ore");
        LanguageRegistry.addName(oreSilver, "Silver Ore");
        LanguageRegistry.addName(oreTungsten, "Tungsten Ore");
        LanguageRegistry.addName(orePlatinum, "Platinum Ore");
        LanguageRegistry.addName(oreDemonite, "Demonite Ore");
        LanguageRegistry.addName(oreCrimtane, "Crimtane Ore");
        LanguageRegistry.addName(oreMeteorite, "Meteorite Ore");
        LanguageRegistry.addName(oreHellstone, "Hellstone");
        LanguageRegistry.addName(oreCobalt, "Cobalt Ore");
        LanguageRegistry.addName(orePalladium, "Palladium Ore");
        LanguageRegistry.addName(oreMythril, "Mythril Ore");
        LanguageRegistry.addName(oreOrichalcum, "Orichalcum Ore");
        LanguageRegistry.addName(oreAdamantite, "Adamantite Ore");
        LanguageRegistry.addName(oreTitanium, "Titanium Ore");
        LanguageRegistry.addName(oreChlorophyte, "Chlorophyte Ore");
        LanguageRegistry.addName(oreAmethyst, "Amethyst Ore");
        LanguageRegistry.addName(oreTopaz, "Topaz Ore");
        LanguageRegistry.addName(oreSapphire, "Sapphire Ore");
        LanguageRegistry.addName(oreRuby, "Ruby Ore");
        LanguageRegistry.addName(mud, "Mud");
        LanguageRegistry.addName(silt, "Silt");
        LanguageRegistry.addName(redClay, "Red Clay");
        LanguageRegistry.addName(grassJungle, "Jungle Grass");
        LanguageRegistry.addName(grassCorrupted, "Corrupted Grass");
        LanguageRegistry.addName(ebonstone, "Ebonstone");
        LanguageRegistry.addName(ebonsand, "Ebonsand");
        LanguageRegistry.addName(grassCrimson, "Crimson Grass");
        LanguageRegistry.addName(crimstone, "Crimstone");
        LanguageRegistry.addName(crimsand, "Crimsand");        
        LanguageRegistry.addName(grassHallowed, "Hallowed Grass");
        LanguageRegistry.addName(pearlstone, "Pearlstone");
        LanguageRegistry.addName(pearlsand, "Pearlsand");
        LanguageRegistry.addName(grassMushroom, "Mushroom Grass");
        LanguageRegistry.addName(logRichMahogany, "Rich Mahogany Log");
        LanguageRegistry.addName(plankRichMahogany, "Rich Mahogany Plank");      
        LanguageRegistry.addName(logEbon, "Ebonwood Log");
        LanguageRegistry.addName(plankEbon, "Ebonwood Plank");
        LanguageRegistry.addName(logShade, "Shadewood Log");
        LanguageRegistry.addName(plankShade, "Shadewood Plank");
        LanguageRegistry.addName(logPearl, "Pearl Log");
        LanguageRegistry.addName(plankPearl, "Pearl Plank");
        LanguageRegistry.addName(livingWood, "Living Wood");
        LanguageRegistry.addName(iceBlue, "Blue Ice");
        LanguageRegistry.addName(icePink, "Pink Ice");
        LanguageRegistry.addName(iceRed, "Red Ice");
        LanguageRegistry.addName(icePurple, "Purple Ice");
        LanguageRegistry.addName(candyCaneRed, "Red Candy Cane");
        LanguageRegistry.addName(candyCaneGreen, "Green Candy Cane");
        LanguageRegistry.addName(ash, "Ash");
        LanguageRegistry.addName(slime, "Slime");
        LanguageRegistry.addName(asphalt, "Asphalt");
        LanguageRegistry.addName(hive, "Hive");
        LanguageRegistry.addName(honey, "Honey Block");
        LanguageRegistry.addName(crispyHoney, "Crispy Honey Block");
        LanguageRegistry.addName(bubbleGum, "Bubble Gum Block");
        LanguageRegistry.addName(spike, "Spike");
        LanguageRegistry.addName(sunPlate, "Sunplate");
        LanguageRegistry.addName(brickRed, "Red Brick");
        LanguageRegistry.addName(brickObsidian, "Obsidian Brick");
        LanguageRegistry.addName(brickMudstone, "Mudstone Brick");
        LanguageRegistry.addName(brickIridescent, "Iridescent Brick");
        LanguageRegistry.addName(brickCopper, "Copper Brick");
        LanguageRegistry.addName(brickTin, "Tin Brick");
        LanguageRegistry.addName(brickSilver, "Silver Brick");
        LanguageRegistry.addName(brickTungsten, "Tungsten Brick");
        LanguageRegistry.addName(brickGold, "Gold Brick");
        LanguageRegistry.addName(brickPlatinum, "Platinum Brick");
        LanguageRegistry.addName(brickHellstone, "Hellstone Brick");
        LanguageRegistry.addName(brickCobalt, "Cobalt Brick");
        LanguageRegistry.addName(brickPalladium, "Palladium Brick");
        LanguageRegistry.addName(brickMythril, "Mythril Brick");
        LanguageRegistry.addName(brickDemonite, "Demonite Brick");
        LanguageRegistry.addName(brickPearlstone, "Pearlstone Brick");
        LanguageRegistry.addName(brickBlue, "Blue Brick");
        LanguageRegistry.addName(brickGreen, "Green Brick");
        LanguageRegistry.addName(brickPink, "Pink Brick");
        LanguageRegistry.addName(brickSandstone, "Sandstone Brick");
        LanguageRegistry.addName(brickSnow, "Red Brick");
        LanguageRegistry.addName(brickIce, "Ice Brick");
        LanguageRegistry.addName(brickLihzahrd, "Lihzahrd Brick");
        LanguageRegistry.addName(brickRainbow, "Rainbow Brick");
        LanguageRegistry.addName(brickEbonstone, "Ebonstone Brick");
        LanguageRegistry.addName(brickRed, "Red Brick");
        LanguageRegistry.addName(cloud, "Cloud Block");
        LanguageRegistry.addName(raincloud, "Raincloud Block");
        LanguageRegistry.addName(slush, "Slush");
    }

    public ModBlock disableDrop()
    {
        this.canDrop = false;
        return this;
    }

    public ModBlock setSlippery()
    {
        this.slipperiness = 1.0F;
        return this;
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        if(canDrop)
        {
            return this.blockID;
        }
        return 0;
        
    }

    public Block setModCreativeTabBlock()
    {
        this.setCreativeTab(ModCreativeTabs.tabBlocks);
        return this;
    }

    public Block setModCreativeTabScenery()
    {
        this.setCreativeTab(ModCreativeTabs.tabScenery);
        return this;
    }
}

