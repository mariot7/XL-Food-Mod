package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class VanillaFlower extends BlockBush {
	
	protected String name;
    
	public VanillaFlower(String name, Material material, float hardness, float resistance) {
		super(material);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setSoundType(SoundType.PLANT);
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	 
    public boolean isFullCube()
    {
        return false;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    public boolean shouldSideBeRendered()
    {
    	return false;
    }
    
    public void registerItemModel(Item itemBlock) {
		Main.proxy.registerItemRenderer(itemBlock, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
    
}
