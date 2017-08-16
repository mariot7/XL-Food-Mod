package mariot7.xlfoodmod.blocks;

import java.util.Random;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import mariot7.xlfoodmod.init.ItemListxlfoodmod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RockSalt extends Block {

	public RockSalt(String name, Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
		this.setSoundType(SoundType.STONE);
		this.setHardness(1.5F);
	}		
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) { 
	return ItemListxlfoodmod.salt;
    }
	
    @Override
    public int quantityDropped(Random rand) {
    return 4;
    }

    
}
