package src.terracraft.items;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import src.terracraft.ModCreativeTabs;
import src.terracraft.blocks.ModBlock;

public class ModItem extends Item
{
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
    public static Item keyGold;
    public static Item keyShadow;
    public static Item rope;
    public static Item magicMirror;
    public static Item potionGreaterHealing;
    public static Item potionHealing;
    public static Item potionLesserHealing;
    public static Item potionGreaterMana;
    public static Item potionMana;
    public static Item potionLesserMana;
    public static Item potionGreaterRestoration;
    public static Item potionRestoration;
    public static Item potionLesserRestoration;
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
        super();
        GameRegistry.registerItem(this, name);
        this.setTextureName("terracraft:" + name);
        this.setUnlocalizedName(name);
        this.setMaxStackSize(64);
    }

    public static void initItems()
    {
    	// TODO: MISSING GFX: Item rope
    	// TODO: MISSING GFX: Item magicMirror
        // TODO: MISSING GFX: Item swordCactus
        // TODO: MISSING GFX: Item bloodButcher
        // TODO: MISSING GFX: Item bladeOfGrass
        // TODO: MISSING GFX: Item breakerBlade
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
        // TODO: MISSING GFX: Item pickaxeChlorophyte;
        // TODO: MISSING GFX: Item pickaxeSpectre;
    	// TODO: MISSING GFX: Item keyGold;
    	// TODO: MISSING GFX: Item keyShadow;
        ingotCopper = new ModItem("ingotCopper").setModCreativeTabMaterial();
        ingotTin = new ModItem("ingotTin").setModCreativeTabMaterial();
        ingotLead = new ModItem("ingotLead").setModCreativeTabMaterial();
        ingotSilver = new ModItem("ingotSilver").setModCreativeTabMaterial();
        ingotTungsten = new ModItem("ingotTungsten").setModCreativeTabMaterial();
        ingotPlatinum = new ModItem("ingotPlatinum").setModCreativeTabMaterial();
        ingotDemonite = new ModItem("ingotDemonite").setModCreativeTabMaterial();
        ingotCrimtane = new ModItem("ingotCrimtane").setModCreativeTabMaterial();
        ingotMeteorite = new ModItem("ingotMeteorite").setModCreativeTabMaterial();
        ingotHellstone = new ModItem("ingotHellstone").setModCreativeTabMaterial();
        ingotCobalt = new ModItem("ingotCobalt").setModCreativeTabMaterial();
        ingotPalladium = new ModItem("ingotPalladium").setModCreativeTabMaterial();
        ingotMythril = new ModItem("ingotMythril").setModCreativeTabMaterial();
        ingotOrichalcum = new ModItem("ingotOrichalcum").setModCreativeTabMaterial();
        ingotAdamantite = new ModItem("ingotAdamantite").setModCreativeTabMaterial();
        ingotTitanium = new ModItem("ingotTitanium").setModCreativeTabMaterial();
        ingotChlorophyte = new ModItem("ingotChlorophyte").setModCreativeTabMaterial();
        ingotShroomite = new ModItem("ingotShroomite").setModCreativeTabMaterial();
        ingotHallowed = new ModItem("ingotHallowed").setModCreativeTabMaterial();
        ruby = new ModItem("ruby").setModCreativeTabMaterial();
        sapphire = new ModItem("sapphire").setModCreativeTabMaterial();
        topaz = new ModItem("topaz").setModCreativeTabMaterial();
        amethyst = new ModItem("amethyst").setModCreativeTabMaterial();
        soulFlight = new ModItem("soulFlight").setModCreativeTabMaterial();
        soulLight = new ModItem("soulLight").setModCreativeTabMaterial();
        soulNight = new ModItem("soulNight").setModCreativeTabMaterial();
        soulMight = new ModItem("soulMight").setModCreativeTabMaterial();
        soulSight = new ModItem("soulSight").setModCreativeTabMaterial();
        soulFright = new ModItem("soulFright").setModCreativeTabMaterial();
        gel = new ModItem("gel").setModCreativeTabMaterial();
        blackLens = new ModItem("blackLens").setModCreativeTabMaterial();
        lens = new ModItem("lens").setModCreativeTabMaterial();
        coinCopper = new ModItemCoin("coinCopper").setModCreativeTabMaterial();
        coinSilver = new ModItemCoin("coinSilver").setModCreativeTabMaterial();
        coinGold = new ModItemCoin("coinGold").setModCreativeTabMaterial();
        coinPlatin = new ModItemCoin("coinPlatin").setModCreativeTabMaterial();
        fallenStar = new ModItemFallenStar("fallenStar").setModCreativeTabConsumable();
        crystalMana = new ModItemCrystalMana("crystalMana").setModCreativeTabConsumable();
        keyGold = new ModItemKey("keyGold").setModCreativeTabConsumable();
        keyShadow = new ModItemKey("keyShadow").setModCreativeTabConsumable();
        rope = new ModItemRope("rope").setModCreativeTabConsumable();
        magicMirror = new ModItemMagicMirror("magicMirror").setModCreativeTabTool();
        potionGreaterHealing = new ModItemPotionHealing("potionGreaterHealing", 2).setModCreativeTabConsumable();
        potionHealing = new ModItemPotionHealing("potionHealing", 1).setModCreativeTabConsumable();
        potionLesserHealing = new ModItemPotionHealing("potionLesserHealing", 0).setModCreativeTabConsumable();
        potionGreaterMana = new ModItemPotionMana("potionGreaterMana", 2).setModCreativeTabConsumable();
        potionMana = new ModItemPotionMana("potionMana", 1).setModCreativeTabConsumable();
        potionLesserMana = new ModItemPotionMana("potionLesserMana", 0).setModCreativeTabConsumable();
        potionGreaterRestoration = new ModItemPotionRestoration("potionGreaterRestoration", 2).setModCreativeTabConsumable();
        potionRestoration = new ModItemPotionRestoration("potionRestoration", 1).setModCreativeTabConsumable();
        potionLesserRestoration = new ModItemPotionRestoration("potionLesserRestoration", 0).setModCreativeTabConsumable();
        swordCopper = new ModItemBroadsword("swordCopper", ModToolMaterial.COPPER).setModCreativeTabWeapon();
        swordTin = new ModItemBroadsword("swordTin", ModToolMaterial.TIN).setModCreativeTabWeapon();
        swordMahogany = new ModItemBroadsword("swordMahogany", ModToolMaterial.MAHOGANY).setModCreativeTabWeapon();
        swordCactus = new ModItemBroadsword("swordCactus", ModToolMaterial.CACTUS).setModCreativeTabWeapon();
        swordShadewood = new ModItemBroadsword("swordShadewood", ModToolMaterial.SHADEWOOD).setModCreativeTabWeapon();
        swordEbonwood = new ModItemBroadsword("swordEbonwood", ModToolMaterial.EBONWOOD).setModCreativeTabWeapon();
        swordLead = new ModItemBroadsword("swordLead", ModToolMaterial.LEAD).setModCreativeTabWeapon();
        swordSilver = new ModItemBroadsword("swordSilver", ModToolMaterial.SILVER).setModCreativeTabWeapon();
        swordPearlwood = new ModItemBroadsword("swordPearlwood", ModToolMaterial.PEARLWOOD).setModCreativeTabWeapon();
        swordTungsten = new ModItemBroadsword("swordTungsten", ModToolMaterial.TUNGSTEN);
        swordPlatinum = new ModItemBroadsword("swordPlatinum", ModToolMaterial.PLATINUM);
        lightsBane = new ModItemBroadsword("lightsBane", ModToolMaterial.SHADOW);
        bloodButcher = new ModItemBroadsword("bloodButcher", ModToolMaterial.CRIMSON);
        beeKeeper = new ModItemBeeKeeper("beeKeeper");
        phasebladeRed = new ModItemPhaseblade("phasebladeRed");
        phasebladeWhite = new ModItemPhaseblade("phasebladeWhite");
        phasebladePurple = new ModItemPhaseblade("phasebladePurple");
        phasebladeYellow = new ModItemPhaseblade("phasebladeYellow");
        phasebladeBlue = new ModItemPhaseblade("phasebladeBlue");
        phasebladeGreen = new ModItemPhaseblade("phasebladeGreen");
        phasesaberRed = new ModItemPhasesaber("phasesaberRed");
        phasesaberWhite = new ModItemPhasesaber("phasesaberWhite");
        phasesaberPurple = new ModItemPhasesaber("phasesaberPurple");
        phasesaberYellow = new ModItemPhasesaber("phasesaberYellow");
        phasesaberBlue = new ModItemPhasesaber("phasesaberBlue");
        phasesaberGreen = new ModItemPhasesaber("phasesaberGreen");
        fieryGreatsword = new ModItemBroadsword("fieryGreatsword", ModToolMaterial.MOLTEN);
        bladeOfGrass = new ModItemBladeOfGrass("bladeOfGrass");
        muramasa = new ModItemSword("muramasa", 4012, 7.5F);
        nightsEdge = new ModItemSword("nightsEdge", 4829, 24.5F);
        breakerBlade = new ModItemSword("breakerBlade", 2493, 22.5F);
        swordCobalt = new ModItemBroadsword("swordCobalt", ModToolMaterial.COBALT);
        swordMythril = new ModItemBroadsword("swordMythril", ModToolMaterial.MYTHRIL);
        swordAdamantite = new ModItemBroadsword("swordAdamantite", ModToolMaterial.ADAMANTITE);
        swordPalladium = new ModItemBroadsword("swordPalladium", ModToolMaterial.PALLADIUM);
        swordOrichalcum = new ModItemBroadsword("swordOrichalcum", ModToolMaterial.ORICHALCUM);
        swordTitanium = new ModItemBroadsword("swordTitanium", ModToolMaterial.TITANIUM);
        excalibur = new ModItemBroadsword("excalibur", ModToolMaterial.HALLOWED);
        frostBrand = new ModItemBeamSword("frostBrand", 4203, 31F, 1);
        cutlass = new ModItemSword("cutlass", 4558, 32F);
        keyBrand = new ModItemSword("keyBrand", 4199, 34F);
        beamSword = new ModItemBeamSword("beamSword", 4784, 35F, 0);
        trueNightsEdge = new ModItemBeamSword("trueNightsEdge", 6293, 37.5F, 2);
        trueExcalibur = new ModItemBeamSword("trueExcalibur", 5392, 34F, 2);
        swordChlorophyte = new ModItemBroadsword("swordChlorophyte", ModToolMaterial.CHLOROPHYTE);
        terrablade = new ModItemBeamSword("terrablade", 8685,  44F, 3).setModCreativeTabWeapon();
        hammerWood = new ModItemHammer("hammerWood", ModToolMaterial.WOOD);
        hammerMahogany = new ModItemHammer("hammerMahogany", ModToolMaterial.MAHOGANY);
        hammerCopper = new ModItemHammer("hammerCopper", ModToolMaterial.COPPER);
        hammerTin = new ModItemHammer("hammerTin", ModToolMaterial.TIN);
        hammerEbonwood = new ModItemHammer("hammerEbonwood", ModToolMaterial.EBONWOOD);
        hammerShadewood = new ModItemHammer("hammerShadewood", ModToolMaterial.SHADEWOOD);
        hammerLead = new ModItemHammer("hammerLead", ModToolMaterial.LEAD);
        hammerIron = new ModItemHammer("hammerIron", ModToolMaterial.IRON);
        hammerPearlwood = new ModItemHammer("hammerPearlwood", ModToolMaterial.PEARLWOOD);
        hammerSilver = new ModItemHammer("hammerSilver", ModToolMaterial.SILVER);
        hammerTungsten = new ModItemHammer("hammerTungsten", ModToolMaterial.TUNGSTEN);
        hammerGold = new ModItemHammer("hammerGold", ModToolMaterial.GOLD);
        hammerPlatinum = new ModItemHammer("hammerPlatinum", ModToolMaterial.PLATINUM);
        theBreaker = new ModItemHammer("theBreaker", ModToolMaterial.SHADOW);
        fleshGrinder = new ModItemHammer("fleshGrinder", ModToolMaterial.CRIMSON);
        pwnHammer = new ModItemHammer("pwnHammer", ModToolMaterial.HALLOWED);
        hammush = new ModItemHammer("hammush", ModToolMaterial.SHROOMITE);
        axeCopper = new ModItemModAxe("axeCopper", ModToolMaterial.COPPER);
        axeTin = new ModItemModAxe("axeTin", ModToolMaterial.TIN);
        axeLead = new ModItemModAxe("axeLead", ModToolMaterial.LEAD);
        axeSilver = new ModItemModAxe("axeSilver", ModToolMaterial.SILVER);
        axeTungsten = new ModItemModAxe("axeTungsten", ModToolMaterial.TUNGSTEN);
        axePlatinum = new ModItemModAxe("axePlatinum", ModToolMaterial.PLATINUM);
        axeCobalt = new ModItemModAxe("axeCobalt", ModToolMaterial.COBALT);
        axePalladium = new ModItemModAxe("axePalladium", ModToolMaterial.PALLADIUM);
        axeShadow = new ModItemModAxe("axeShadow", ModToolMaterial.SHADOW);
        axeCrimson = new ModItemModAxe("axeCrimson", ModToolMaterial.CRIMSON);
        axeMythril = new ModItemModAxe("axeMythril", ModToolMaterial.MYTHRIL);
        axeOrichalcum = new ModItemModAxe("axeOrichalcum", ModToolMaterial.ORICHALCUM);
        axeAdamantite = new ModItemModAxe("axeAdamantite", ModToolMaterial.ADAMANTITE);
        axeTitanium = new ModItemModAxe("axeTitanium", ModToolMaterial.TITANIUM);
        axeChlorophyte = new ModItemModAxe("axeChlorophyte", ModToolMaterial.CHLOROPHYTE);
        pickaxeCopper = new ModItemModPickaxe("pickaxeCopper", ModToolMaterial.COPPER);
        pickaxeTin = new ModItemModPickaxe("pickaxeTin", ModToolMaterial.TIN);
        pickaxeLead = new ModItemModPickaxe("pickaxeLead", ModToolMaterial.LEAD);
        pickaxeSilver = new ModItemModPickaxe("pickaxeSilver", ModToolMaterial.SILVER);
        pickaxeTungsten = new ModItemModPickaxe("pickaxeTungsten", ModToolMaterial.TUNGSTEN);
        pickaxePlatinum = new ModItemModPickaxe("pickaxePlatinum", ModToolMaterial.PLATINUM);
        pickaxeNightmare = new ModItemModPickaxe("pickaxeNightmare", ModToolMaterial.SHADOW);
        pickaxeDeathbringer = new ModItemModPickaxe("pickaxeDeathbringer", ModToolMaterial.CRIMSON);
        pickaxeMolten = new ModItemModPickaxe("pickaxeMolten", ModToolMaterial.MOLTEN);
        pickaxeCobalt = new ModItemModPickaxe("pickaxeCobalt", ModToolMaterial.COBALT);
        pickaxePalladium = new ModItemModPickaxe("pickaxePalladium", ModToolMaterial.PALLADIUM);
        pickaxeMythril = new ModItemModPickaxe("pickaxeMythril", ModToolMaterial.MYTHRIL);
        pickaxeOrichalcum = new ModItemModPickaxe("pickaxeOrichalcum", ModToolMaterial.ORICHALCUM);
        pickaxeAdamantite = new ModItemModPickaxe("pickaxeAdamantite", ModToolMaterial.ADAMANTITE);
        pickaxeTitanium = new ModItemModPickaxe("pickaxeTitanium", ModToolMaterial.TITANIUM);
        pickaxeChlorophyte = new ModItemModPickaxe("pickaxeChlorophyte", ModToolMaterial.CHLOROPHYTE);
    }

	public static enum ModToolMaterial
    {
		//Vanilla
        WOOD(0, 59, 2.0F, 0.0F, 15),
        STONE(1, 131, 4.0F, 1.0F, 5),
        IRON(2, 250, 6.0F, 2.0F, 14),
        EMERALD(3, 1561, 8.0F, 3.0F, 10),
        GOLD(0, 32, 12.0F, 0.0F, 22),

        //Modded
        COPPER(2, 202, 5F, 0.5F, 10),
        MAHOGANY(2, 143, 5.5F, 0.5F, 11),
        TIN(2, 235, 5.5F, 0.5F, 12),
        CACTUS(2, 122, 5.5F, 1.5F, 13),
        EBONWOOD(2, 161, 6F, 2.0F, 14),
        SHADEWOOD(2, 187, 6F, 2.0F, 15),
        LEAD(2, 312, 6F, 2.5F, 16),
        SILVER(2, 532, 6.5F, 2.5F, 17),
        PEARLWOOD(2, 419, 6.5F, 2.5F, 18),
        TUNGSTEN(3, 843, 7F, 3.0F, 19),
        PLATINUM(4, 1374, 8F, 5.0F, 20),
        SHADOW(5, 1892, 8.5F, 6.5F, 21),
        CRIMSON(5, 2143, 9F, 11.5F, 22),
        MOLTEN(6, 3532, 12F, 20.5F, 23),
        COBALT(7, 2987, 13F, 19.5F, 24),
        PALLADIUM(7, 3098, 15F, 20.5F, 25),
        MYTHRIL(8, 3654, 17F, 22.5F, 26),
        ORICHALCUM(8, 3936, 18.5F, 24F, 27),
        ADAMANTITE(9, 4137, 20F, 26F, 28),
        TITANIUM(9, 4663, 21F, 29F, 29),
        CHLOROPHYTE(10, 2235, 22F, 29.0F, 30),
        HALLOWED(10, 3777, 22F, 29.5F, 31),
        SHROOMITE(10, 4534, 23F, 30F, 32);

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiencyOnProperMaterial;
        private final float damageVsEntity;
        private final int enchantability;

        private static final String __OBFID = "CL_00000042";

        //Added by forge for custom Tool materials.
        public Item customCraftingMaterial = null;

        private ModToolMaterial(int par3, int par4, float par5, float par6, int par7)
        {
            this.harvestLevel = par3;
            this.maxUses = par4;
            this.efficiencyOnProperMaterial = par5;
            this.damageVsEntity = par6;
            this.enchantability = par7;
        }

        public int getMaxUses()
        {
            return this.maxUses;
        }

        public float getEfficiencyOnProperMaterial()
        {
            return this.efficiencyOnProperMaterial;
        }

        public float getDamageVsEntity()
        {
            return this.damageVsEntity;
        }

        public int getHarvestLevel()
        {
            return this.harvestLevel;
        }

        public int getEnchantability()
        {
            return this.enchantability;
        }

        public Item func_150995_f()
        {
            switch (this)
            {
                case WOOD:        return Item.getItemFromBlock(Blocks.planks);
            	case STONE:       return Item.getItemFromBlock(Blocks.cobblestone);
                case GOLD:        return Items.gold_ingot;
            	case IRON:        return Items.iron_ingot;
            	case EMERALD:     return Items.diamond;
                case COPPER:      return ModItem.ingotCopper;
                case MAHOGANY:    return Item.getItemFromBlock(ModBlock.plankRichMahogany);
                case TIN:         return ModItem.ingotTin;
                case CACTUS:      return Item.getItemFromBlock(Blocks.cactus);
                case EBONWOOD:    return Item.getItemFromBlock(ModBlock.plankEbon);
                case SHADEWOOD:   return Item.getItemFromBlock(ModBlock.plankShade);
                case LEAD:        return ModItem.ingotLead;
                case SILVER:      return ModItem.ingotSilver;
                case PEARLWOOD:   return Item.getItemFromBlock(ModBlock.plankPearl);
                case TUNGSTEN:    return ModItem.ingotTungsten;
                case PLATINUM:    return ModItem.ingotPlatinum;
                case SHADOW:      return ModItem.ingotDemonite;
                case CRIMSON:     return ModItem.ingotCrimtane;
                case MOLTEN:      return ModItem.ingotHellstone;
                case COBALT:      return ModItem.ingotCobalt;
                case PALLADIUM:   return ModItem.ingotPalladium;
                case MYTHRIL:     return ModItem.ingotMythril;
                case ORICHALCUM:  return ModItem.ingotOrichalcum;
                case ADAMANTITE:  return ModItem.ingotAdamantite;
                case TITANIUM:    return ModItem.ingotTitanium;
                case CHLOROPHYTE: return ModItem.ingotChlorophyte;
                case HALLOWED:    return ModItem.ingotHallowed;
                case SHROOMITE:   return ModItem.ingotShroomite;
                default:      return customCraftingMaterial;
            }
        }
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

    public Item setModCreativeTabConsumable()
    {
        this.setCreativeTab(ModCreativeTabs.tabConsumable);
        return this;
    }
}

