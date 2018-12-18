package mariot7.xlfoodmod.blocks;

import biomesoplenty.api.block.BOPBlocks;
import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Onion extends BlockCrops {
	
	protected String name;
	
	public Onion(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public Item getSeed() {
		return ItemListxlfoodmod.onion;
	}
	
	public Item getCrop() {
		return ItemListxlfoodmod.onion;
	}
	
	public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	protected boolean canSustainBush(IBlockState state)
    {
		if (Main.isBiomesoPlentyLoaded) {
			return state.getBlock() == Blocks.FARMLAND || state.getBlock() == BOPBlocks.farmland_0 || state.getBlock() == BOPBlocks.farmland_1;
		}
		else {
			return state.getBlock() == Blocks.FARMLAND;
		}
    }
	
	@Override
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state)
    {
		IBlockState soil = worldIn.getBlockState(pos.down());
		if (Main.isBiomesoPlentyLoaded) {
			return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && soil.getBlock() == Blocks.FARMLAND || soil.getBlock() == BOPBlocks.farmland_0 || soil.getBlock() == BOPBlocks.farmland_1;
		}
		else {
			return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && soil.getBlock() == Blocks.FARMLAND;
		}
    }
	
	
}
