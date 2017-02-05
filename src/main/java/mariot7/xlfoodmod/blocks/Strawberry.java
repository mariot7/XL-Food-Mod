package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Strawberry extends BlockCrops{
	
	public Strawberry(String name) {
		this.setUnlocalizedName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.strawberry_seeds;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.strawberry;
	}
}
