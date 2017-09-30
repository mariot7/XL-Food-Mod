package mariot7.xlfoodmod;

import mariot7.xlfoodmod.config.GuiConfigurationxlfoodmod;
import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import mariot7.xlfoodmod.init.Craftingxlfoodmod;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import mariot7.xlfoodmod.init.Smeltingxlfoodmod;
import mariot7.xlfoodmod.proxy.CommonProxy;
import mariot7.xlfoodmod.render.BlockRenderxlfoodmod;
import mariot7.xlfoodmod.render.ItemRenderxlfoodmod;
import mariot7.xlfoodmod.world.WorldGeneratorRockSaltxlfoodmod;
import mariot7.xlfoodmod.world.WorldGeneratorGrassxlfoodmod;
import mariot7.xlfoodmod.world.WorldGeneratorVanillaFlowerxlfoodmod;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, updateJSON = Reference.updateJSON)
public class Main {
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static Configuration config;
	public static final XLFoodModTab tabXLFoodMod = new XLFoodModTab();

	@Mod.Instance(Reference.MOD_ID)
	public static Main instance;
	
	@Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preEvent)
    {
		this.proxy.preInit(preEvent);
		config = new Configuration(preEvent.getSuggestedConfigurationFile());
		if(!GuiConfigurationxlfoodmod.WorldGen.RockGen) {
		GameRegistry.registerWorldGenerator(new WorldGeneratorRockSaltxlfoodmod(), 0);
		}
		if(!GuiConfigurationxlfoodmod.WorldGen.GrassGen) {
		GameRegistry.registerWorldGenerator(new WorldGeneratorGrassxlfoodmod(), 2);
		}
		if(!GuiConfigurationxlfoodmod.WorldGen.FlowerGen) {
		GameRegistry.registerWorldGenerator(new WorldGeneratorVanillaFlowerxlfoodmod(), 1);
        }
	}
    
	@Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
		this.proxy.init(event);
		FMLCommonHandler.instance().bus().register(instance);
    }
    
	@Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postEvent)
    {
		this.proxy.postInit(postEvent);
    }
	
	
}
