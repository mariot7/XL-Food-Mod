package mariot7.xlfoodmod.world;

import java.util.Random;
import mariot7.xlfoodmod.init.BlockListxlfoodmod;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGeneratorRockSaltxlfoodmod implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
	    case 0: //Overworld
	    this.runGenerator(this.gen_rock_salt, world, random, chunkX, chunkZ, 18, 0, 64);
        }
        
	}
	
		public WorldGenerator gen_rock_salt;
		public WorldGeneratorRockSaltxlfoodmod() {
		    this.gen_rock_salt = new WorldGenMinable(BlockListxlfoodmod.rock_salt.getDefaultState(), 8);
		}
		
		private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
		    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
		        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

		    int heightDiff = maxHeight - minHeight + 1;
		    for (int i = 0; i < chancesToSpawn; i ++) {
		        int x = chunk_X * 16 + rand.nextInt(16);
		        int y = minHeight + rand.nextInt(heightDiff);
		        int z = chunk_Z * 16 + rand.nextInt(16);
		        generator.generate(world, rand, new BlockPos(x, y, z));
		    }

	}

		
 }
