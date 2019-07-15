package mariot7.xlfoodmod.world;

import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;
import mariot7.xlfoodmod.init.BlockListXL;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.gen.GenerationStage;

public class OreGeneratorXL {
	
	public static void setupOregen()
	{
		for (Biome biome : ForgeRegistries.BIOMES)
		{
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(NATURAL_STONE, BlockListXL.ROCK_SALT.getDefaultState(), 6), COUNT_RANGE, new CountRangeConfig(6, 6, 6, 64)));
			
			biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(BlockListXL.GRASS.getDefaultState()), Placement.CHANCE_HEIGHTMAP, new ChanceConfig(5)));
			biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH, new BushConfig(BlockListXL.VANILLA_FLOWER.getDefaultState()), Placement.CHANCE_HEIGHTMAP, new ChanceConfig(7)));
		}
	}

}
