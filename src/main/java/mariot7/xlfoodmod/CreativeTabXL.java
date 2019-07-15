package mariot7.xlfoodmod;

import mariot7.xlfoodmod.init.ItemListXL;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTabXL extends ItemGroup {
	
	private static final CreativeTabXL INSTANCE = new CreativeTabXL();

    public CreativeTabXL()
    {
        super(XLFoodMod.MOD_ID);
    }

    public static CreativeTabXL getInstance()
    {
        return INSTANCE;
    }
    
    public ItemStack createIcon()
    {
    	return new ItemStack(ItemListXL.PEPPER);
    }

}
