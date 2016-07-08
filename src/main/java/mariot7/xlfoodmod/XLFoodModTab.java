package mariot7.xlfoodmod;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class XLFoodModTab extends CreativeTabs{

	public XLFoodModTab(String label) {
		super(label);
		this.setBackgroundImageName("XLFoodModTab.png");
	}

	@Override
	public Item getTabIconItem() {
		return ItemListxlfoodmod.pepper;
	}

}


