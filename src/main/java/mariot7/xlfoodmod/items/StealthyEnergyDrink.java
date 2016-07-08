package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class StealthyEnergyDrink extends ItemFood{
	
	public StealthyEnergyDrink(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.tabXLFoodMod);
	}
	
	public StealthyEnergyDrink(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
    }
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2400, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.NIGHT_VISION, 2400, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.INVISIBILITY, 2400, 0));
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	return EnumAction.DRINK;
	}

}
