package erebus.world.biomes.decorators;

import erebus.core.handler.configs.ConfigHandler;
import erebus.world.biomes.decorators.data.FeatureType;
import erebus.world.biomes.decorators.data.OreSettings;
import erebus.world.biomes.decorators.data.OreSettings.OreType;
import erebus.world.biomes.decorators.data.SurfaceType;
import erebus.world.feature.decoration.WorldGenRedGem;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

import java.util.Random;

public abstract class BiomeDecoratorBaseErebus {

	protected World world;
	protected Random rand;
	protected int x, z;
	protected int xx, yy, zz, attempt;
	private boolean isDecorating = false;

//	private static final OreSettings oreGen = new OreSettings();

//	protected static final WorldGenRedGem genRedGem = new WorldGenRedGem();

	protected BiomeDecoratorBaseErebus() {
	}

	public final void populate(World world, Random rand, int x, int z) {
		this.world = world;
		this.rand = rand;
		this.x = x;
		this.z = z;
		populate();
	}

	public final void decorate(World world, Random rand, int x, int z) {
		if (isDecorating)
			throw new RuntimeException("Already decorating Erebus!");
		isDecorating = true;
		this.world = world;
		this.rand = rand;
		this.x = x;
		this.z = z;

	/*	for (FeatureType featureType : FeatureType.values())
			generateFeature(featureType);

		boolean extraOres = ConfigHandler.INSTANCE.lead || ConfigHandler.INSTANCE.silver || ConfigHandler.INSTANCE.copper || ConfigHandler.INSTANCE.tin || ConfigHandler.INSTANCE.aluminium;

		for (OreType oreType : OreType.values()) {
			oreType.setupDefault(oreGen, extraOres);
			modifyOreGen(oreGen, oreType, extraOres);
			oreGen.generate(world, rand, x, z);
		}*/

		decorate();

		isDecorating = false;
	}

	protected void populate() {
	}

	protected void decorate() {
	}

	protected void modifyOreGen(OreSettings oreGen, OreType oreType, boolean extraOres) {
	}

	protected void generateFeature(FeatureType featureType) {
	/*	switch (featureType) {
			case REDGEM:
				for (attempt = 0; attempt < 5; attempt++)
					genRedGem.generate(world, rand, x + offsetXZ(), 64 + rand.nextInt(60), z + offsetXZ());
				break;
		}*/
	}

	protected final int offsetXZ() {
		return rand.nextInt(16) + 8;
	}

	protected boolean checkSurface(SurfaceType surfaceType, BlockPos pos) {
		//System.out.println("Surface Checked at "+ pos);
		return surfaceType.matchBlock(world.getBlockState(pos)) && world.isAirBlock(pos.up());
	}

	public static class BiomeDecoratorEmpty extends BiomeDecoratorBaseErebus {
	}
}