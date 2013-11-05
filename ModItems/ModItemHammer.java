package Terracraft.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;


public class ModItemHammer extends ModItem
{
    public static final Block[] blocksEffectiveAgainst = new Block[] {};
    private final EnumToolMaterial toolMaterial;

    public ModItemHammer(String name, EnumToolMaterial par2EnumToolMaterial)
    {
        super(name);
        this.toolMaterial = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(par2EnumToolMaterial.getMaxUses());
    }

    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4,
                               int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack))
        {
            int blockId = par3World.getBlockId(par4, par5, par6);
        }
        return true;
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
/*        if(blocksEffectiveAgainst.binarySearch(par2Block))
        {
            return this.efficiencyOnProperMaterial;
        }
        else
        {
            return super(par1ItemStack, par2Block);
        }*/
        return 1.0F;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.none;
    }
}
