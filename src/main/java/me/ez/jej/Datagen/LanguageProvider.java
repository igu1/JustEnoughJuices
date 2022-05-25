package me.ez.jej.Datagen;

import me.ez.jej.Init;
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
        add(Init.APPLE_JUICE.get(), "Apple Juice");
        add(Init.APPLE_JUICE_BOOSTED.get(), "Apple Juice Boosted");
        add(Init.BAKEDPOTATO_JUICE.get(), "Potato Juice");
        add(Init.BAKEDPOTATO_JUICE_BOOSTED.get(), "Potato Juice Boosted");
        add(Init.CARROT_JUICE.get(), "Carrot Juice");
        add(Init.CARROT_JUICE_BOOSTED.get(), "Carrot Juice Boosted");
        add(Init.DRIEDKELP_JUICE.get(), "DriedKelp Juice");
        add(Init.DRIEDKELP_JUICE_BOOSTED.get(), "DriedKelp Juice Boosted");
        add(Init.GLISTERING_MELON_JUICE.get(), "Glistering Melon Juice");
        add(Init.GOLDENAPPLE_JUICE.get(), "Golden Apple Juice");
        add(Init.GOLDENCARROT_JUICE.get(), "Golden Carrot Juice");
        add(Init.ICEBERRY_JUICE.get(), "IceBerry Juice");
        add(Init.ICEBERRY_JUICE_BOOSTED.get(), "Iceberry Juice Boosted");
        add(Init.MELON_JUICE.get(), "Melon Juice");
        add(Init.MELON_JUICE_BOOSTED.get(), "Melon Juice Boosted");
        add(Init.PUMPKIN_JUICE.get(), "Pumpkin Juice");
        add(Init.PUMPKIN_JUICE_BOOSTED.get(), "Pumpkin Juice Boosted");
        add(Init.STRAWBERRY_JUICE.get(), "StrawBerry Juice");
        add(Init.STRAWBERRY_JUICE_BOOSTED.get(), "StrawBerry Juice Boosted");
        add(Init.SWEETBERRY_JUICE.get(), "SweetBerry Juice");
        add(Init.SWEETBERRY_JUICE_BOOSTED.get(), "SweetBerry Juice Boosted");

        //Bushes
        add(Init.ICE_BERRY.get(), "IceBerry");
//        add(Init.ICE_BERRY_BUSH.get(), "IceBerry Bush");

        add(Init.STRAW_BERRY.get(), "StrawBerry");
//        add(Init.STRAW_BERRY_BUSH.get(), "StrawBerry Bush");

        //Effect
        add(Init.ICYFOOTEFFECT.get(), "Icy Foot");

        //item
        add(Init.EMERALD_DUST.get(), "Emerald Dust");

    }
}
