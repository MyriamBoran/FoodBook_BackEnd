package com.FoodBook.foodBook.controllers;

import com.FoodBook.foodBook.repositories.FavouriteRecipeRepository.FavouriteRecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/favorite-recipes")
public class FavouriteRecipeController {

    @Autowired
    private FavouriteRecipeRepository favouriteRecipeRepository;

    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public void deleteRecipeById(@PathVariable Long id){
        System.out.println("hitting delete route");
        this.favouriteRecipeRepository.deleteById(id);
    }

}
