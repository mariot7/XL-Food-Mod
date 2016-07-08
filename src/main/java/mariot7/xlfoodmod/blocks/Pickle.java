package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Pickle extends BlockCrops{
	
	public Pickle(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.pickle_seeds;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.pickle;
	}
}
