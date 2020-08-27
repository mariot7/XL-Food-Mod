package mariot7.xlfoodmod.init;

import mariot7.xlfoodmod.CreativeTabXL;
import mariot7.xlfoodmod.XLFoodMod;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ItemXL extends Item {
	
	public ItemXL(String name)
	{
        super(new Properties().group(CreativeTabXL.getInstance()));
        this.setRegistryName(new ResourceLocation(XLFoodMod.MOD_ID, name));
    }

}
