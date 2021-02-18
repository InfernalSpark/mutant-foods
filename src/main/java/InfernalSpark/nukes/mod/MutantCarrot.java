package InfernalSpark.nukes.mod;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MutantCarrot {

    public static final FoodComponent MUTANT_CARROT = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 3000, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 2500), 1.0F).alwaysEdible().build();
    
}
