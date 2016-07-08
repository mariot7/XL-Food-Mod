package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;

public class ItemSeedsxlfoodmod extends ItemSeeds{
	
	public ItemSeedsxlfoodmod(Block crops, Block soil, String name) {
		super(crops, soil);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.tabXLFoodMod);
	}
	
	 public static void addGrassSeed(ItemStack seed, int weight) {
		 
	 }
	
}
