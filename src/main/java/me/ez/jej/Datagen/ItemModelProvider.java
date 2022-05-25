package me.ez.jej.Datagen;


import me.ez.jej.Init;
import me.ez.jej.Main;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {

    public ItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Juice
        simpleItem(Init.APPLE_JUICE.get());
        simpleItem(Init.CARROT_JUICE.get());
        simpleItem(Init.BAKEDPOTATO_JUICE.get());
        simpleItem(Init.SWEETBERRY_JUICE.get());
        simpleItem(Init.ICEBERRY_JUICE.get());
        simpleItem(Init.PUMPKIN_JUICE.get());
        simpleItem(Init.MELON_JUICE.get());
        simpleItem(Init.DRIEDKELP_JUICE.get());
        simpleItem(Init.STRAWBERRY_JUICE.get());

        simpleItem(Init.GOLDENCARROT_JUICE.get());
        simpleItem(Init.GOLDENAPPLE_JUICE.get());
        simpleItem(Init.GLISTERING_MELON_JUICE.get());

        simpleItem(Init.APPLE_JUICE_BOOSTED.get());
        simpleItem(Init.CARROT_JUICE_BOOSTED.get());
        simpleItem(Init.BAKEDPOTATO_JUICE_BOOSTED.get());
        simpleItem(Init.SWEETBERRY_JUICE_BOOSTED.get());
        simpleItem(Init.ICEBERRY_JUICE_BOOSTED.get());
        simpleItem(Init.PUMPKIN_JUICE_BOOSTED.get());
        simpleItem(Init.MELON_JUICE_BOOSTED.get());
        simpleItem(Init.DRIEDKELP_JUICE_BOOSTED.get());
        simpleItem(Init.STRAWBERRY_JUICE_BOOSTED.get());

        //Item
        simpleItem(Init.EMERALD_DUST.get());

        //BlockItem
        simpleItem(Init.STRAW_BERRY.get());
        simpleItem(Init.ICE_BERRY.get());
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Main.MOD_ID,"item/" + item.getRegistryName().getPath()));
    }
}
