package mariot7.xlfoodmod.items;

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

public class SuperEnergyDrink extends ItemFood{
	
	public SuperEnergyDrink(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(Main.tabXLFoodMod);
	}
	
	public SuperEnergyDrink(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
    }
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 3600, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 3600, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 3600, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 3600, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 3600, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 3600, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 3600, 2));
		player.inventory.addItemStackToInventory(new ItemStack(ItemListxlfoodmod.empty_can));
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	return EnumAction.DRINK;
	}


}
