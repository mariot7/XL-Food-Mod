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

public class SpeedyEnergyDrinkItem extends ItemFoodXL {

	public SpeedyEnergyDrinkItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
        	entityLiving.addPotionEffect(new EffectInstance(Effects.SPEED, 500, 0, false, false));
        	entityLiving.addPotionEffect(new EffectInstance(Effects.HASTE, 500, 2, false, false));
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemListXL.EMPTY_CAN));        
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
	
	//@OnlyIn(Dist.CLIENT)
	//public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	//{
    //    tooltip.add(new TextComponentTranslation("speedyenergydrink.tooltip"));
    //    tooltip.add(new TextComponentTranslation("speedyenergydrink2.tooltip"));
	//}

}
