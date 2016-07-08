package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.Reference;
import mariot7.xlfoodmod.blocks.Grass;
import mariot7.xlfoodmod.blocks.Corn;
import mariot7.xlfoodmod.blocks.Pepper;
import mariot7.xlfoodmod.blocks.Pickle;
import mariot7.xlfoodmod.blocks.Rice;
import mariot7.xlfoodmod.blocks.VanillaFlower;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockListxlfoodmod {
	
	public static Block grass;
	public static Block vanilla_flower;
	public static Block rice_plant;
	public static Block pepper_plant;
	public static Block corn_plant;
	public static Block pickle_plant;

	public static void initBlocks()
	{
		GameRegistry.registerBlock(grass = new Grass("grass", Material.GRASS, 0, 0), "grass");
		GameRegistry.registerBlock(vanilla_flower = new VanillaFlower("vanilla_flower", Material.GRASS, 0, 0), "vanilla_flower");
		GameRegistry.registerBlock(rice_plant = new Rice("rice_plant"), "rice_plant");
		GameRegistry.registerBlock(pepper_plant = new Pepper("pepper_plant"), "pepper_plant");
		GameRegistry.registerBlock(corn_plant = new Corn("corn_plant"), "corn_plant");
		GameRegistry.registerBlock(pickle_plant = new Pickle("pickle_plant"), "pickle_plant");
	}

}
