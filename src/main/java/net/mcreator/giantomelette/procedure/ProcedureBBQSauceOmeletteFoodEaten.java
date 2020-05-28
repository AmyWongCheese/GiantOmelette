package net.mcreator.giantomelette.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.giantomelette.item.ItemBBQSauceOmelette2;
import net.mcreator.giantomelette.ElementsGiantOmelette;

@ElementsGiantOmelette.ModElement.Tag
public class ProcedureBBQSauceOmeletteFoodEaten extends ElementsGiantOmelette.ModElement {
	public ProcedureBBQSauceOmeletteFoodEaten(ElementsGiantOmelette instance) {
		super(instance, 134);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BBQSauceOmeletteFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(ItemBBQSauceOmelette2.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
