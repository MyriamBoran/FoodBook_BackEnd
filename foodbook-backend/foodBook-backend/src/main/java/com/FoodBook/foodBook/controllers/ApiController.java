package com.FoodBook.foodBook.controllers;

import com.FoodBook.foodBook.models.Recipe;
import com.FoodBook.foodBook.models.RecipeList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping(value="/api")
public class ApiController {

    @CrossOrigin
    @GetMapping(value="/search/{query}")
    public RecipeList getRecipesBySearchQuery(@PathVariable String query){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<RecipeList> response = restTemplate.getForEntity("https://api.edamam.com/search?q="
                + query + "&app_id=4bbe4d45&app_key=ef61c2a3e3911a1085638fb0a3bb5cc9", RecipeList.class);
        System.out.println(response.getHeaders());
        return response.getBody();
    }
}
