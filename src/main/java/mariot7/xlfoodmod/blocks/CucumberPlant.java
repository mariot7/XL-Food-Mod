package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.XLFoodMod;
import mariot7.xlfoodmod.init.ItemListXL;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class CucumberPlant extends CropsBlock {

    public CucumberPlant(String name)
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
 		return ItemListXL.CUCUMBER_SEEDS;
  	}

  	@OnlyIn(Dist.CLIENT)
  	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
  	{
  		return new ItemStack(this.getSeedsItem());
  	}
  	
    public boolean onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hit)
    {
    	if(!world.isRemote)
		{
			if(this.isMaxAge(state))
			{
				world.addEntity(new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemListXL.CUCUMBER, world.rand.nextInt(3) + 1)));
				world.setBlockState(pos, this.withAge(0));
				return true;
			}
		}		
		return false;
    }

}
