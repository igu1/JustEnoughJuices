package me.ez.jej.common.Effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class LightningEffect extends MobEffect {

    protected LightningEffect(MobEffectCategory category, int i) {
        super(category, i);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amp) {
        super.applyEffectTick(entity, amp);
    }

    @Override
    public boolean isDurationEffectTick(int duration, int amp) {
        return duration % 5 == 0;
    }
}
