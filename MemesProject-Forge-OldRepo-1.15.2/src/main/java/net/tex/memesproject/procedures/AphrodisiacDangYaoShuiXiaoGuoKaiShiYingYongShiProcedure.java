package net.tex.memesproject.procedures;

import net.tex.memesproject.MemesprojectModElements;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@MemesprojectModElements.ModElement.Tag
public class AphrodisiacDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure extends MemesprojectModElements.ModElement {
	public AphrodisiacDangYaoShuiXiaoGuoKaiShiYingYongShiProcedure(MemesprojectModElements instance) {
		super(instance, 36);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure AphrodisiacDangYaoShuiXiaoGuoKaiShiYingYongShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.disableDamage = (false);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
