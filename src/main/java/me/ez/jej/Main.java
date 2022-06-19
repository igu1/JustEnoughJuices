package me.ez.jej;

import me.ez.jej.WorldGen.BiomeModifiers.BiomeModifiers;
import me.ez.jej.init.BlockInit;
import me.ez.jej.init.EffectInit;
import me.ez.jej.init.ItemInit;
import me.ez.jej.init.PlacedFeatureInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main{

    public static final String MOD_ID = "jej";
    public static CreativeModeTab TAB = new JuiceTab();

    public Main()
    {
        EffectInit.EFFECT.register(FMLJavaModLoadingContext.get().getModEventBus());
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
//        PlacedFeatureInit.PLACED_FEATURE_DEFERRED_REGISTER.register(FMLJavaModLoadingContext.get().getModEventBus());
//        BiomeModifiers.BIOME_MODIFIERS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FMLJavaModLoadingContext.get().getModEventBus().addListener(EventPriority.HIGH, this::ClientSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void ClientSetup(FMLClientSetupEvent event)
    {
        System.out.println("Setting Client Setup");
//        ItemBlockRenderTypes.setRenderLayer(Init.ICE_BERRY_BUSH.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(Init.WILD_BERRY_BUSH.get(), RenderType.cutout());
    }

    public static class JuiceTab extends CreativeModeTab{

        public JuiceTab() {
            super("juices");
        }

        @Override
        public ItemStack makeIcon() {
            return ItemInit.GOLDENAPPLE_JUICE.get().getDefaultInstance();
        }
    }
}
