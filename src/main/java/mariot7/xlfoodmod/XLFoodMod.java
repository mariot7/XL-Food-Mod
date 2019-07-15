package mariot7.xlfoodmod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mariot7.xlfoodmod.world.OreGeneratorXL;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(XLFoodMod.MOD_ID)
public class XLFoodMod {
	
    public static final String MOD_ID = "xlfoodmod";
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	public XLFoodMod()
	{
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
    {
		// some preinit code
		OreGeneratorXL.setupOregen();
    }
	
	private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
    }
	
	private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
    }
	
	private void doClientStuff(final FMLClientSetupEvent event)
	{
        // do something that can only be done on the client
	}	
	
	public static Logger getLogger()
    {
        return LOGGER;
    }

}
