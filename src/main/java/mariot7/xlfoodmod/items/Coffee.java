package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Coffee extends ItemFood {
	
	public Coffee(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	
	public Coffee(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
    }
	
	public void onFoodEaten(ItemStack stack, World world, EntityPlayer player) {
		player.inventory.addItemStackToInventory(new ItemStack(ItemListxlfoodmod.coffee_cup));
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	return EnumAction.DRINK;
	}
	

}
