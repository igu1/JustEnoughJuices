package me.ez.jej.WorldGen;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

public class ModPlacementFeature {

    public static final Holder<PlacedFeature> PATCH_WILD_BUSH =
            PlacementUtils.register("patch_wild_bush",
                    ModConfiguredFeature.PATCH_WILD_BERRY_BUSH,
                    RarityFilter.onAverageOnceEvery(32),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                    BiomeFilter.biome());

    public static final Holder<PlacedFeature> PATCH_ICE_BUSH =
            PlacementUtils.register("patch_ice_bush",
                    ModConfiguredFeature.PATCH_ICE_BERRY_BUSH,
                    RarityFilter.onAverageOnceEvery(32),
                    InSquarePlacement.spread(),
                    PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                    BiomeFilter.biome());

}
