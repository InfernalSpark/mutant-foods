package InfernalSpark.nukes.mod;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class UraniumFoodComponents {

    public static final FoodComponent URANIUM = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600, 0), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1200, 0), 1.0F).build();
    
}
