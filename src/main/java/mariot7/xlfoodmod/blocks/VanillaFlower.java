package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.Main;
import mariot7.xlfoodmod.XLFoodModTab;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VanillaFlower extends BlockBush {
    
	public VanillaFlower(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setCreativeTab(XLFoodModTab.tabXLFoodMod);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName("vanilla_flower");
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setSoundType(SoundType.PLANT);
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
    
    
}
