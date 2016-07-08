package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import net.minecraft.item.ItemFood;

public class ItemFoodxlfoodmod extends ItemFood{
	
	public ItemFoodxlfoodmod(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.tabXLFoodMod);
	}


}
