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

public class StrongEnergyDrink extends ItemFood{
	
	public StrongEnergyDrink(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(Main.tabXLFoodMod);
	}
	
	public StrongEnergyDrink(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
    }
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 2400, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 2400, 1));
		player.inventory.addItemStackToInventory(new ItemStack(ItemListxlfoodmod.empty_can));
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean adva){
		list.add("Strength II");
		list.add("Fire Resistance II (2:00)");
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	return EnumAction.DRINK;
	}

	
}
