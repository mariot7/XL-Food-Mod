package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.items.Beer;
import mariot7.xlfoodmod.items.BucketOfFriedChicken;
import mariot7.xlfoodmod.items.Cappuccino;
import mariot7.xlfoodmod.items.Coffee;
import mariot7.xlfoodmod.items.DeadlyEnergyDrink;
import mariot7.xlfoodmod.items.HealthyEnergyDrink;
import mariot7.xlfoodmod.items.Onion;
import mariot7.xlfoodmod.items.Bowl;
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
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemListxlfoodmod {
	
	//crops
	public static ItemSeedsxlfoodmod rice_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.rice_plant, Blocks.FARMLAND, "rice_seeds");
	public static ItemFoodxlfoodmod rice = new ItemFoodxlfoodmod("rice", 1, 0.6F, false);
	public static ItemFoodxlfoodmod butter_rice = new ItemFoodxlfoodmod("butter_rice", 4, 2.0F, false);
	public static ItemFoodxlfoodmod fried_rice = new ItemFoodxlfoodmod("fried_rice", 3, 1.8F, false);
	public static ItemSeedsxlfoodmod pepper_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.pepper_plant, Blocks.FARMLAND, "pepper_seeds");
	public static ItemFoodxlfoodmod pepper = new ItemFoodxlfoodmod("pepper", 1, 0.6F, false);
	public static ItemSeedsxlfoodmod corn_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.corn_plant, Blocks.FARMLAND, "corn_seeds");
	public static ItemFoodxlfoodmod raw_corn = new ItemFoodxlfoodmod("raw_corn", 1, 0.6F, false);
	public static ItemFoodxlfoodmod corn = new ItemFoodxlfoodmod("corn", 1, 0.6F, false);
	public static ItemSeedsxlfoodmod cucumber_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.cucumber_plant, Blocks.FARMLAND, "cucumber_seeds");
	public static ItemFoodxlfoodmod cucumber = new ItemFoodxlfoodmod("cucumber", 1, 0.6F, false);
	public static ItemSeedsxlfoodmod lettuce_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.lettuce_plant, Blocks.FARMLAND, "lettuce_seeds");
	public static ItemFoodxlfoodmod lettuce = new ItemFoodxlfoodmod("lettuce", 1, 0.6F, false);
	public static Onion onion = new Onion(1, 0.6F, BlockListxlfoodmod.onion_plant, Blocks.FARMLAND);
	public static ItemSeedsxlfoodmod tomato_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.tomato_plant, Blocks.FARMLAND, "tomato_seeds");
	public static ItemFoodxlfoodmod tomato = new ItemFoodxlfoodmod("tomato", 1, 0.6F, false);
	public static ItemSeedsxlfoodmod strawberry_seeds = new ItemSeedsxlfoodmod(BlockListxlfoodmod.strawberry_plant, Blocks.FARMLAND, "strawberry_seeds");
	public static ItemFoodxlfoodmod strawberry = new ItemFoodxlfoodmod("strawberry", 1, 0.6F, false);
	//other foods
	public static ItemFoodxlfoodmod salt = new ItemFoodxlfoodmod("salt", 0, 0.1F, false);
	public static ItemFoodxlfoodmod dough = new ItemFoodxlfoodmod("dough", 1, 0.6F, false);
	public static ItemFoodxlfoodmod cooked_dough = new ItemFoodxlfoodmod("cooked_dough", 2, 1.2F, false);
	public static ItemFoodxlfoodmod crouton = new ItemFoodxlfoodmod("crouton", 1, 1.5F, false);
	public static ItemFoodxlfoodmod butter = new ItemFoodxlfoodmod("butter", 1, 0.3F, false);
	public static ItemFoodxlfoodmod cheese = new ItemFoodxlfoodmod("cheese", 1, 0.4F, false);
	public static ItemFoodxlfoodmod cheese_puff = new ItemFoodxlfoodmod("cheese_puff", 1, 0.6F, false);
	public static ItemFoodxlfoodmod chips = new ItemFoodxlfoodmod("chips", 1, 4.8F, false);
	public static ItemFoodxlfoodmod salty_chips = new ItemFoodxlfoodmod("salty_chips", 1, 1.5F, false);
	public static ItemFoodxlfoodmod spicy_chips = new ItemFoodxlfoodmod("spicy_chips", 1, 1.6F, false);
	public static ItemFoodxlfoodmod onion_rings = new ItemFoodxlfoodmod("onion_rings", 2, 3.0F, false);
	public static ItemFoodxlfoodmod cheesy_bread = new ItemFoodxlfoodmod("cheesy_bread", 6, 6.4F, false);
	public static ItemFoodxlfoodmod potato_bread = new ItemFoodxlfoodmod("potato_bread", 6, 7.0F, false);
	public static ItemFoodxlfoodmod corn_bread = new ItemFoodxlfoodmod("corn_bread", 8, 7.8F, false);
	public static ItemFoodxlfoodmod baguette = new ItemFoodxlfoodmod("baguette", 6, 5.0F, false);
	public static ItemFoodxlfoodmod fried_egg = new ItemFoodxlfoodmod("fried_egg", 3, 3.0F, false);
	public static ItemFoodxlfoodmod pancake = new ItemFoodxlfoodmod("pancake", 5, 4.6F, false);
	public static ItemFoodxlfoodmod waffle = new ItemFoodxlfoodmod("waffle", 5, 5.8F, false);
	public static Bowl spaghetti = new Bowl("spaghetti", 9, 8.8F, false);
	public static ItemFoodxlfoodmod lasagne = new ItemFoodxlfoodmod("lasagne", 12, 9.5F, false);
    //meat
	public static ItemFoodxlfoodmod flesh = new ItemFoodxlfoodmod("flesh", 4, 1.2F, false);
	public static ItemFoodxlfoodmod sausage = new ItemFoodxlfoodmod("sausage", 3, 4.2F, false);
	public static ItemFoodxlfoodmod bacon = new ItemFoodxlfoodmod("bacon", 3, 13.0F, false);
	public static ItemFoodxlfoodmod ground_beef = new ItemFoodxlfoodmod("ground_beef", 4, 6.4F, false);
	public static ItemFoodxlfoodmod raw_chicken_wing = new ItemFoodxlfoodmod("raw_chicken_wing", 1, 0.6F, false);
	public static ItemFoodxlfoodmod cooked_chicken_wing = new ItemFoodxlfoodmod("cooked_chicken_wing", 3, 3.6F, false);
	public static ItemFoodxlfoodmod spicy_chicken_wing = new ItemFoodxlfoodmod("spicy_chicken_wing", 3, 4.0F, false);
	public static BucketOfFriedChicken bucket_of_fried_chicken = new BucketOfFriedChicken("bucket_of_fried_chicken", 6, 7.2F, false);
    //fast food
	public static ItemFoodxlfoodmod top_bun = new ItemFoodxlfoodmod("top_bun", 4, 3.0F, false);
	public static ItemFoodxlfoodmod bottom_bun = new ItemFoodxlfoodmod("bottom_bun", 4, 3.0F, false);
	public static ItemFoodxlfoodmod hamburger = new ItemFoodxlfoodmod("hamburger", 9, 14.6F, false);
	public static ItemFoodxlfoodmod chickenburger = new ItemFoodxlfoodmod("chickenburger", 9, 6.6F, false);
	public static ItemFoodxlfoodmod cheeseburger = new ItemFoodxlfoodmod("cheeseburger", 10, 15.0F, false);
	public static ItemFoodxlfoodmod hot_dog = new ItemFoodxlfoodmod("hot_dog", 8, 10.0F, false);
	public static ItemFoodxlfoodmod tortilla = new ItemFoodxlfoodmod("tortilla", 4, 3.0F, false);
	public static ItemFoodxlfoodmod taco = new ItemFoodxlfoodmod("taco", 7, 9.4F, false);
	public static ItemFoodxlfoodmod burrito = new ItemFoodxlfoodmod("burrito", 7, 9.0F, false);
	public static ItemFoodxlfoodmod slice_of_pizza = new ItemFoodxlfoodmod("slice_of_pizza", 7, 1.4F, false);
    //salad
	public static Itemxlfoodmod bowl = new Itemxlfoodmod("bowl");
	public static Bowl garden_salad = new Bowl("garden_salad", 5, 5.8F, false);
	public static Bowl chicken_salad = new Bowl("chicken_salad", 8, 10.0F, false);
	public static Bowl caesar_salad = new Bowl("caesar_salad", 6, 7.4F, false);
	public static Bowl onion_salad = new Bowl("onion_salad", 4, 5.0F, false);
	public static Bowl taco_salad = new Bowl("taco_salad", 10, 12.0F, false);
	//soups and stews
	public static Bowl cucumber_soup = new Bowl("cucumber_soup", 6, 6.6F, false);
	public static Bowl tomato_soup = new Bowl("tomato_soup", 3, 1.4F, false);
	public static Bowl vegetable_soup = new Bowl("vegetable_soup", 8, 5.2F, false);
	public static ItemFoodxlfoodmod pumpkin_stew = new ItemFoodxlfoodmod("pumpkin_stew", 6, 9.5F, false);
    //candy etc.
	public static ItemFoodxlfoodmod marshmallow = new ItemFoodxlfoodmod("marshmallow", 1, 0.6F, false);
	public static ItemFoodxlfoodmod roasted_marshmallow = new ItemFoodxlfoodmod("roasted_marshmallow", 2, 1.2F, false);
	public static ItemFoodxlfoodmod oreo_cookie = new ItemFoodxlfoodmod("oreo_cookie", 3, 3.4F, false);
	public static ItemFoodxlfoodmod twinkie = new ItemFoodxlfoodmod("twinkie", 4, 3.6F, false);
	public static ItemFoodxlfoodmod brownie = new ItemFoodxlfoodmod("brownie", 3, 2.8F, false);
	public static ItemFoodxlfoodmod chocolate = new ItemFoodxlfoodmod("chocolate", 1, 0.8F, false);
	public static Itemxlfoodmod chocolate_icecream_ball = new Itemxlfoodmod("chocolate_icecream_ball");
	public static Itemxlfoodmod vanilla_icecream_ball = new Itemxlfoodmod("vanilla_icecream_ball");
	public static Itemxlfoodmod strawberry_icecream_ball = new Itemxlfoodmod("strawberry_icecream_ball");
	public static ItemFoodxlfoodmod icecream_cone = new ItemFoodxlfoodmod("icecream_cone", 3, 4.8F, false);
	public static ItemFoodxlfoodmod chocolate_icecream = new ItemFoodxlfoodmod("chocolate_icecream", 4, 5.8F, false);
	public static ItemFoodxlfoodmod vanilla_icecream = new ItemFoodxlfoodmod("vanilla_icecream", 4, 5.8F, false);
	public static ItemFoodxlfoodmod strawberry_icecream = new ItemFoodxlfoodmod("strawberry_icecream", 4, 5.8F, false);
	public static ItemFoodxlfoodmod crescent_roll = new ItemFoodxlfoodmod("crescent_roll", 6, 3.6F, false);
	public static ItemFoodxlfoodmod donut = new ItemFoodxlfoodmod("donut", 4, 4.8F, false);
	public static ItemFoodxlfoodmod sugar_donut = new ItemFoodxlfoodmod("sugar_donut", 4, 5.0F, false);
	public static ItemFoodxlfoodmod chocolate_donut = new ItemFoodxlfoodmod("chocolate_donut", 4, 5.8F, false);
	//cupcakes
	public static Itemxlfoodmod paper_cup = new Itemxlfoodmod("paper_cup");
	public static ItemFoodxlfoodmod chocolate_cupcake = new ItemFoodxlfoodmod("chocolate_cupcake", 3, 2.0F, false);
	public static ItemFoodxlfoodmod oreo_cupcake = new ItemFoodxlfoodmod("oreo_cupcake", 5, 4.0F, false);
	public static ItemFoodxlfoodmod strawberry_cupcake = new ItemFoodxlfoodmod("strawberry_cupcake", 3, 1.8F, false);
    //pies
	public static Itemxlfoodmod pie_shell = new Itemxlfoodmod("pie_shell");
	public static ItemFoodxlfoodmod apple_pie = new ItemFoodxlfoodmod("apple_pie", 8, 4.8F, false);
	public static ItemFoodxlfoodmod golden_apple_pie = new ItemFoodxlfoodmod("golden_apple_pie", 8, 5.8F, false);
	public static ItemFoodxlfoodmod cheese_pie = new ItemFoodxlfoodmod("cheese_pie", 8, 4.8F, false);
	public static ItemFoodxlfoodmod chicken_pot_pie = new ItemFoodxlfoodmod("chicken_pot_pie", 8, 5.8F, false);
	public static ItemFoodxlfoodmod chocolate_pie = new ItemFoodxlfoodmod("chocolate_pie", 8, 4.8F, false);
	public static ItemFoodxlfoodmod bacon_pie = new ItemFoodxlfoodmod("bacon_pie", 8, 5.8F, false);
	public static ItemFoodxlfoodmod fish_pie = new ItemFoodxlfoodmod("fish_pie", 8, 4.8F, false);
	public static ItemFoodxlfoodmod strawberry_pie = new ItemFoodxlfoodmod("strawberry_pie", 8, 4.8F, false);
    //syrup, cream etc.
	public static Itemxlfoodmod tomato_sauce = new Itemxlfoodmod("tomato_sauce");
	public static Itemxlfoodmod hot_sauce = new Itemxlfoodmod("hot_sauce");
	public static Itemxlfoodmod chocolate_syrup = new Itemxlfoodmod("chocolate_syrup");
	public static Itemxlfoodmod vanilla_extract = new Itemxlfoodmod("vanilla_extract");
	public static Itemxlfoodmod vanilla_cream = new Itemxlfoodmod("vanilla_cream");
	//drinks
	public static Itemxlfoodmod empty_can = new Itemxlfoodmod("empty_can");
	public static SpeedyEnergyDrink speedy_energy_drink = new SpeedyEnergyDrink("speedy_energy_drink", 0, 0.0F, false);
	public static HealthyEnergyDrink healthy_energy_drink = new HealthyEnergyDrink("healthy_energy_drink", 0, 0.0F, false);
	public static StealthyEnergyDrink stealthy_energy_drink = new StealthyEnergyDrink("stealthy_energy_drink", 0, 0.0F, false);
	public static StrongEnergyDrink strong_energy_drink = new StrongEnergyDrink("strong_energy_drink", 0, 0.0F, false);
	public static DeadlyEnergyDrink deadly_energy_drink = new DeadlyEnergyDrink("deadly_energy_drink", 0, 0.0F, false);
	public static SuperEnergyDrink super_energy_drink = new SuperEnergyDrink("super_energy_drink", 0, 0.0F, false);
	public static Itemxlfoodmod glass_mug = new Itemxlfoodmod("glass_mug");
	public static Beer beer = new Beer("beer", 1, 1.5F, false);
	public static Itemxlfoodmod coffee_cup = new Itemxlfoodmod("coffee_cup");
	public static Coffee coffee = new Coffee("coffee", 1, 0.5F, false);
	public static Cappuccino cappuccino = new Cappuccino("cappuccino", 2, 0.5F, false);
	
	
	public static void register(IForgeRegistry<Item> registry) {
		
		//crops
		registry.registerAll(rice_seeds);
		registry.registerAll(rice);
		registry.registerAll(butter_rice);
		registry.registerAll(fried_rice);
		registry.registerAll(pepper_seeds);
		registry.registerAll(pepper);
		registry.registerAll(corn_seeds);
		registry.registerAll(raw_corn);
		registry.registerAll(corn);
		registry.registerAll(cucumber_seeds);
		registry.registerAll(cucumber);
		registry.registerAll(lettuce_seeds);
		registry.registerAll(lettuce);
		registry.registerAll(onion);
		registry.registerAll(tomato_seeds);
		registry.registerAll(tomato);
		registry.registerAll(strawberry_seeds);
		registry.registerAll(strawberry);
		//other foods
		registry.registerAll(salt);
		OreDictionary.registerOre("itemSalt", salt);
		OreDictionary.registerOre("dustSalt", salt);
		registry.registerAll(dough);
		registry.registerAll(cooked_dough);
		registry.registerAll(crouton);
		registry.registerAll(butter);
		registry.registerAll(cheese);
		registry.registerAll(cheese_puff);
		registry.registerAll(chips);
		registry.registerAll(salty_chips);
		registry.registerAll(spicy_chips);
		registry.registerAll(onion_rings);
		registry.registerAll(cheesy_bread);
		registry.registerAll(potato_bread);
		registry.registerAll(corn_bread);
		registry.registerAll(baguette);
		registry.registerAll(fried_egg);
		registry.registerAll(pancake);
		registry.registerAll(waffle);
		registry.registerAll(spaghetti);
		registry.registerAll(lasagne);
		//meat
		registry.registerAll(flesh);
		registry.registerAll(sausage);
		registry.registerAll(bacon);
		registry.registerAll(ground_beef);
		registry.registerAll(raw_chicken_wing);
		registry.registerAll(cooked_chicken_wing);
		registry.registerAll(spicy_chicken_wing);
		registry.registerAll(bucket_of_fried_chicken);
		//fast food
		registry.registerAll(top_bun);
		registry.registerAll(bottom_bun);
		registry.registerAll(hamburger);
		registry.registerAll(chickenburger);
		registry.registerAll(cheeseburger);
		registry.registerAll(hot_dog);
		registry.registerAll(tortilla);
		registry.registerAll(taco);
		registry.registerAll(burrito);
		registry.registerAll(slice_of_pizza);
		//salad
		registry.registerAll(bowl);
		registry.registerAll(garden_salad);
		registry.registerAll(chicken_salad);
		registry.registerAll(caesar_salad);
		registry.registerAll(onion_salad);
		registry.registerAll(taco_salad);
		//soups and stews
		registry.registerAll(cucumber_soup);
		registry.registerAll(tomato_soup);
		registry.registerAll(vegetable_soup);
		registry.registerAll(pumpkin_stew);
		//candy etc.
		registry.registerAll(marshmallow);
		registry.registerAll(roasted_marshmallow);
		registry.registerAll(oreo_cookie);
		registry.registerAll(twinkie);
		registry.registerAll(brownie);
		registry.registerAll(chocolate);
		registry.registerAll(chocolate_icecream_ball);
		registry.registerAll(vanilla_icecream_ball);
		registry.registerAll(strawberry_icecream_ball);
		registry.registerAll(icecream_cone);
		registry.registerAll(chocolate_icecream);
		registry.registerAll(vanilla_icecream);
		registry.registerAll(strawberry_icecream);
		registry.registerAll(crescent_roll);
		registry.registerAll(donut);
		registry.registerAll(sugar_donut);
		registry.registerAll(chocolate_donut);
		//cupcakes
		registry.registerAll(paper_cup);
		registry.registerAll(chocolate_cupcake);
		registry.registerAll(oreo_cupcake);
		registry.registerAll(strawberry_cupcake);
		//pies
		registry.registerAll(pie_shell);
		registry.registerAll(apple_pie);
		registry.registerAll(golden_apple_pie);
		registry.registerAll(cheese_pie);
		registry.registerAll(chicken_pot_pie);
		registry.registerAll(chocolate_pie);
		registry.registerAll(bacon_pie);
		registry.registerAll(fish_pie);
		registry.registerAll(strawberry_pie);
		//syrup, cream etc.
		registry.registerAll(tomato_sauce);
		registry.registerAll(hot_sauce);
		registry.registerAll(chocolate_syrup);
		registry.registerAll(vanilla_extract);
		registry.registerAll(vanilla_cream);
		//drinks
		registry.registerAll(empty_can);
		registry.registerAll(speedy_energy_drink);
		registry.registerAll(healthy_energy_drink);
		registry.registerAll(stealthy_energy_drink);
		registry.registerAll(strong_energy_drink);
		registry.registerAll(deadly_energy_drink);
		registry.registerAll(super_energy_drink);
		registry.registerAll(glass_mug);
		registry.registerAll(beer);
		registry.registerAll(coffee_cup);
		registry.registerAll(coffee);
		registry.registerAll(cappuccino);
		
	}
	
	public static void registerModels() {
		
		//crops
		rice_seeds.registerItemModel();
		rice.registerItemModel();
		butter_rice.registerItemModel();
		fried_rice.registerItemModel();
		pepper_seeds.registerItemModel();
		pepper.registerItemModel();
		corn_seeds.registerItemModel();
		raw_corn.registerItemModel();
		corn.registerItemModel();
		cucumber_seeds.registerItemModel();
		cucumber.registerItemModel();
		lettuce_seeds.registerItemModel();
		lettuce.registerItemModel();
		onion.registerItemModel();
		tomato_seeds.registerItemModel();
		tomato.registerItemModel();
		strawberry_seeds.registerItemModel();
		strawberry.registerItemModel();
		//other foods
		salt.registerItemModel();
		dough.registerItemModel();
		cooked_dough.registerItemModel();
		crouton.registerItemModel();
		butter.registerItemModel();
		cheese.registerItemModel();
		cheese_puff.registerItemModel();
		chips.registerItemModel();
		salty_chips.registerItemModel();
		spicy_chips.registerItemModel();
		onion_rings.registerItemModel();
		cheesy_bread.registerItemModel();
		potato_bread.registerItemModel();
		corn_bread.registerItemModel();
		baguette.registerItemModel();
		fried_egg.registerItemModel();
		pancake.registerItemModel();
		waffle.registerItemModel();
		spaghetti.registerItemModel();
		lasagne.registerItemModel();
		//meat
		flesh.registerItemModel();
		sausage.registerItemModel();
		bacon.registerItemModel();
		ground_beef.registerItemModel();
		raw_chicken_wing.registerItemModel();
		cooked_chicken_wing.registerItemModel();
		spicy_chicken_wing.registerItemModel();
		bucket_of_fried_chicken.registerItemModel();
		//fast food
		top_bun.registerItemModel();
		bottom_bun.registerItemModel();
		hamburger.registerItemModel();
		chickenburger.registerItemModel();
		cheeseburger.registerItemModel();
		hot_dog.registerItemModel();
		tortilla.registerItemModel();
		taco.registerItemModel();
		burrito.registerItemModel();
		slice_of_pizza.registerItemModel();
		//salad
		bowl.registerItemModel();
		garden_salad.registerItemModel();
		chicken_salad.registerItemModel();
		caesar_salad.registerItemModel();
		onion_salad.registerItemModel();
		taco_salad.registerItemModel();
		//soups and stews
		cucumber_soup.registerItemModel();
		tomato_soup.registerItemModel();
		vegetable_soup.registerItemModel();
		pumpkin_stew.registerItemModel();
		//candy etc.
		marshmallow.registerItemModel();
		roasted_marshmallow.registerItemModel();
		oreo_cookie.registerItemModel();
		twinkie.registerItemModel();
		brownie.registerItemModel();
		chocolate.registerItemModel();
		chocolate_icecream_ball.registerItemModel();
		vanilla_icecream_ball.registerItemModel();
		strawberry_icecream_ball.registerItemModel();
		icecream_cone.registerItemModel();
		chocolate_icecream.registerItemModel();
		vanilla_icecream.registerItemModel();
		strawberry_icecream.registerItemModel();
		crescent_roll.registerItemModel();
		donut.registerItemModel();
		sugar_donut.registerItemModel();
		chocolate_donut.registerItemModel();
		//cupcake
		paper_cup.registerItemModel();
		chocolate_cupcake.registerItemModel();
		oreo_cupcake.registerItemModel();
		strawberry_cupcake.registerItemModel();
		//pies
		pie_shell.registerItemModel();
		apple_pie.registerItemModel();
		golden_apple_pie.registerItemModel();
		cheese_pie.registerItemModel();
		chicken_pot_pie.registerItemModel();
		chocolate_pie.registerItemModel();
		bacon_pie.registerItemModel();
		fish_pie.registerItemModel();
		strawberry_pie.registerItemModel();
		//syrup, cream etc.
		tomato_sauce.registerItemModel();
		hot_sauce.registerItemModel();
		chocolate_syrup.registerItemModel();
		vanilla_extract.registerItemModel();
		vanilla_cream.registerItemModel();
		//drinks
		empty_can.registerItemModel();
		speedy_energy_drink.registerItemModel();
		healthy_energy_drink.registerItemModel();
		stealthy_energy_drink.registerItemModel();
		strong_energy_drink.registerItemModel();
		deadly_energy_drink.registerItemModel();
		super_energy_drink.registerItemModel();
		glass_mug.registerItemModel();
		beer.registerItemModel();
		coffee_cup.registerItemModel();
		coffee.registerItemModel();
		cappuccino.registerItemModel();
		
	}
	

}
