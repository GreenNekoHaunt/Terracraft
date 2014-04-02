package src.terracraft.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import java.util.Random;

public class ModBlockModIce extends ModBlockFalling
{
    public ModBlockModIce(String name)
    {
        super(name, Material.ice);
        this.setStepSound(soundTypeGlass);
        this.setHardness(1.0F);
        this.setSlippery();
    }
}
