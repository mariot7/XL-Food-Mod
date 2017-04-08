package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.items.Beer;
import mariot7.xlfoodmod.items.BucketOfFriedChicken;
import mariot7.xlfoodmod.items.Cappuccino;
import mariot7.xlfoodmod.items.Coffee;
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
import net.minecraftforge.oredict.OreDictionary;

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
	public static Item cucumber_seeds;
	public static Item cucumber;
	public static Item tomato_seeds;
	public static Item tomato;
	public static Item strawberry_seeds;
	public static Item strawberry;
	//other foods
	public static Item salt;
	public static Item dough;
	public static Item cooked_dough;
	public static Item butter;
	public static Item cheese;
	public static Item cheese_puff;
	public static Item chips;
	public static Item salty_chips;
	public static Item spicy_chips;
    public static Item cheesy_bread;
    public static Item corn_bread;
    public static Item fried_egg;
    public static Item pancake;
    public static Item waffle;
    //meat
    public static Item flesh;
    public static Item sausage;
    public static Item bacon;
    public static Item ground_beef;
    public static Item raw_chicken_wing;
    public static Item cooked_chicken_wing;
    public static Item spicy_chicken_wing;
    public static Item bucket_of_fried_chicken;
    //fast food
    public static Item top_bun;
    public static Item bottom_bun;
    public static Item hamburger;
    public static Item cheeseburger;
    public static Item hot_dog;
    public static Item tortilla;
    public static Item taco;
    public static Item burrito;
    public static Item slice_of_pizza;
    //candy etc.
    public static Item marshmallow;
    public static Item roasted_marshmallow;
    public static Item oreo_cookie;
    public static Item brownie;
    public static Item chocolate_icecream_ball;
    public static Item vanilla_icecream_ball;
    public static Item strawberry_icecream_ball;
    public static Item icecream_cone;
    public static Item chocolate_icecream;
    public static Item vanilla_icecream;
    public static Item strawberry_icecream;
    public static Item crescent_roll;
    public static Item donut;
    public static Item sugar_donut;
    public static Item chocolate_donut;
    //pies
    public static Item pie_shell;
    public static Item apple_pie;
    public static Item golden_apple_pie;
    public static Item cheese_pie;
    public static Item chicken_pot_pie;
    public static Item chocolate_pie;
    public static Item bacon_pie;
    public static Item fish_pie;
    public static Item strawberry_pie;
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
	public static Item coffee_cup;
	public static Item coffee;
	public static Item cappuccino;
	
	
	public static void initItems(){
		//crops
		GameRegistry.registerItem(rice_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.rice_plant, Blocks.FARMLAND, "rice_seeds"), "rice_seeds");
		GameRegistry.registerItem(rice = new ItemFoodxlfoodmod("rice", 1, 0.3F, false), "rice");
		GameRegistry.registerItem(butter_rice = new ItemFoodxlfoodmod("butter_rice", 3, 0.3F, false), "butter_rice");
		GameRegistry.registerItem(fried_rice = new ItemFoodxlfoodmod("fried_rice", 4, 0.3F, false), "fried_rice");
		GameRegistry.registerItem(pepper_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.pepper_plant, Blocks.FARMLAND, "pepper_seeds"), "pepper_seeds");
		GameRegistry.registerItem(pepper = new ItemFoodxlfoodmod("pepper", 1, 0.3F, false), "pepper");
		GameRegistry.registerItem(corn_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.corn_plant, Blocks.FARMLAND, "corn_seeds"), "corn_seeds");
		GameRegistry.registerItem(raw_corn = new ItemFoodxlfoodmod("raw_corn", 1, 0.3F, false), "raw_corn");
		GameRegistry.registerItem(corn = new ItemFoodxlfoodmod("corn", 4, 0.4F, false), "corn");
		GameRegistry.registerItem(cucumber_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.cucumber_plant, Blocks.FARMLAND, "cucumber_seeds"), "cucumber_seeds");
		GameRegistry.registerItem(cucumber = new ItemFoodxlfoodmod("cucumber", 1, 0.3F, false), "cucumber");
		GameRegistry.registerItem(tomato_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.tomato_plant, Blocks.FARMLAND, "tomato_seeds"), "tomato_seeds");
		GameRegistry.registerItem(tomato = new ItemFoodxlfoodmod("tomato", 1, 0.3F, false), "tomato");
		GameRegistry.registerItem(strawberry_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.strawberry_plant, Blocks.FARMLAND, "strawberry_seeds"), "strawberry_seeds");
		GameRegistry.registerItem(strawberry = new ItemFoodxlfoodmod("strawberry", 1, 0.3F, false), "strawberry");
		//other foods
		GameRegistry.registerItem(salt = new ItemFoodxlfoodmod("salt", 0, 0.1F, false), "salt");
		OreDictionary.registerOre("itemSalt", salt);
		OreDictionary.registerOre("dustSalt", salt);
		GameRegistry.registerItem(dough = new ItemFoodxlfoodmod("dough", 3, 0.3F, false), "dough");
		GameRegistry.registerItem(cooked_dough = new ItemFoodxlfoodmod("cooked_dough", 5, 0.6F, false), "cooked_dough");
		GameRegistry.registerItem(butter = new ItemFoodxlfoodmod("butter", 3, 0.3F, false), "butter");
		GameRegistry.registerItem(cheese = new ItemFoodxlfoodmod("cheese", 3, 0.3F, false), "cheese");
		GameRegistry.registerItem(cheese_puff = new ItemFoodxlfoodmod("cheese_puff", 4, 0.4F, false), "cheese_puff");
		GameRegistry.registerItem(chips = new ItemFoodxlfoodmod("chips", 4, 0.4F, false), "chips");
		GameRegistry.registerItem(salty_chips = new ItemFoodxlfoodmod("salty_chips", 4, 0.5F, false), "salty_chips");
		GameRegistry.registerItem(spicy_chips = new ItemFoodxlfoodmod("spicy_chips", 4, 0.6F, false), "spicy_chips");
		GameRegistry.registerItem(cheesy_bread = new ItemFoodxlfoodmod("cheesy_bread", 5, 1.2F, false), "cheesy_bread");
		GameRegistry.registerItem(corn_bread = new ItemFoodxlfoodmod("corn_bread", 5, 1.2F, false), "corn_bread");
		GameRegistry.registerItem(fried_egg = new ItemFoodxlfoodmod("fried_egg", 5, 0.6F, false), "fried_egg");
		GameRegistry.registerItem(pancake = new ItemFoodxlfoodmod("pancake", 5, 0.6F, false), "pancake");
		GameRegistry.registerItem(waffle = new ItemFoodxlfoodmod("waffle", 4, 0.3F, false), "waffle");
		//meat
		GameRegistry.registerItem(flesh = new ItemFoodxlfoodmod("flesh", 3, 0.2F, false), "flesh");
		GameRegistry.registerItem(sausage = new ItemFoodxlfoodmod("sausage", 5, 0.6F, false), "sausage");
		GameRegistry.registerItem(bacon = new ItemFoodxlfoodmod("bacon", 4, 0.6F, false), "bacon");
		GameRegistry.registerItem(ground_beef = new ItemFoodxlfoodmod("ground_beef", 4, 0.3F, false), "ground_beef");
	    GameRegistry.registerItem(raw_chicken_wing = new ItemFoodxlfoodmod("raw_chicken_wing", 3, 0.6F, false), "raw_chicken_wing");
		GameRegistry.registerItem(cooked_chicken_wing = new ItemFoodxlfoodmod("cooked_chicken_wing", 5, 1.2F, false), "cooked_chicken_wing");
		GameRegistry.registerItem(spicy_chicken_wing = new ItemFoodxlfoodmod("spicy_chicken_wing", 5, 1.3F, false), "spicy_chicken_wing");
		GameRegistry.registerItem(bucket_of_fried_chicken = new BucketOfFriedChicken("bucket_of_fried_chicken", 6, 1.2F, false), "bucket_of_fried_chicken");
		//fast food
		GameRegistry.registerItem(top_bun = new ItemFoodxlfoodmod("top_bun", 2, 0.2F, false), "top_bun");
		GameRegistry.registerItem(bottom_bun = new ItemFoodxlfoodmod("bottom_bun", 2, 0.2F, false), "bottom_bun");
		GameRegistry.registerItem(hamburger = new ItemFoodxlfoodmod("hamburger", 8, 0.8F, false), "hamburger");
		GameRegistry.registerItem(cheeseburger = new ItemFoodxlfoodmod("cheeseburger", 8, 0.8F, false), "cheeseburger");
		GameRegistry.registerItem(hot_dog = new ItemFoodxlfoodmod("hot_dog", 8, 0.8F, false), "hot_dog");
		GameRegistry.registerItem(tortilla = new ItemFoodxlfoodmod("tortilla", 3, 0.3F, false), "tortilla");
		GameRegistry.registerItem(taco = new ItemFoodxlfoodmod("taco", 8, 0.8F, false), "taco");
		GameRegistry.registerItem(burrito = new ItemFoodxlfoodmod("burrito", 8, 0.8F, false), "burrito");
		GameRegistry.registerItem(slice_of_pizza = new ItemFoodxlfoodmod("slice_of_pizza", 8, 0.8F, false), "slice_of_pizza");
		//candy etc.
		GameRegistry.registerItem(marshmallow = new ItemFoodxlfoodmod("marshmallow", 3, 0.3F, false), "marshmallow");
		GameRegistry.registerItem(roasted_marshmallow = new ItemFoodxlfoodmod("roasted_marshmallow", 3, 0.3F, false), "roasted_marshmallow");
		GameRegistry.registerItem(oreo_cookie = new ItemFoodxlfoodmod("oreo_cookie", 4, 0.3F, false), "oreo_cookie");
		GameRegistry.registerItem(brownie = new ItemFoodxlfoodmod("brownie", 4, 0.3F, false), "brownie");
		GameRegistry.registerItem(chocolate_icecream_ball = new Itemxlfoodmod("chocolate_icecream_ball"), "chocolate_icecream_ball");
		GameRegistry.registerItem(vanilla_icecream_ball = new Itemxlfoodmod("vanilla_icecream_ball"), "vanilla_icecream_ball");
	    GameRegistry.registerItem(strawberry_icecream_ball = new Itemxlfoodmod("strawberry_icecream_ball"), "strawberry_icecream_ball");
		GameRegistry.registerItem(icecream_cone = new ItemFoodxlfoodmod("icecream_cone", 3, 0.3F, false), "icecream_cone");
		GameRegistry.registerItem(chocolate_icecream = new ItemFoodxlfoodmod("chocolate_icecream", 4, 0.3F, false), "chocolate_icecream");
		GameRegistry.registerItem(vanilla_icecream = new ItemFoodxlfoodmod("vanilla_icecream", 4, 0.3F, false), "vanilla_icecream");
		GameRegistry.registerItem(strawberry_icecream = new ItemFoodxlfoodmod("strawberry_icecream", 4, 0.3F, false), "strawberry_icecream");
		GameRegistry.registerItem(crescent_roll = new ItemFoodxlfoodmod("crescent_roll", 4, 0.3F, false), "crescent_roll");
		GameRegistry.registerItem(donut = new ItemFoodxlfoodmod("donut", 4, 0.3F, false), "donut");
		GameRegistry.registerItem(sugar_donut = new ItemFoodxlfoodmod("sugar_donut", 4, 0.4F, false), "sugar_donut");
		GameRegistry.registerItem(chocolate_donut = new ItemFoodxlfoodmod("chocolate_donut", 4, 0.4F, false), "chocolate_donut");
		//pies
		GameRegistry.registerItem(pie_shell = new Itemxlfoodmod("pie_shell"), "pie_shell");
		GameRegistry.registerItem(apple_pie = new ItemFoodxlfoodmod("apple_pie", 8, 0.6F, false), "apple_pie");
		GameRegistry.registerItem(golden_apple_pie = new ItemFoodxlfoodmod("golden_apple_pie", 8, 0.6F, false), "golden_apple_pie");
		GameRegistry.registerItem(cheese_pie = new ItemFoodxlfoodmod("cheese_pie", 8, 0.6F, false), "cheese_pie");
		GameRegistry.registerItem(chicken_pot_pie = new ItemFoodxlfoodmod("chicken_pot_pie", 8, 0.6F, false), "chicken_pot_pie");
		GameRegistry.registerItem(chocolate_pie = new ItemFoodxlfoodmod("chocolate_pie", 8, 0.6F, false), "chocolate_pie");
		GameRegistry.registerItem(bacon_pie = new ItemFoodxlfoodmod("bacon_pie", 8, 0.6F, false), "bacon_pie");
		GameRegistry.registerItem(fish_pie = new ItemFoodxlfoodmod("fish_pie", 8, 0.6F, false), "fish_pie");
		GameRegistry.registerItem(strawberry_pie = new ItemFoodxlfoodmod("strawberry_pie", 8, 0.6F, false), "strawberry_pie");
		//sauces
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
		GameRegistry.registerItem(beer = new Beer("beer", 2, 0.2F, false), "beer");
		GameRegistry.registerItem(coffee_cup = new Itemxlfoodmod("coffee_cup"), "coffee_cup");
		GameRegistry.registerItem(coffee = new Coffee("coffee", 0, 0.1F, false), "coffee");
		GameRegistry.registerItem(cappuccino = new Cappuccino("cappuccino", 1, 0.1F, false), "cappuccino");
	}

}
