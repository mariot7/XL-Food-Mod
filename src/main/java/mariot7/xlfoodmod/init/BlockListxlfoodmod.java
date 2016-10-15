package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.blocks.Grass;
import mariot7.xlfoodmod.blocks.NetherCake;
import mariot7.xlfoodmod.blocks.OreoCake;
import mariot7.xlfoodmod.blocks.CheeseCake;
import mariot7.xlfoodmod.blocks.ChocolateCake;
import mariot7.xlfoodmod.blocks.Corn;
import mariot7.xlfoodmod.blocks.Pepper;
import mariot7.xlfoodmod.blocks.Pizza;
import mariot7.xlfoodmod.blocks.Cucumber;
import mariot7.xlfoodmod.blocks.Rice;
import mariot7.xlfoodmod.blocks.RockSalt;
import mariot7.xlfoodmod.blocks.Tomato;
import mariot7.xlfoodmod.blocks.VanillaFlower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockListxlfoodmod {
	
	public static Block rock_salt;
	public static Block grass;
	public static Block vanilla_flower;
	public static Block rice_plant;
	public static Block pepper_plant;
	public static Block corn_plant;
	public static Block cucumber_plant;
	public static Block tomato_plant;
	public static Block chocolate_cake;
	public static Block oreo_cake;
	public static Block cheese_cake;
	public static Block nether_cake;
	public static Block pizza;

	public static void initBlocks()
	{
		GameRegistry.registerBlock(rock_salt = new RockSalt("rock_salt", Material.GRASS), "rock_salt");
		GameRegistry.registerBlock(grass = new Grass("grass", Material.GRASS, 0, 0), "grass");
		GameRegistry.registerBlock(vanilla_flower = new VanillaFlower("vanilla_flower", Material.GRASS, 0, 0), "vanilla_flower");
		GameRegistry.registerBlock(rice_plant = new Rice("rice_plant"), "rice_plant");
		GameRegistry.registerBlock(pepper_plant = new Pepper("pepper_plant"), "pepper_plant");
		GameRegistry.registerBlock(corn_plant = new Corn("corn_plant"), "corn_plant");
		GameRegistry.registerBlock(cucumber_plant = new Cucumber("cucumber_plant"), "cucumber_plant");
		GameRegistry.registerBlock(tomato_plant = new Tomato("tomato_plant"), "tomato_plant");
		GameRegistry.registerBlock(chocolate_cake = new ChocolateCake("chocolate_cake", 14, 0.2F), "chocolate_cake");
		GameRegistry.registerBlock(oreo_cake = new OreoCake("oreo_cake", 14, 0.2F), "oreo_cake");
		GameRegistry.registerBlock(cheese_cake = new CheeseCake("cheese_cake", 14, 0.2F), "cheese_cake");
		GameRegistry.registerBlock(nether_cake = new NetherCake("nether_cake", 14, 0.2F), "nether_cake");
		GameRegistry.registerBlock(pizza = new Pizza("pizza", 14, 0.2F), "pizza");
	}

}
