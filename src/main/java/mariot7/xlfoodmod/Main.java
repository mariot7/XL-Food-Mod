package mariot7.xlfoodmod;

import mariot7.xlfoodmod.config.GuiConfigurationxlfoodmod;
import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import mariot7.xlfoodmod.init.Smeltingxlfoodmod;
import mariot7.xlfoodmod.proxy.CommonProxy;
import mariot7.xlfoodmod.world.WorldGeneratorRockSaltxlfoodmod;
import mariot7.xlfoodmod.world.WorldGeneratorVanillaFlowerxlfoodmod;
import mariot7.xlfoodmod.world.WorldGeneratorGrassxlfoodmod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
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
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			BlockListxlfoodmod.register(event.getRegistry());
		}

		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			BlockListxlfoodmod.registerItemBlocks(event.getRegistry());
			ItemListxlfoodmod.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			BlockListxlfoodmod.registerModels();
			ItemListxlfoodmod.registerModels();
		}
		
	}
	
	@EventHandler
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
    
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		this.proxy.init(event);
		FMLCommonHandler.instance().bus().register(instance);
    }
    
	@EventHandler
    public void postInit(FMLPostInitializationEvent postEvent)
    {
		this.proxy.postInit(postEvent);
    }
	
	
}
