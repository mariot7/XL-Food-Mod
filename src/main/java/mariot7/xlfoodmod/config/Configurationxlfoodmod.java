package mariot7.xlfoodmod.config;

import mariot7.xlfoodmod.Main;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class Configurationxlfoodmod {
	
	public static boolean SaltGen;
	public static final boolean SALTGEN_DEFAULT = false;
	public static final String SALTGEN_NAME = "Disable the generation of the Rock Salt";
	public static boolean GrassGen;
	public static final boolean GRASSGEN_DEFAULT = false;
	public static final String GRASSGEN_NAME = "Disable the generation of Grass & Vanilla Flowers";
	
	public static void syncConfig() {
		FMLCommonHandler.instance().bus().register(Main.instance);
		final String WORLDGEN = Main.config.CATEGORY_GENERAL + Main.config.CATEGORY_SPLITTER + "WorldGen";
		Main.config.addCustomCategoryComment(WORLDGEN, "Enable or disable World Generation");
		
		SaltGen = Main.config.get(WORLDGEN, SALTGEN_NAME, SALTGEN_DEFAULT).getBoolean(SALTGEN_DEFAULT);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
		
		GrassGen = Main.config.get(WORLDGEN, GRASSGEN_NAME, GRASSGEN_DEFAULT).getBoolean(GRASSGEN_DEFAULT);
		if(Main.config.hasChanged()){
			Main.config.save();
		}
	}

	
}
