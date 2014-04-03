package src.terracraft.blocks;

import static net.minecraftforge.common.util.ForgeDirection.DOWN;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryLargeChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.texture.IIconRegister;

import java.util.Iterator;
import java.util.Random;

import src.terracraft.items.ModItem;
import src.terracraft.tileEntities.ModTileEntityModChest;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModBlockModChest extends ModBlock implements ITileEntityProvider
{
    private final Random random = new Random();
    private static final String __OBFID = "CL_00000214";
    private String chestType;

    public ModBlockModChest(String name)
    {
        super(name, Material.wood);
        this.setChestType(name);
        this.isBlockContainer = true;
        this.setStepSound(soundTypeWood);
        this.setHardness(2.5F);
        this.setResistance(5.0F);
        this.setModCreativeTabTileEntities();
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    }

    public ModBlock setChestType(String newName)
    {
    	this.chestType = newName.substring(5, 6).toLowerCase() + newName.substring(6);
        return this;
    }

    public String getChestType()
    {
    	return this.chestType;
    }

	@Override
	public TileEntity createNewTileEntity(World world, int var2)
	{
        ModTileEntityModChest tileEntityTerraChest = new ModTileEntityModChest(chestType);
        return (TileEntity) tileEntityTerraChest;
	}

    public boolean onBlockEventReceived(World world, int x, int y, int z, int p_149696_5_, int p_149696_6_)
    {
        super.onBlockEventReceived(world, x, y, z, p_149696_5_, p_149696_6_);
        TileEntity tileentity = world.getTileEntity(x, y, z);
        return tileentity != null ? tileentity.receiveClientEvent(p_149696_5_, p_149696_6_) : false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 22;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess iBlockAccess, int x, int y, int z)
    {
        this.setBlockBounds(0.0625F, 0.0F, 0.0625F, 0.9375F, 0.875F, 0.9375F);
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLivingBase, ItemStack itemStack)
    {
        Block block = world.getBlock(x, y, z - 1);
        Block block1 = world.getBlock(x, y, z + 1);
        Block block2 = world.getBlock(x - 1, y, z);
        Block block3 = world.getBlock(x + 1, y, z);
        byte b0 = 0;
        int l = MathHelper.floor_double((double)(entityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            b0 = 2;
        }

        if (l == 1)
        {
            b0 = 5;
        }

        if (l == 2)
        {
            b0 = 3;
        }

        if (l == 3)
        {
            b0 = 4;
        }

        if (block != this && block1 != this && block2 != this && block3 != this)
        {
            world.setBlockMetadataWithNotify(x, y, z, b0, 3);
        }
        else
        {
            if ((block == this || block1 == this) && (b0 == 4 || b0 == 5))
            {
                if (block == this)
                {
                    world.setBlockMetadataWithNotify(x, y, z - 1, b0, 3);
                }
                else
                {
                    world.setBlockMetadataWithNotify(x, y, z + 1, b0, 3);
                }

                world.setBlockMetadataWithNotify(x, y, z, b0, 3);
            }

            if ((block2 == this || block3 == this) && (b0 == 2 || b0 == 3))
            {
                if (block2 == this)
                {
                    world.setBlockMetadataWithNotify(x - 1, y, z, b0, 3);
                }
                else
                {
                    world.setBlockMetadataWithNotify(x + 1, y, z, b0, 3);
                }

                world.setBlockMetadataWithNotify(x, y, z, b0, 3);
            }
        }

        if (itemStack.hasDisplayName())
        {
            ((ModTileEntityModChest)world.getTileEntity(x, y, z)).func_145976_a(itemStack.getDisplayName());
        }
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int meta)
    {
    	ModTileEntityModChest modTileEntityModChest = (ModTileEntityModChest)world.getTileEntity(x, y, z);

        if (modTileEntityModChest != null)
        {
            for (int i1 = 0; i1 < modTileEntityModChest.getSizeInventory(); ++i1)
            {
                ItemStack itemstack = modTileEntityModChest.getStackInSlot(i1);

                if (itemstack != null)
                {
                    float f = this.random.nextFloat() * 0.8F + 0.1F;
                    float f1 = this.random.nextFloat() * 0.8F + 0.1F;
                    EntityItem entityitem;

                    for (float f2 = this.random.nextFloat() * 0.8F + 0.1F; itemstack.stackSize > 0; world.spawnEntityInWorld(entityitem))
                    {
                        int j1 = this.random.nextInt(21) + 10;

                        if (j1 > itemstack.stackSize)
                        {
                            j1 = itemstack.stackSize;
                        }

                        itemstack.stackSize -= j1;
                        entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
                        float f3 = 0.05F;
                        entityitem.motionX = (double)((float)this.random.nextGaussian() * f3);
                        entityitem.motionY = (double)((float)this.random.nextGaussian() * f3 + 0.2F);
                        entityitem.motionZ = (double)((float)this.random.nextGaussian() * f3);

                        if (itemstack.hasTagCompound())
                        {
                            entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                        }
                    }
                }
            }

            world.func_147453_f(x, y, z, block);
        }

        super.breakBlock(world, x, y, z, block, meta);
        world.removeTileEntity(x, y, z);
	}

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer entityPlayer, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (world.isRemote)
        {
            return true;
        }
        else
        {
            IInventory iinventory = this.getIInventoryObject(world, x, y, z, false);

            if (iinventory != null)
            {
                entityPlayer.displayGUIChest(iinventory);
            }

            return true;
        }
    }

    public IInventory getIInventoryObject(World world, int x, int y, int z, boolean ignoreExceptions)
    {
        Object object = (ModTileEntityModChest)world.getTileEntity(x, y, z);

        if(ignoreExceptions)
        {
        	return (IInventory)object;
        }

        if (object == null)
        {
            return null;
        }
        else if (world.isSideSolid(x, y + 1, z, DOWN))
        {
            return null;
        }
        else if (isBlockedByEntity(world, x, y, z))
        {
            return null;
        }
        else if (world.getBlock(x - 1, y, z) == this && (world.isSideSolid(x - 1, y + 1, z, DOWN) || isBlockedByEntity(world, x - 1, y, z)))
        {
            return null;
        }
        else if (world.getBlock(x + 1, y, z) == this && (world.isSideSolid(x + 1, y + 1, z, DOWN) || isBlockedByEntity(world, x + 1, y, z)))
        {
            return null;
        }
        else if (world.getBlock(x, y, z - 1) == this && (world.isSideSolid(x, y + 1, z - 1, DOWN) || isBlockedByEntity(world, x, y, z - 1)))
        {
            return null;
        }
        else if (world.getBlock(x, y, z + 1) == this && (world.isSideSolid(x, y + 1, z + 1, DOWN) || isBlockedByEntity(world, x, y, z + 1)))
        {
            return null;
        }
        else
        {
            return (IInventory)object;
        }
    }

    public boolean canProvidePower()
    {
        return false;
    }

    public int isProvidingWeakPower(IBlockAccess iBlockAccess, int x, int y, int z, int meta)
    {
        if (!this.canProvidePower())
        {
            return 0;
        }
        else
        {
            int i1 = ((ModTileEntityModChest)iBlockAccess.getTileEntity(x, y, z)).numPlayersUsing;
            return MathHelper.clamp_int(i1, 0, 15);
        }
    }

    public int isProvidingStrongPower(IBlockAccess iBlockAccess, int x, int y, int z, int meta)
    {
        return meta == 1 ? this.isProvidingWeakPower(iBlockAccess, x, y, z, meta) : 0;
    }

    private static boolean isBlockedByEntity(World world, int x, int y, int z)
    {
        Iterator iterator = world.getEntitiesWithinAABB(EntityOcelot.class, AxisAlignedBB.getAABBPool().getAABB((double)x, (double)(y + 1), (double)z, (double)(x + 1), (double)(y + 2), (double)(z + 1))).iterator();
        EntityOcelot entityocelot1;

        do
        {
            if (!iterator.hasNext())
            {
                return false;
            }

            EntityOcelot entityocelot = (EntityOcelot)iterator.next();
            entityocelot1 = (EntityOcelot)entityocelot;
        }
        while (!entityocelot1.isSitting());

        return true;
    }

    public boolean hasComparatorInputOverride()
    {
        return true;
    }

    public int getComparatorInputOverride(World world, int x, int y, int z, int meta)
    {
        return Container.calcRedstoneFromInventory(this.getIInventoryObject(world, x, y, z, false));
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iIconRegister)
    {
        this.blockIcon = iIconRegister.registerIcon(this.getTextureName());
    }

    public void func_149954_e(World world, int x, int y, int z)
    {
        if (!world.isRemote)
        {
            Block block = world.getBlock(x, y, z - 1);
            Block block1 = world.getBlock(x, y, z + 1);
            Block block2 = world.getBlock(x - 1, y, z);
            Block block3 = world.getBlock(x + 1, y, z);
            boolean flag = true;
            int l;
            Block block4;
            int i1;
            Block block5;
            boolean flag1;
            byte b0;
            int j1;

            if (block != this && block1 != this)
            {
                if (block2 != this && block3 != this)
                {
                    b0 = 3;

                    if (block.func_149730_j() && !block1.func_149730_j())
                    {
                        b0 = 3;
                    }

                    if (block1.func_149730_j() && !block.func_149730_j())
                    {
                        b0 = 2;
                    }

                    if (block2.func_149730_j() && !block3.func_149730_j())
                    {
                        b0 = 5;
                    }

                    if (block3.func_149730_j() && !block2.func_149730_j())
                    {
                        b0 = 4;
                    }
                }
                else
                {
                    l = block2 == this ? x - 1 : x + 1;
                    block4 = world.getBlock(l, y, z - 1);
                    i1 = block2 == this ? x - 1 : x + 1;
                    block5 = world.getBlock(i1, y, z + 1);
                    b0 = 3;
                    flag1 = true;

                    if (block2 == this)
                    {
                        j1 = world.getBlockMetadata(x - 1, y, z);
                    }
                    else
                    {
                        j1 = world.getBlockMetadata(x + 1, y, z);
                    }

                    if (j1 == 2)
                    {
                        b0 = 2;
                    }

                    if ((block.func_149730_j() || block4.func_149730_j()) && !block1.func_149730_j() && !block5.func_149730_j())
                    {
                        b0 = 3;
                    }

                    if ((block1.func_149730_j() || block5.func_149730_j()) && !block.func_149730_j() && !block4.func_149730_j())
                    {
                        b0 = 2;
                    }
                }
            }
            else
            {
                l = block == this ? z - 1 : z + 1;
                block4 = world.getBlock(x - 1, y, l);
                i1 = block == this ? z - 1 : z + 1;
                block5 = world.getBlock(x + 1, y, i1);
                b0 = 5;
                flag1 = true;

                if (block == this)
                {
                    j1 = world.getBlockMetadata(x, y, z - 1);
                }
                else
                {
                    j1 = world.getBlockMetadata(x, y, z + 1);
                }

                if (j1 == 4)
                {
                    b0 = 4;
                }

                if ((block2.func_149730_j() || block4.func_149730_j()) && !block3.func_149730_j() && !block5.func_149730_j())
                {
                    b0 = 5;
                }

                if ((block3.func_149730_j() || block5.func_149730_j()) && !block2.func_149730_j() && !block4.func_149730_j())
                {
                    b0 = 4;
                }
            }

            world.setBlockMetadataWithNotify(x, y, z, b0, 3);
        }
    }
}
