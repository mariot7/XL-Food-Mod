package mariot7.xlfoodmod.config;

import mariot7.xlfoodmod.Reference;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.RangeDouble;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
import net.minecraftforge.common.config.Config.RequiresWorldRestart;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MOD_ID)
@Config.LangKey("xlfoodmod.config.title")
public class Configurationxlfoodmod {
	
	@Config.Comment("Right Click Harvesting Settings")
    public static RightClickHarvesting rightclickharvesting = new RightClickHarvesting();

	@Config.Comment("Rock Salt Generation Settings")
    public static RockSaltGeneration rocksaltgeneration = new RockSaltGeneration();
	
	@Config.Comment("Grass Generation Settings")
    public static GrassGeneration grassgeneration = new GrassGeneration();
	
	@Config.Comment("Vanilla Flower Generation Settings")
    public static VanillaFlowerGeneration vanillaflowergeneration = new VanillaFlowerGeneration();
	
	public static class RightClickHarvesting {
		
	    @Config.Comment("Enable right click harvesting")
	    public boolean rightclickharvest = false;
	    
	}
	
	public static class RockSaltGeneration {
		
		@RequiresMcRestart
        @Config.Comment("Enable the generation of Rock Salt")
        public boolean rockgen = true;

		@RequiresWorldRestart
		@Config.Comment("Minimum size of the ore vein")
		public int minveinsize = 4;

		@RequiresWorldRestart
		@Config.Comment("Maximum size of the ore vein")
		public int maxveinsize = 6;

		@RequiresWorldRestart
		@Config.Comment("Minimum height for the ore")
		public int miny = 6;

		@RequiresWorldRestart
		@Config.Comment("Maximum height for the ore")
		public int maxy = 64;
		
		@RequiresWorldRestart
		@Config.Comment("Maximum veins per chunk")
		public int chancestospawn = 6;
		
	}
	
	public static class GrassGeneration {
		
		@RequiresMcRestart
		@Config.Comment("Enable the generation of Grass")
        public boolean grassgen = true;
		
		@RangeInt(min = 0, max = 255) 
		@RequiresWorldRestart
		@Config.Comment("Minimum amount of Grass in a chunk")
		public int minchunk = 1;
		
		@RangeInt(min = 2, max = 256) 
		@RequiresWorldRestart
		@Config.Comment("Maximum amount of Grass in a chunk")
		public int maxchunk = 4;
		
		@RangeDouble(min = 0, max = 1) 
		@Config.Comment("Chance of dropping Rice Seeds")
		public double ricechance = 0.2;
		
		@RangeDouble(min = 0, max = 1) 
		@Config.Comment("Chance of dropping Pepper Seeds")
		public double pepperchance = 0.2;
		
		@RangeDouble(min = 0, max = 1) 
		@Config.Comment("Chance of dropping Corn Seeds")
		public double cornchance = 0.2;
		
		@RangeDouble(min = 0, max = 1) 
		@Config.Comment("Chance of dropping Cucumber Seeds")
		public double cucumberchance = 0.2;
		
		@RangeDouble(min = 0, max = 1) 
		@Config.Comment("Chance of dropping Lettuce Seeds")
		public double lettucechance = 0.2;
		
		@RangeDouble(min = 0, max = 1) 
		@Config.Comment("Chance of dropping Onion")
		public double onionchance = 0.2;
		
		@RangeDouble(min = 0, max = 1) 
		@Config.Comment("Chance of dropping Tomato Seeds")
		public double tomatochance = 0.2;
		
		@RangeDouble(min = 0, max = 1) 
		@Config.Comment("Chance of dropping Strawberry Seeds")
		public double strawberrychance = 0.2;
		
	}
	
	public static class VanillaFlowerGeneration {
		
		@RequiresMcRestart
        @Config.Comment("Enable the generation of Vanilla Flowers")
        public boolean flowergen = true;
		
		@RangeInt(min = 0, max = 255) 
		@RequiresWorldRestart
		@Config.Comment("Minimum amount of Vanilla Flowers in a chunk")
		public int minchunk = 0;
		
		@RangeInt(min = 2, max = 256) 
		@RequiresWorldRestart
		@Config.Comment("Maximum amount of Vanilla Flowers in a chunk")
		public int maxchunk = 2;
		
	}
    
    @Mod.EventBusSubscriber
	private static class EventHandler {  
    	@SubscribeEvent
    	public static void configChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
    		if (event.getModID().equals(Reference.MOD_ID)) {
    			ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
    		}
    	}
    }
    

}
