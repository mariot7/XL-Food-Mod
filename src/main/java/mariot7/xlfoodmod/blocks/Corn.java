package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Corn extends BlockCrops{
	
	public Corn(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.corn_seeds;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.raw_corn;
	}
}
