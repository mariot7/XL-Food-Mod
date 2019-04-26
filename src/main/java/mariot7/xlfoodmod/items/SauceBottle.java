package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class SauceBottle extends Item {
	
	protected String name;
	
	public SauceBottle(String name) {
		super();
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}

	@Override
	public Item getContainerItem() {
		return Items.GLASS_BOTTLE;
	}
	
	@Override
	public boolean hasContainerItem() {
		return Items.GLASS_BOTTLE != null;
	}
	

}
