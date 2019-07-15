package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.init.ItemFoodXL;
import mariot7.xlfoodmod.init.ItemListXL;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
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
	
	//@OnlyIn(Dist.CLIENT)
	//public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	//{
	//    tooltip.add(new TextComponentTranslation("superenergydrink.tooltip"));
	//    tooltip.add(new TextComponentTranslation("superenergydrink2.tooltip"));
	//    tooltip.add(new TextComponentTranslation("superenergydrink3.tooltip"));
	//    tooltip.add(new TextComponentTranslation("superenergydrink4.tooltip"));
	//    tooltip.add(new TextComponentTranslation("superenergydrink5.tooltip"));
	//    tooltip.add(new TextComponentTranslation("superenergydrink6.tooltip"));
	//    tooltip.add(new TextComponentTranslation("superenergydrink7.tooltip"));
	//    tooltip.add(new TextComponentTranslation("superenergydrink8.tooltip"));
	//}

}
