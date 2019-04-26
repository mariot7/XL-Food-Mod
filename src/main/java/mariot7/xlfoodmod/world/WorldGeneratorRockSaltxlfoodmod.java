package mariot7.xlfoodmod.world;

import java.util.Random;

import mariot7.xlfoodmod.config.Configurationxlfoodmod;
import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneratorRockSaltxlfoodmod implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(BlockListxlfoodmod.rock_salt.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, Configurationxlfoodmod.rocksaltgeneration.miny, Configurationxlfoodmod.rocksaltgeneration.maxy, Configurationxlfoodmod.rocksaltgeneration.minveinsize, Configurationxlfoodmod.rocksaltgeneration.maxveinsize, Configurationxlfoodmod.rocksaltgeneration.chancestospawn);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int minVeinSize, int maxVeinSize, int chancesToSpawn) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chancesToSpawn; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(ore, minVeinSize + random.nextInt(maxVeinSize - minVeinSize + 1));
			generator.generate(world, random, pos);
		}
	}
	

}
