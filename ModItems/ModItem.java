package Terracraft.ModItems;

import net.minecraft.item.Item;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import Terracraft.ModCreativeTabs;
import Terracraft.ModEnumToolMaterial;
import Terracraft.ModBlocks.ModBlock;

public class ModItem extends Item
{
    public static int itemCount = 0;
    public static Item ingotCopper;
    public static Item ingotTin;
    public static Item ingotLead;
    public static Item ingotSilver;
    public static Item ingotTungsten;
    public static Item ingotPlatinum;
    public static Item ingotDemonite;
    public static Item ingotCrimtane;
    public static Item ingotMeteorite;
    public static Item ingotHellstone;
    public static Item ingotCobalt;
    public static Item ingotPalladium;
    public static Item ingotMythril;
    public static Item ingotOrichalcum;
    public static Item ingotAdamantite;
    public static Item ingotTitanium;
    public static Item ingotChlorophyte;
    public static Item ingotShroomite;
    public static Item ingotHallowed;
    public static Item ruby;
    public static Item sapphire;
    public static Item topaz;
    public static Item amethyst;
    public static Item soulFlight;
    public static Item soulLight;
    public static Item soulNight;
    public static Item soulMight;
    public static Item soulSight;
    public static Item soulFright;
    public static Item gel;
    public static Item blackLens;
    public static Item lens;
    public static Item coinCopper;
    public static Item coinSilver;
    public static Item coinGold;
    public static Item coinPlatin;
    public static Item fallenStar;
    public static Item crystalMana;
    public static Item potionGreaterHealing;
    public static Item potionHealing;
    public static Item potionLesserHealing;
    public static Item swordCopper;
    public static Item swordTin;
    public static Item swordMahogany;
    public static Item swordCactus;
    public static Item swordShadewood;
    public static Item swordEbonwood;
    public static Item swordLead;
    public static Item swordSilver;
    public static Item swordPearlwood;
    public static Item swordTungsten;
    public static Item swordIce;
    public static Item swordPlatinum;
    public static Item lightsBane;
    public static Item bloodButcher;
    public static Item beeKeeper;
    public static Item phasebladeRed;
    public static Item phasebladeWhite;
    public static Item phasebladePurple;
    public static Item phasebladeYellow;
    public static Item phasebladeBlue;
    public static Item phasebladeGreen;
    public static Item phasesaberRed;
    public static Item phasesaberWhite;
    public static Item phasesaberPurple;
    public static Item phasesaberYellow;
    public static Item phasesaberBlue;
    public static Item phasesaberGreen;
    public static Item fieryGreatsword;
    public static Item bladeOfGrass;
    public static Item muramasa;
    public static Item nightsEdge;
    public static Item breakerBlade;
    public static Item swordCobalt;
    public static Item swordMythril;
    public static Item swordAdamantite;
    public static Item swordPalladium;
    public static Item swordOrichalcum;
    public static Item swordTitanium;
    public static Item excalibur;
    public static Item frostBrand;
    public static Item cutlass;
    public static Item keyBrand;
    public static Item beamSword;
    public static Item trueNightsEdge;
    public static Item trueExcalibur;
    public static Item swordChlorophyte;
    public static Item terrablade;
    public static Item hammerWood;
    public static Item hammerMahogany;
    public static Item hammerCopper;
    public static Item hammerTin;
    public static Item hammerEbonwood;
    public static Item hammerShadewood;
    public static Item hammerLead;
    public static Item hammerIron;
    public static Item hammerPearlwood;
    public static Item hammerSilver;
    public static Item hammerTungsten;
    public static Item hammerGold;
    public static Item hammerPlatinum;
    public static Item theBreaker;
    public static Item fleshGrinder;
    public static Item pwnHammer;
    public static Item hammush;
    public static Item axeCopper;
    public static Item axeTin;
    public static Item axeLead;
    public static Item axeSilver;
    public static Item axeTungsten;
    public static Item axePlatinum;
    public static Item axeCobalt;
    public static Item axePalladium;
    public static Item axeShadow;
    public static Item axeCrimson;
    public static Item axeMythril;
    public static Item axeOrichalcum;
    public static Item axeAdamantite;
    public static Item axeTitanium;
    public static Item axeChlorophyte;
    public static Item pickaxeCopper;
    public static Item pickaxeTin;
    public static Item pickaxeLead;
    public static Item pickaxeSilver;
    public static Item pickaxeTungsten;
    public static Item pickaxePlatinum;
    public static Item pickaxeNightmare;
    public static Item pickaxeDeathbringer;
    public static Item pickaxeMolten;
    public static Item pickaxeCobalt;
    public static Item pickaxePalladium;
    public static Item pickaxeMythril;
    public static Item pickaxeOrichalcum;
    public static Item pickaxeAdamantite;
    public static Item pickaxeTitanium;
    public static Item pickaxeChlorophyte;
    public static Item pickaxeSpectre;

