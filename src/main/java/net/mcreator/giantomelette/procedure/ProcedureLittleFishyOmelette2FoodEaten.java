package net.mcreator.giantomelette.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.giantomelette.item.ItemLittleFishyOmelette3;
import net.mcreator.giantomelette.ElementsGiantomeletteMod;

@ElementsGiantomeletteMod.ModElement.Tag
public class ProcedureLittleFishyOmelette2FoodEaten extends ElementsGiantomeletteMod.ModElement {
	public ProcedureLittleFishyOmelette2FoodEaten(ElementsGiantomeletteMod instance) {
		super(instance, 175);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LittleFishyOmelette2FoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemLittleFishyOmelette3.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
