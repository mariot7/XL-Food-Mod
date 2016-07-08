package mariot7.xlfoodmod.blocks;

import mariot7.xlfoodmod.Main;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VanillaFlower extends BlockBush{
    
	public VanillaFlower(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material);
		this.setCreativeTab(Main.tabXLFoodMod);
		this.setUnlocalizedName(unlocalizedName);
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