    public ModItem(String name)
    {
        super(ModBlock.baseId + ModBlock.blockCount + itemCount);
        GameRegistry.registerItem(this, name);
        this.setTextureName("terracraft/" + name);
        this.setUnlocalizedName(name);
        itemCount++;
    }

    public static void initItems(String modid)
    {
        // TODO: MISSING GFX: Item swordCactus
        // TODO: MISSING GFX: Item swordIce
        // TODO: MISSING GFX: Item lightsBane
        // TODO: MISSING GFX: Item bloodButcher
        // TODO: MISSING GFX: Item beeKeeper
        // TODO: MISSING GFX: Item fieryGreatsword
        // TODO: MISSING GFX: Item bladeOfGrass
        // TODO: MISSING GFX: Item muramasa
        // TODO: MISSING GFX: Item nightsEdge
        // TODO: MISSING GFX: Item breakerBlade
        // TODO: MISSING GFX: Item swordCobalt
        // TODO: MISSING GFX: Item swordMythril
        // TODO: MISSING GFX: Item swordAdamantite
        // TODO: MISSING GFX: Item swordPalladium
        // TODO: MISSING GFX: Item swordOrichalcum
        // TODO: MISSING GFX: Item swordTitanium
        // TODO: MISSING GFX: Item excalibur
        // TODO: MISSING GFX: Item frostBrand
        // TODO: MISSING GFX: Item cutlass
        // TODO: MISSING GFX: Item keyBrand
        // TODO: MISSING GFX: Item beamSword
        // TODO: MISSING GFX: Item trueNightsEdge
        // TODO: MISSING GFX: Item trueExcalibur
        // TODO: MISSING GFX: Item swordChlorophyte
        // TODO: MISSING GFX: Item terrablade
        // TODO: MISSING GFX: Item theBreaker;
        // TODO: MISSING GFX: Item fleshGrinder;
        // TODO: MISSING GFX: Item pwnHammer;
        // TODO: MISSING GFX: Item hammush;
        // TODO: MISSING GFX: Item axeCobalt;
        // TODO: MISSING GFX: Item axePalladium;
        // TODO: MISSING GFX: Item axeShadow;
        // TODO: MISSING GFX: Item axeCrimson;
        // TODO: MISSING GFX: Item axeMythril;
        // TODO: MISSING GFX: Item axeOrichalcum;
        // TODO: MISSING GFX: Item axeAdamantite;
        // TODO: MISSING GFX: Item axeTitanium;
        // TODO: MISSING GFX: Item axeChlorophyte;
        // TODO: MISSING GFX: Item pickaxeNightmare;
        // TODO: MISSING GFX: Item pickaxeDeathbringer;
        // TODO: MISSING GFX: Item pickaxeMolten;
        // TODO: MISSING GFX: Item pickaxeCobalt;
        // TODO: MISSING GFX: Item pickaxePalladium;
        // TODO: MISSING GFX: Item pickaxeMythril;
        // TODO: MISSING GFX: Item pickaxeOrichalcum;
        // TODO: MISSING GFX: Item pickaxeAdamantite;
        // TODO: MISSING GFX: Item pickaxeTitanium;
        // TODO: MISSING GFX: Item pickaxeChlorophyte;
        // TODO: MISSING GFX: Item pickaxeSpectre;
        ingotCopper = new ModItem("ingotCopper").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotTin = new ModItem("ingotTin").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotLead = new ModItem("ingotLead").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotSilver = new ModItem("ingotSilver").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotTungsten = new ModItem("ingotTungsten").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotPlatinum = new ModItem("ingotPlatinum").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotDemonite = new ModItem("ingotDemonite").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotCrimtane = new ModItem("ingotCrimtane").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotMeteorite = new ModItem("ingotMeteorite").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotHellstone = new ModItem("ingotHellstone").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotCobalt = new ModItem("ingotCobalt").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotPalladium = new ModItem("ingotPalladium").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotMythril = new ModItem("ingotMythril").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotOrichalcum = new ModItem("ingotOrichalcum").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotAdamantite = new ModItem("ingotAdamantite").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotTitanium = new ModItem("ingotTitanium").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotChlorophyte = new ModItem("ingotChlorophyte").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotShroomite = new ModItem("ingotShroomite").setModCreativeTabMaterial().setMaxStackSize(64);
        ingotHallowed = new ModItem("ingotHallowed").setModCreativeTabMaterial().setMaxStackSize(64);
        ruby = new ModItem("ruby").setModCreativeTabMaterial().setMaxStackSize(64);
        sapphire = new ModItem("sapphire").setModCreativeTabMaterial().setMaxStackSize(64);
        topaz = new ModItem("topaz").setModCreativeTabMaterial().setMaxStackSize(64);
        amethyst = new ModItem("amethyst").setModCreativeTabMaterial().setMaxStackSize(64);
        soulFlight = new ModItem("soulFlight").setModCreativeTabMaterial().setMaxStackSize(64);
        soulLight = new ModItem("soulLight").setModCreativeTabMaterial().setMaxStackSize(64);
        soulNight = new ModItem("soulNight").setModCreativeTabMaterial().setMaxStackSize(64);
        soulMight = new ModItem("soulMight").setModCreativeTabMaterial().setMaxStackSize(64);
        soulSight = new ModItem("soulSight").setModCreativeTabMaterial().setMaxStackSize(64);
        soulFright = new ModItem("soulFright").setModCreativeTabMaterial().setMaxStackSize(64);
        gel = new ModItem("gel").setModCreativeTabMaterial().setMaxStackSize(64);
        blackLens = new ModItem("blackLens").setModCreativeTabMaterial().setMaxStackSize(64);
        lens = new ModItem("lens").setModCreativeTabMaterial().setMaxStackSize(64);
        coinCopper = new ModItemCoin("coinCopper").setModCreativeTabMaterial().setMaxStackSize(100);
        coinSilver = new ModItemCoin("coinSilver").setModCreativeTabMaterial().setMaxStackSize(100);
        coinGold = new ModItemCoin("coinGold").setModCreativeTabMaterial().setMaxStackSize(100);
        coinPlatin = new ModItemCoin("coinPlatin").setModCreativeTabMaterial().setMaxStackSize(100);
        fallenStar = new ModItemFallenStar("fallenStar").setModCreativeTabMaterial().setMaxStackSize(64);
        crystalMana = new ModItemCrystalMana("crystalMana").setModCreativeTabMaterial().setMaxStackSize(64);
        potionGreaterHealing = new ModItemPotionHealing("potionGreaterHealing", 2).setModCreativeTabPotion().setMaxStackSize(30);
        potionHealing = new ModItemPotionHealing("potionHealing", 1).setModCreativeTabPotion().setMaxStackSize(30);
        potionLesserHealing = new ModItemPotionHealing("potionLesserHealing", 0).setModCreativeTabPotion().setMaxStackSize(30);
        swordCopper = new ModItemBroadsword("swordCopper", ModEnumToolMaterial.COPPER).setModCreativeTabWeapon();
        swordTin = new ModItemBroadsword("swordTin", ModEnumToolMaterial.TIN).setModCreativeTabWeapon();
        swordMahogany = new ModItemBroadsword("swordMahogany", ModEnumToolMaterial.MAHOGANY).setModCreativeTabWeapon();
        swordCactus = new ModItemBroadsword("swordCactus", ModEnumToolMaterial.CACTUS).setModCreativeTabWeapon();
        swordShadewood = new ModItemBroadsword("swordShadewood", ModEnumToolMaterial.SHADEWOOD).setModCreativeTabWeapon();
        swordEbonwood = new ModItemBroadsword("swordEbonwood", ModEnumToolMaterial.EBONWOOD).setModCreativeTabWeapon();
        swordLead = new ModItemBroadsword("swordLead", ModEnumToolMaterial.LEAD).setModCreativeTabWeapon();
        swordSilver = new ModItemBroadsword("swordSilver", ModEnumToolMaterial.SILVER).setModCreativeTabWeapon();
        swordPearlwood = new ModItemBroadsword("swordPearlwood", ModEnumToolMaterial.PEARLWOOD).setModCreativeTabWeapon();
        swordTungsten = new ModItemBroadsword("swordTungsten", ModEnumToolMaterial.TUNGSTEN).setModCreativeTabWeapon();
        swordPlatinum = new ModItemBroadsword("swordPlatinum", ModEnumToolMaterial.PLATINUM).setModCreativeTabWeapon();
        lightsBane = new ModItemBroadsword("lightsBane", ModEnumToolMaterial.SHADOW).setModCreativeTabWeapon();
        bloodButcher = new ModItemBroadsword("bloodButcher", ModEnumToolMaterial.CRIMSON).setModCreativeTabWeapon();
        beeKeeper = new ModItemBeeKeeper("beeKeeper").setModCreativeTabWeapon();
        phasebladeRed = new ModItemPhaseblade("phasebladeRed").setModCreativeTabWeapon();
        phasebladeWhite = new ModItemPhaseblade("phasebladeWhite").setModCreativeTabWeapon();
        phasebladePurple = new ModItemPhaseblade("phasebladePurple").setModCreativeTabWeapon();
        phasebladeYellow = new ModItemPhaseblade("phasebladeYellow").setModCreativeTabWeapon();
        phasebladeBlue = new ModItemPhaseblade("phasebladeBlue").setModCreativeTabWeapon();
        phasebladeGreen = new ModItemPhaseblade("phasebladeGreen").setModCreativeTabWeapon();
        phasesaberRed = new ModItemPhasesaber("phasesaberRed").setModCreativeTabWeapon();
        phasesaberWhite = new ModItemPhasesaber("phasesaberWhite").setModCreativeTabWeapon();
        phasesaberPurple = new ModItemPhasesaber("phasesaberPurple").setModCreativeTabWeapon();
        phasesaberYellow = new ModItemPhasesaber("phasesaberYellow").setModCreativeTabWeapon();
        phasesaberBlue = new ModItemPhasesaber("phasesaberBlue").setModCreativeTabWeapon();
        phasesaberGreen = new ModItemPhasesaber("phasesaberGreen").setModCreativeTabWeapon();
        fieryGreatsword = new ModItemBroadsword("fieryGreatswird", ModEnumToolMaterial.MOLTEN).setModCreativeTabWeapon();
        bladeOfGrass = new ModItemBladeOfGrass("bladeOfGrass").setModCreativeTabWeapon();
        muramasa = new ModItemMuramasa("muramasa").setModCreativeTabWeapon();
        nightsEdge = new ModItemNightsEdge("nightsEdge").setModCreativeTabWeapon();
        breakerBlade = new ModItemBreakerBlade("breakerBlade").setModCreativeTabWeapon();
        swordCobalt = new ModItemBroadsword("swordCobalt", ModEnumToolMaterial.COBALT).setModCreativeTabWeapon();
        swordMythril = new ModItemBroadsword("swordMythril", ModEnumToolMaterial.MYTHRIL).setModCreativeTabWeapon();
        swordAdamantite = new ModItemBroadsword("swordAdamantite", ModEnumToolMaterial.ADAMANTITE).setModCreativeTabWeapon();
        swordPalladium = new ModItemBroadsword("swordPalladium", ModEnumToolMaterial.PALLADIUM).setModCreativeTabWeapon();
        swordOrichalcum = new ModItemBroadsword("swordOrichalcum", ModEnumToolMaterial.ORICHALCUM).setModCreativeTabWeapon();
        swordTitanium = new ModItemBroadsword("swordTitanium", ModEnumToolMaterial.TITANIUM).setModCreativeTabWeapon();
        excalibur = new ModItemBroadsword("excalibur", ModEnumToolMaterial.HALLOWED).setModCreativeTabWeapon();
        frostBrand = new ModItemFrostBrand("frostBrand").setModCreativeTabWeapon();
        cutlass = new ModItemCutlass("cutlass").setModCreativeTabWeapon();
        keyBrand = new ModItemKeyBrand("keyBrand").setModCreativeTabWeapon();
        beamSword = new ModItemBeamSword("beamSword").setModCreativeTabWeapon();
        trueNightsEdge = new ModItemTrueNightsEdge("trueNightsEdge").setModCreativeTabWeapon();
        trueExcalibur = new ModItemTrueExcalibur("trueExcalibur").setModCreativeTabWeapon();
        swordChlorophyte = new ModItemBroadsword("swordChlorophyte", ModEnumToolMaterial.CHLOROPHYTE).setModCreativeTabWeapon();
        terrablade = new ModItemTerrablade("terrablade").setModCreativeTabWeapon();
        hammerWood = new ModItemHammer("hammerWood", EnumToolMaterial.WOOD).setModCreativeTabTool();
        hammerMahogany = new ModItemHammer("hammerMahogany", ModEnumToolMaterial.MAHOGANY).setModCreativeTabTool();
        hammerCopper = new ModItemHammer("hammerCopper", ModEnumToolMaterial.COPPER).setModCreativeTabTool();
        hammerTin = new ModItemHammer("hammerTin", ModEnumToolMaterial.TIN).setModCreativeTabTool();
        hammerEbonwood = new ModItemHammer("hammerEbonwood", ModEnumToolMaterial.EBONWOOD).setModCreativeTabTool();
        hammerShadewood = new ModItemHammer("hammerShadewood", ModEnumToolMaterial.SHADEWOOD).setModCreativeTabTool();
        hammerLead = new ModItemHammer("hammerLead", ModEnumToolMaterial.LEAD).setModCreativeTabTool();
        hammerIron = new ModItemHammer("hammerIron", EnumToolMaterial.IRON).setModCreativeTabTool();
        hammerPearlwood = new ModItemHammer("hammerPearlwood", ModEnumToolMaterial.PEARLWOOD).setModCreativeTabTool();
        hammerSilver = new ModItemHammer("hammerSilver", ModEnumToolMaterial.SILVER).setModCreativeTabTool();
        hammerTungsten = new ModItemHammer("hammerTungsten", ModEnumToolMaterial.TUNGSTEN).setModCreativeTabTool();
        hammerGold = new ModItemHammer("hammerGold", EnumToolMaterial.GOLD).setModCreativeTabTool();
        hammerPlatinum = new ModItemHammer("hammerPlatinum", ModEnumToolMaterial.PLATINUM).setModCreativeTabTool();
        theBreaker = new ModItemHammer("theBreaker", ModEnumToolMaterial.SHADOW).setModCreativeTabTool();
        fleshGrinder = new ModItemHammer("fleshGrinder", ModEnumToolMaterial.CRIMSON).setModCreativeTabTool();
        pwnHammer = new ModItemHammer("pwnHammer", ModEnumToolMaterial.HALLOWED).setModCreativeTabTool();
        hammush = new ModItemHammer("hammush", ModEnumToolMaterial.SHROOMITE).setModCreativeTabTool();
        axeCopper = new ModItemModAxe("axeCopper", ModEnumToolMaterial.COPPER).setModCreativeTabTool();
        axeTin = new ModItemModAxe("axeTin", ModEnumToolMaterial.TIN).setModCreativeTabTool();
        axeLead = new ModItemModAxe("axeLead", ModEnumToolMaterial.LEAD).setModCreativeTabTool();
        axeSilver = new ModItemModAxe("axeSilver", ModEnumToolMaterial.SILVER).setModCreativeTabTool();
        axeTungsten = new ModItemModAxe("axeTungsten", ModEnumToolMaterial.TUNGSTEN).setModCreativeTabTool();
        axePlatinum = new ModItemModAxe("axePlatinum", ModEnumToolMaterial.PLATINUM).setModCreativeTabTool();
        axeCobalt = new ModItemModAxe("axeCobalt", ModEnumToolMaterial.COBALT).setModCreativeTabTool();
        axePalladium = new ModItemModAxe("axePalladium", ModEnumToolMaterial.PALLADIUM).setModCreativeTabTool();
        axeShadow = new ModItemModAxe("axeShadow", ModEnumToolMaterial.SHADOW).setModCreativeTabTool();
        axeCrimson = new ModItemModAxe("axeCrimson", ModEnumToolMaterial.CRIMSON).setModCreativeTabTool();
        axeMythril = new ModItemModAxe("axeMythril", ModEnumToolMaterial.MYTHRIL).setModCreativeTabTool();
        axeOrichalcum = new ModItemModAxe("axeOrichalcum", ModEnumToolMaterial.ORICHALCUM).setModCreativeTabTool();
        axeAdamantite = new ModItemModAxe("axeAdamantite", ModEnumToolMaterial.ADAMANTITE).setModCreativeTabTool();
        axeTitanium = new ModItemModAxe("axeTitanium", ModEnumToolMaterial.TITANIUM).setModCreativeTabTool();
        axeChlorophyte = new ModItemModAxe("axeChlorophyte", ModEnumToolMaterial.CHLOROPHYTE).setModCreativeTabTool();
        pickaxeCopper = new ModItemModPickaxe("pickaxeCopper", ModEnumToolMaterial.COPPER).setModCreativeTabTool();
        pickaxeTin = new ModItemModPickaxe("pickaxeTin", ModEnumToolMaterial.TIN).setModCreativeTabTool();
        pickaxeLead = new ModItemModPickaxe("pickaxeLead", ModEnumToolMaterial.LEAD).setModCreativeTabTool();
        pickaxeSilver = new ModItemModPickaxe("pickaxeSilver", ModEnumToolMaterial.SILVER).setModCreativeTabTool();
        pickaxeTungsten = new ModItemModPickaxe("pickaxeTungsten", ModEnumToolMaterial.TUNGSTEN).setModCreativeTabTool();
        pickaxePlatinum = new ModItemModPickaxe("pickaxePlatinum", ModEnumToolMaterial.PLATINUM).setModCreativeTabTool();
        pickaxeNightmare = new ModItemModPickaxe("pickaxeNightmare", ModEnumToolMaterial.SHADOW).setModCreativeTabTool();
        pickaxeDeathbringer = new ModItemModPickaxe("pickaxeDeathbringer", ModEnumToolMaterial.CRIMSON).setModCreativeTabTool();
        pickaxeMolten = new ModItemModPickaxe("pickaxeMolten", ModEnumToolMaterial.MOLTEN).setModCreativeTabTool();
        pickaxeCobalt = new ModItemModPickaxe("pickaxeCobalt", ModEnumToolMaterial.COBALT).setModCreativeTabTool();
        pickaxePalladium = new ModItemModPickaxe("pickaxePalladium", ModEnumToolMaterial.PALLADIUM).setModCreativeTabTool();
        pickaxeMythril = new ModItemModPickaxe("pickaxeMythril", ModEnumToolMaterial.MYTHRIL).setModCreativeTabTool();
        pickaxeOrichalcum = new ModItemModPickaxe("pickaxeOrichalcum", ModEnumToolMaterial.ORICHALCUM).setModCreativeTabTool();
        pickaxeAdamantite = new ModItemModPickaxe("pickaxeAdamantite", ModEnumToolMaterial.ADAMANTITE).setModCreativeTabTool();
        pickaxeTitanium = new ModItemModPickaxe("pickaxeTitanium", ModEnumToolMaterial.TITANIUM).setModCreativeTabTool();
        pickaxeChlorophyte = new ModItemModPickaxe("pickaxeChlorophyte", ModEnumToolMaterial.CHLOROPHYTE).setModCreativeTabTool();
        addNames();
    }
    
