package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.blocks.CornPlant;
import mariot7.xlfoodmod.blocks.CucumberPlant;
import mariot7.xlfoodmod.blocks.GrassBlock;
import mariot7.xlfoodmod.blocks.LettucePlant;
import mariot7.xlfoodmod.blocks.OnionPlant;
import mariot7.xlfoodmod.blocks.PepperPlant;
import mariot7.xlfoodmod.blocks.RicePlant;
import mariot7.xlfoodmod.blocks.RockSaltBlock;
import mariot7.xlfoodmod.blocks.StrawberryPlant;
import mariot7.xlfoodmod.blocks.VanillaFlowerBlock;
import mariot7.xlfoodmod.blocks.TomatoPlant;
import net.minecraft.block.Block;

public class BlockListXL {
	
	public static Block ROCK_SALT = new RockSaltBlock("rock_salt");
	public static Block GRASS = new GrassBlock("grass");
	public static Block VANILLA_FLOWER = new VanillaFlowerBlock("vanilla_flower");
	public static Block RICE_PLANT = new RicePlant("rice_plant");
	public static Block PEPPER_PLANT = new PepperPlant("pepper_plant");
	public static Block CORN_PLANT = new CornPlant("corn_plant");
	public static Block CUCUMBER_PLANT = new CucumberPlant("cucumber_plant");
	public static Block LETTUCE_PLANT = new LettucePlant("lettuce_plant");
	public static Block ONION_PLANT = new OnionPlant("onion_plant");
	public static Block TOMATO_PLANT = new TomatoPlant("tomato_plant");
	public static Block STRAWBERRY_PLANT = new StrawberryPlant("strawberry_plant");
	public static Block CHOCOLATE_CAKE = new BlockCakeXL("chocolate_cake", 14, 0.2F);
	public static Block CHOCOLATE_COOKIE_CAKE = new BlockCakeXL("chocolate_cookie_cake", 17, 0.2F);
	public static Block CHEESE_CAKE = new BlockCakeXL("cheese_cake", 15, 0.2F);
	public static Block NETHER_CAKE = new BlockCakeXL("nether_cake", 14, 0.2F);
	public static Block STRAWBERRY_CAKE = new BlockCakeXL("strawberry_cake", 15, 0.2F);
	public static Block PUMPKIN_CAKE = new BlockCakeXL("pumpkin_cake", 14, 0.2F);
	public static Block PIZZA = new BlockCakeXL("pizza", 18, 0.2F);

}
