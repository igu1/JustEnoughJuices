package me.ez.jej.Datagen;

import me.ez.jej.Init;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class RecipeProvider extends net.minecraft.data.recipes.RecipeProvider implements IConditionBuilder {

    public RecipeProvider(DataGenerator p_125973_) {
        super(p_125973_);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> recipeConsumer) {

        ShapelessRecipeBuilder.shapeless(Init.EMERALD_DUST.get(), 9)
                .requires(Items.EMERALD)
                .unlockedBy("has_emerald", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.EMERALD).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Items.EMERALD)
                .define('M', Init.EMERALD_DUST.get())
                .pattern("MMM")
                .pattern("MMM")
                .pattern("MMM")
                .unlockedBy("has_emerald_dust", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.EMERALD_DUST.get()).build()))
                .save(recipeConsumer);

        //Apple Jucie
        ShapedRecipeBuilder.shaped(Init.APPLE_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.APPLE)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_apple", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.APPLE).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.APPLE_JUICE_BOOSTED.get())
                .define('J', Init.APPLE_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_apple_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.APPLE_JUICE.get()).build()))
                .save(recipeConsumer);
        //---------------------------------------------------
        //Baked Potato
        ShapedRecipeBuilder.shaped(Init.BAKEDPOTATO_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.BAKED_POTATO)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_baked_potato", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.BAKED_POTATO).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.BAKEDPOTATO_JUICE_BOOSTED.get())
                .define('J', Init.BAKEDPOTATO_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_baked_potato_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.BAKEDPOTATO_JUICE.get()).build()))
                .save(recipeConsumer);
        //--------------------------------------------------------
        //Carrot Juice
        ShapedRecipeBuilder.shaped(Init.CARROT_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.CARROT)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_carrot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.CARROT).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.CARROT_JUICE_BOOSTED.get())
                .define('J', Init.CARROT_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_carrot_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.CARROT_JUICE.get()).build()))
                .save(recipeConsumer);
        //------------------------------------------
        //Dried Kelp
        ShapedRecipeBuilder.shaped(Init.DRIEDKELP_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.DRIED_KELP)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_dried_kelp", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.DRIED_KELP).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.DRIEDKELP_JUICE_BOOSTED.get())
                .define('J', Init.DRIEDKELP_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_kelp_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.DRIEDKELP_JUICE.get()).build()))
                .save(recipeConsumer);
        //--------------------------------------------------------
        //Ice Berry
        ShapedRecipeBuilder.shaped(Init.ICEBERRY_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Init.ICE_BERRY.get())

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_ice_berry", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.ICE_BERRY.get()).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.ICEBERRY_JUICE_BOOSTED.get())
                .define('J', Init.ICEBERRY_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_ice_berry_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.ICEBERRY_JUICE.get()).build()))
                .save(recipeConsumer);
        //----------------------------------------------
        ShapedRecipeBuilder.shaped(Init.MELON_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.MELON_SLICE)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_melon_slice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.MELON_SLICE).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.MELON_JUICE_BOOSTED.get())
                .define('J', Init.MELON_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_melon_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.MELON_JUICE.get()).build()))
                .save(recipeConsumer);
        //------------------------------------------
        //Pumpkin
        ShapedRecipeBuilder.shaped(Init.PUMPKIN_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.PUMPKIN)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_pumpkin", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.PUMPKIN).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.PUMPKIN_JUICE_BOOSTED.get())
                .define('J', Init.PUMPKIN_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_pumpkin_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.PUMPKIN_JUICE.get()).build()))
                .save(recipeConsumer);
        //------------------------------------------
        ShapedRecipeBuilder.shaped(Init.SWEETBERRY_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.SWEET_BERRIES)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_sweet_berry", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SWEET_BERRIES).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.SWEETBERRY_JUICE_BOOSTED.get())
                .define('J', Init.SWEETBERRY_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_sweet_berry_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.SWEETBERRY_JUICE.get()).build()))
                .save(recipeConsumer);
        //------------------------------------------
        ShapedRecipeBuilder.shaped(Init.WILDBERRY_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Init.WILD_BERRY.get())

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_wild_berry", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.WILD_BERRY.get()).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.WILDBERRY_JUICE_BOOSTED.get())
                .define('J', Init.WILDBERRY_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('E', Init.EMERALD_DUST.get())

                .pattern(" M ")
                .pattern(" E ")
                .pattern(" J ")
                .unlockedBy("has_wild_berry_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Init.WILDBERRY_JUICE.get()).build()))
                .save(recipeConsumer);
        //------------------------------------------

        ShapedRecipeBuilder.shaped(Init.GLISTERING_MELON_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.GLISTERING_MELON_SLICE)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_glistering_melon_juice", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GLISTERING_MELON_SLICE).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.GOLDENAPPLE_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.GOLDEN_APPLE)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_golden_apple", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLDEN_APPLE).build()))
                .save(recipeConsumer);

        ShapedRecipeBuilder.shaped(Init.GOLDENCARROT_JUICE.get())
                .define('M', Items.MILK_BUCKET)
                .define('G', Init.GLASS_BOTTLE.get())

                .define('F', Items.GOLDEN_CARROT)

                .pattern(" F ")
                .pattern(" M ")
                .pattern(" G ")
                .unlockedBy("has_golden_carrot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.GOLDEN_CARROT).build()))
                .save(recipeConsumer);
    }
}
