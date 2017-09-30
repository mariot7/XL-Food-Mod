package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import mariot7.xlfoodmod.init.ItemSeedFoodxlfoodmod;
import net.minecraft.block.Block;
import net.minecraftforge.common.IPlantable;

public class Onion extends ItemSeedFoodxlfoodmod implements IPlantable {
	
	public Onion(int healAmount, float saturation, Block crops, Block soil) {
		super(healAmount, saturation, crops, soil);
		this.setUnlocalizedName("onion");
		this.setRegistryName("onion");
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, "onion");
	}
	

}
