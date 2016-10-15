package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BucketOfFriedChicken extends ItemFood{
	
	public BucketOfFriedChicken(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(16);
		this.setCreativeTab(Main.tabXLFoodMod);
	}
	
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		player.inventory.addItemStackToInventory(new ItemStack(Items.BUCKET));
	}


}
