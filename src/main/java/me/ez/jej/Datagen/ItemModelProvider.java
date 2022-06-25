package me.ez.jej.Datagen;


import me.ez.jej.init.ItemInit;
import me.ez.jej.Main;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {

    public ItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Main.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        //Juice
        simpleItem(ItemInit.APPLE_JUICE);
        simpleItem(ItemInit.CARROT_JUICE);
        simpleItem(ItemInit.BAKEDPOTATO_JUICE);
        simpleItem(ItemInit.SWEETBERRY_JUICE);
        simpleItem(ItemInit.PUMPKIN_JUICE);
        simpleItem(ItemInit.MELON_JUICE);
        simpleItem(ItemInit.DRIEDKELP_JUICE);

        simpleItem(ItemInit.GOLDENCARROT_JUICE);
        simpleItem(ItemInit.GOLDENAPPLE_JUICE);
        simpleItem(ItemInit.GLISTERING_MELON_JUICE);

        simpleItem(ItemInit.APPLE_JUICE_BOOSTED);
        simpleItem(ItemInit.CARROT_JUICE_BOOSTED);
        simpleItem(ItemInit.BAKEDPOTATO_JUICE_BOOSTED);
        simpleItem(ItemInit.SWEETBERRY_JUICE_BOOSTED);
        simpleItem(ItemInit.PUMPKIN_JUICE_BOOSTED);
        simpleItem(ItemInit.MELON_JUICE_BOOSTED);
        simpleItem(ItemInit.DRIEDKELP_JUICE_BOOSTED);

        //Item
        simpleItem(ItemInit.EMERALD_DUST);
        simpleItem(ItemInit.GLASS_BOTTLE);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Main.MOD_ID,"item/" + item.getId().getPath()));
    }
}
