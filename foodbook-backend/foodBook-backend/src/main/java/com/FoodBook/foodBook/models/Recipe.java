package com.FoodBook.foodBook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.net.URLEncoder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Recipe {

    private String uri;
    private String label;
    private String image;
    private List<String> healthLabels;
    private List<String> ingredientLines;
    private int calories;
    private int totalTime;



//    create setter that encodes uri

}
