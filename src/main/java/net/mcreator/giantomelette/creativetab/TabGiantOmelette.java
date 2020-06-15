
package net.mcreator.giantomelette.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.giantomelette.item.ItemCarrotAndPeaOmelette;
import net.mcreator.giantomelette.ElementsGiantomeletteMod;

@ElementsGiantomeletteMod.ModElement.Tag
public class TabGiantOmelette extends ElementsGiantomeletteMod.ModElement {
	public TabGiantOmelette(ElementsGiantomeletteMod instance) {
		super(instance, 111);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabgiantomelette") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemCarrotAndPeaOmelette.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
