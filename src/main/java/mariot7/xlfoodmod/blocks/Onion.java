package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Onion extends BlockCrops{
	
	public Onion(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.onion;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.onion;
	}
}
