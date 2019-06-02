package com.FoodBook.foodBook.repositories;
import com.FoodBook.foodBook.models.FavouriteRecipe;
import com.FoodBook.foodBook.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<FavouriteRecipe> getFavouriteRecipesById(Long id);
}
