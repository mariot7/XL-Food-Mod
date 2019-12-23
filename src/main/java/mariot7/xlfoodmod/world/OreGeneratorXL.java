package mariot7.xlfoodmod.world;

import mariot7.xlfoodmod.init.BlockListXL;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.WeightedBlockStateProvider;

public class OreGeneratorXL {
	
	 public static void setupOregen()
	{
		for (Biome biome : ForgeRegistries.BIOMES)
		{
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockListXL.ROCK_SALT.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(6, 6, 6, 64))));
			
			BlockClusterFeatureConfig featureConfigGrass = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).func_227407_a_(BlockListXL.GRASS.getDefaultState(), 1), new SimpleBlockPlacer())).func_227315_a_(64).func_227322_d_();
			biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227247_y_.func_225566_b_(featureConfigGrass).func_227228_a_(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(2))));
			
			BlockClusterFeatureConfig featureConfigVanillaFlower = (new BlockClusterFeatureConfig.Builder((new WeightedBlockStateProvider()).func_227407_a_(BlockListXL.VANILLA_FLOWER.getDefaultState(), 1), new SimpleBlockPlacer())).func_227315_a_(64).func_227322_d_();
			biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.field_227247_y_.func_225566_b_(featureConfigVanillaFlower).func_227228_a_(Placement.COUNT_HEIGHTMAP_DOUBLE.func_227446_a_(new FrequencyConfig(1))));
		}
	}

}
