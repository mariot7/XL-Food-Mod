package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class ItemSeedsxlfoodmod extends ItemSeeds {
	
	public String name;
	public final Block crops;
	
	public ItemSeedsxlfoodmod(Block crops, Block soil, String name) {
		super(crops, soil);
		this.name = name;
		this.crops = crops;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	 
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
	
	 
}
