package erebus.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import erebus.lib.EnumWood;
import erebus.lib.Reference;

public class BlockPlanksErebus extends Block {

	public static int dataBamboo = 0;

	public static int dataWhite = 1;

	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	public BlockPlanksErebus() {
		super(Material.wood);
		setBlockName(Reference.MOD_ID + ".planks");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta) {
		return icons[meta < 0 || meta >= icons.length ? 0 : meta];
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void getSubBlocks(Item item, CreativeTabs tab, List list) {
		for (int i = 0; i < icons.length; i++)
			list.add(new ItemStack(item, 1, i));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister reg) {
		icons = new IIcon[EnumWood.values().length];

		for (int i = 0; i < icons.length; i++)
			icons[i] = reg.registerIcon("erebus:planks_" + EnumWood.values()[i].name().toLowerCase());
	}
}