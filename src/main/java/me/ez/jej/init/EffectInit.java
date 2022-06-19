package me.ez.jej.init;

import me.ez.jej.Main;
import me.ez.jej.common.Effects.IcyFootEffect;
import me.ez.jej.common.JuiceClass;
import me.ez.jej.common.Bushes.IcyBush;
import me.ez.jej.common.Bushes.WildBerryBush;
import me.ez.jej.common.TomatoBlock;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EffectInit {
    //Effects
    public static final DeferredRegister<MobEffect> EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Main.MOD_ID);
//    public static final RegistryObject<MobEffect> ICYFOOTEFFECT = EFFECT.register("icyfooteffect", () -> new IcyFootEffect(1));

}
