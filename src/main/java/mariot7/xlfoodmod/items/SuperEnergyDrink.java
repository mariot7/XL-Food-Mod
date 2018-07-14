package mariot7.xlfoodmod.items;

import java.util.List;

import javax.annotation.Nullable;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SuperEnergyDrink extends ItemFood {
	
	protected String name;
	
	public SuperEnergyDrink(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setMaxStackSize(1);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public SuperEnergyDrink(int amount, float saturation, boolean isWolfFood) {
        super(amount, saturation, isWolfFood);
    }
	
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
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
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(TextFormatting.BLUE + "Jump Boost");
		tooltip.add(TextFormatting.BLUE + "Speed");
		tooltip.add(TextFormatting.BLUE + "Haste");
		tooltip.add(TextFormatting.BLUE + "Water Breathing II");
		tooltip.add(TextFormatting.BLUE + "Regeneration II");
		tooltip.add(TextFormatting.BLUE + "Night Vision III");
		tooltip.add(TextFormatting.BLUE + "Invisibility III");
		tooltip.add(TextFormatting.BLUE + "Strength III (3:00)");
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack) {
	return EnumAction.DRINK;
	}
	

}
