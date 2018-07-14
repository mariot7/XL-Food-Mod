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
import mariot7.xlfoodmod.blocks.PumpkinCake;
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
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockListxlfoodmod {
	
	public static RockSalt rock_salt = new RockSalt("rock_salt", Material.ROCK);
	public static Grass grass = new Grass("grass", Material.GRASS, 0, 0);
	public static VanillaFlower vanilla_flower = new VanillaFlower("vanilla_flower", Material.GRASS, 0, 0);
	public static Rice rice_plant = new Rice("rice_plant");
	public static Pepper pepper_plant = new Pepper("pepper_plant");
	public static Corn corn_plant = new Corn("corn_plant");
	public static Cucumber cucumber_plant = new Cucumber("cucumber_plant");
	public static Lettuce lettuce_plant = new Lettuce("lettuce_plant");
	public static Onion onion_plant = new Onion("onion_plant");
	public static Tomato tomato_plant = new Tomato("tomato_plant");
	public static Strawberry strawberry_plant = new Strawberry("strawberry_plant");
	public static ChocolateCake chocolate_cake = new ChocolateCake("chocolate_cake", 14, 0.2F);
	public static OreoCake oreo_cake = new OreoCake("oreo_cake", 17, 0.2F);
	public static CheeseCake cheese_cake = new CheeseCake("cheese_cake", 15, 0.2F);
	public static NetherCake nether_cake = new NetherCake("nether_cake", 14, 0.2F);
	public static StrawberryCake strawberry_cake = new StrawberryCake("strawberry_cake", 15, 0.2F);
	public static PumpkinCake pumpkin_cake = new PumpkinCake("pumpkin_cake", 14, 0.2F);
	public static Pizza pizza = new Pizza("pizza", 18, 0.2F);
	
	
	public static void register(IForgeRegistry<Block> registry) {
		
		registry.registerAll(rock_salt);
		registry.registerAll(grass);
		registry.registerAll(vanilla_flower);
		registry.registerAll(rice_plant);
		registry.registerAll(pepper_plant);
		registry.registerAll(corn_plant);
		registry.registerAll(cucumber_plant);
		registry.registerAll(lettuce_plant);
		registry.registerAll(onion_plant);
		registry.registerAll(tomato_plant);
		registry.registerAll(strawberry_plant);
		registry.registerAll(chocolate_cake);
		registry.registerAll(oreo_cake);
		registry.registerAll(cheese_cake);
		registry.registerAll(nether_cake);
		registry.registerAll(strawberry_cake);
		registry.registerAll(pumpkin_cake);
		registry.registerAll(pizza);
		
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		
		registry.register(rock_salt.createItemBlock());
		registry.register(grass.createItemBlock());
		registry.register(vanilla_flower.createItemBlock());
		registry.register(rice_plant.createItemBlock());
		registry.register(pepper_plant.createItemBlock());
		registry.register(corn_plant.createItemBlock());
		registry.register(cucumber_plant.createItemBlock());
		registry.register(lettuce_plant.createItemBlock());
		registry.register(onion_plant.createItemBlock());
		registry.register(tomato_plant.createItemBlock());
		registry.register(strawberry_plant.createItemBlock());
		registry.register(chocolate_cake.createItemBlock());
		registry.register(oreo_cake.createItemBlock());
		registry.register(cheese_cake.createItemBlock());
		registry.register(nether_cake.createItemBlock());
		registry.register(strawberry_cake.createItemBlock());
		registry.register(pumpkin_cake.createItemBlock());
		registry.register(pizza.createItemBlock());
		
	}

	public static void registerModels() {
		
		rock_salt.registerItemModel(Item.getItemFromBlock(rock_salt));
		grass.registerItemModel(Item.getItemFromBlock(grass));
		vanilla_flower.registerItemModel(Item.getItemFromBlock(vanilla_flower));
		rice_plant.registerItemModel(Item.getItemFromBlock(rice_plant));
		pepper_plant.registerItemModel(Item.getItemFromBlock(pepper_plant));
		corn_plant.registerItemModel(Item.getItemFromBlock(corn_plant));
		cucumber_plant.registerItemModel(Item.getItemFromBlock(cucumber_plant));
		lettuce_plant.registerItemModel(Item.getItemFromBlock(lettuce_plant));
		onion_plant.registerItemModel(Item.getItemFromBlock(onion_plant));
		tomato_plant.registerItemModel(Item.getItemFromBlock(tomato_plant));
		strawberry_plant.registerItemModel(Item.getItemFromBlock(strawberry_plant));
		chocolate_cake.registerItemModel(Item.getItemFromBlock(chocolate_cake));
		oreo_cake.registerItemModel(Item.getItemFromBlock(oreo_cake));
		cheese_cake.registerItemModel(Item.getItemFromBlock(cheese_cake));
		nether_cake.registerItemModel(Item.getItemFromBlock(nether_cake));
		strawberry_cake.registerItemModel(Item.getItemFromBlock(strawberry_cake));
		pumpkin_cake.registerItemModel(Item.getItemFromBlock(pumpkin_cake));
		pizza.registerItemModel(Item.getItemFromBlock(pizza));
	
	}
	     
	
}
