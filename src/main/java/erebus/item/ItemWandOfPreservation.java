package erebus.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.ModTabs;
import erebus.entity.EntityPreservedBlock;

public class ItemWandOfPreservation extends Item {

	public ItemWandOfPreservation() {
		setMaxStackSize(1);
		setCreativeTab(ModTabs.specials);
		setUnlocalizedName("erebus.wandOfPreservation");
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
		if (!player.capabilities.isCreativeMode)
			stack.stackSize--;
		world.playSoundAtEntity(player, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
		if (!world.isRemote)
			world.spawnEntityInWorld(new EntityPreservedBlock(world, player));
		return stack;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {
	}
}