package erebus.world.feature.plant;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

public class WorldGenMelon extends WorldGenerator {
	@Override
	public boolean generate(World world, Random rand, int x, int y, int z) {
		boolean canSpawn = rand.nextBoolean() && rand.nextBoolean();

		if (!canSpawn)
			for (int waterAttempt = 0; waterAttempt < 30; waterAttempt++)
				if (world.getBlock(x + rand.nextInt(8) - rand.nextInt(8), y + rand.nextInt(4) - rand.nextInt(4), z + rand.nextInt(8) - rand.nextInt(8)).getMaterial() == Material.water) {
					canSpawn = true;
					break;
				}

		if (!canSpawn)
			return false;

		for (int attempt = 0, xx, yy, zz; attempt < 64; ++attempt) {
			xx = x + rand.nextInt(8) - rand.nextInt(8);
			yy = y + rand.nextInt(4) - rand.nextInt(4);
			zz = z + rand.nextInt(8) - rand.nextInt(8);

			if (world.isAirBlock(xx, yy, zz) && world.getBlock(xx, yy - 1, zz) == Blocks.grass && Blocks.melon_block.canPlaceBlockAt(world, xx, yy, zz))
				world.setBlock(xx, yy, zz, Blocks.melon_block, 0, 3);
		}

		return true;
	}
}