package src.terracraft.renderer;

import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Calendar;
import net.minecraft.block.Block;
import net.minecraft.block.BlockChest;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.model.ModelLargeChest;
import net.minecraft.client.renderer.tileentity.TileEntityChestRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import src.terracraft.blocks.ModBlockModChest;
import src.terracraft.tileEntities.ModTileEntityModChest;

@SideOnly(Side.CLIENT)
public class ModTileEntityModChestRenderer extends TileEntityChestRenderer
{
    private ResourceLocation resourceChest;

    private ModelChest modelChest = new ModelChest();
    private boolean field_147509_j;
    private static final String __OBFID = "CL_00000965";

    public ModTileEntityModChestRenderer()
    {
        Calendar calendar = Calendar.getInstance();

        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26)
        {
            this.field_147509_j = true;
        }
    }

    public void renderTileEntityAt(ModTileEntityModChest modTileEntityModChest, double p_147502_2_, double p_147502_4_, double p_147502_6_, float p_147502_8_)
    {
        int i;

        if (!modTileEntityModChest.hasWorldObj())
        {
            i = 0;
        }
        else
        {
            Block block = modTileEntityModChest.getBlockType();
            i = modTileEntityModChest.getBlockMetadata();

            if (block instanceof ModBlockModChest && i == 0)
            {
                try
                {
                ((ModBlockModChest)block).func_149954_e(modTileEntityModChest.getWorldObj(), modTileEntityModChest.xCoord, modTileEntityModChest.yCoord, modTileEntityModChest.zCoord);
                }
                catch (ClassCastException e)
                {
                    FMLLog.severe("Attempted to render a chest at %d,  %d, %d that was not a chest", modTileEntityModChest.xCoord, modTileEntityModChest.yCoord, modTileEntityModChest.zCoord);
                }
                i = modTileEntityModChest.getBlockMetadata();
            }
        }

        ModelChest modelchest;

        modelchest = this.modelChest;
        String path = "terracraft:textures/entity/chest/" + modTileEntityModChest.getChestType() + ".png";
        resourceChest = new ResourceLocation(path);
        this.bindTexture(resourceChest);

        GL11.glPushMatrix();
        GL11.glEnable(GL12.GL_RESCALE_NORMAL);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glTranslatef((float)p_147502_2_, (float)p_147502_4_ + 1.0F, (float)p_147502_6_ + 1.0F);
        GL11.glScalef(1.0F, -1.0F, -1.0F);
        GL11.glTranslatef(0.5F, 0.5F, 0.5F);
        short short1 = 0;

        if (i == 2)
        {
            short1 = 180;
        }

        if (i == 3)
        {
            short1 = 0;
        }

        if (i == 4)
        {
            short1 = 90;
        }

        if (i == 5)
        {
            short1 = -90;
        }

        GL11.glRotatef((float)short1, 0.0F, 1.0F, 0.0F);
        GL11.glTranslatef(-0.5F, -0.5F, -0.5F);
        float f1 = modTileEntityModChest.prevLidAngle + (modTileEntityModChest.lidAngle - modTileEntityModChest.prevLidAngle) * p_147502_8_;
        float f2;

        f1 = 1.0F - f1;
        f1 = 1.0F - f1 * f1 * f1;
        modelchest.chestLid.rotateAngleX = -(f1 * (float)Math.PI / 2.0F);
        modelchest.renderAll();
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        GL11.glPopMatrix();
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    public void renderTileEntityAt(TileEntity p_147500_1_, double p_147500_2_, double p_147500_4_, double p_147500_6_, float p_147500_8_)
    {
        this.renderTileEntityAt((ModTileEntityModChest)p_147500_1_, p_147500_2_, p_147500_4_, p_147500_6_, p_147500_8_);
    }
}