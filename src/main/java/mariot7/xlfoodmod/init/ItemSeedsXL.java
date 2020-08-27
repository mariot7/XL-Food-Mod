package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.XLFoodMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.util.ResourceLocation;

public class ItemSeedsXL extends BlockNamedItem {
	
	public ItemSeedsXL(String name, Block crop)
	{
        super(crop, new Properties().maxStackSize(64));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
