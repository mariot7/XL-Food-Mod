package mariot7.xlfoodmod.config;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.Reference;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

public class ConfigGui extends GuiConfig {
	
	public ConfigGui(GuiScreen parent) {
	    super(parent,
	        new ConfigElement(Main.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
	        Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(Main.config.toString()));
	}

}
