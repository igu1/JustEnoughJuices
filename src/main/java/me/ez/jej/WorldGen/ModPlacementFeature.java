package me.ez.jej.WorldGen;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacementFeature {

    public static final Holder<PlacedFeature> PATCH_WILD_BUSH = bushPlacementFeature(
            "patch_wild_bush",
            ModConfiguredFeature.PATCH_WILD_BERRY_BUSH,
            32);

    public static final Holder<PlacedFeature> PATCH_ICE_BUSH = bushPlacementFeature(
            "path_ice_bush",
            ModConfiguredFeature.PATCH_ICE_BERRY_BUSH,
            32);

    private static <T extends ConfiguredFeature<RandomPatchConfiguration, ?>> Holder<PlacedFeature> bushPlacementFeature(String string, Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> feature, int onEvery){
        return PlacementUtils.register(string,
                feature,
                RarityFilter.onAverageOnceEvery(onEvery),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome());
    }

}
