package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.XLFoodMod;
import mariot7.xlfoodmod.init.ItemListXL;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class TomatoPlant extends CropsBlock {

    public TomatoPlant(String name)
    {
        super(Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().sound(SoundType.CROP));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }
    
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos)
    {
    	return state.getBlock() instanceof FarmlandBlock;
    }

   	@OnlyIn(Dist.CLIENT)
  	protected IItemProvider getSeedsItem()
  	{
   		return ItemListXL.TOMATO_SEEDS;
  	}

  	@OnlyIn(Dist.CLIENT)
  	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
  	{
  		return new ItemStack(this.getSeedsItem());
	}
  	
}
