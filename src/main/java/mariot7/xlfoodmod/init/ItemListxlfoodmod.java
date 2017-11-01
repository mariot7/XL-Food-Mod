package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.items.Beer;
import mariot7.xlfoodmod.items.BucketOfFriedChicken;
import mariot7.xlfoodmod.items.Salad;
import mariot7.xlfoodmod.items.Cappuccino;
import mariot7.xlfoodmod.items.Coffee;
import mariot7.xlfoodmod.items.DeadlyEnergyDrink;
import mariot7.xlfoodmod.items.HealthyEnergyDrink;
import mariot7.xlfoodmod.items.Onion;
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
	public static Item lettuce_seeds;
	public static Item lettuce;
	public static Item onion;
	public static Item tomato_seeds;
	public static Item tomato;
	public static Item strawberry_seeds;
	public static Item strawberry;
	//other foods
	public static Item salt;
	public static Item dough;
	public static Item cooked_dough;
	public static Item crouton;
	public static Item butter;
	public static Item cheese;
	public static Item cheese_puff;
	public static Item chips;
	public static Item salty_chips;
	public static Item spicy_chips;
	public static Item onion_rings;
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
    public static Item chickenburger;
    public static Item cheeseburger;
    public static Item hot_dog;
    public static Item tortilla;
    public static Item taco;
    public static Item burrito;
    public static Item slice_of_pizza;
    //salad
    public static Item salad_bowl;
    public static Item garden_salad;
    public static Item chicken_salad;
    public static Item caesar_salad;
    public static Item onion_salad;
    public static Item taco_salad;
    //candy etc.
    public static Item pumpkin_stew;
    public static Item marshmallow;
    public static Item roasted_marshmallow;
    public static Item oreo_cookie;
    public static Item twinkie;
    public static Item brownie;
    public static Item chocolate;
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
	
	
	public static void initItems() {
		
		//crops
		GameRegistry.register(rice_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.rice_plant, Blocks.FARMLAND, "rice_seeds"));
		GameRegistry.register(rice = new ItemFoodxlfoodmod("rice", 1, 0.6F, false));
		GameRegistry.register(butter_rice = new ItemFoodxlfoodmod("butter_rice", 4, 2.0F, false));
		GameRegistry.register(fried_rice = new ItemFoodxlfoodmod("fried_rice", 3, 1.8F, false));
		GameRegistry.register(pepper_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.pepper_plant, Blocks.FARMLAND, "pepper_seeds"));
		GameRegistry.register(pepper = new ItemFoodxlfoodmod("pepper", 1, 0.6F, false));
		GameRegistry.register(corn_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.corn_plant, Blocks.FARMLAND, "corn_seeds"));
		GameRegistry.register(raw_corn = new ItemFoodxlfoodmod("raw_corn", 1, 0.6F, false));
		GameRegistry.register(corn = new ItemFoodxlfoodmod("corn", 3, 1.8F, false));
		GameRegistry.register(cucumber_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.cucumber_plant, Blocks.FARMLAND, "cucumber_seeds"));
		GameRegistry.register(cucumber = new ItemFoodxlfoodmod("cucumber", 1, 0.6F, false));
		GameRegistry.register(lettuce_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.lettuce_plant, Blocks.FARMLAND, "lettuce_seeds"));
		GameRegistry.register(lettuce = new ItemFoodxlfoodmod("lettuce", 1, 0.6F, false));
		GameRegistry.register(onion = new Onion(1, 0.6F, BlockListxlfoodmod.onion_plant, Blocks.FARMLAND));
		GameRegistry.register(tomato_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.tomato_plant, Blocks.FARMLAND, "tomato_seeds"));
		GameRegistry.register(tomato = new ItemFoodxlfoodmod("tomato", 1, 0.6F, false));
		GameRegistry.register(strawberry_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.strawberry_plant, Blocks.FARMLAND, "strawberry_seeds"));
		GameRegistry.register(strawberry = new ItemFoodxlfoodmod("strawberry", 1, 0.6F, false));
		//other foods
		GameRegistry.register(salt = new ItemFoodxlfoodmod("salt", 0, 0.1F, false));
		OreDictionary.registerOre("itemSalt", salt);
		OreDictionary.registerOre("dustSalt", salt);
		GameRegistry.register(dough = new ItemFoodxlfoodmod("dough", 1, 0.6F, false));
		GameRegistry.register(cooked_dough = new ItemFoodxlfoodmod("cooked_dough", 2, 1.2F, false));
		GameRegistry.register(crouton = new ItemFoodxlfoodmod("crouton", 1, 1.5F, false));
		GameRegistry.register(butter = new ItemFoodxlfoodmod("butter", 1, 0.3F, false));
		GameRegistry.register(cheese = new ItemFoodxlfoodmod("cheese", 1, 0.4F, false));
		GameRegistry.register(cheese_puff = new ItemFoodxlfoodmod("cheese_puff", 1, 0.6F, false));
		GameRegistry.register(chips = new ItemFoodxlfoodmod("chips", 1, 4.8F, false));
		GameRegistry.register(salty_chips = new ItemFoodxlfoodmod("salty_chips", 1, 5.0F, false));
		GameRegistry.register(spicy_chips = new ItemFoodxlfoodmod("spicy_chips", 1, 6.0F, false));
		GameRegistry.register(onion_rings = new ItemFoodxlfoodmod("onion_rings", 2, 7.0F, false));
		GameRegistry.register(cheesy_bread = new ItemFoodxlfoodmod("cheesy_bread", 6, 6.4F, false));
		GameRegistry.register(corn_bread = new ItemFoodxlfoodmod("corn_bread", 8, 7.8F, false));
		GameRegistry.register(fried_egg = new ItemFoodxlfoodmod("fried_egg", 3, 3.0F, false));
		GameRegistry.register(pancake = new ItemFoodxlfoodmod("pancake", 5, 3.6F, false));
		GameRegistry.register(waffle = new ItemFoodxlfoodmod("waffle", 5, 4.8F, false));
		//meat
		GameRegistry.register(flesh = new ItemFoodxlfoodmod("flesh", 4, 1.2F, false));
		GameRegistry.register(sausage = new ItemFoodxlfoodmod("sausage", 3, 4.2F, false));
		GameRegistry.register(bacon = new ItemFoodxlfoodmod("bacon", 3, 13.0F, false));
		GameRegistry.register(ground_beef = new ItemFoodxlfoodmod("ground_beef", 4, 6.4F, false));
	    GameRegistry.register(raw_chicken_wing = new ItemFoodxlfoodmod("raw_chicken_wing", 1, 0.6F, false));
		GameRegistry.register(cooked_chicken_wing = new ItemFoodxlfoodmod("cooked_chicken_wing", 3, 3.6F, false));
		GameRegistry.register(spicy_chicken_wing = new ItemFoodxlfoodmod("spicy_chicken_wing", 3, 4.0F, false));
		GameRegistry.register(bucket_of_fried_chicken = new BucketOfFriedChicken("bucket_of_fried_chicken", 6, 7.2F, false));
		//fast food
		GameRegistry.register(top_bun = new ItemFoodxlfoodmod("top_bun", 4, 3.0F, false));
		GameRegistry.register(bottom_bun = new ItemFoodxlfoodmod("bottom_bun", 4, 3.0F, false));
		GameRegistry.register(hamburger = new ItemFoodxlfoodmod("hamburger", 9, 14.6F, false));
		GameRegistry.register(chickenburger = new ItemFoodxlfoodmod("chickenburger", 9, 6.6F, false));
		GameRegistry.register(cheeseburger = new ItemFoodxlfoodmod("cheeseburger", 10, 15.0F, false));
		GameRegistry.register(hot_dog = new ItemFoodxlfoodmod("hot_dog", 8, 10.0F, false));
		GameRegistry.register(tortilla = new ItemFoodxlfoodmod("tortilla", 4, 3.0F, false));
		GameRegistry.register(taco = new ItemFoodxlfoodmod("taco", 7, 9.4F, false));
		GameRegistry.register(burrito = new ItemFoodxlfoodmod("burrito", 7, 9.0F, false));
		GameRegistry.register(slice_of_pizza = new ItemFoodxlfoodmod("slice_of_pizza", 7, 1.4F, false));
		//salad
		GameRegistry.register(salad_bowl = new Itemxlfoodmod("salad_bowl"));
		GameRegistry.register(garden_salad = new Salad("garden_salad", 5, 5.8F, false));
		GameRegistry.register(chicken_salad = new Salad("chicken_salad", 8, 10F, false));
		GameRegistry.register(caesar_salad = new Salad("caesar_salad", 6, 7.4F, false));
		GameRegistry.register(onion_salad = new Salad("onion_salad", 4, 5.0F, false));
		GameRegistry.register(taco_salad = new Salad("taco_salad", 10, 12F, false));
		//candy etc.
		GameRegistry.register(pumpkin_stew = new ItemFoodxlfoodmod("pumpkin_stew", 6, 9.5F, false));
		GameRegistry.register(marshmallow = new ItemFoodxlfoodmod("marshmallow", 1, 0.6F, false));
		GameRegistry.register(roasted_marshmallow = new ItemFoodxlfoodmod("roasted_marshmallow", 2, 1.2F, false));
		GameRegistry.register(oreo_cookie = new ItemFoodxlfoodmod("oreo_cookie", 3, 3.4F, false));
		GameRegistry.register(twinkie = new ItemFoodxlfoodmod("twinkie", 4, 3.6F, false));
		GameRegistry.register(brownie = new ItemFoodxlfoodmod("brownie", 3, 2.8F, false));
		GameRegistry.register(chocolate = new ItemFoodxlfoodmod("chocolate", 1, 0.8F, false));
		GameRegistry.register(chocolate_icecream_ball = new Itemxlfoodmod("chocolate_icecream_ball"));
		GameRegistry.register(vanilla_icecream_ball = new Itemxlfoodmod("vanilla_icecream_ball"));
	    GameRegistry.register(strawberry_icecream_ball = new Itemxlfoodmod("strawberry_icecream_ball"));
		GameRegistry.register(icecream_cone = new ItemFoodxlfoodmod("icecream_cone", 3, 4.8F, false));
		GameRegistry.register(chocolate_icecream = new ItemFoodxlfoodmod("chocolate_icecream", 4, 5.8F, false));
		GameRegistry.register(vanilla_icecream = new ItemFoodxlfoodmod("vanilla_icecream", 4, 5.8F, false));
		GameRegistry.register(strawberry_icecream = new ItemFoodxlfoodmod("strawberry_icecream", 4, 5.8F, false));
		GameRegistry.register(crescent_roll = new ItemFoodxlfoodmod("crescent_roll", 6, 3.6F, false));
		GameRegistry.register(donut = new ItemFoodxlfoodmod("donut", 4, 4.8F, false));
		GameRegistry.register(sugar_donut = new ItemFoodxlfoodmod("sugar_donut", 4, 5.0F, false));
		GameRegistry.register(chocolate_donut = new ItemFoodxlfoodmod("chocolate_donut", 4, 5.8F, false));
		//pies
		GameRegistry.register(pie_shell = new Itemxlfoodmod("pie_shell"));
		GameRegistry.register(apple_pie = new ItemFoodxlfoodmod("apple_pie", 8, 4.8F, false));
		GameRegistry.register(golden_apple_pie = new ItemFoodxlfoodmod("golden_apple_pie", 8, 5.8F, false));
		GameRegistry.register(cheese_pie = new ItemFoodxlfoodmod("cheese_pie", 8, 4.8F, false));
		GameRegistry.register(chicken_pot_pie = new ItemFoodxlfoodmod("chicken_pot_pie", 8, 5.8F, false));
		GameRegistry.register(chocolate_pie = new ItemFoodxlfoodmod("chocolate_pie", 8, 4.8F, false));
		GameRegistry.register(bacon_pie = new ItemFoodxlfoodmod("bacon_pie", 8, 5.8F, false));
		GameRegistry.register(fish_pie = new ItemFoodxlfoodmod("fish_pie", 8, 4.8F, false));
		GameRegistry.register(strawberry_pie = new ItemFoodxlfoodmod("strawberry_pie", 8, 4.8F, false));
		//sauces
		GameRegistry.register(hot_sauce = new Itemxlfoodmod("hot_sauce"));
		GameRegistry.register(chocolate_syrup = new Itemxlfoodmod("chocolate_syrup"));
		GameRegistry.register(vanilla_extract = new Itemxlfoodmod("vanilla_extract"));
		GameRegistry.register(vanilla_cream = new Itemxlfoodmod("vanilla_cream"));
		//drinks
		GameRegistry.register(empty_can = new Itemxlfoodmod("empty_can"));
		GameRegistry.register(speedy_energy_drink = new SpeedyEnergyDrink("speedy_energy_drink", 0, 0.0F, false));
		GameRegistry.register(healthy_energy_drink = new HealthyEnergyDrink("healthy_energy_drink", 0, 0.0F, false));
		GameRegistry.register(stealthy_energy_drink = new StealthyEnergyDrink("stealthy_energy_drink", 0, 0.0F, false));
		GameRegistry.register(strong_energy_drink = new StrongEnergyDrink("strong_energy_drink", 0, 0.0F, false));
		GameRegistry.register(deadly_energy_drink = new DeadlyEnergyDrink("deadly_energy_drink", 0, 0.0F, false));
		GameRegistry.register(super_energy_drink = new SuperEnergyDrink("super_energy_drink", 0, 0.0F, false));
		GameRegistry.register(glass_mug = new Itemxlfoodmod("glass_mug"));
		GameRegistry.register(beer = new Beer("beer", 1, 1.5F, false));
		GameRegistry.register(coffee_cup = new Itemxlfoodmod("coffee_cup"));
		GameRegistry.register(coffee = new Coffee("coffee", 1, 0.5F, false));
		GameRegistry.register(cappuccino = new Cappuccino("cappuccino", 2, 0.5F, false));
		
	}

	
}
