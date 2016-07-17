package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Cucumber extends BlockCrops{
	
	public Cucumber(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.cucumber_seeds;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.cucumber;
	}
}
