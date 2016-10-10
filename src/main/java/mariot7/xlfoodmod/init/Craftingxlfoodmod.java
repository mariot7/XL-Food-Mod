package mariot7.xlfoodmod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class Craftingxlfoodmod {
	
	public static void initRecipes(){
		//shaped
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.dough, 8), new Object [] {"WW ","WW "," B ", 'W', Items.WHEAT, 'B', Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemListxlfoodmod.butter, 2), new Object [] {"MMM","MSM","   ", 'M', Items.MILK_BUCKET, 'S', "itemSalt"}));
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.cheese, 4), new Object [] {"MM ","MM ","MM ", 'M', Items.MILK_BUCKET});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.pancake), new Object [] {"   ","CCC","   ", 'C', ItemListxlfoodmod.cooked_dough});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.waffle), new Object [] {"CC ","CC ","   ", 'C', ItemListxlfoodmod.cooked_dough});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.sausage, 3), new Object [] {"C  "," C ","  C", 'C', Items.COOKED_PORKCHOP});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.top_bun), new Object [] {" W ","W W","   ", 'W', Items.WHEAT});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.bottom_bun), new Object [] {"W W"," W ","   ", 'W', Items.WHEAT});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.hamburger), new Object [] {" T ","OGP"," B ", 'T', ItemListxlfoodmod.top_bun, 'O', ItemListxlfoodmod.tomato, 'G', ItemListxlfoodmod.ground_beef, 'P', ItemListxlfoodmod.cucumber, 'B', ItemListxlfoodmod.bottom_bun});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.cheeseburger), new Object [] {" T ","PGC"," B ", 'T', ItemListxlfoodmod.top_bun, 'P', ItemListxlfoodmod.cucumber, 'G', ItemListxlfoodmod.ground_beef, 'C', ItemListxlfoodmod.cheese, 'B', ItemListxlfoodmod.bottom_bun});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.hot_dog), new Object [] {" C ","CSC"," C ", 'C', ItemListxlfoodmod.cooked_dough, 'S', ItemListxlfoodmod.sausage});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.taco), new Object [] {"TGC","DDD","   ", 'T', ItemListxlfoodmod.tomato, 'G', ItemListxlfoodmod.ground_beef, 'C', ItemListxlfoodmod.cucumber, 'D', ItemListxlfoodmod.cooked_dough});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.oreo_cookie), new Object [] {"SCS"," M ","SCS", 'S', ItemListxlfoodmod.chocolate_syrup, 'C', Items.COOKIE, 'M', ItemListxlfoodmod.marshmallow});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.brownie), new Object [] {"CC ","CC ","   ", 'C', ItemListxlfoodmod.chocolate_syrup});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.icecream_cone), new Object [] {"W W","W W"," W ", 'W', Items.WHEAT});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.crescent_roll), new Object [] {"D D"," D ","   ", 'D', ItemListxlfoodmod.cooked_dough});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.donut, 4), new Object [] {"CCC","C C","CCC", 'C', ItemListxlfoodmod.cooked_dough});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.pie_shell), new Object [] {"   ","C C","CCC", 'C', ItemListxlfoodmod.cooked_dough});
		GameRegistry.addRecipe(new ItemStack(BlockListxlfoodmod.chocolate_cake), new Object [] {"MMM","SCS","WWW", 'M', Items.MILK_BUCKET, 'S', Items.SUGAR, 'C', ItemListxlfoodmod.chocolate_syrup, 'W', Items.WHEAT});
		GameRegistry.addRecipe(new ItemStack(BlockListxlfoodmod.oreo_cake), new Object [] {"MMM","SOS","WWW", 'M', Items.MILK_BUCKET, 'S', Items.SUGAR, 'O', ItemListxlfoodmod.oreo_cookie, 'W', Items.WHEAT});
		GameRegistry.addRecipe(new ItemStack(BlockListxlfoodmod.nether_cake), new Object [] {"MMM","SBS","WWW", 'M', Items.MILK_BUCKET, 'S', Items.SUGAR, 'B', Items.BLAZE_POWDER, 'W', Items.WHEAT});
		
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.empty_can, 2), new Object [] {"I I","I I","I I",'I', Items.IRON_INGOT});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.speedy_energy_drink), new Object [] {"SR ","EW ","   ", 'S', Items.SUGAR, 'R', ItemListxlfoodmod.rice, 'E', ItemListxlfoodmod.empty_can, 'W', Items.WATER_BUCKET});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.healthy_energy_drink), new Object [] {"GR ","EW ","L  ", 'G', Items.GHAST_TEAR, 'R', ItemListxlfoodmod.rice, 'E', ItemListxlfoodmod.empty_can, 'W', Items.WATER_BUCKET, 'L', Items.SPECKLED_MELON});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.stealthy_energy_drink), new Object [] {"RE ","WS ","G  ", 'R', ItemListxlfoodmod.rice, 'E', ItemListxlfoodmod.empty_can, 'W', Items.WATER_BUCKET, 'S', Items.SUGAR, 'G', Items.GOLDEN_CARROT});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.strong_energy_drink), new Object [] {"RE ","WM ","B  ", 'R', ItemListxlfoodmod.rice, 'E', ItemListxlfoodmod.empty_can, 'W', Items.WATER_BUCKET, 'M', Items.MAGMA_CREAM, 'B', Items.BLAZE_POWDER});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.deadly_energy_drink), new Object [] {"RE ","WF ","S  ", 'R', ItemListxlfoodmod.rice, 'E', ItemListxlfoodmod.empty_can, 'W', Items.WATER_BUCKET, 'F', Items.FERMENTED_SPIDER_EYE, 'S', Items.SPIDER_EYE});
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.super_energy_drink), new Object [] {"SH ","PT ","D  ", 'S', ItemListxlfoodmod.stealthy_energy_drink, 'H', ItemListxlfoodmod.healthy_energy_drink, 'P', ItemListxlfoodmod.speedy_energy_drink, 'T', ItemListxlfoodmod.strong_energy_drink, 'D', Items.DIAMOND});
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemListxlfoodmod.glass_mug, 2), new Object [] {"GG ","GGG","GG ", 'G', "blockGlass"}));
		GameRegistry.addRecipe(new ItemStack(ItemListxlfoodmod.beer), new Object [] {" R "," F "," G ", 'R', ItemListxlfoodmod.rice, 'F', Items.FERMENTED_SPIDER_EYE, 'G', ItemListxlfoodmod.glass_mug});
		
		//shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.rice_seeds), new Object [] {ItemListxlfoodmod.rice});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.pepper_seeds), new Object [] {ItemListxlfoodmod.pepper});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.corn_seeds), new Object [] {ItemListxlfoodmod.raw_corn});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.cucumber_seeds), new Object [] {ItemListxlfoodmod.cucumber});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.tomato_seeds), new Object [] {ItemListxlfoodmod.tomato});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.butter_rice), new Object [] {ItemListxlfoodmod.rice, ItemListxlfoodmod.butter});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.cheesy_bread), new Object [] {Items.BREAD, ItemListxlfoodmod.cheese});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.corn_bread), new Object [] {Items.BREAD, ItemListxlfoodmod.corn});
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ItemListxlfoodmod.chips, 8), new Object [] {ItemListxlfoodmod.cooked_dough, "itemSalt"}));
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.spicy_chips), new Object [] {ItemListxlfoodmod.chips, ItemListxlfoodmod.hot_sauce});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.waffle), new Object [] {Items.MILK_BUCKET, ItemListxlfoodmod.cooked_dough});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.bacon, 4), new Object [] {Items.COOKED_PORKCHOP});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.ground_beef, 2), new Object [] {Items.COOKED_BEEF});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.raw_chicken_wing, 2), new Object [] {Items.CHICKEN});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.cooked_chicken_wing, 2), new Object [] {Items.COOKED_CHICKEN});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.spicy_chicken_wing), new Object [] {ItemListxlfoodmod.cooked_chicken_wing, ItemListxlfoodmod.hot_sauce});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.chocolate_icecream_ball), new Object [] {new ItemStack(Items.DYE, 1, 3), ItemListxlfoodmod.vanilla_cream, Items.SNOWBALL, Items.MILK_BUCKET});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.vanilla_icecream_ball), new Object [] {ItemListxlfoodmod.vanilla_cream, Items.SNOWBALL, Items.MILK_BUCKET});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.chocolate_icecream), new Object [] {ItemListxlfoodmod.chocolate_icecream_ball, ItemListxlfoodmod.icecream_cone});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.vanilla_icecream), new Object [] {ItemListxlfoodmod.vanilla_icecream_ball, ItemListxlfoodmod.icecream_cone});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.sugar_donut), new Object [] {Items.SUGAR, ItemListxlfoodmod.donut});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.chocolate_donut), new Object [] {ItemListxlfoodmod.chocolate_syrup, ItemListxlfoodmod.donut});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.apple_pie), new Object [] {ItemListxlfoodmod.pie_shell, Items.APPLE});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.golden_apple_pie), new Object [] {ItemListxlfoodmod.pie_shell, Items.GOLDEN_APPLE});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.cheese_pie), new Object [] {ItemListxlfoodmod.pie_shell, ItemListxlfoodmod.cheese});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.chicken_pot_pie), new Object [] {ItemListxlfoodmod.pie_shell, Items.COOKED_CHICKEN});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.chocolate_pie), new Object [] {ItemListxlfoodmod.pie_shell, ItemListxlfoodmod.chocolate_syrup});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.bacon_pie), new Object [] {ItemListxlfoodmod.pie_shell, ItemListxlfoodmod.bacon});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.fish_pie), new Object [] {ItemListxlfoodmod.pie_shell, Items.COOKED_FISH});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.vanilla_extract), new Object [] {BlockListxlfoodmod.vanilla_flower, Items.GLASS_BOTTLE});
		GameRegistry.addShapelessRecipe(new ItemStack(ItemListxlfoodmod.vanilla_cream), new Object [] {ItemListxlfoodmod.vanilla_extract, Items.SUGAR, Items.SUGAR});
		

		}

}
