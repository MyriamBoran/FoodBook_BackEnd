package com.FoodBook.foodBook.repositories.FavouriteRecipeRepository;

import com.FoodBook.foodBook.models.FavouriteRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FavouriteRecipeRepository extends JpaRepository<FavouriteRecipe, String> {
    List<FavouriteRecipe> getFavouriteRecipesById(String id);
}
