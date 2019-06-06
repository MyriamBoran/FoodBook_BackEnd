package com.FoodBook.foodBook.controllers;

import com.FoodBook.foodBook.models.Hit;
import com.FoodBook.foodBook.models.Recipe;
import com.FoodBook.foodBook.models.RecipeList;
import com.FoodBook.foodBook.models.SingleRecipe;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping(value="/api")
public class ApiController {

    @CrossOrigin
    @GetMapping(value="/search/{query}")
    public RecipeList getRecipesBySearchQuery(@PathVariable String query){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<RecipeList> response = restTemplate.getForEntity("https://api.edamam.com/search?q="
                + query + "&app_id=4bbe4d45&app_key=ef61c2a3e3911a1085638fb0a3bb5cc9", RecipeList.class);
        return response.getBody();
    }

    @CrossOrigin
    @GetMapping(value="/find/{id}")
    public Recipe[] getRecipesById(@PathVariable String id){
        System.out.println("in find");
        RestTemplate restTemplate = new RestTemplate();
        Recipe[] response = restTemplate.getForObject("https://api.edamam.com/search?r=http%3A%2F%2Fwww.edamam.com%2Fontologies%2Fedamam.owl%23recipe_5e8a91726dd94399e780ea391b895480&app_id=4bbe4d45&app_key=ef61c2a3e3911a1085638fb0a3bb5cc9", Recipe[].class);
        return response;
    }
}
