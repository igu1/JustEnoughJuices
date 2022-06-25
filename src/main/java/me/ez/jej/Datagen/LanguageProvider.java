package me.ez.jej.Datagen;

import me.ez.jej.init.ItemInit;
import me.ez.jej.Main;
import net.minecraft.data.DataGenerator;

public class LanguageProvider extends net.minecraftforge.common.data.LanguageProvider {

    public LanguageProvider(DataGenerator gen, String locale) {
        super(gen, Main.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        //Item Group
        add("itemGroup." + "juices", "Juices");

        //Juice
        add(ItemInit.APPLE_JUICE.get(), "Apple Juice");
        add(ItemInit.APPLE_JUICE_BOOSTED.get(), "Apple Juice Boosted");
        add(ItemInit.BAKEDPOTATO_JUICE.get(), "Potato Juice");
        add(ItemInit.BAKEDPOTATO_JUICE_BOOSTED.get(), "Potato Juice Boosted");
        add(ItemInit.CARROT_JUICE.get(), "Carrot Juice");
        add(ItemInit.CARROT_JUICE_BOOSTED.get(), "Carrot Juice Boosted");
        add(ItemInit.DRIEDKELP_JUICE.get(), "DriedKelp Juice");
        add(ItemInit.DRIEDKELP_JUICE_BOOSTED.get(), "Dried Kelp Juice Boosted");
        add(ItemInit.GLISTERING_MELON_JUICE.get(), "Glistering Melon Juice");
        add(ItemInit.GOLDENAPPLE_JUICE.get(), "Golden Apple Juice");
        add(ItemInit.GOLDENCARROT_JUICE.get(), "Golden Carrot Juice");
        add(ItemInit.MELON_JUICE.get(), "Melon Juice");
        add(ItemInit.MELON_JUICE_BOOSTED.get(), "Melon Juice Boosted");
        add(ItemInit.PUMPKIN_JUICE.get(), "Pumpkin Juice");
        add(ItemInit.PUMPKIN_JUICE_BOOSTED.get(), "Pumpkin Juice Boosted");
        add(ItemInit.SWEETBERRY_JUICE.get(), "Sweet Berry Juice");
        add(ItemInit.SWEETBERRY_JUICE_BOOSTED.get(), "Sweet Berry Juice Boosted");

        //item
        add(ItemInit.EMERALD_DUST.get(), "Emerald Dust");
        add(ItemInit.GLASS_BOTTLE.get(), "Glass Bottle");


    }
}
