package mariot7.xlfoodmod.items;

import java.util.List;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class HealthyEnergyDrink extends ItemFood{
	
	public HealthyEnergyDrink(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(Main.tabXLFoodMod);
	}
	
	public HealthyEnergyDrink(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
    }
	
	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 600, 0));
		player.inventory.addItemStackToInventory(new ItemStack(ItemListxlfoodmod.empty_can));
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean adva){
		list.add("Regeneration (0:30)");
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	return EnumAction.DRINK;
	}


}
