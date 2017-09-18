package erebus.blocks;

import java.util.Random;

import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockSpiderSpawner extends BlockSpawner {

	public BlockSpiderSpawner(String mobName) {
		super("erebus." + mobName);
		setHarvestLevel("pickaxe", 0);
	}

	@Override
	public Item getItemDropped(int id, Random rand, int fortune) {
		return Items.string;
	}

	@Override
	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(3);
	}
}