    private static void addNames()
    {
        LanguageRegistry.addName(ingotCopper, "Copper Ingot");
        LanguageRegistry.addName(ingotTin, "Tin Ingot");
        LanguageRegistry.addName(ingotLead, "Lead Ingot");
        LanguageRegistry.addName(ingotSilver, "Silver Ingot");
        LanguageRegistry.addName(ingotTungsten, "Tungsten Ingot");
        LanguageRegistry.addName(ingotPlatinum, "Platinum Ingot");
        LanguageRegistry.addName(ingotDemonite, "Demonite Ingot");
        LanguageRegistry.addName(ingotCrimtane, "Crimtane Ingot");
        LanguageRegistry.addName(ingotMeteorite, "Meteorite Ingot");
        LanguageRegistry.addName(ingotHellstone, "Hellstone Ingot");
        LanguageRegistry.addName(ingotCobalt, "Cobalt Ingot");
        LanguageRegistry.addName(ingotPalladium, "Palladium Ingot");
        LanguageRegistry.addName(ingotMythril, "Mythril Ingot");
        LanguageRegistry.addName(ingotOrichalcum, "Orichalcum Ingot");
        LanguageRegistry.addName(ingotAdamantite, "Adamantite Ingot");
        LanguageRegistry.addName(ingotTitanium, "Titanium Ingot");
        LanguageRegistry.addName(ingotChlorophyte, "Chlorophyte Ingot");
        LanguageRegistry.addName(ingotShroomite, "Shroomite Ingot");
        LanguageRegistry.addName(ingotHallowed, "Hallowed Ingot");
        LanguageRegistry.addName(ruby, "Ruby");
        LanguageRegistry.addName(sapphire, "Sapphire");
        LanguageRegistry.addName(topaz, "Topaz");
        LanguageRegistry.addName(amethyst, "Amethyst");
        LanguageRegistry.addName(soulFlight, "Soul of Flight");
        LanguageRegistry.addName(soulLight, "Soul of Light");
        LanguageRegistry.addName(soulNight, "Soul of Night");
        LanguageRegistry.addName(soulMight, "Soul of Might");
        LanguageRegistry.addName(soulSight, "Soul of Sight");
        LanguageRegistry.addName(soulFright, "Soul of Fright");
        LanguageRegistry.addName(gel, "Gel");
        LanguageRegistry.addName(blackLens, "Black Lens");
        LanguageRegistry.addName(lens, "Lens");
        LanguageRegistry.addName(coinCopper, "Copper Coin");
        LanguageRegistry.addName(coinSilver, "Silver Coin");
        LanguageRegistry.addName(coinGold, "Gold Coin");
        LanguageRegistry.addName(coinPlatin, "Platin Coin");
        LanguageRegistry.addName(fallenStar, "Fallen Star");
        LanguageRegistry.addName(crystalMana, "Mana Crystal");
        LanguageRegistry.addName(potionGreaterHealing, "Greater Healing Potion");
        LanguageRegistry.addName(potionHealing, "Healing Potion");
        LanguageRegistry.addName(potionLesserHealing, "Lesser Healing Potion");
        LanguageRegistry.addName(swordCopper, "Copper Sword");
        LanguageRegistry.addName(swordTin, "Tin Sword");
        LanguageRegistry.addName(swordMahogany, "Mahogany Sword");
        LanguageRegistry.addName(swordCactus, "Cactus Sword");
        LanguageRegistry.addName(swordShadewood, "Shadewood Sword");
        LanguageRegistry.addName(swordEbonwood, "Ebonwood Sword");
        LanguageRegistry.addName(swordLead, "Lead Sword");
        LanguageRegistry.addName(swordSilver, "Silver Sword");
        LanguageRegistry.addName(swordPearlwood, "Pearlwood Sword");
        LanguageRegistry.addName(swordTungsten, "Tungsten Sword");
        LanguageRegistry.addName(swordPlatinum, "Platinum Sword");
        LanguageRegistry.addName(lightsBane, "Light\'s Bane");
        LanguageRegistry.addName(bloodButcher, "Blood Butcher");
        LanguageRegistry.addName(beeKeeper, "Bee Keeper");
        LanguageRegistry.addName(phasebladeRed, "Phaseblade");
        LanguageRegistry.addName(phasebladeWhite, "Phaseblade");
        LanguageRegistry.addName(phasebladePurple, "Phaseblade");
        LanguageRegistry.addName(phasebladeYellow, "Phaseblade");
        LanguageRegistry.addName(phasebladeBlue, "Phaseblade");
        LanguageRegistry.addName(phasebladeGreen, "Phaseblade");
        LanguageRegistry.addName(phasesaberRed, "Phasesaber");
        LanguageRegistry.addName(phasesaberWhite, "Phasesaber");
        LanguageRegistry.addName(phasesaberPurple, "Phasesaber");
        LanguageRegistry.addName(phasesaberYellow, "Phasesaber");
        LanguageRegistry.addName(phasesaberBlue, "Phasesaber");
        LanguageRegistry.addName(phasesaberGreen, "Phasesaber");
        LanguageRegistry.addName(fieryGreatsword, "Fiery Greatsword");
        LanguageRegistry.addName(bladeOfGrass, "Blade of Grass");
        LanguageRegistry.addName(muramasa, "Muramasa");
        LanguageRegistry.addName(nightsEdge, "Night\'s Edge");
        LanguageRegistry.addName(breakerBlade, "Breaker Blade");
        LanguageRegistry.addName(swordCobalt, "Cobalt Sword");
        LanguageRegistry.addName(swordMythril, "Mythril Sword");
        LanguageRegistry.addName(swordAdamantite, "Adamantite Sword");
        LanguageRegistry.addName(swordPalladium, "Palladium Sword");
        LanguageRegistry.addName(swordOrichalcum, "Orichalcum Sword");
        LanguageRegistry.addName(swordTitanium, "Titanium Sword");
        LanguageRegistry.addName(excalibur, "Excalibur");
        LanguageRegistry.addName(frostBrand, "Frostbrand");
        LanguageRegistry.addName(cutlass, "Cutlass");
        LanguageRegistry.addName(keyBrand, "Keybrand");
        LanguageRegistry.addName(beamSword, "Beam Sword");
        LanguageRegistry.addName(trueNightsEdge, "True Night\'s Edge");
        LanguageRegistry.addName(trueExcalibur, "True Excalibur");
        LanguageRegistry.addName(swordChlorophyte, "Chlorophyte Claymore");
        LanguageRegistry.addName(terrablade, "Terrablade");
        LanguageRegistry.addName(hammerWood, "Wooden Hammer");
        LanguageRegistry.addName(hammerMahogany, "Mahoganywood Hammer");
        LanguageRegistry.addName(hammerCopper, "Copper Hammer");
        LanguageRegistry.addName(hammerTin, "Tin Hammer");
        LanguageRegistry.addName(hammerEbonwood, "Ebonwood Hammer");
        LanguageRegistry.addName(hammerShadewood, "Shadewood Hammer");
        LanguageRegistry.addName(hammerLead, "Lead Hammer");
        LanguageRegistry.addName(hammerIron, "Iron Hammer");
        LanguageRegistry.addName(hammerPearlwood, "Pearlwood Hammer");
        LanguageRegistry.addName(hammerSilver, "Silver Hammer");
        LanguageRegistry.addName(hammerTungsten, "Tungsten Hammer");
        LanguageRegistry.addName(hammerGold, "Gold Hammer");
        LanguageRegistry.addName(hammerPlatinum, "Platinum Hammer");
        LanguageRegistry.addName(theBreaker, "The Breaker");
        LanguageRegistry.addName(fleshGrinder, "Flesh Grinder");
        LanguageRegistry.addName(pwnHammer, "Pwnhammer");
        LanguageRegistry.addName(hammush, "Hammush");
        LanguageRegistry.addName(axeCopper, "Copper Axe");
        LanguageRegistry.addName(axeTin, "Tin Axe");
        LanguageRegistry.addName(axeLead, "Lead Axe");
        LanguageRegistry.addName(axeSilver, "Silver Axe");
        LanguageRegistry.addName(axeTungsten, "Tungsten Axe");
        LanguageRegistry.addName(axePlatinum, "Platinum Axe");
        LanguageRegistry.addName(axeCobalt, "Cobalt Waraxe");
        LanguageRegistry.addName(axePalladium, "Palladium Waraxe");
        LanguageRegistry.addName(axeShadow, "War Axe of the Night");
        LanguageRegistry.addName(axeCrimson, "Blood Lust Cluster");
        LanguageRegistry.addName(axeMythril, "Mythril Waraxe");
        LanguageRegistry.addName(axeOrichalcum, "Orichalcum Waraxe");
        LanguageRegistry.addName(axeAdamantite, "Adamantite Waraxe");
        LanguageRegistry.addName(axeTitanium, "Titanium Waraxe");
        LanguageRegistry.addName(axeChlorophyte, "Chlorophyte Greataxe");
        LanguageRegistry.addName(pickaxeCopper, "Copper Pickaxe");
        LanguageRegistry.addName(pickaxeTin, "Tin Pickaxe");
        LanguageRegistry.addName(pickaxeLead, "Lead Pickaxe");
        LanguageRegistry.addName(pickaxeSilver, "Silver Pickaxe");
        LanguageRegistry.addName(pickaxeTungsten, "Tungsten Pickaxe");
        LanguageRegistry.addName(pickaxePlatinum, "Platinum Pickaxe");
        LanguageRegistry.addName(pickaxeNightmare, "Nightmare Pickaxe");
        LanguageRegistry.addName(pickaxeDeathbringer, "Deathbringer Pickaxe");
        LanguageRegistry.addName(pickaxeMolten, "Molten Pickaxe");
        LanguageRegistry.addName(pickaxeCobalt, "Cobalt Pickaxe");
        LanguageRegistry.addName(pickaxePalladium, "Palladium Pickaxe");
        LanguageRegistry.addName(pickaxeMythril, "Mythril Pickaxe");
        LanguageRegistry.addName(pickaxeOrichalcum, "Orichalcum Pickaxe");
        LanguageRegistry.addName(pickaxeAdamantite, "Adamantite Pickaxe");
        LanguageRegistry.addName(pickaxeTitanium, "Titanium Pickaxe");
        LanguageRegistry.addName(pickaxeChlorophyte, "Chlorophyte Pickaxe");
    }

    public Item setModCreativeTabMaterial()
    {
        this.setCreativeTab(ModCreativeTabs.tabMaterial);
        return this;
    }

    public Item setModCreativeTabTool()
    {
        this.setCreativeTab(ModCreativeTabs.tabTools);
        return this;
    }

    public Item setModCreativeTabWeapon()
    {
        this.setCreativeTab(ModCreativeTabs.tabWeapons);
        return this;
    }

    public Item setModCreativeTabArmor()
    {
        this.setCreativeTab(ModCreativeTabs.tabArmor);
        return this;
    }

    public Item setModCreativeTabAccessory()
    {
        this.setCreativeTab(ModCreativeTabs.tabAccessories);
        return this;
    }

    public Item setModCreativeTabPotion()
    {
        this.setCreativeTab(ModCreativeTabs.tabPotions);
        return this;
    }
}
