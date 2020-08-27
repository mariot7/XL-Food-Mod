package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.CreativeTabXL;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemXL extends BlockItem {
	
	public BlockItemXL(Block blockIn)
	{
		super(blockIn, new Properties().group(CreativeTabXL.getInstance()));
		setRegistryName(blockIn.getRegistryName());
	}

}
