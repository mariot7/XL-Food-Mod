package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.XLFoodMod;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockCakeXL extends CakeBlock {

	public BlockCakeXL(String name, int foodlevel, float saturation)
	{
		super(Properties.create(Material.CAKE).hardnessAndResistance(0.5F).sound(SoundType.CLOTH));
		this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
	}

}
