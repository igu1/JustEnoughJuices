package me.ez.jej;

import me.ez.jej.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Main.MOD_ID)
public class Main{

    public static final String MOD_ID = "jej";
    public static CreativeModeTab TAB = new JuiceTab();

    public Main()
    {
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);
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
