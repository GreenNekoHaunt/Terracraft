package com.terracraft.items;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ModItemPotionRestoration extends ModItem
{
    private static int healthGainBase = 5;
    private static int manaGainBase = 50;
    private int healthGain;
    private int manaGain;

    public ModItemPotionRestoration(String name, int size)
    {
        super(name);
        this.setMaxStackSize(30);
        this.healthGain = this.healthGainBase * (size + 1);
        this.manaGain = this.manaGainBase * (size + 1);

    }

    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (!par3EntityPlayer.capabilities.isCreativeMode)
        {
            --par1ItemStack.stackSize;
        }

        if (!par2World.isRemote)
        {
            par3EntityPlayer.heal(this.healthGain);
            // TODO: give player mana.
        }

        return par1ItemStack;
    }

    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
        return 16;
    }

    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.drink;
    }

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
}
