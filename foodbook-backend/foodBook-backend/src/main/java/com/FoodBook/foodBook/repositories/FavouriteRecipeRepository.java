package com.FoodBook.foodBook.repositories;

import com.FoodBook.foodBook.models.FavouriteRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRecipeRepository extends JpaRepository<FavouriteRecipe, Long> {
}
