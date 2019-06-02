package com.FoodBook.foodBook.controllers;

import com.FoodBook.foodBook.models.FavouriteRecipe;
import com.FoodBook.foodBook.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/{id}/favourite-recipes")
    public List<FavouriteRecipe> getFavouriteRecipesById(Long id){
        return userRepository.getFavouriteRecipesById(id);
    }
}
