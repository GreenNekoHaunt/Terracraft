package com.terracraft.items;

import java.util.Set;

import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.terracraft.blocks.ModBlock;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class ModItemModAxe extends ModItemModTool
{
    public float efficiencyOnProperMaterial = 4.0F;

    private static final Set field_150917_c = Sets.newHashSet(new Block[] { Blocks.planks,
    		Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin,
    		ModBlock.plankEbon, ModBlock.plankPearl, ModBlock.plankRichMahogany, ModBlock.plankShade,
    		ModBlock.logEbon, ModBlock.logPearl, ModBlock.logRichMahogany, ModBlock.logShade});

    public ModItemModAxe(String name, ModToolMaterial enumToolMaterial)
    {
        super(name, 3.0F, enumToolMaterial, field_150917_c);
    }

    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
    {
        return (p_150893_2_.getMaterial() != Material.wood
        		&& p_150893_2_.getMaterial() != Material.plants
        		&& p_150893_2_.getMaterial() != Material.vine ? super.func_150893_a(p_150893_1_, p_150893_2_)
        				: this.efficiencyOnProperMaterial);
    }
}
