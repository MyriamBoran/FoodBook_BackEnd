package com.FoodBook.foodBook.repositories.UserRepository;

import com.FoodBook.foodBook.models.FavouriteRecipe;
import com.FoodBook.foodBook.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    @Query(value = "SELECT r FROM FavouriteRecipe r WHERE r.user.id = :id")
    List<FavouriteRecipe> findFavouriteRecipes(@Param("id") String id);
}
