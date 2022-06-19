package me.ez.jej.common;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import me.ez.jej.Main;
import me.ez.jej.init.ItemInit;
import net.minecraft.ChatFormatting;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectUtil;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;

public class JuiceClass extends PotionItem {

    private static final Component NO_EFFECT = (Component.translatable("effect.none")).withStyle(ChatFormatting.GRAY);


    public JuiceClass(Properties properties) {
        super(properties.stacksTo(1).tab(Main.TAB));
    }

    private List<MobEffectInstance> getJuiceEffects(ItemStack stack) {

        List<MobEffectInstance> list = Lists.newArrayList();

        if (ItemInit.APPLE_JUICE.get() == stack.getItem() || ItemInit.APPLE_JUICE_BOOSTED.get() == stack.getItem()) {
            list.add(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0));
            if (ItemInit.APPLE_JUICE_BOOSTED.get() == stack.getItem()) {
                list.add(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
                list.add(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0));


            }

        } else if (ItemInit.SWEETBERRY_JUICE.get() == stack.getItem() || ItemInit.SWEETBERRY_JUICE_BOOSTED.get() == stack.getItem()) {
            if (stack.getItem() == ItemInit.SWEETBERRY_JUICE_BOOSTED.get()) {
                list.add(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 3600, 1));
            } else {
                list.add(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 0));
            }

        } else if (ItemInit.MELON_JUICE.get() == stack.getItem() || ItemInit.MELON_JUICE_BOOSTED.get() == stack.getItem()) {
            if (stack.getItem() == ItemInit.MELON_JUICE_BOOSTED.get()) {
                list.add(new MobEffectInstance(MobEffects.JUMP, 3600, 1));
            } else {
                list.add(new MobEffectInstance(MobEffects.JUMP, 1200, 0));
            }

        } else if (ItemInit.BAKEDPOTATO_JUICE.get() == stack.getItem() || ItemInit.BAKEDPOTATO_JUICE_BOOSTED.get() == stack.getItem()) {
            if (stack.getItem() == ItemInit.BAKEDPOTATO_JUICE_BOOSTED.get()) {
                list.add(new MobEffectInstance(MobEffects.DIG_SPEED, 2400, 1));
            } else {
                list.add(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0));
                list.add(new MobEffectInstance(MobEffects.DIG_SPEED, 1600, 0));
            }

        } else if (ItemInit.PUMPKIN_JUICE.get() == stack.getItem() || ItemInit.PUMPKIN_JUICE_BOOSTED.get() == stack.getItem()) {
            if (stack.getItem() == ItemInit.PUMPKIN_JUICE_BOOSTED.get()) {
                list.add(new MobEffectInstance(MobEffects.INVISIBILITY, 2400, 0));
            } else {
                list.add(new MobEffectInstance(MobEffects.INVISIBILITY, 1200, 0));
            }

        }
