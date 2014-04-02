package com.terracraft.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import java.util.Random;

import com.terracraft.ModCreativeTabs;

public class ModBlock extends Block
{
	//SoundTypes
	static Block.SoundType soundTypeMud;
	//Blocks
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
    private boolean canDrop = true;

    public ModBlock(String name, Material material)
    {
        super(material);
        GameRegistry.registerBlock(this, name);
        this.setBlockTextureName("terracraft:" + name);
        this.setBlockName(name);
        this.setStepSound(soundTypePiston);
        this.setModCreativeTabBlock();
    }

    public ModBlock(String name, Material material, float hardness, float resistance)
    {
        super(material);
        GameRegistry.registerBlock(this, name);
        this.setBlockName(name);
        this.setBlockTextureName("terracraft:" + name);
        this.setBlockName(name);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setStepSound(soundTypePiston);
        this.setModCreativeTabBlock();
    }

    public ModBlock(String name, Material material, float hardness, float resistance, SoundType soundtype)
    {
        super(material);
        GameRegistry.registerBlock(this, name);
        this.setBlockTextureName("terracraft:" + name);
        this.setBlockName(name);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setStepSound(soundtype);
        this.setModCreativeTabBlock();
    }

    public static void initBlockSounds()
    {
        soundTypeMud = new Block.SoundType("sand", 1.0F, 1.0F);
    }

