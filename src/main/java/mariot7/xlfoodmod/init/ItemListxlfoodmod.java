package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.items.Beer;
import mariot7.xlfoodmod.items.DeadlyEnergyDrink;
import mariot7.xlfoodmod.items.HealthyEnergyDrink;
import mariot7.xlfoodmod.items.SpeedyEnergyDrink;
import mariot7.xlfoodmod.items.StealthyEnergyDrink;
import mariot7.xlfoodmod.items.StrongEnergyDrink;
import mariot7.xlfoodmod.items.SuperEnergyDrink;
import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemListxlfoodmod {
	
	//crops
	public static Item rice_seeds;
	public static Item rice;
	public static Item butter_rice;
	public static Item fried_rice;
	public static Item pepper_seeds;
	public static Item pepper;
	public static Item corn_seeds;
	public static Item raw_corn;
	public static Item corn;
	public static Item pickle_seeds;
	public static Item pickle;
	//other foods
	public static Item salt;
	public static Item dough;
	public static Item cooked_dough;
	public static Item butter;
	public static Item cheese;
	public static Item cheese_puff;
    public static Item cheesy_bread;
    public static Item corn_bread;
    //meat
    public static Item flesh;
    public static Item sausage;
    public static Item bacon;
    public static Item ground_beef;
    public static Item raw_chicken_wing;
    public static Item cooked_chicken_wing;
    public static Item spicy_chicken_wing;
    //fast food
    public static Item top_bun;
    public static Item bottom_bun;
    public static Item hamburger;
    public static Item cheeseburger;
    public static Item hot_dog;
    //candy
    public static Item marshmallow;
    public static Item roasted_marshmallow;
    public static Item oreo_cookie;
    public static Item chocolate_icecream_ball;
    public static Item vanilla_icecream_ball;
    public static Item icecream_cone;
    public static Item chocolate_icecream;
    public static Item vanilla_icecream;
    //pies
    public static Item pie_shell;
    public static Item apple_pie;
    public static Item golden_apple_pie;
    public static Item cheese_pie;
    public static Item chicken_pot_pie;
    public static Item chocolate_pie;
    public static Item bacon_pie;
    public static Item fish_pie;
    //syrup, cream etc.
	public static Item hot_sauce;
	public static Item chocolate_syrup;
	public static Item vanilla_extract;
	public static Item vanilla_cream;
	//drinks
	public static Item empty_can;
	public static Item speedy_energy_drink;
	public static Item healthy_energy_drink;
	public static Item stealthy_energy_drink;
	public static Item strong_energy_drink;
	public static Item deadly_energy_drink;
	public static Item super_energy_drink;
	public static Item glass_mug;
	public static Item beer;
	
	
	public static void initItems(){
		//crops
		GameRegistry.registerItem(rice_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.rice_plant, Blocks.FARMLAND, "rice_seeds"), "rice_seeds");
		GameRegistry.registerItem(rice = new ItemFoodxlfoodmod("rice", 3, 0.3F, false), "rice");
		GameRegistry.registerItem(butter_rice = new ItemFoodxlfoodmod("butter_rice", 3, 0.3F, false), "butter_rice");
		GameRegistry.registerItem(fried_rice = new ItemFoodxlfoodmod("fried_rice", 4, 0.3F, false), "fried_rice");
		GameRegistry.registerItem(pepper_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.pepper_plant, Blocks.FARMLAND, "pepper_seeds"), "pepper_seeds");
		GameRegistry.registerItem(pepper = new ItemFoodxlfoodmod("pepper", 3, 0.3F, false), "pepper");
		GameRegistry.registerItem(corn_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.corn_plant, Blocks.FARMLAND, "corn_seeds"), "corn_seeds");
		GameRegistry.registerItem(raw_corn = new ItemFoodxlfoodmod("raw_corn", 3, 0.3F, false), "raw_corn");
		GameRegistry.registerItem(corn = new ItemFoodxlfoodmod("corn", 4, 0.3F, false), "corn");
		GameRegistry.registerItem(pickle_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.pickle_plant, Blocks.FARMLAND, "pickle_seeds"), "pickle_seeds");
		GameRegistry.registerItem(pickle = new ItemFoodxlfoodmod("pickle", 3, 0.3F, false), "pickle");
		//other foods
		GameRegistry.registerItem(salt = new ItemFoodxlfoodmod("salt", 0, 0.1F, false), "salt");
		GameRegistry.registerItem(dough = new ItemFoodxlfoodmod("dough", 3, 0.3F, false), "dough");
		GameRegistry.registerItem(cooked_dough = new ItemFoodxlfoodmod("cooked_dough", 5, 0.6F, false), "cooked_dough");
		GameRegistry.registerItem(butter = new ItemFoodxlfoodmod("butter", 3, 0.3F, false), "butter");
		GameRegistry.registerItem(cheese = new ItemFoodxlfoodmod("cheese", 3, 0.3F, false), "cheese");
		GameRegistry.registerItem(cheese_puff = new ItemFoodxlfoodmod("cheese_puff", 3, 0.3F, false), "cheese_puff");
		GameRegistry.registerItem(cheesy_bread = new ItemFoodxlfoodmod("cheesy_bread", 5, 0.6F, false), "cheesy_bread");
		GameRegistry.registerItem(corn_bread = new ItemFoodxlfoodmod("corn_bread", 5, 0.6F, false), "corn_bread");
		//meat
		GameRegistry.registerItem(flesh = new ItemFoodxlfoodmod("flesh", 4, 0.8F, false), "flesh");
		GameRegistry.registerItem(sausage = new ItemFoodxlfoodmod("sausage", 5, 0.6F, false), "sausage");
		GameRegistry.registerItem(bacon = new ItemFoodxlfoodmod("bacon", 4, 0.3F, false), "bacon");
		GameRegistry.registerItem(ground_beef = new ItemFoodxlfoodmod("ground_beef", 4, 0.3F, false), "ground_beef");
		GameRegistry.registerItem(raw_chicken_wing = new ItemFoodxlfoodmod("raw_chicken_wing", 3, 0.3F, false), "raw_chicken_wing");
		GameRegistry.registerItem(cooked_chicken_wing = new ItemFoodxlfoodmod("cooked_chicken_wing", 5, 0.6F, false), "cooked_chicken_wing");
		GameRegistry.registerItem(spicy_chicken_wing = new ItemFoodxlfoodmod("spicy_chicken_wing", 5, 0.6F, false), "spicy_chicken_wing");
		//fast food
		GameRegistry.registerItem(top_bun = new ItemFoodxlfoodmod("top_bun", 3, 0.3F, false), "top_bun");
		GameRegistry.registerItem(bottom_bun = new ItemFoodxlfoodmod("bottom_bun", 3, 0.3F, false), "bottom_bun");
		GameRegistry.registerItem(hamburger = new ItemFoodxlfoodmod("hamburger", 8, 0.8F, false), "hamburger");
		GameRegistry.registerItem(cheeseburger = new ItemFoodxlfoodmod("cheeseburger", 8, 0.8F, false), "cheeseburger");
		GameRegistry.registerItem(hot_dog = new ItemFoodxlfoodmod("hot_dog", 8, 0.8F, false), "hot_dog");
		//candy
		GameRegistry.registerItem(marshmallow = new ItemFoodxlfoodmod("marshmallow", 3, 0.3F, false), "marshmallow");
		GameRegistry.registerItem(roasted_marshmallow = new ItemFoodxlfoodmod("roasted_marshmallow", 3, 0.3F, false), "roasted_marshmallow");
		GameRegistry.registerItem(oreo_cookie = new ItemFoodxlfoodmod("oreo_cookie", 4, 0.3F, false), "oreo_cookie");
		GameRegistry.registerItem(chocolate_icecream_ball = new Itemxlfoodmod("chocolate_icecream_ball"), "chocolate_icecream_ball");
		GameRegistry.registerItem(vanilla_icecream_ball = new Itemxlfoodmod("vanilla_icecream_ball"), "vanilla_icecream_ball");
		GameRegistry.registerItem(icecream_cone = new ItemFoodxlfoodmod("icecream_cone", 3, 0.3F, false), "icecream_cone");
		GameRegistry.registerItem(chocolate_icecream = new ItemFoodxlfoodmod("chocolate_icecream", 4, 0.3F, false), "chocolate_icecream");
		GameRegistry.registerItem(vanilla_icecream = new ItemFoodxlfoodmod("vanilla_icecream", 4, 0.3F, false), "vanilla_icecream");
		//pies
		GameRegistry.registerItem(pie_shell = new Itemxlfoodmod("pie_shell"), "pie_shell");
		GameRegistry.registerItem(apple_pie = new ItemFoodxlfoodmod("apple_pie", 8, 0.6F, false), "apple_pie");
		GameRegistry.registerItem(golden_apple_pie = new ItemFoodxlfoodmod("golden_apple_pie", 8, 0.6F, false), "golden_apple_pie");
		GameRegistry.registerItem(cheese_pie = new ItemFoodxlfoodmod("cheese_pie", 8, 0.6F, false), "cheese_pie");
		GameRegistry.registerItem(chicken_pot_pie = new ItemFoodxlfoodmod("chicken_pot_pie", 8, 0.6F, false), "chicken_pot_pie");
		GameRegistry.registerItem(chocolate_pie = new ItemFoodxlfoodmod("chocolate_pie", 8, 0.6F, false), "chocolate_pie");
		GameRegistry.registerItem(bacon_pie = new ItemFoodxlfoodmod("bacon_pie", 8, 0.6F, false), "bacon_pie");
		GameRegistry.registerItem(fish_pie = new ItemFoodxlfoodmod("fish_pie", 8, 0.6F, false), "fish_pie");
		
		GameRegistry.registerItem(hot_sauce = new Itemxlfoodmod("hot_sauce"), "hot_sauce");
		GameRegistry.registerItem(chocolate_syrup = new Itemxlfoodmod("chocolate_syrup"), "chocolate_syrup");
		GameRegistry.registerItem(vanilla_extract = new Itemxlfoodmod("vanilla_extract"), "vanilla_extract");
		GameRegistry.registerItem(vanilla_cream = new Itemxlfoodmod("vanilla_cream"), "vanilla_cream");
		//drinks
		GameRegistry.registerItem(empty_can = new Itemxlfoodmod("empty_can"), "empty_can");
		GameRegistry.registerItem(speedy_energy_drink = new SpeedyEnergyDrink("speedy_energy_drink", 0, 0.0F, false), "speedy_energy_drink");
		GameRegistry.registerItem(healthy_energy_drink = new HealthyEnergyDrink("healthy_energy_drink", 0, 0.0F, false), "healthy_energy_drink");
		GameRegistry.registerItem(stealthy_energy_drink = new StealthyEnergyDrink("stealthy_energy_drink", 0, 0.0F, false), "stealthy_energy_drink");
		GameRegistry.registerItem(strong_energy_drink = new StrongEnergyDrink("strong_energy_drink", 0, 0.0F, false), "strong_energy_drink");
		GameRegistry.registerItem(deadly_energy_drink = new DeadlyEnergyDrink("deadly_energy_drink", 0, 0.0F, false), "deadly_energy_drink");
		GameRegistry.registerItem(super_energy_drink = new SuperEnergyDrink("super_energy_drink", 0, 0.0F, false), "super_energy_drink");
		GameRegistry.registerItem(glass_mug = new Itemxlfoodmod("glass_mug"), "glass_mug");
		GameRegistry.registerItem(beer = new Beer("beer", 0, 0.0F, false), "beer");
	}

}
