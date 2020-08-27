package mariot7.xlfoodmod.items;

import java.util.List;

import mariot7.xlfoodmod.init.ItemFoodXL;
import mariot7.xlfoodmod.init.ItemListXL;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.items.ItemHandlerHelper;

public class SuperEnergyDrinkItem extends ItemFoodXL {

	public SuperEnergyDrinkItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
        	entityLiving.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 3600, 2, false, false));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.SPEED, 3600, 0, false, false));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.HASTE, 3600, 0, false, false));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 3600, 2, false, false));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 3600, 0, false, false));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.REGENERATION, 3600, 1, false, false));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 3600, 1, false, false));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 3600, 2, false, false));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemListXL.EMPTY_CAN));        
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip").applyTextStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip2").applyTextStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip3").applyTextStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip4").applyTextStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip5").applyTextStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip6").applyTextStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip7").applyTextStyle(TextFormatting.BLUE));
		tooltip.add(new TranslationTextComponent(this.getTranslationKey() + ".tooltip8").applyTextStyle(TextFormatting.BLUE));
	}

}