    public static void initBlocks()
    {
        // TODO: MISSING GFX: Block spike
        // TODO: MISSING GFX: Block sunPlate;
        // TODO: MISSING GFX: Block brickRainbow;
        oreCopper = new ModBlockModOre("oreCopper");
        oreTin = new ModBlockModOre("oreTin");
        oreLead = new ModBlockModOre("oreLead");
        oreSilver = new ModBlockModOre("oreSilver");
        oreTungsten = new ModBlockModOre("oreTungsten");
        orePlatinum = new ModBlockModOre("orePlatinum");
        oreDemonite = new ModBlockModOre("oreDemonite");
        oreCrimtane = new ModBlockModOre("oreCrimtane");
        oreMeteorite = new ModBlockModOre("oreMeteorite");
        oreHellstone = new ModBlockModOre("oreHellstone");
        oreCobalt = new ModBlockModOre("oreCobalt");
        orePalladium = new ModBlockModOre("orePalladium");
        oreMythril = new ModBlockModOre("oreMythril");
        oreOrichalcum = new ModBlockModOre("oreOrichalcum");
        oreAdamantite = new ModBlockModOre("oreAdamantite");
        oreTitanium = new ModBlockModOre("oreTitanium");
        oreChlorophyte = new ModBlockModOre("oreChlorophyte");
        oreAmethyst = new ModBlockModOre("oreAmethyst");
        oreTopaz = new ModBlockModOre("oreTopaz");
        oreSapphire = new ModBlockModOre("oreSapphire");
        oreRuby = new ModBlockModOre("oreRuby");
        mud = new ModBlock("mud", Material.ground).setHardness(0.8F).setStepSound(soundTypeMud);
        silt = new ModBlockSilt("silt");
        slush = new ModBlockSilt("slush");
        iceBlue = new ModBlockModIce("iceBlue");
        icePink = new ModBlockModIce("icePink");
        iceRed = new ModBlockModIce("iceRed");
        icePurple = new ModBlockModIce("icePurple");
        redClay = new ModBlock("redClay", Material.clay, 0.6F, 0.0F, soundTypeGravel);
        grassJungle = new ModBlockGrassJungle("grassJungle");
        grassCorrupted = new ModBlockGrassCorrupted("grassCorrupted");
        ebonstone = new ModBlockEbonstone("ebonstone", Material.rock);
        ebonsand = new ModBlockEbonsand("ebonsand", Material.sand);
        grassCrimson = new ModBlockGrassCrimson("grassCrimson");
        crimstone = new ModBlockCrimstone("crimstone", Material.rock);
        crimsand = new ModBlockCrimsand("crimsand", Material.sand);
        grassHallowed = new ModBlockGrassHallowed("grassHallowed");
        pearlstone = new ModBlockPearlstone("pearlstone", Material.rock);
        pearlsand = new ModBlockPearlsand("pearlsand", Material.sand);
        grassMushroom = new ModBlockGrassMushroom("grassMushroom");
        logRichMahogany = new ModBlockModLog("logRichMahogany");
        logEbon = new ModBlockModLog("logEbon");
        logShade = new ModBlockModLog("logShade");
        logPearl = new ModBlockModLog("logPearl");
        livingWood = new ModBlock("livingWood", Material.wood);
        ash = new ModBlock("ash", Material.ground, 0.6F, 0.0F, soundTypeSand);
        hive = new ModBlock("hive", Material.rock).setHardness(1.5F); //ModBlockHive
        cloud = new ModBlock("cloud", Material.rock).setHardness(1.5F);
        raincloud = new ModBlock("raincloud", Material.rock).setHardness(1.5F); //ModBlockRaincloud
        honey = new ModBlockHoney("honey");
        crispyHoney = new ModBlock("crispyHoney", Material.rock).setHardness(1.5F);
        bubbleGum = new ModBlock("bubbleGum", Material.rock).setHardness(1.5F);
        spike = new ModBlock("spike", Material.iron, 2.0F, 0.0F, soundTypeMetal); //ModBlockSpike
        sunPlate = new ModBlock("sunPlate", Material.iron, 2.0F, 0.0F, soundTypeMetal);
        brickRed = new ModBlockBrick("brickRed");
        brickObsidian = new ModBlockBrick("brickObsidian");
        brickMudstone = new ModBlockBrick("brickMudstone");
        brickIridescent = new ModBlockBrick("brickIridescent");
        brickCopper = new ModBlockBrick("brickCopper");
        brickTin = new ModBlockBrick("brickTin");
        brickSilver = new ModBlockBrick("brickSilver");
        brickTungsten = new ModBlockBrick("brickTungsten");
        brickGold = new ModBlockBrick("brickGold");
        brickPlatinum = new ModBlockBrick("brickPlatinum");
        brickHellstone = new ModBlockBrick("brickHellstone"); //ModBlockBrickHellstone
        brickCobalt = new ModBlockBrick("brickCobalt");
        brickPalladium = new ModBlockBrick("brickPalladium");
        brickMythril = new ModBlockBrick("brickMythril");
        brickDemonite = new ModBlockBrick("brickDemonite"); //ModBlockBrickDemonite
        brickPearlstone = new ModBlockBrick("brickPearlstone"); //ModBlockBrickPearlstone
        brickBlue = new ModBlockBrick("brickBlue");
        brickGreen = new ModBlockBrick("brickGreen");
        brickPink = new ModBlockBrick("brickPink");
        brickSandstone = new ModBlockBrick("brickSandstone");
        brickSnow = new ModBlockBrick("brickSnow");
        brickIce = new ModBlockBrick("brickIce");
        brickLihzahrd = new ModBlockBrick("brickLihzahrd");
        brickRainbow = new ModBlockBrick("brickRainbow");
        brickEbonstone = new ModBlockBrick("brickEbonstone");
        plankPearl = new ModBlockPlank("plankPearl");
        plankEbon = new ModBlockPlank("plankEbon");
        plankShade = new ModBlockPlank("plankShade");
        plankRichMahogany = new ModBlockPlank("plankRichMahogany");
        candyCaneRed = new ModBlock("candyCaneRed", Material.rock).setHardness(2.0F).setResistance(5.0F);
        candyCaneGreen = new ModBlock("candyCaneGreen", Material.rock).setHardness(2.0F).setResistance(5.0F);
        slime = new ModBlock("slime", Material.rock).setHardness(1.0F).setResistance(5.0F);
        asphalt = new ModBlockAsphalt("asphalt");
    }

    public Block toParent()
    {
        return this;
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

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
    	if(canDrop)
    	{
            return Item.getItemFromBlock(this);
    	}
    	return null;
    }

    public ModBlock setModCreativeTabBlock()
    {
        this.setCreativeTab(ModCreativeTabs.tabBlocks);
        return this;
    }

    public ModBlock setModCreativeTabScenery()
    {
        this.setCreativeTab(ModCreativeTabs.tabScenery);
        return this;
    }
}

