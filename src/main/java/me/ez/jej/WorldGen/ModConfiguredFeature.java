package me.ez.jej.WorldGen;

import me.ez.jej.init.BlockInit;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BushBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeature<E, I> {

    private static final List<Block> blocks = List.of(
            Blocks.GRASS_BLOCK
    );

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_ICE_BERRY_BUSH = PatchBush(BlockInit.ICE_BERRY_BUSH.get(), blocks, "ice");

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PATCH_WILD_BERRY_BUSH = PatchBush(BlockInit.WILD_BERRY_BUSH.get(),blocks, "wild");


    private static Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> PatchBush(BushBlock block, List<Block> PlaceableBlockList, String registerName){
        return FeatureUtils.register("patch_" + registerName + "_bush",
                Feature.RANDOM_PATCH,
                FeatureUtils.simplePatchConfiguration(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(
                                block.defaultBlockState()
                                        .setValue(BlockStateProperties.AGE_3, Integer.valueOf(3)))), PlaceableBlockList));
    }
}
