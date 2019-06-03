package com.FoodBook.foodBook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Hit {

    private Recipe recipe;

    public Hit(Recipe recipe) {
        this.recipe = recipe;
    }

    public Hit() {
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