//        else if (ItemInit.WILDBERRY_JUICE.get() == stack.getItem() || ItemInit.WILDBERRY_JUICE_BOOSTED.get() == stack.getItem()) {
//            if (stack.getItem() == ItemInit.WILDBERRY_JUICE_BOOSTED.get()) {
//                list.add(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1));
//                list.add(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0));
//            } else {
//                list.add(new MobEffectInstance(MobEffects.ABSORPTION, 1100, 0));
//            }
//
//        } else if (ItemInit.ICEBERRY_JUICE.get() == stack.getItem() || ItemInit.ICEBERRY_JUICE_BOOSTED.get() == stack.getItem()) {
//            if (stack.getItem() == ItemInit.ICEBERRY_JUICE_BOOSTED.get()) {
//                list.add(new MobEffectInstance(ItemInit.ICYFOOTEFFECT.get(), 1200, 0));
//                list.add(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0));
//            } else {
//                list.add(new MobEffectInstance(ItemInit.ICYFOOTEFFECT.get(), 1200, 0));
//            }
//
//        }
        else if (ItemInit.DRIEDKELP_JUICE.get() == stack.getItem() || ItemInit.DRIEDKELP_JUICE_BOOSTED.get() == stack.getItem()) {
            if (stack.getItem() == ItemInit.DRIEDKELP_JUICE_BOOSTED.get()) {
                list.add(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400, 0));
                list.add(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0));
            } else {
                list.add(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 1200, 0));
            }

        } else if (ItemInit.CARROT_JUICE.get() == stack.getItem() || ItemInit.CARROT_JUICE_BOOSTED.get() == stack.getItem()) {
            if (stack.getItem() == ItemInit.CARROT_JUICE_BOOSTED.get()) {
                list.add(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 3600, 0));
                list.add(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 3600, 0));
            } else {
                list.add(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 0));
            }
        } else if (ItemInit.GOLDENAPPLE_JUICE.get() == stack.getItem()) {
            list.add(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 0));
            list.add(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0));
            list.add(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0));

        } else if (ItemInit.GOLDENCARROT_JUICE.get() == stack.getItem()) {
            list.add(new MobEffectInstance(MobEffects.NIGHT_VISION, 3600, 0));
            list.add(new MobEffectInstance(MobEffects.WATER_BREATHING, 3600, 0));
            list.add(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2400, 1));

        } else if (ItemInit.GLISTERING_MELON_JUICE.get() == stack.getItem()) {
            list.add(new MobEffectInstance(MobEffects.REGENERATION, 200, 0));
            list.add(new MobEffectInstance(MobEffects.SLOW_FALLING, 1200, 0));
            list.add(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2400, 0));

        }
        return list;
    }

    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity livingEntity) {
        Player player = livingEntity instanceof Player ? (Player)livingEntity : null;

        //Not Sure
        if (player instanceof ServerPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer)player, stack);
        }

        //Wanted
        if (!level.isClientSide) {
            for(MobEffectInstance mobeffectinstance : getJuiceEffects(stack)) {
                if (mobeffectinstance.getEffect().isInstantenous()) {
                    mobeffectinstance.getEffect().applyInstantenousEffect(player, player, livingEntity, mobeffectinstance.getAmplifier(), 1.0D);
                } else {
                    livingEntity.addEffect(new MobEffectInstance(mobeffectinstance));
                }
            }
        }
        //Wanted
        if (player != null) {
            player.awardStat(Stats.ITEM_USED.get(this));
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
        }

        //Wanted
        if (player == null || !player.getAbilities().instabuild) {
            if (stack.isEmpty()) {
                return new ItemStack(ItemInit.GLASS_BOTTLE.get());
            }
            if (player != null) {
                player.getInventory().add(new ItemStack(ItemInit.GLASS_BOTTLE.get()));
            }
        }

        level.gameEvent(livingEntity, GameEvent.ITEM_INTERACT_FINISH, livingEntity.getOnPos());
        return stack;
    }

    public @NotNull String getDescriptionId(ItemStack stack) {
        return stack.getItem().getDescription().getString();
    }

    @Override
    public boolean isFoil(ItemStack itemStack) {
        return itemStack.getRarity() == Rarity.RARE;
    }

    @Override
    public void fillItemCategory(@NotNull CreativeModeTab creativeModeTab, @NotNull NonNullList<ItemStack> stacks) {
        if (this.allowedIn(creativeModeTab)) {
            stacks.add(new ItemStack(this));
        }
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level p_42989_, List<Component> components, TooltipFlag flag) {
        List<MobEffectInstance> list = getJuiceEffects(stack);
        List<Pair<Attribute, AttributeModifier>> list1 = Lists.newArrayList();
        if (list.isEmpty()) {
            components.add(NO_EFFECT);
        } else {
            for(MobEffectInstance mobeffectinstance : list) {
                MutableComponent mutablecomponent = Component.translatable(mobeffectinstance.getDescriptionId()).withStyle(ChatFormatting.GOLD);
                MobEffect mobeffect = mobeffectinstance.getEffect();
                Map<Attribute, AttributeModifier> map = mobeffect.getAttributeModifiers();
                if (!map.isEmpty()) {
                    for(Map.Entry<Attribute, AttributeModifier> entry : map.entrySet()) {
                        AttributeModifier attributemodifier = entry.getValue();
                        AttributeModifier attributemodifier1 = new AttributeModifier(attributemodifier.getName(), mobeffect.getAttributeModifierValue(mobeffectinstance.getAmplifier(), attributemodifier), attributemodifier.getOperation());
                        list1.add(new Pair<>(entry.getKey(), attributemodifier1));
                    }
                }

                if (mobeffectinstance.getAmplifier() > 0) {
                    mutablecomponent = Component.translatable("potion.withAmplifier", mutablecomponent, Component.translatable("potion.potency." + mobeffectinstance.getAmplifier())).withStyle(ChatFormatting.RED);
                }

                if (mobeffectinstance.getDuration() > 20) {
                    mutablecomponent = Component.translatable("potion.withDuration", mutablecomponent, MobEffectUtil.formatDuration(mobeffectinstance, 1.0F));
                }

                components.add(mutablecomponent.withStyle(mobeffect.getCategory().getTooltipFormatting()));
            }
        }
    }
}
