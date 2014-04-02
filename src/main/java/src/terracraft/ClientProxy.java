package src.terracraft;

import cpw.mods.fml.client.registry.ClientRegistry;
import src.terracraft.renderer.ModTileEntityModChestRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderers()
    {
    	ClientRegistry.bindTileEntitySpecialRenderer(src.terracraft.tileEntities.ModTileEntityModChest.class, (TileEntitySpecialRenderer)(new ModTileEntityModChestRenderer()));
    }
}
