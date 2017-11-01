package mariot7.xlfoodmod.init;

import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Smeltingxlfoodmod {
	
	public static void initSmelting() {
		
		GameRegistry.addSmelting(ItemListxlfoodmod.rice, new ItemStack(ItemListxlfoodmod.fried_rice), 0);
		GameRegistry.addSmelting(ItemListxlfoodmod.raw_corn, new ItemStack(ItemListxlfoodmod.corn), 0);
		GameRegistry.addSmelting(ItemListxlfoodmod.dough, new ItemStack(ItemListxlfoodmod.cooked_dough), 0);
		GameRegistry.addSmelting(ItemListxlfoodmod.cheese, new ItemStack(ItemListxlfoodmod.cheese_puff), 0);
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ItemListxlfoodmod.fried_egg), 0);
		GameRegistry.addSmelting(Items.ROTTEN_FLESH, new ItemStack(ItemListxlfoodmod.flesh), 0);
		GameRegistry.addSmelting(ItemListxlfoodmod.raw_chicken_wing, new ItemStack(ItemListxlfoodmod.cooked_chicken_wing), 0);
		GameRegistry.addSmelting(ItemListxlfoodmod.onion, new ItemStack(ItemListxlfoodmod.onion_rings, 4), 0);
		GameRegistry.addSmelting(Items.SUGAR, new ItemStack(ItemListxlfoodmod.marshmallow), 0);
		GameRegistry.addSmelting(ItemListxlfoodmod.marshmallow, new ItemStack(ItemListxlfoodmod.roasted_marshmallow), 0);
		GameRegistry.addSmelting(ItemListxlfoodmod.pepper, new ItemStack(ItemListxlfoodmod.hot_sauce), 0);
		GameRegistry.addSmelting(new ItemStack(Items.DYE, 1, 3), new ItemStack(ItemListxlfoodmod.chocolate_syrup), 0);
		
	}
	

}
