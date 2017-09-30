package mariot7.xlfoodmod.items;

import java.util.List;

import javax.annotation.Nullable;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Beer extends ItemFood {
	
	public Beer(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setMaxStackSize(1);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	
	public Beer(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
    }

	protected void onFoodEaten(ItemStack itemstack, World world, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.NAUSEA, 300, 1));
		player.inventory.addItemStackToInventory(new ItemStack(ItemListxlfoodmod.glass_mug));
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean adva) {
		list.add("Nauesa II (0:15)");
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	return EnumAction.DRINK;
	}
    

}
