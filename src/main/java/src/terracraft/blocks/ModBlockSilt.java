package src.terracraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import java.util.Random;

public class ModBlockSilt extends ModBlockFalling
{
    public ModBlockSilt(String name)
    {
        super(name, Material.ground);
        this.setHardness(0.6F);
        this.setStepSound(soundTypeGravel);
    }
}
