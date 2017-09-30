package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import mariot7.xlfoodmod.init.ItemSeedFoodxlfoodmod;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

public class Onion extends ItemSeedFoodxlfoodmod implements IPlantable {

	public Onion(int healAmount, float saturation, Block crops, Block soil) {
		super(healAmount, saturation, crops, soil);
		this.setUnlocalizedName("onion");
		this.setRegistryName("onion");
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	

}
