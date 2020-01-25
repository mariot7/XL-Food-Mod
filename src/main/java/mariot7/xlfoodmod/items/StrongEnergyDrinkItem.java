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

public class StrongEnergyDrinkItem extends ItemFoodXL {

	public StrongEnergyDrinkItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
        	entityLiving.addPotionEffect(new EffectInstance(Effects.STRENGTH, 2400, 1, false, true));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 2400, 1, false, true));
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
	}

}
