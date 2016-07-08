package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Rice extends BlockCrops{
	
	public Rice(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.rice_seeds;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.rice;
	}
}
