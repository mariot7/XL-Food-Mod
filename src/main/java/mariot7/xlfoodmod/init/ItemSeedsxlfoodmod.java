package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;

public class ItemSeedsxlfoodmod extends ItemSeeds {
	
	protected String name;
	
	public ItemSeedsxlfoodmod(Block crops, Block soil, String name) {
		super(crops, soil);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	
	 public static void addGrassSeed(ItemStack seed, int weight) {
		 
	 }
	 
	 public void registerItemModel() {
			Main.proxy.registerItemRenderer(this, 0, name);
		}
	
	 
}
