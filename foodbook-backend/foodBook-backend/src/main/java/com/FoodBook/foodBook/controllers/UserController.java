package com.FoodBook.foodBook.controllers;

import com.FoodBook.foodBook.models.FavouriteRecipe;

import com.FoodBook.foodBook.repositories.FavouriteRecipeRepository.FavouriteRecipeRepository;
import com.FoodBook.foodBook.repositories.UserRepository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @Autowired
    FavouriteRecipeRepository favouriteRecipeRepository;

    @CrossOrigin
    @GetMapping("/{id}/favourite-recipes")
    public FavouriteRecipe getFavouriteRecipes(@PathVariable String id){
        System.out.println(id);
        List<FavouriteRecipe> recipes = userRepository.findFavouriteRecipes(id);
        if(recipes.size() == 0) return null;
        return recipes.get(0);
    }
}
