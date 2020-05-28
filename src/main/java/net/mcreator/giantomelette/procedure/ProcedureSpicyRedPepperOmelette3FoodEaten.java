package net.mcreator.giantomelette.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.giantomelette.ElementsGiantOmelette;

@ElementsGiantOmelette.ModElement.Tag
public class ProcedureSpicyRedPepperOmelette3FoodEaten extends ElementsGiantOmelette.ModElement {
	public ProcedureSpicyRedPepperOmelette3FoodEaten(ElementsGiantOmelette instance) {
		super(instance, 200);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpicyRedPepperOmelette3FoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, (int) 60, (int) 1));
	}
}
