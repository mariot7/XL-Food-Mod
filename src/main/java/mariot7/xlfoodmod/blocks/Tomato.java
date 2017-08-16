package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class Tomato extends BlockCrops{
	
	public Tomato(String name) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.tomato_seeds;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.tomato;
	}
}
