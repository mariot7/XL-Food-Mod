package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.CreativeTabXL;
import mariot7.xlfoodmod.XLFoodMod;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.util.ResourceLocation;

public class ItemFoodXL extends Item {
	
	public ItemFoodXL(String name, int hunger, float saturation)
	{
	    super(new Properties().group(CreativeTabXL.getInstance()).food(new Food.Builder().saturation(saturation).hunger(hunger).build()));
	    this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
