package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.item.Item;

public class Itemxlfoodmod extends Item {
	
	protected String name;
	
	public Itemxlfoodmod(String name) {
		super();
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	
}
