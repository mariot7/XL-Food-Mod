package mariot7.xlfoodmod.proxy;

import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import mariot7.xlfoodmod.init.Craftingxlfoodmod;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import mariot7.xlfoodmod.init.Smeltingxlfoodmod;
import mariot7.xlfoodmod.world.WorldGeneratorGrassxlfoodmod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent preEvent) {
		BlockListxlfoodmod.initBlocks();
		ItemListxlfoodmod.initItems();
		Craftingxlfoodmod.initRecipes();
		Smeltingxlfoodmod.initSmelting();
	}
	
	public void init(FMLInitializationEvent event) {

		
	}

	public void postInit(FMLPostInitializationEvent postEvent) {
	
	}
	

}
