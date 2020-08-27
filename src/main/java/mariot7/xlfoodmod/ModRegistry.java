package mariot7.xlfoodmod;

import mariot7.xlfoodmod.init.BlockListXL;
import mariot7.xlfoodmod.init.ItemListXL;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(XLFoodMod.MOD_ID)
@EventBusSubscriber(modid = XLFoodMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ModRegistry {

	@SubscribeEvent
	public static void onBlockRegistry(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().register(BlockListXL.ROCK_SALT);
		event.getRegistry().register(BlockListXL.GRASS);
		event.getRegistry().register(BlockListXL.VANILLA_FLOWER);
		event.getRegistry().register(BlockListXL.RICE_PLANT);
		event.getRegistry().register(BlockListXL.PEPPER_PLANT);
		event.getRegistry().register(BlockListXL.CORN_PLANT);
		event.getRegistry().register(BlockListXL.CUCUMBER_PLANT);
		event.getRegistry().register(BlockListXL.LETTUCE_PLANT);
		event.getRegistry().register(BlockListXL.ONION_PLANT);
		event.getRegistry().register(BlockListXL.TOMATO_PLANT);
		event.getRegistry().register(BlockListXL.STRAWBERRY_PLANT);
		event.getRegistry().register(BlockListXL.CHOCOLATE_CAKE);
		event.getRegistry().register(BlockListXL.CHOCOLATE_COOKIE_CAKE);
		event.getRegistry().register(BlockListXL.CHEESE_CAKE);
		event.getRegistry().register(BlockListXL.NETHER_CAKE);
		event.getRegistry().register(BlockListXL.STRAWBERRY_CAKE);
		event.getRegistry().register(BlockListXL.PUMPKIN_CAKE);
		event.getRegistry().register(BlockListXL.PIZZA);
	}

	@SubscribeEvent
	public static void onItemRegistry(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().register(ItemListXL.ROCK_SALT);
		event.getRegistry().register(ItemListXL.GRASS);
		event.getRegistry().register(ItemListXL.VANILLA_FLOWER);
		event.getRegistry().register(ItemListXL.CHOCOLATE_CAKE);
		event.getRegistry().register(ItemListXL.CHOCOLATE_COOKIE_CAKE);
		event.getRegistry().register(ItemListXL.CHEESE_CAKE);
		event.getRegistry().register(ItemListXL.NETHER_CAKE);
		event.getRegistry().register(ItemListXL.STRAWBERRY_CAKE);
		event.getRegistry().register(ItemListXL.PUMPKIN_CAKE);
		event.getRegistry().register(ItemListXL.PIZZA);
		
		event.getRegistry().register(ItemListXL.RICE_PLANT);
		event.getRegistry().register(ItemListXL.RICE);
		event.getRegistry().register(ItemListXL.BUTTER_RICE);
		event.getRegistry().register(ItemListXL.FRIED_RICE);
		event.getRegistry().register(ItemListXL.PEPPER_PLANT);
		event.getRegistry().register(ItemListXL.PEPPER_SEEDS);
		event.getRegistry().register(ItemListXL.PEPPER);
		event.getRegistry().register(ItemListXL.CORN_PLANT);
		event.getRegistry().register(ItemListXL.CORN_SEEDS);
		event.getRegistry().register(ItemListXL.RAW_CORN);
		event.getRegistry().register(ItemListXL.CORN);
		event.getRegistry().register(ItemListXL.CUCUMBER_PLANT);
		event.getRegistry().register(ItemListXL.CUCUMBER_SEEDS);
		event.getRegistry().register(ItemListXL.CUCUMBER);
		event.getRegistry().register(ItemListXL.LETTUCE_PLANT);
		event.getRegistry().register(ItemListXL.LETTUCE_SEEDS);
		event.getRegistry().register(ItemListXL.LETTUCE);
		event.getRegistry().register(ItemListXL.ONION_PLANT);
		event.getRegistry().register(ItemListXL.ONION);
		event.getRegistry().register(ItemListXL.TOMATO_PLANT);
		event.getRegistry().register(ItemListXL.TOMATO_SEEDS);
		event.getRegistry().register(ItemListXL.TOMATO);
		event.getRegistry().register(ItemListXL.STRAWBERRY_PLANT);
		event.getRegistry().register(ItemListXL.STRAWBERRY_SEEDS);
		event.getRegistry().register(ItemListXL.STRAWBERRY);
		event.getRegistry().register(ItemListXL.SALT);
		event.getRegistry().register(ItemListXL.DOUGH);
		event.getRegistry().register(ItemListXL.COOKED_DOUGH);
		event.getRegistry().register(ItemListXL.CROUTON);
		event.getRegistry().register(ItemListXL.BUTTER);
		event.getRegistry().register(ItemListXL.CHEESE);
		event.getRegistry().register(ItemListXL.CHEESE_PUFF);
		event.getRegistry().register(ItemListXL.CHIPS);
		event.getRegistry().register(ItemListXL.SALTY_CHIPS);
		event.getRegistry().register(ItemListXL.SPICY_CHIPS);
		event.getRegistry().register(ItemListXL.ONION_RINGS);
		event.getRegistry().register(ItemListXL.CHEESY_BREAD);
		event.getRegistry().register(ItemListXL.POTATO_BREAD);
		event.getRegistry().register(ItemListXL.CORN_BREAD);
		event.getRegistry().register(ItemListXL.RICE_BREAD);
		event.getRegistry().register(ItemListXL.BAGUETTE);
		event.getRegistry().register(ItemListXL.FRIED_EGG);
		event.getRegistry().register(ItemListXL.PANCAKE);
		event.getRegistry().register(ItemListXL.WAFFLE);
		event.getRegistry().register(ItemListXL.MACARONI_AND_CHEESE);
		
		event.getRegistry().register(ItemListXL.SPAGHETTI);
		event.getRegistry().register(ItemListXL.ENCHILADA);
		event.getRegistry().register(ItemListXL.LASAGNE);
		event.getRegistry().register(ItemListXL.JAMBON_BEURRE);
		
		event.getRegistry().register(ItemListXL.FLESH);
		event.getRegistry().register(ItemListXL.HAM);
		event.getRegistry().register(ItemListXL.SAUSAGE);
		event.getRegistry().register(ItemListXL.BACON);
		event.getRegistry().register(ItemListXL.BEEF_JERKY);
		event.getRegistry().register(ItemListXL.GROUND_BEEF);
		event.getRegistry().register(ItemListXL.RAW_CHICKEN_WING);
		event.getRegistry().register(ItemListXL.COOKED_CHICKEN_WING);
		event.getRegistry().register(ItemListXL.SPICY_CHICKEN_WING);
		event.getRegistry().register(ItemListXL.BUCKET_OF_FRIED_CHICKEN);
		
		event.getRegistry().register(ItemListXL.TOP_BUN);
		event.getRegistry().register(ItemListXL.BOTTOM_BUN);
		event.getRegistry().register(ItemListXL.HAMBURGER);
		event.getRegistry().register(ItemListXL.CHICKENBURGER);
		event.getRegistry().register(ItemListXL.CHEESEBURGER);
		event.getRegistry().register(ItemListXL.HOT_DOG);
		event.getRegistry().register(ItemListXL.SAUSAGE_ROLL);
		event.getRegistry().register(ItemListXL.SLICE_OF_PIZZA);
		event.getRegistry().register(ItemListXL.TORTILLA);
		event.getRegistry().register(ItemListXL.TACO);
		event.getRegistry().register(ItemListXL.BURRITO);
		event.getRegistry().register(ItemListXL.KEBAB);
		
		event.getRegistry().register(ItemListXL.CHICKEN_SANDWICH);
		event.getRegistry().register(ItemListXL.BLT_SANDWICH);
		event.getRegistry().register(ItemListXL.BREAKFAST_SANDWICH);
		event.getRegistry().register(ItemListXL.GRILLED_CHEESE_SANDWICH);
		event.getRegistry().register(ItemListXL.ICE_CREAM_SANDWICH);
		
		event.getRegistry().register(ItemListXL.SEAWEED);
		event.getRegistry().register(ItemListXL.FUTOMAKI);
		event.getRegistry().register(ItemListXL.URAMAKI);
		event.getRegistry().register(ItemListXL.OSHIZUSHI);
		
		event.getRegistry().register(ItemListXL.BOWL);
		event.getRegistry().register(ItemListXL.GARDEN_SALAD);
		event.getRegistry().register(ItemListXL.CHICKEN_SALAD);
		event.getRegistry().register(ItemListXL.CAESAR_SALAD);
		event.getRegistry().register(ItemListXL.ONION_SALAD);
		event.getRegistry().register(ItemListXL.TACO_SALAD);
		
		event.getRegistry().register(ItemListXL.CUCUMBER_SOUP);
		event.getRegistry().register(ItemListXL.TOMATO_SOUP);
		event.getRegistry().register(ItemListXL.VEGETABLE_SOUP);
		event.getRegistry().register(ItemListXL.CHICKEN_SOUP);
		event.getRegistry().register(ItemListXL.BEEF_STEW);
		event.getRegistry().register(ItemListXL.PUMPKIN_STEW);
		
		event.getRegistry().register(ItemListXL.CARAMEL_APPLE);
		event.getRegistry().register(ItemListXL.MARSHMALLOW);
		event.getRegistry().register(ItemListXL.ROASTED_MARSHMALLOW);
		event.getRegistry().register(ItemListXL.CHOCOLATE_COOKIE);
		event.getRegistry().register(ItemListXL.VANILLA_COOKIE);
		event.getRegistry().register(ItemListXL.BROWNIE);
		event.getRegistry().register(ItemListXL.BOURBON_BISCUIT);
		event.getRegistry().register(ItemListXL.CHOCOLATE);
		event.getRegistry().register(ItemListXL.CHOCOLATE_ICE_CREAM_BALL);
		event.getRegistry().register(ItemListXL.VANILLA_ICE_CREAM_BALL);
		event.getRegistry().register(ItemListXL.STRAWBERRY_ICE_CREAM_BALL);
		event.getRegistry().register(ItemListXL.ICE_CREAM_CONE);
		event.getRegistry().register(ItemListXL.CHOCOLATE_ICE_CREAM);
		event.getRegistry().register(ItemListXL.VANILLA_ICE_CREAM);
		event.getRegistry().register(ItemListXL.STRAWBERRY_ICE_CREAM);
		event.getRegistry().register(ItemListXL.CRESCENT_ROLL);
		event.getRegistry().register(ItemListXL.DONUT);
		event.getRegistry().register(ItemListXL.SUGAR_DONUT);
		event.getRegistry().register(ItemListXL.CHOCOLATE_DONUT);
		event.getRegistry().register(ItemListXL.VANILLA_DONUT);
		
		event.getRegistry().register(ItemListXL.PAPER_CUP);
		event.getRegistry().register(ItemListXL.VANILLA_CUPCAKE);
		event.getRegistry().register(ItemListXL.CHOCOLATE_CUPCAKE);
		event.getRegistry().register(ItemListXL.CHOCOLATE_COOKIE_CUPCAKE);
		event.getRegistry().register(ItemListXL.STRAWBERRY_CUPCAKE);
		
		event.getRegistry().register(ItemListXL.PIE_SHELL);
		event.getRegistry().register(ItemListXL.APPLE_PIE);
		event.getRegistry().register(ItemListXL.GOLDEN_APPLE_PIE);
		event.getRegistry().register(ItemListXL.CHEESE_PIE);
		event.getRegistry().register(ItemListXL.CHICKEN_POT_PIE);
		event.getRegistry().register(ItemListXL.CHOCOLATE_PIE);
		event.getRegistry().register(ItemListXL.BACON_PIE);
		event.getRegistry().register(ItemListXL.FISH_PIE);
		event.getRegistry().register(ItemListXL.STRAWBERRY_PIE);
		
		event.getRegistry().register(ItemListXL.TOMATO_SAUCE);
		event.getRegistry().register(ItemListXL.HOT_SAUCE);
		event.getRegistry().register(ItemListXL.CHOCOLATE_SYRUP);
		event.getRegistry().register(ItemListXL.VANILLA_EXTRACT);
		event.getRegistry().register(ItemListXL.VANILLA_CREAM);
		
		event.getRegistry().register(ItemListXL.EMPTY_CAN);
		event.getRegistry().register(ItemListXL.SPEEDY_ENERGY_DRINK);
		event.getRegistry().register(ItemListXL.HEALTHY_ENERGY_DRINK);
		event.getRegistry().register(ItemListXL.STEALTHY_ENERGY_DRINK);
		event.getRegistry().register(ItemListXL.STRONG_ENERGY_DRINK);
		event.getRegistry().register(ItemListXL.DEADLY_ENERGY_DRINK);
		event.getRegistry().register(ItemListXL.SUPER_ENERGY_DRINK);
		event.getRegistry().register(ItemListXL.GLASS_MUG);
		event.getRegistry().register(ItemListXL.BEER);
		event.getRegistry().register(ItemListXL.COFFEE_CUP);
		event.getRegistry().register(ItemListXL.COFFEE);
		event.getRegistry().register(ItemListXL.CAPPUCCINO);
	}
  
}
