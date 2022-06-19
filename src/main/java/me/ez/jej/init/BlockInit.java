package me.ez.jej.init;

import me.ez.jej.Main;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

    //    public static final RegistryObject<BlockItem> ICE_BERRY = ITEMS.register("ice_berry",() -> new BlockItem(Init.ICE_BERRY_BUSH.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).build())));
//    public static final RegistryObject<BlockItem> WILD_BERRY = ITEMS.register("wild_berry",() -> new BlockItem(Init.WILD_BERRY_BUSH.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build())));
//    public static final RegistryObject<BlockItem> TOMATO_ITEM = ITEMS.register("tomato",() -> new BlockItem(Init.TOMATO.get(), new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.1F).build())));

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MOD_ID);
    //Blocks
//    public static final RegistryObject<IcyBush> ICE_BERRY_BUSH = BLOCKS.register("iceberry_bush", IcyBush::new);
//    public static final RegistryObject<WildBerryBush> WILD_BERRY_BUSH = BLOCKS.register("wildberry_bush", WildBerryBush::new);
//    public static final RegistryObject<Block> TOMATO = BLOCKS.register("tomato", () -> new TomatoBlock(BlockBehaviour.Properties.copy(Blocks.PUMPKIN)));

}
