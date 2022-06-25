package me.ez.jej.init;

import me.ez.jej.Main;
import me.ez.jej.common.JuiceClass;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    //Items
    public static final RegistryObject<Item> APPLE_JUICE = registerJuice("apple_juice");
    public static final RegistryObject<Item> APPLE_JUICE_BOOSTED = registerJuiceBoosted("apple_juice_boosted");

    public static final RegistryObject<Item> SWEETBERRY_JUICE = registerJuice("sweetberry_juice");
    public static final RegistryObject<Item> SWEETBERRY_JUICE_BOOSTED = registerJuiceBoosted("sweetberry_juice_boosted");;

    public static final RegistryObject<Item> CARROT_JUICE = registerJuice("carrot_juice");
    public static final RegistryObject<Item> CARROT_JUICE_BOOSTED = registerJuiceBoosted("carrot_juice_boosted");

    public static final RegistryObject<Item> BAKEDPOTATO_JUICE = registerJuice("bakedpotato_juice");
    public static final RegistryObject<Item> BAKEDPOTATO_JUICE_BOOSTED = registerJuiceBoosted("bakedpotato_juice_boosted");

    public static final RegistryObject<Item> MELON_JUICE = registerJuice("melon_juice");
    public static final RegistryObject<Item> MELON_JUICE_BOOSTED = registerJuiceBoosted("melon_juice_boosted");

    public static final RegistryObject<Item> PUMPKIN_JUICE = registerJuice("pumpkin_juice");
    public static final RegistryObject<Item> PUMPKIN_JUICE_BOOSTED = registerJuiceBoosted("pumpkin_juice_boosted");

    public static final RegistryObject<Item> DRIEDKELP_JUICE = registerJuice("driedkelp_juice");
    public static final RegistryObject<Item> DRIEDKELP_JUICE_BOOSTED = registerJuiceBoosted("driedkelp_juice_boosted");

    public static final RegistryObject<Item> GOLDENAPPLE_JUICE = registerJuice("goldenapple_juice");

    public static final RegistryObject<Item> GOLDENCARROT_JUICE = registerJuice("goldencarrot_juice");

    public static final RegistryObject<Item> GLISTERING_MELON_JUICE = registerJuice("glistering_melon_juice");

    public static final RegistryObject<Item> EMERALD_DUST = registerItem("emerald_dust", CreativeModeTab.TAB_MISC, 64);
    public static final RegistryObject<Item> GLASS_BOTTLE = registerItem("glass_bottle", CreativeModeTab.TAB_MISC, 16);

    
    private static RegistryObject<Item> registerItem(String name, CreativeModeTab tab, int stackupto){
        return ITEMS.register(name, () -> new Item(new Item.Properties().tab(tab).stacksTo(stackupto)));
    }

    private static RegistryObject<Item> registerJuice(String name){
        return ITEMS.register(name, () -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    }
    
    private static RegistryObject<Item> registerJuiceBoosted(String name){
        return  ITEMS.register(name,() -> new JuiceClass(new Item.Properties().stacksTo(1).rarity(Rarity.RARE).tab(Main.TAB)));
    }
}
