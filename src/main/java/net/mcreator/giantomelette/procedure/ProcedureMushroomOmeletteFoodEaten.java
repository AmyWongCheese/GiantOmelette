package net.mcreator.giantomelette.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.giantomelette.item.ItemMushroomOmelette2;
import net.mcreator.giantomelette.ElementsGiantOmelette;

@ElementsGiantOmelette.ModElement.Tag
public class ProcedureMushroomOmeletteFoodEaten extends ElementsGiantOmelette.ModElement {
	public ProcedureMushroomOmeletteFoodEaten(ElementsGiantOmelette instance) {
		super(instance, 183);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MushroomOmeletteFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemMushroomOmelette2.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}