package me.ez.jej;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.RenderShape;
import net.minecraftforge.client.RenderProperties;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main{

    public static final String MOD_ID = "jej";
    public static CreativeModeTab TAB = new JuiceTab();

    public Main()
    {
        Init.EFFECT.register(FMLJavaModLoadingContext.get().getModEventBus());
        Init.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        Init.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::ClientSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public void ClientSetup(FMLClientSetupEvent event)
    {
        ItemBlockRenderTypes.setRenderLayer(Init.ICE_BERRY_BUSH.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(Init.STRAW_BERRY_BUSH.get(), RenderType.cutout());

    }

    public static class JuiceTab extends CreativeModeTab{

        public JuiceTab() {
            super("juices");
        }

        @Override
        public ItemStack makeIcon() {
            return Init.GOLDENAPPLE_JUICE.get().getDefaultInstance();
        }
    }
}
