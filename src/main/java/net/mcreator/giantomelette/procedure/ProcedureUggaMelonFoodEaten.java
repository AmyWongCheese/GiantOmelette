package net.mcreator.giantomelette.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.giantomelette.ElementsGiantomeletteMod;

@ElementsGiantomeletteMod.ModElement.Tag
public class ProcedureUggaMelonFoodEaten extends ElementsGiantomeletteMod.ModElement {
	public ProcedureUggaMelonFoodEaten(ElementsGiantomeletteMod instance) {
		super(instance, 223);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure UggaMelonFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.SPEED, (int) 60, (int) 1));
	}
}
