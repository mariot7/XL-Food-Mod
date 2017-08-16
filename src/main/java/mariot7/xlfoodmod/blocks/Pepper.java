package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Pepper extends BlockCrops{
	
	public Pepper(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.pepper_seeds;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.pepper;
	}
}
