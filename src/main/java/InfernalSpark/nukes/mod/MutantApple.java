package InfernalSpark.nukes.mod;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MutantApple {

    public static final FoodComponent MUTANT_APPLE = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1250, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 2500, 0), 1.0F).alwaysEdible().build();
    
}
