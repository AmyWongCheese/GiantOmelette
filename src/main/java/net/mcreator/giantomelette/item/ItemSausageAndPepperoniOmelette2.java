
package net.mcreator.giantomelette.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.giantomelette.procedure.ProcedureSausageAndPepperoniOmelette2FoodEaten;
import net.mcreator.giantomelette.creativetab.TabGiantOmelette;
import net.mcreator.giantomelette.ElementsGiantOmelette;

@ElementsGiantOmelette.ModElement.Tag
public class ItemSausageAndPepperoniOmelette2 extends ElementsGiantOmelette.ModElement {
	@GameRegistry.ObjectHolder("giantomelette:sausageandpepperoniomelette2")
	public static final Item block = null;
	public ItemSausageAndPepperoniOmelette2(ElementsGiantOmelette instance) {
		super(instance, 60);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("giantomelette:sausageandpepperoniomelette2", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(4, 0.3f, false);
			setUnlocalizedName("sausageandpepperoniomelette2");
			setRegistryName("sausageandpepperoniomelette2");
			setCreativeTab(TabGiantOmelette.tab);
			setMaxStackSize(64);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.EAT;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureSausageAndPepperoniOmelette2FoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}