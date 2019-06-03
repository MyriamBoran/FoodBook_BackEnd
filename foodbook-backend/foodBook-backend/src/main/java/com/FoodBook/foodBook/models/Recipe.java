package com.FoodBook.foodBook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.net.URLEncoder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {

    private String uri;
    private String label;
    private String image;
    private String url;
    private List<String> healthLabels;
    private List<String> ingredientLines;
    private double calories;
    private int totalTime;

    public Recipe(String uri, String label, String image, String url, List<String> healthLabels,
                  List<String> ingredientLines, double calories, int totalTime) {
        this.uri = uri;
        this.label = label;
        this.image = image;
        this.url = url;
        this.healthLabels = healthLabels;
        this.ingredientLines = ingredientLines;
        this.calories = calories;
        this.totalTime = totalTime;
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

}
