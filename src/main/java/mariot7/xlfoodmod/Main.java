package mariot7.xlfoodmod;

import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import mariot7.xlfoodmod.init.Craftingxlfoodmod;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import mariot7.xlfoodmod.init.Smeltingxlfoodmod;
import mariot7.xlfoodmod.proxy.CommonProxy;
import mariot7.xlfoodmod.render.BlockRenderxlfoodmod;
import mariot7.xlfoodmod.render.ItemRenderxlfoodmod;
import mariot7.xlfoodmod.world.WorldGeneratorxlfoodmod;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Main {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static final XLFoodModTab tabXLFoodMod = new XLFoodModTab("tabXLFoodMod");

	@EventHandler
    public void preInit(FMLPreInitializationEvent preEvent)
    {
		this.proxy.preInit(preEvent);
	}
    
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		this.proxy.init(event);
		GameRegistry.registerWorldGenerator(new WorldGeneratorxlfoodmod(), 10);
    }
    
	@EventHandler
    public void postInit(FMLPostInitializationEvent postEvent)
    {
		this.proxy.postInit(postEvent);
    }
}

