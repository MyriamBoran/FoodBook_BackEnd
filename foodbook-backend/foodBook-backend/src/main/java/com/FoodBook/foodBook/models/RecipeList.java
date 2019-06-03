package com.FoodBook.foodBook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeList {
    private String q;

    private List<Recipe> hits;

    public RecipeList(String q) {
        this.q = q;
        this.hits = new ArrayList<>();
    }

    public RecipeList(){

    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public List<Recipe> getHits() {
        return hits;
    }

    public void setHits(List<Recipe> hits) {
        this.hits = hits;
    }
}
