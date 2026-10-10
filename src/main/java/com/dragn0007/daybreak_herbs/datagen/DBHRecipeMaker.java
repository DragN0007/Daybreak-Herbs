package com.dragn0007.daybreak_herbs.datagen;

import com.dragn0007.daybreak_herbs.items.DBHItems;
import com.dragn0007.daybreak_herbs.util.DBHTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class DBHRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public DBHRecipeMaker(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, DBHItems.WINTERBLOOM_WASH.get())
                .requires(DBHItems.WINTERBLOOM_LEAF.get())
                .requires(Items.WATER_BUCKET)
                .requires(DBHTags.Items.LEAVES)
                .requires(DBHTags.Items.LEAVES)
                .unlockedBy("has_leaves", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DBHTags.Items.LEAVES).build()))
                .save(pFinishedRecipeConsumer);
    }
}