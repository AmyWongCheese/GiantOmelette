
package net.mcreator.giantomelette.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.giantomelette.creativetab.TabGiantOmelette;
import net.mcreator.giantomelette.ElementsGiantomeletteMod;

@ElementsGiantomeletteMod.ModElement.Tag
public class ItemStrawberryOmelette3 extends ElementsGiantomeletteMod.ModElement {
	@GameRegistry.ObjectHolder("giantomelette:strawberryomelette3")
	public static final Item block = null;
	public ItemStrawberryOmelette3(ElementsGiantomeletteMod instance) {
		super(instance, 97);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("giantomelette:strawberryomelette3", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 0.3f, false);
			setUnlocalizedName("strawberryomelette3");
			setRegistryName("strawberryomelette3");
			setCreativeTab(TabGiantOmelette.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
