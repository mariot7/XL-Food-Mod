package mariot7.xlfoodmod.init;

import biomesoplenty.api.block.BOPBlocks;
import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemSeedsxlfoodmod extends ItemSeeds {
	
	protected String name;
	private final Block crops;
	
	public ItemSeedsxlfoodmod(Block crops, Block soil, String name) {
		super(crops, soil);
		this.name = name;
		this.crops = crops;
		setUnlocalizedName(name);
		setRegistryName(name);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
	}
	
	public static void addGrassSeed(ItemStack seed, int weight) {
		 
	}
	 
	public void registerItemModel() {
		Main.proxy.registerItemRenderer(this, 0, name);
	}
	 
	public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
	{
		ItemStack itemstack = player.getHeldItem(hand);
		net.minecraft.block.state.IBlockState state = worldIn.getBlockState(pos);
		if (Main.isBiomesoPlentyLoaded) {
			if (facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, itemstack) && state.getBlock() == Blocks.FARMLAND || state.getBlock() == BOPBlocks.farmland_0 || state.getBlock() == BOPBlocks.farmland_1 && worldIn.isAirBlock(pos.up()))
			{
				worldIn.setBlockState(pos.up(), this.crops.getDefaultState());

				if (player instanceof EntityPlayerMP)
				{
					CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos.up(), itemstack);
				}

				itemstack.shrink(1);
				return EnumActionResult.SUCCESS;
	        	}
	        	else
	        	{
	        		return EnumActionResult.FAIL;
	        	}
		}
		else {
			if (facing == EnumFacing.UP && player.canPlayerEdit(pos.offset(facing), facing, itemstack) && state.getBlock() == Blocks.FARMLAND && worldIn.isAirBlock(pos.up()))
			{
				worldIn.setBlockState(pos.up(), this.crops.getDefaultState());

				if (player instanceof EntityPlayerMP)
				{
					CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos.up(), itemstack);
				}

				itemstack.shrink(1);
				return EnumActionResult.SUCCESS;
	        	}
	        	else
	        	{
	        		return EnumActionResult.FAIL;
	        	}
		
		}
	}
	
	 
}
