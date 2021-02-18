package InfernalSpark.nukes.mod;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MutantSteak {

    public static final FoodComponent MUTANT_STEAK = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.7F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2500, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 2000, 0), 1.0F).alwaysEdible().build();
    
}
