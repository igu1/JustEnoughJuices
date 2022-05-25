package me.ez.jej;

import me.ez.jej.common.Effects.IcyFootEffect;
import me.ez.jej.common.JuiceClass;
import me.ez.jej.common.Bushes.IcyBush;
import me.ez.jej.common.Bushes.StrawBerryBush;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Init {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    //Items
    public static final RegistryObject<Item> APPLE_JUICE = ITEMS.register("apple_juice",() -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> APPLE_JUICE_BOOSTED = ITEMS.register("apple_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> SWEETBERRY_JUICE = ITEMS.register("sweetberry_juice",() -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> SWEETBERRY_JUICE_BOOSTED = ITEMS.register("sweetberry_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));;

    public static final RegistryObject<Item> CARROT_JUICE = ITEMS.register("carrot_juice", () -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> CARROT_JUICE_BOOSTED = ITEMS.register("carrot_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> BAKEDPOTATO_JUICE = ITEMS.register("bakedpotato_juice", () -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> BAKEDPOTATO_JUICE_BOOSTED = ITEMS.register("bakedpotato_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> MELON_JUICE = ITEMS.register("melon_juice",() -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> MELON_JUICE_BOOSTED = ITEMS.register("melon_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> PUMPKIN_JUICE = ITEMS.register("pumpkin_juice", () -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> PUMPKIN_JUICE_BOOSTED = ITEMS.register("pumpkin_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> ICEBERRY_JUICE = ITEMS.register("iceberry_juice", () -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> ICEBERRY_JUICE_BOOSTED = ITEMS.register("iceberry_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> STRAWBERRY_JUICE = ITEMS.register("strawberry_juice",() -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> STRAWBERRY_JUICE_BOOSTED = ITEMS.register("strawberry_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> DRIEDKELP_JUICE = ITEMS.register("driedkelp_juice",() -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
    public static final RegistryObject<Item> DRIEDKELP_JUICE_BOOSTED = ITEMS.register("driedkelp_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> GOLDENAPPLE_JUICE = ITEMS.register("goldenapple_juice",() -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
//    public static final RegistryObject<Item> GOLDENAPPLE_JUICE_BOOSTED = ITEMS.register("driedkelp_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> GOLDENCARROT_JUICE = ITEMS.register("goldencarrot_juice",() -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
//    public static final RegistryObject<Item> GOLDENCARROT_JUICE_BOOSTED = ITEMS.register("driedkelp_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));

    public static final RegistryObject<Item> GLISTERING_MELON_JUICE = ITEMS.register("glistering_melon_juice",() -> new JuiceClass(new Item.Properties().stacksTo(1).tab(Main.TAB)));
//    public static final RegistryObject<Item> GLITTERINGMELON_JUICE_BOOSTED = ITEMS.register("driedkelp_juice_boosted", () -> new JuiceClass(new Item.Properties().rarity(Rarity.RARE).stacksTo(1).tab(Main.TAB)));


    public static final RegistryObject<Item> EMERALD_DUST = ITEMS.register("emerald_dust",() -> new Item(new Item.Properties().tab(Main.TAB)));
    public static final RegistryObject<BlockItem> ICE_BERRY = ITEMS.register("ice_berry",() -> new BlockItem(Init.ICE_BERRY_BUSH.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build())));
    public static final RegistryObject<BlockItem> STRAW_BERRY = ITEMS.register("straw_berry",() -> new BlockItem(Init.STRAW_BERRY_BUSH.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build())));


    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    //Blocks
    public static final RegistryObject<IcyBush> ICE_BERRY_BUSH = BLOCKS.register("iceberry_bush", IcyBush::new);
    public static final RegistryObject<StrawBerryBush> STRAW_BERRY_BUSH = BLOCKS.register("strawberry_bush", StrawBerryBush::new);


    public static final DeferredRegister<MobEffect> EFFECT = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Main.MOD_ID);

    //Effects
    public static final RegistryObject<MobEffect> ICYFOOTEFFECT = EFFECT.register("icyfooteffect", () -> new IcyFootEffect(1));

}
