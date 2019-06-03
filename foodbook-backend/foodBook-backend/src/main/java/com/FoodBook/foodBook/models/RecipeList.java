package com.FoodBook.foodBook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecipeList {

    private String q;

    private List<Hit> hits;

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


    public List<Hit> getHits() {
        return hits;
    }

    public void setHits(List<Hit> hits) {
        this.hits = hits;
    }
}
