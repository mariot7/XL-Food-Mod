package mariot7.xlfoodmod.world;

import mariot7.xlfoodmod.init.BlockListXL;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

public class FeatureConfigsXL {
	
	public static final BlockClusterFeatureConfig GRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockListXL.GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(6).build();
	public static final BlockClusterFeatureConfig VANILLA_FLOWER_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BlockListXL.VANILLA_FLOWER.getDefaultState()), new SimpleBlockPlacer())).tries(1).build();
	
}
