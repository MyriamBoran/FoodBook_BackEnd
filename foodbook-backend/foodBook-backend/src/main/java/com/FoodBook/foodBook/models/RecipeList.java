package com.FoodBook.foodBook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeList {

    @JsonProperty
    private String q;

    @JsonProperty
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
