package me.ez.jej.common.Effects;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.CollisionContext;

public class IcyFootEffect extends MobEffect {

    public IcyFootEffect(int amp) {
        super(MobEffectCategory.BENEFICIAL, amp);
    }

    @Override
    public void applyEffectTick(LivingEntity livingEntity, int amp) {
        if (livingEntity.isOnGround()) {
            BlockPos pos = livingEntity.getOnPos();
            Level level = livingEntity.getLevel();
            if (!level.isClientSide) {
                if (level.isWaterAt(pos)) {
                    level.setBlock(pos, Blocks.ICE.defaultBlockState(), 1);
                }
            }
        }
    }

    @Override
    public boolean isBeneficial() {
        return true;
    }

    @Override
    public boolean isDurationEffectTick(int p_19455_, int p_19456_) {
        return true;
    }
}
