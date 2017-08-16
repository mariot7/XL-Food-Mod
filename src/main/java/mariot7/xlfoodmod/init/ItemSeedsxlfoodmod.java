package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;

public class ItemSeedsxlfoodmod extends ItemSeeds{
	
	public ItemSeedsxlfoodmod(Block crops, Block soil, String name) {
		super(crops, soil);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	
	 public static void addGrassSeed(ItemStack seed, int weight) {
		 
	 }
	
}
