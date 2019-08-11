package mariot7.xlfoodmod.blocks;

import java.util.Random;

import mariot7.xlfoodmod.XLFoodMod;
import mariot7.xlfoodmod.init.ItemListXL;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.IPlantable;

public class CornPlant extends CropsBlock {

	public CornPlant(String name)
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
		return ItemListXL.CORN_SEEDS;
	}

	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state)
	{
		return new ItemStack(this.getSeedsItem());
	}

	public IntegerProperty getAgeProperty()
	{
		return AGE;
	}

	public int getMaxAge()
	{
		return 5; 
	}

	protected int getAge(BlockState state)
	{
		return state.get(this.getAgeProperty());
	}

	public BlockState withAge(int age)
	{
		return this.getDefaultState().with(this.getAgeProperty(), Integer.valueOf(age));
	}

	public boolean isMaxAge(BlockState state)
	{
		return state.get(this.getAgeProperty()) >= this.getMaxAge();
	}   
	   
	public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit)
	{
		if (!worldIn.isRemote)
		{
			if (player.getHeldItem(handIn).getItem() == Items.BONE_MEAL)
			{
				if(this.getAge(state)==5)
				{
					ItemStack stack = player.getHeldItem(handIn);
					worldIn.setBlockState(pos, this.withAge(6), 3);
					if (worldIn.getBlockState(pos.up()) == Blocks.AIR.getDefaultState())
						worldIn.setBlockState(pos.up(), this.withAge(7), 3);
					stack.shrink(1);
					return true;
				}
			}
			else
			{
				if (this.getAge(state) == 7)
				{
					spawnAsEntity(worldIn, pos, new ItemStack(ItemListXL.RAW_CORN, 2));
					worldIn.playSound((PlayerEntity)null, pos, SoundEvents.BLOCK_CROP_BREAK, SoundCategory.BLOCKS, 1.0F, 0.8F + worldIn.rand.nextFloat() * 0.4F);
					worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
					worldIn.setBlockState(pos.down(), state.with(AGE, Integer.valueOf(0)), 3);
					return true;
				}
			}
		}
		return false;
	}

	public void tick(BlockState state, World worldIn, BlockPos pos, Random random)
	{
		super.tick(state, worldIn, pos, random);
		if (!worldIn.isAreaLoaded(pos, 1)) return;
		if (worldIn.getLightSubtracted(pos, 0) >= 9)
		{
			int i = this.getAge(state);
			if (i < 6)
			{
				float f = getGrowthChance(this, worldIn, pos);
				if (ForgeHooks.onCropsGrowPre(worldIn, pos, state, random.nextInt((int)(25.0F / f) + 1) == 0)) 
				{
					if (i==5)
					{
						worldIn.setBlockState(pos, this.withAge(6), 3);
						if (worldIn.getBlockState(pos.up()) == Blocks.AIR.getDefaultState())
							worldIn.setBlockState(pos.up(), this.withAge(7), 3);	            		
					}
					else
						worldIn.setBlockState(pos, this.withAge(i + 1), 3);
					ForgeHooks.onCropsGrowPost(worldIn, pos, state);
				}
			}
		}
	}

	public void grow(World worldIn, BlockPos pos, BlockState state)
	{
		int i = this.getAge(state) + this.getBonemealAgeIncrease(worldIn);
		int j = this.getMaxAge();
		if (i > j)
		{
			i = j;
		}
		worldIn.setBlockState(pos, this.withAge(i), 2);
	}

	protected int getBonemealAgeIncrease(World worldIn)
	{
		return MathHelper.nextInt(worldIn.rand, 2, 5);
	}

	protected static float getGrowthChance(Block blockIn, IBlockReader worldIn, BlockPos pos)
	{
		float f = 1.0F;
		BlockPos blockpos = pos.down();
		for(int i = -1; i <= 1; ++i)
		{
			for(int j = -1; j <= 1; ++j)
			{
				float f1 = 0.0F;
				BlockState blockstate = worldIn.getBlockState(blockpos.add(i, 0, j));
				if (blockstate.canSustainPlant(worldIn, blockpos.add(i, 0, j), Direction.UP, (IPlantable)blockIn))
				{
					f1 = 1.0F;
					if (blockstate.isFertile(worldIn, blockpos.add(i, 0, j)))
					{
						f1 = 3.0F;
					}
				}
				if (i != 0 || j != 0)
				{
					f1 /= 4.0F;
				}
				f += f1;
			}
		}
		BlockPos blockpos1 = pos.north();
		BlockPos blockpos2 = pos.south();
		BlockPos blockpos3 = pos.west();
		BlockPos blockpos4 = pos.east();
		boolean flag = blockIn == worldIn.getBlockState(blockpos3).getBlock() || blockIn == worldIn.getBlockState(blockpos4).getBlock();
		boolean flag1 = blockIn == worldIn.getBlockState(blockpos1).getBlock() || blockIn == worldIn.getBlockState(blockpos2).getBlock();
		if (flag && flag1)
		{
			f /= 2.0F;
		}
		else
		{
			boolean flag2 = blockIn == worldIn.getBlockState(blockpos3.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.north()).getBlock() || blockIn == worldIn.getBlockState(blockpos4.south()).getBlock() || blockIn == worldIn.getBlockState(blockpos3.south()).getBlock();
			if (flag2)
			{
				f /= 2.0F;
			}
		}
		return f;
	}

	public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
	{	   
		if (this.getAge(state) == 6 && worldIn.getBlockState(pos.up()) == Blocks.AIR.getDefaultState())
			return false;
		else
			return (worldIn.getLightSubtracted(pos, 0) >= 8 || worldIn.isSkyLightMax(pos)) && checker(state, worldIn, pos);
	}
	   

	public boolean checker(BlockState state, IWorldReader worldIn, BlockPos pos)
	{
		Block block = worldIn.getBlockState(pos.down()).getBlock();	   
		if (block == Blocks.FARMLAND)
			return true;
		if (block == this && !worldIn.getBlockState(pos.down(3)).getBlock().equals(Blocks.FARMLAND) && worldIn.getBlockState(pos.down()) == this.withAge(6))
			return true; 
		else return false;
	}

	public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn)
	{
		if (entityIn instanceof RavagerEntity && net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(worldIn, entityIn))
		{
			worldIn.destroyBlock(pos, true);
		}
		super.onEntityCollision(state, worldIn, pos, entityIn);
	}
	
}
