package mariot7.xlfoodmod.items;

import mariot7.xlfoodmod.init.ItemFoodXL;
import mariot7.xlfoodmod.init.ItemListXL;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.items.ItemHandlerHelper;

public class CoffeeItem extends ItemFoodXL {

	public CoffeeItem(String name, int hunger, float saturation)
    {
        super(name, hunger, saturation);
    }
	
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
        if(entityLiving instanceof PlayerEntity)
        {
        	PlayerEntity player = (PlayerEntity) entityLiving;
            ItemHandlerHelper.giveItemToPlayer(player, new ItemStack(ItemListXL.COFFEE_CUP));
        }
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }

}
