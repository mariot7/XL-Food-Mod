package mariot7.xlfoodmod.config;


import mariot7.xlfoodmod.Reference;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MOD_ID)
@Config.LangKey("xlfoodmod.config.title")
public class GuiConfigurationxlfoodmod {
	
	@Config.Comment("World Generation Settings")
    public static WorldGen WorldGen = new WorldGen();
	
	@Config.Comment("Right Click Harvesting Settings")
    public static RightClickHarvesting RightClickHarvesting = new RightClickHarvesting();
    
    public static class WorldGen {
    	
    	@RequiresMcRestart
        @Config.Comment("Disable the generation of Rock Salt")
        public boolean RockGen = false;
        
        @RequiresMcRestart
        @Config.Comment("Disable the generation of Grass")
        public boolean GrassGen = false;
        
        @RequiresMcRestart
        @Config.Comment("Disable the generation of Vanilla Flowers")
        public boolean FlowerGen = false;    
        
    }
    
    public static class RightClickHarvesting {
    	
    	@Config.Comment("Disable right click harvesting")
        public boolean RightClickHarvest = true;
    	
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
