package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.items.BeerItem;
import mariot7.xlfoodmod.items.BowlItem;
import mariot7.xlfoodmod.items.BucketOfFriedChickenItem;
import mariot7.xlfoodmod.items.CappucinoItem;
import mariot7.xlfoodmod.items.CoffeeItem;
import mariot7.xlfoodmod.items.DeadlyEnergyDrinkItem;
import mariot7.xlfoodmod.items.HealthyEnergyDrinkItem;
import mariot7.xlfoodmod.items.SpeedyEnergyDrinkItem;
import mariot7.xlfoodmod.items.StealthyEnergyDrinkItem;
import mariot7.xlfoodmod.items.StrongEnergyDrinkItem;
import mariot7.xlfoodmod.items.SuperEnergyDrinkItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class ItemListXL {
	
	public static BlockItem ROCK_SALT = new BlockItemXL(BlockListXL.ROCK_SALT);
	public static BlockItem GRASS = new BlockItemXL(BlockListXL.GRASS);
	public static BlockItem VANILLA_FLOWER = new BlockItemXL(BlockListXL.VANILLA_FLOWER);
	public static BlockItem RICE_PLANT = new BlockItemXL(BlockListXL.RICE_PLANT);
	public static BlockItem PEPPER_PLANT = new BlockItemXL(BlockListXL.PEPPER_PLANT);
	public static BlockItem CORN_PLANT = new BlockItemXL(BlockListXL.CORN_PLANT);
	public static BlockItem CUCUMBER_PLANT = new BlockItemXL(BlockListXL.CUCUMBER_PLANT);
	public static BlockItem LETTUCE_PLANT = new BlockItemXL(BlockListXL.LETTUCE_PLANT);
	public static BlockItem ONION_PLANT = new BlockItemXL(BlockListXL.ONION_PLANT);
	public static BlockItem TOMATO_PLANT = new BlockItemXL(BlockListXL.TOMATO_PLANT);
	public static BlockItem STRAWBERRY_PLANT = new BlockItemXL(BlockListXL.STRAWBERRY_PLANT);
	public static BlockItem CHOCOLATE_CAKE = new BlockItemXL(BlockListXL.CHOCOLATE_CAKE);
	public static BlockItem CHOCOLATE_COOKIE_CAKE = new BlockItemXL(BlockListXL.CHOCOLATE_COOKIE_CAKE);
	public static BlockItem CHEESE_CAKE = new BlockItemXL(BlockListXL.CHEESE_CAKE);
	public static BlockItem NETHER_CAKE = new BlockItemXL(BlockListXL.NETHER_CAKE);
	public static BlockItem STRAWBERRY_CAKE = new BlockItemXL(BlockListXL.STRAWBERRY_CAKE);
	public static BlockItem PUMPKIN_CAKE = new BlockItemXL(BlockListXL.PUMPKIN_CAKE);
	public static BlockItem PIZZA = new BlockItemXL(BlockListXL.PIZZA);
	
	public static Item RICE = new ItemSeedFoodXL("rice", BlockListXL.RICE_PLANT, 1, 0.6F);
	public static Item BUTTER_RICE = new ItemFoodXL("butter_rice", 4, 0.6F);
	public static Item FRIED_RICE = new ItemFoodXL("fried_rice", 3, 0.6F);
	public static Item PEPPER_SEEDS = new ItemSeedsXL("pepper_seeds", BlockListXL.PEPPER_PLANT);
	public static Item PEPPER = new ItemFoodXL("pepper", 1, 0.6F);
	public static Item CORN_SEEDS = new ItemSeedsXL("corn_seeds", BlockListXL.CORN_PLANT);
	public static Item RAW_CORN = new ItemFoodXL("raw_corn", 1, 0.6F);
	public static Item CORN = new ItemFoodXL("corn", 1, 0.6F);
	public static Item CUCUMBER_SEEDS = new ItemSeedsXL("cucumber_seeds", BlockListXL.CUCUMBER_PLANT);
	public static Item CUCUMBER = new ItemFoodXL("cucumber", 1, 0.6F);
	public static Item LETTUCE_SEEDS = new ItemSeedsXL("lettuce_seeds", BlockListXL.LETTUCE_PLANT);
	public static Item LETTUCE = new ItemFoodXL("lettuce", 1, 0.6F);
	public static Item ONION = new ItemSeedFoodXL("onion", BlockListXL.ONION_PLANT, 1, 0.6F);
	public static Item TOMATO_SEEDS = new ItemSeedsXL("tomato_seeds", BlockListXL.TOMATO_PLANT);
	public static Item TOMATO = new ItemFoodXL("tomato", 1, 0.6F);
	public static Item STRAWBERRY_SEEDS = new ItemSeedsXL("strawberry_seeds", BlockListXL.STRAWBERRY_PLANT);
	public static Item STRAWBERRY = new ItemFoodXL("strawberry", 1, 0.6F);
	
	public static Item SALT = new ItemFoodXL("salt", 0, 0.2F);
	public static Item DOUGH = new ItemFoodXL("dough", 1, 0.6F);
	public static Item COOKED_DOUGH = new ItemFoodXL("cooked_dough", 2, 1.2F);
	public static Item CROUTON = new ItemFoodXL("crouton", 1, 1.2F);
	public static Item BUTTER = new ItemFoodXL("butter", 1, 0.6F);
	public static Item CHEESE = new ItemFoodXL("cheese", 1, 0.6F);
	public static Item CHEESE_PUFF = new ItemFoodXL("cheese_puff", 1, 0.6F);
	public static Item CHIPS = new ItemFoodXL("chips", 1, 0.6F);
	public static Item SALTY_CHIPS = new ItemFoodXL("salty_chips", 1, 1.2F);
	public static Item SPICY_CHIPS = new ItemFoodXL("spicy_chips", 1, 1.2F);
	public static Item ONION_RINGS = new ItemFoodXL("onion_rings", 2, 1.2F);
	public static Item CHEESY_BREAD = new ItemFoodXL("cheesy_bread", 6, 0.6F);
	public static Item POTATO_BREAD = new ItemFoodXL("potato_bread", 6, 0.6F);
	public static Item CORN_BREAD = new ItemFoodXL("corn_bread", 8, 0.6F);
	public static Item RICE_BREAD = new ItemFoodXL("rice_bread", 5, 0.6F);
	public static Item BAGUETTE = new ItemFoodXL("baguette", 5, 0.6F);
	public static Item FRIED_EGG = new ItemFoodXL("fried_egg", 3, 0.6F);
	public static Item PANCAKE = new ItemFoodXL("pancake", 5, 0.6F);
	public static Item WAFFLE = new ItemFoodXL("waffle", 5, 0.6F);
	public static Item MACARONI_AND_CHEESE = new BowlItem("macaroni_and_cheese", 9, 0.6F);
	
	public static Item SPAGHETTI = new BowlItem("spaghetti", 9, 0.6F);
	public static Item ENCHILADA = new ItemFoodXL("enchilada", 9, 0.6F);
	public static Item LASAGNE = new ItemFoodXL("lasagne", 12, 0.6F);
	public static Item JAMBON_BEURRE = new ItemFoodXL("jambon_beurre", 15, 0.4F);
	
	public static Item FLESH = new ItemFoodXL("flesh", 4, 0.2F);
	public static Item HAM = new ItemFoodXL("ham", 4, 0.6F);
	public static Item SAUSAGE = new ItemFoodXL("sausage", 3, 1.2F);
	public static Item BACON = new ItemFoodXL("bacon", 3, 1.2F);
	public static Item BEEF_JERKY = new ItemFoodXL("beef_jerky", 3, 0.6F);
	public static Item GROUND_BEEF = new ItemFoodXL("ground_beef", 4, 1.2F);
	public static Item RAW_CHICKEN_WING = new ItemFoodXL("raw_chicken_wing", 1, 0.6F);
	public static Item COOKED_CHICKEN_WING = new ItemFoodXL("cooked_chicken_wing", 4, 1.2F);
	public static Item SPICY_CHICKEN_WING = new ItemFoodXL("spicy_chicken_wing", 4, 1.4F);
	public static Item BUCKET_OF_FRIED_CHICKEN = new BucketOfFriedChickenItem("bucket_of_fried_chicken", 6, 0.6F);
	
	public static Item TOP_BUN = new ItemFoodXL("top_bun", 4, 0.6F);
	public static Item BOTTOM_BUN = new ItemFoodXL("bottom_bun", 4, 0.6F);
	public static Item HAMBURGER = new ItemFoodXL("hamburger", 9, 0.6F);
	public static Item CHICKENBURGER = new ItemFoodXL("chickenburger", 9, 0.6F);
	public static Item CHEESEBURGER = new ItemFoodXL("cheeseburger", 10, 0.6F);
	public static Item HOT_DOG = new ItemFoodXL("hot_dog", 8, 0.6F);
	public static Item SAUSAGE_ROLL = new ItemFoodXL("sausage_roll", 7, 0.6F);
	public static Item SLICE_OF_PIZZA = new ItemFoodXL("slice_of_pizza", 7, 0.6F);
	public static Item TORTILLA = new ItemFoodXL("tortilla", 4, 0.6F);
	public static Item TACO = new ItemFoodXL("taco", 7, 0.6F);
	public static Item BURRITO = new ItemFoodXL("burrito", 7, 0.6F);
	public static Item KEBAB = new ItemFoodXL("kebab", 12, 0.4F);
	
	public static Item CHICKEN_SANDWICH = new ItemFoodXL("chicken_sandwich", 10, 0.6F);
	public static Item BLT_SANDWICH = new ItemFoodXL("blt_sandwich", 12, 0.4F);
	public static Item BREAKFAST_SANDWICH = new ItemFoodXL("breakfast_sandwich", 8, 0.6F);
	public static Item GRILLED_CHEESE_SANDWICH = new ItemFoodXL("grilled_cheese_sandwich", 11, 0.4F);
	public static Item ICE_CREAM_SANDWICH = new ItemFoodXL("ice_cream_sandwich", 6, 0.6F);
	
	public static Item OSHIZUSHI = new ItemFoodXL("oshizushi", 12, 0.2F);
	
	public static Item BOWL = new ItemXL("bowl");
	public static Item GARDEN_SALAD = new BowlItem("garden_salad", 5, 0.6F);
	public static Item CHICKEN_SALAD = new BowlItem("chicken_salad", 8, 0.6F);
	public static Item CAESAR_SALAD = new BowlItem("caesar_salad", 6, 0.6F);
	public static Item ONION_SALAD = new BowlItem("onion_salad", 4, 0.6F);
	public static Item TACO_SALAD = new BowlItem("taco_salad", 10, 0.6F);
	
	public static Item CUCUMBER_SOUP = new BowlItem("cucumber_soup", 6, 0.6F);
	public static Item TOMATO_SOUP = new BowlItem("tomato_soup", 3, 0.6F);
	public static Item VEGETABLE_SOUP = new BowlItem("vegetable_soup", 8, 0.6F);
	public static Item CHICKEN_SOUP = new BowlItem("chicken_soup", 10, 0.6F);
	public static Item BEEF_STEW = new BowlItem("beef_stew", 12, 0.6F);
	public static Item PUMPKIN_STEW = new ItemFoodXL("pumpkin_stew", 6, 0.6F);
	
	public static Item CARAMEL_APPLE = new ItemFoodXL("caramel_apple", 6, 0.6F);
	public static Item MARSHMALLOW = new ItemFoodXL("marshmallow", 1, 0.6F);
	public static Item ROASTED_MARSHMALLOW = new ItemFoodXL("roasted_marshmallow", 2, 0.6F);
	public static Item CHOCOLATE_COOKIE = new ItemFoodXL("chocolate_cookie", 3, 0.6F);
	public static Item VANILLA_COOKIE = new ItemFoodXL("vanilla_cookie", 4, 0.6F);
	public static Item BROWNIE = new ItemFoodXL("brownie", 3, 0.6F);
	public static Item BOURBON_BISCUIT = new ItemFoodXL("bourbon_biscuit", 3, 0.6F);
	public static Item CHOCOLATE = new ItemFoodXL("chocolate", 1, 0.6F);
	public static Item CHOCOLATE_ICE_CREAM_BALL = new ItemXL("chocolate_ice_cream_ball");
	public static Item VANILLA_ICE_CREAM_BALL = new ItemXL("vanilla_ice_cream_ball");
	public static Item STRAWBERRY_ICE_CREAM_BALL = new ItemXL("strawberry_ice_cream_ball");
	public static Item ICE_CREAM_CONE = new ItemFoodXL("ice_cream_cone", 3, 1.2F);
	public static Item CHOCOLATE_ICE_CREAM = new ItemFoodXL("chocolate_ice_cream", 4, 0.6F);
	public static Item VANILLA_ICE_CREAM = new ItemFoodXL("vanilla_ice_cream", 4, 0.6F);
	public static Item STRAWBERRY_ICE_CREAM = new ItemFoodXL("strawberry_ice_cream", 4, 0.6F);
	public static Item CRESCENT_ROLL = new ItemFoodXL("crescent_roll", 6, 0.6F);
	public static Item DONUT = new ItemFoodXL("donut", 4, 0.6F);
	public static Item SUGAR_DONUT = new ItemFoodXL("sugar_donut", 5, 0.6F);
	public static Item CHOCOLATE_DONUT = new ItemFoodXL("chocolate_donut", 5, 0.6F);
	public static Item VANILLA_DONUT = new ItemFoodXL("vanilla_donut", 5, 0.6F);
	
	public static Item PAPER_CUP = new ItemXL("paper_cup");
	public static Item VANILLA_CUPCAKE = new ItemFoodXL("vanilla_cupcake", 2, 0.6F);
	public static Item CHOCOLATE_CUPCAKE = new ItemFoodXL("chocolate_cupcake", 3, 0.6F);
	public static Item CHOCOLATE_COOKIE_CUPCAKE = new ItemFoodXL("chocolate_cookie_cupcake", 5, 0.6F);
	public static Item STRAWBERRY_CUPCAKE = new ItemFoodXL("strawberry_cupcake", 3, 0.6F);
	
	public static Item PIE_SHELL = new ItemXL("pie_shell");
	public static Item APPLE_PIE = new ItemFoodXL("apple_pie", 8, 0.6F);
	public static Item GOLDEN_APPLE_PIE = new ItemFoodXL("golden_apple_pie", 8, 0.6F);
	public static Item CHEESE_PIE = new ItemFoodXL("cheese_pie", 8, 0.6F);
	public static Item CHICKEN_POT_PIE = new ItemFoodXL("chicken_pot_pie", 8, 0.6F);
	public static Item CHOCOLATE_PIE = new ItemFoodXL("chocolate_pie", 8, 0.6F);
	public static Item BACON_PIE = new ItemFoodXL("bacon_pie", 8, 0.6F);
	public static Item FISH_PIE = new ItemFoodXL("fish_pie", 8, 0.6F);
	public static Item STRAWBERRY_PIE = new ItemFoodXL("strawberry_pie", 8, 0.6F);
	
	public static Item TOMATO_SAUCE = new ItemXL("tomato_sauce");
	public static Item HOT_SAUCE = new ItemXL("hot_sauce");
	public static Item CHOCOLATE_SYRUP = new ItemXL("chocolate_syrup");
	public static Item VANILLA_EXTRACT = new ItemXL("vanilla_extract");
	public static Item VANILLA_CREAM = new ItemXL("vanilla_cream");
	
	public static Item EMPTY_CAN = new ItemXL("empty_can");
	public static Item SPEEDY_ENERGY_DRINK = new SpeedyEnergyDrinkItem("speedy_energy_drink", 0, 0.0F);
    public static Item HEALTHY_ENERGY_DRINK = new HealthyEnergyDrinkItem("healthy_energy_drink", 0, 0.0F);
    public static Item STEALTHY_ENERGY_DRINK = new StealthyEnergyDrinkItem("stealthy_energy_drink", 0, 0.0F);
    public static Item STRONG_ENERGY_DRINK = new StrongEnergyDrinkItem("strong_energy_drink", 0, 0.0F);
	public static Item DEADLY_ENERGY_DRINK = new DeadlyEnergyDrinkItem("deadly_energy_drink", 0, 0.0F);
	public static Item SUPER_ENERGY_DRINK = new SuperEnergyDrinkItem("super_energy_drink", 0, 0.0F);
	public static Item GLASS_MUG = new ItemXL("glass_mug");
	public static Item BEER = new BeerItem("beer", 1, 0.2F);
	public static Item COFFEE_CUP = new ItemXL("coffee_cup");
	public static Item COFFEE = new CoffeeItem("coffee", 1, 0.2F);
	public static Item CAPPUCCINO = new CappucinoItem("cappuccino", 2, 0.2F);

}
