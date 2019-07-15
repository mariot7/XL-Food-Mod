package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.XLFoodMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.util.ResourceLocation;

public class ItemSeedFoodXL extends BlockNamedItem {

	public ItemSeedFoodXL(String name, Block crop, int hunger, float saturation)
	{
		super(crop, new Properties().food(new Food.Builder().saturation(saturation).hunger(hunger).build()));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
