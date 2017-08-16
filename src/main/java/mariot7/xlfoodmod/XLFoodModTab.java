package mariot7.xlfoodmod;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class XLFoodModTab {
	
	public static final CreativeTabs tabXLFoodMod = new CreativeTabs ("tabXLFoodMod") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemListxlfoodmod.pepper);
		}
	};
	

}
