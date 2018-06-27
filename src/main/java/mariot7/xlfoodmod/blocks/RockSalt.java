package mariot7.xlfoodmod.blocks;

import java.util.Random;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class RockSalt extends BlockOre {
	
	protected String name;

	public RockSalt(String name, Material materialIn) {
		super();
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.5F);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}		
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) { 
	return ItemListxlfoodmod.salt;
    }
	
    @Override
    public int quantityDropped(Random rand) {
    return 4;
    }
    
    public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune)
	{
		Random rand = world instanceof World ? ((World)world).rand : new Random();
		if (this.getItemDropped(state, rand, fortune) != Item.getItemFromBlock(this)) {			
		    int i = 0;
		
		    i = MathHelper.getInt(rand, 0, 2);
		
		    return i;
		}
		
		return 0;
	}
	
    
}
