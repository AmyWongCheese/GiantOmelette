
package net.mcreator.giantomelette.item;

import net.minecraftforge.oredict.OreDictionary;
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
import net.mcreator.giantomelette.ElementsGiantOmelette;

@ElementsGiantOmelette.ModElement.Tag
public class ItemTigersquash extends ElementsGiantOmelette.ModElement {
	@GameRegistry.ObjectHolder("giantomelette:tigersquash")
	public static final Item block = null;
	public ItemTigersquash(ElementsGiantOmelette instance) {
		super(instance, 198);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("giantomelette:tigersquash", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(1, 0.3f, false);
			setUnlocalizedName("tigersquash");
			setRegistryName("tigersquash");
			setCreativeTab(TabGiantOmelette.tab);
			setMaxStackSize(64);
			OreDictionary.registerOre("listAllfruit", this);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}
	}
}
