package InfernalSpark.nukes.mod;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class MutantCod {

    public static final FoodComponent MUTANT_COD = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 600, 2), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2500, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 2000, 0), 1.0F).alwaysEdible().build();
    
}