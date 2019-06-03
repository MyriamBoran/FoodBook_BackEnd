package com.FoodBook.foodBook.controllers;

import com.FoodBook.foodBook.models.Recipe;
import com.FoodBook.foodBook.models.RecipeList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ApiController {

@GetMapping(value="/search/{query}")
public RecipeList getRecipesBySearchQuery(@PathVariable String query){
    RestTemplate restTemplate = new RestTemplate();
    RecipeList recipes = restTemplate.getForObject("https://api.edamam.com/search?q="
            + query + "&app_id=4bbe4d45&app_key=ef61c2a3e3911a1085638fb0a3bb5cc9", RecipeList.class);
    return recipes;
}
}
