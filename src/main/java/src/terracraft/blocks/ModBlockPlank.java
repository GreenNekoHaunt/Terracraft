package src.terracraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import java.util.Random;

public class ModBlockPlank extends ModBlockFalling
{
    public ModBlockPlank(String name)
    {
        super(name, Material.wood);
        this.setStepSound(soundTypeWood);
        this.setHardness(2.0F);
        this.setResistance(5.0F);
    }
}
