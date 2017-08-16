package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.item.ItemFood;

public class ItemFoodxlfoodmod extends ItemFood{
	
	public ItemFoodxlfoodmod(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}


}
