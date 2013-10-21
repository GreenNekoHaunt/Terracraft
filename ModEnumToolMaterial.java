package Terracraft;

import net.minecraftforge.common.EnumHelper;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import Terracraft.ModItems.ModItem;

public class ModEnumToolMaterial
{
    public static EnumToolMaterial COPPER;
    public static EnumToolMaterial TIN;
    public static EnumToolMaterial MAHOGANY;
    public static EnumToolMaterial CACTUS;
    public static EnumToolMaterial SHADEWOOD;
    public static EnumToolMaterial EBONWOOD;
    public static EnumToolMaterial LEAD;
    public static EnumToolMaterial SILVER;
    public static EnumToolMaterial PEARLWOOD;
    public static EnumToolMaterial TUNGSTEN;
    public static EnumToolMaterial PLATINUM;
    public static EnumToolMaterial SHADOW;
    public static EnumToolMaterial CRIMSON;
    public static EnumToolMaterial MOLTEN;
    public static EnumToolMaterial COBALT;
    public static EnumToolMaterial PALLADIUM;
    public static EnumToolMaterial MYTHRIL;
    public static EnumToolMaterial ORICHALCUM;
    public static EnumToolMaterial ADAMANTITE;
    public static EnumToolMaterial TITANIUM;
    public static EnumToolMaterial HALLOWED;
    public static EnumToolMaterial CHLOROPHYTE;
    public static EnumToolMaterial SHROOMITE;

    public static void initModEnumToolMaterial()
    {
        COPPER = EnumHelper.addToolMaterial("COPPER", 2, 202, 5F, 0.5F, 10);
        MAHOGANY = EnumHelper.addToolMaterial("MAHOGANY", 2, 143, 5.5F, 0.5F, 11);
        TIN = EnumHelper.addToolMaterial("TIN", 2, 235, 5.5F, 0.5F, 12);
        CACTUS = EnumHelper.addToolMaterial("CACTUS", 2, 122, 5.5F, 1.5F, 13);
        EBONWOOD = EnumHelper.addToolMaterial("EBONWOOD", 2, 161, 6F, 2.0F, 14); 
        SHADEWOOD = EnumHelper.addToolMaterial("SHADEWOOD", 2, 187, 6F, 2.0F, 15);
        LEAD = EnumHelper.addToolMaterial("LEAD", 2, 312, 6F, 2.5F, 16);
        SILVER = EnumHelper.addToolMaterial("SILVER", 2, 532, 6.5F, 2.5F, 17);
        PEARLWOOD = EnumHelper.addToolMaterial("PEARLWOOD", 2, 419, 6.5F, 2.5F, 18);
        TUNGSTEN = EnumHelper.addToolMaterial("TUNGSTEN", 3, 843, 7F, 3.0F, 19);
        PLATINUM = EnumHelper.addToolMaterial("PLATINUM", 4, 1374, 8F, 5.0F, 20);
        SHADOW = EnumHelper.addToolMaterial("SHADOW", 5, 1892, 8.5F, 6.5F, 21);
        CRIMSON = EnumHelper.addToolMaterial("CRIMSON", 5, 2143, 9F, 11.5F, 22);
        MOLTEN = EnumHelper.addToolMaterial("MOLTEN", 6, 3532, 12F, 20.5F, 23);
        COBALT = EnumHelper.addToolMaterial("COBALT", 7, 2987, 13F, 19.5F, 24);
        PALLADIUM = EnumHelper.addToolMaterial("PALLADIUM", 7, 3098, 15F, 20.5F, 25);
        MYTHRIL = EnumHelper.addToolMaterial("MYTHRIL", 8, 3654, 17F, 22.5F, 26);
        ORICHALCUM = EnumHelper.addToolMaterial("ORICHALCUM", 8, 3936, 18.5F, 24F, 27);
        ADAMANTITE = EnumHelper.addToolMaterial("ADAMANTITE", 9, 4137, 20F, 26F, 28);
        TITANIUM = EnumHelper.addToolMaterial("TITANIUM", 9, 4663, 21F, 29F, 29);
        CHLOROPHYTE = EnumHelper.addToolMaterial("CHLOROPHYTE", 10, 2235, 22F, 29.0F, 30);
        HALLOWED = EnumHelper.addToolMaterial("HALLOWED", 10, 3777, 22F, 29.5F, 31);
        SHROOMITE = EnumHelper.addToolMaterial("SHROOMITE", 10, 4534, 23F, 30F, 32);
    }
}
