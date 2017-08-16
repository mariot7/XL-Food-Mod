package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Lettuce extends BlockCrops{
	
	public Lettuce(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.lettuce_seeds;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.lettuce;
	}
}
