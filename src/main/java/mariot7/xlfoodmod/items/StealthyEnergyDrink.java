package mariot7.xlfoodmod.items;

import java.util.List;

import javax.annotation.Nullable;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

public class StealthyEnergyDrink extends ItemFood{
	
	public StealthyEnergyDrink(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(Main.tabXLFoodMod);
	}
	
	public StealthyEnergyDrink(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
    }
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 2400, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 2400, 0));
		player.inventory.addItemStackToInventory(new ItemStack(ItemListxlfoodmod.empty_can));
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean adva){
		list.add("Night Vision");
		list.add("Speed");
		list.add("Invisibility (2:00)");
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	return EnumAction.DRINK;
	}


}
