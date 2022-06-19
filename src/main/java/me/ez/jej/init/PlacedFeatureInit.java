package me.ez.jej.init;

import me.ez.jej.Main;
import me.ez.jej.WorldGen.ModConfiguredFeature;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class PlacedFeatureInit {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURE_DEFERRED_REGISTER = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Main.MOD_ID);

    public static final RegistryObject<PlacedFeature> PATCH_WILD_BUSH = bushPlacementFeature(
            "patch_wild_bush",
            ModConfiguredFeature.PATCH_WILD_BERRY_BUSH,
            32);

    public static final RegistryObject<PlacedFeature> PATCH_ICE_BUSH = bushPlacementFeature(
            "path_ice_bush",
            ModConfiguredFeature.PATCH_ICE_BERRY_BUSH,
            32);

    private static <T extends ConfiguredFeature<RandomPatchConfiguration, ?>> RegistryObject<PlacedFeature> bushPlacementFeature(
        String string,
         Holder<T> feature,
            int onEvery){

        return PLACED_FEATURE_DEFERRED_REGISTER.register(string,
                () -> new PlacedFeature((Holder<ConfiguredFeature<?,?>>)(Holder<? extends ConfiguredFeature<?,?>>)
                        feature, List.of(
                RarityFilter.onAverageOnceEvery(onEvery),
                InSquarePlacement.spread(),
                PlacementUtils.HEIGHTMAP_WORLD_SURFACE,
                BiomeFilter.biome())));
    }


}
