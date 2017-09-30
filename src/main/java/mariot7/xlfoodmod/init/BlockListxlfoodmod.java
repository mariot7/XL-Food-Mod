package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.blocks.Grass;
import mariot7.xlfoodmod.blocks.Lettuce;
import mariot7.xlfoodmod.blocks.NetherCake;
import mariot7.xlfoodmod.blocks.Onion;
import mariot7.xlfoodmod.blocks.OreoCake;
import mariot7.xlfoodmod.blocks.CheeseCake;
import mariot7.xlfoodmod.blocks.ChocolateCake;
import mariot7.xlfoodmod.blocks.Corn;
import mariot7.xlfoodmod.blocks.Pepper;
import mariot7.xlfoodmod.blocks.Pizza;
import mariot7.xlfoodmod.blocks.Cucumber;
import mariot7.xlfoodmod.blocks.Rice;
import mariot7.xlfoodmod.blocks.RockSalt;
import mariot7.xlfoodmod.blocks.Strawberry;
import mariot7.xlfoodmod.blocks.StrawberryCake;
import mariot7.xlfoodmod.blocks.Tomato;
import mariot7.xlfoodmod.blocks.VanillaFlower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockListxlfoodmod {
	
	public static Block rock_salt;
	public static ItemBlock ibrock_salt;
	public static Block grass;
	public static ItemBlock ibgrass;
	public static Block vanilla_flower;
	public static ItemBlock ibvanilla_flower;
	public static Block rice_plant;
	public static ItemBlock ibrice_plant;
	public static Block pepper_plant;
	public static ItemBlock ibpepper_plant;
	public static Block corn_plant;
	public static ItemBlock ibcorn_plant;
	public static Block cucumber_plant;
	public static ItemBlock ibcucumber_plant;
	public static Block lettuce_plant;
	public static ItemBlock iblettuce_plant;
	public static Block onion_plant;
	public static ItemBlock ibonion_plant;
	public static Block tomato_plant;
	public static ItemBlock ibtomato_plant;
	public static Block strawberry_plant;
	public static ItemBlock ibstrawberry_plant;
	public static Block chocolate_cake;
	public static ItemBlock ibchocolate_cake;
	public static Block oreo_cake;
	public static ItemBlock iboreo_cake;
	public static Block cheese_cake;
	public static ItemBlock ibcheese_cake;
	public static Block nether_cake;
	public static ItemBlock ibnether_cake;
	public static Block strawberry_cake;
	public static ItemBlock ibstrawberry_cake;
	public static Block pizza;
	public static ItemBlock ibpizza;


	public static void initBlocks()
	{
		
		rock_salt = new RockSalt("rock_salt", Material.ROCK);	 
		ibrock_salt = (ItemBlock) new ItemBlock(rock_salt);
		grass = new Grass("grass", Material.GRASS, 0, 0);	  
		ibgrass = (ItemBlock) new ItemBlock(grass);
		vanilla_flower = new VanillaFlower("vanilla_flower", Material.GRASS, 0, 0);	  
		ibvanilla_flower = (ItemBlock) new ItemBlock(vanilla_flower);
		rice_plant = new Rice("rice_plant");	  
		ibrice_plant = (ItemBlock) new ItemBlock(rice_plant);
		pepper_plant = new Pepper("pepper_plant");	  
		ibpepper_plant = (ItemBlock) new ItemBlock(pepper_plant);
		corn_plant = new Corn("corn_plant");	  
		ibcorn_plant = (ItemBlock) new ItemBlock(corn_plant);
		cucumber_plant = new Cucumber("cucumber_plant");	  
		ibcucumber_plant = (ItemBlock) new ItemBlock(cucumber_plant);
		lettuce_plant = new Lettuce("lettuce_plant");	  
		iblettuce_plant = (ItemBlock) new ItemBlock(lettuce_plant);
		onion_plant = new Onion("onion_plant");	  
		ibonion_plant = (ItemBlock) new ItemBlock(onion_plant);
		tomato_plant = new Tomato("tomato_plant");	  
		ibtomato_plant = (ItemBlock) new ItemBlock(tomato_plant);
		strawberry_plant = new Strawberry("strawberry_plant");	  
		ibstrawberry_plant = (ItemBlock) new ItemBlock(strawberry_plant);
		chocolate_cake = new ChocolateCake("chocolate_cake", 14, 2.8F);	  
		ibchocolate_cake = (ItemBlock) new ItemBlock(chocolate_cake);
		oreo_cake = new OreoCake("oreo_cake", 14, 2.8F);	  
		iboreo_cake = (ItemBlock) new ItemBlock(oreo_cake);
		cheese_cake = new CheeseCake("cheese_cake", 14, 2.8F);	  
		ibcheese_cake = (ItemBlock) new ItemBlock(cheese_cake);
		nether_cake = new NetherCake("nether_cake", 14, 2.8F);	  
		ibnether_cake = (ItemBlock) new ItemBlock(nether_cake);
		strawberry_cake = new StrawberryCake("strawberry_cake", 14, 2.8F);	  
		ibstrawberry_cake = (ItemBlock) new ItemBlock(strawberry_cake);
		pizza = new Pizza("pizza", 14, 2.8F);	  
		ibpizza = (ItemBlock) new ItemBlock(pizza);
		
		GameRegistry.register(rock_salt);
		GameRegistry.register(ibrock_salt, rock_salt.getRegistryName());
		GameRegistry.register(grass);
		GameRegistry.register(ibgrass, grass.getRegistryName());
		GameRegistry.register(vanilla_flower);
		GameRegistry.register(ibvanilla_flower, vanilla_flower.getRegistryName());
		GameRegistry.register(rice_plant);
		GameRegistry.register(ibrice_plant, rice_plant.getRegistryName());
		GameRegistry.register(pepper_plant);
		GameRegistry.register(ibpepper_plant, pepper_plant.getRegistryName());
		GameRegistry.register(corn_plant);
		GameRegistry.register(ibcorn_plant, corn_plant.getRegistryName());
		GameRegistry.register(cucumber_plant);
		GameRegistry.register(ibcucumber_plant, cucumber_plant.getRegistryName());
		GameRegistry.register(lettuce_plant);
		GameRegistry.register(iblettuce_plant, lettuce_plant.getRegistryName());
		GameRegistry.register(onion_plant);
		GameRegistry.register(ibonion_plant, onion_plant.getRegistryName());
		GameRegistry.register(tomato_plant);
		GameRegistry.register(ibtomato_plant, tomato_plant.getRegistryName());
		GameRegistry.register(strawberry_plant);
		GameRegistry.register(ibstrawberry_plant, strawberry_plant.getRegistryName());
		GameRegistry.register(chocolate_cake);
		GameRegistry.register(ibchocolate_cake, chocolate_cake.getRegistryName());
		GameRegistry.register(oreo_cake);
		GameRegistry.register(iboreo_cake, oreo_cake.getRegistryName());
		GameRegistry.register(cheese_cake);
		GameRegistry.register(ibcheese_cake, cheese_cake.getRegistryName());
		GameRegistry.register(nether_cake);
		GameRegistry.register(ibnether_cake, nether_cake.getRegistryName());
		GameRegistry.register(strawberry_cake);
		GameRegistry.register(ibstrawberry_cake, strawberry_cake.getRegistryName());
		GameRegistry.register(pizza);
		GameRegistry.register(ibpizza, pizza.getRegistryName());
		
	}

	
}
