package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.item.Item;

public class Itemxlfoodmod extends Item{
	
	public Itemxlfoodmod(String name) {
		super();
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}

}
