package Terracraft.ModItems;

import com.google.common.collect.Multimap;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import Terracraft.ModEnumToolMaterial;


public class ModItemModAxe extends ModItemModTool
{
    private Block[] blocksEffectiveAgainst;
    public float efficiencyOnProperMaterial = 4.0F;

    public static final Block[] blockArray = new Block[] {Block.planks, Block.bookShelf, Block.wood, Block.chest, Block.stoneDoubleSlab,
                                                                         Block.stoneSingleSlab, Block.pumpkin, Block.pumpkinLantern};

    public ModItemModAxe(String name, EnumToolMaterial enumToolMaterial)
    {
        super(name, 3.0F, enumToolMaterial, blockArray);
    }

    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block != null && (par2Block.blockMaterial == Material.wood || par2Block.blockMaterial == Material.plants
                                  || par2Block.blockMaterial == Material.vine) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }
}
