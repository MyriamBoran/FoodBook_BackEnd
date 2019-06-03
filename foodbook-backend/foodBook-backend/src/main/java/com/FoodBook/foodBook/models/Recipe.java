package com.FoodBook.foodBook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.net.URLEncoder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {

    @JsonProperty("uri")
    private String uri;

    @JsonProperty("label")
    private String label;

    @JsonProperty
    private String image;

    @JsonProperty
    private String url;

    @JsonProperty
    private List<String> healthLabels;

    @JsonProperty
    private List<String> ingredientLines;

    @JsonProperty
    private double calories;

    @JsonProperty
    private int totalTime;

    @JsonProperty
    private RecipeList recipeList;

    public Recipe(String uri, String label, String image, String url,
                  double calories, int totalTime, RecipeList recipeList) {
        this.uri = uri;
        this.label = label;
        this.image = image;
        this.url = url;
        this.healthLabels = new ArrayList<>();
        this.ingredientLines = new ArrayList<>();
        this.calories = calories;
        this.totalTime = totalTime;
        this.recipeList = recipeList;
    }

    public Recipe() {
    }


    public String getUri() {
        return uri;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUri(String uri) throws Exception {
        this.uri = URLEncoder.encode(uri, StandardCharsets.UTF_8.toString());
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<String> getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(List<String> healthLabels) {
        this.healthLabels = healthLabels;
    }

    public List<String> getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(List<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public RecipeList getRecipeList() {
        return recipeList;
    }

    public void setRecipeList(RecipeList recipeList) {
        this.recipeList = recipeList;
    }

}
