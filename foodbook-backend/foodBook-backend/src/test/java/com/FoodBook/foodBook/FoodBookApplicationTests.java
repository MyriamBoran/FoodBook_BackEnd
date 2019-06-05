package com.FoodBook.foodBook;

import com.FoodBook.foodBook.models.FavouriteRecipe;
import com.FoodBook.foodBook.models.User;


import com.FoodBook.foodBook.repositories.FavouriteRecipeRepository.FavouriteRecipeRepository;
import com.FoodBook.foodBook.repositories.UserRepository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodBookApplicationTests {

	@Autowired
	FavouriteRecipeRepository favouriteRecipeRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {

	}

	@Test
	public void createUser(){
		User donald = new User("Donald", "Duck");
		userRepository.save(donald);
	}

	@Test
	public void createFavouriteRecipe() {
//		User mary = new User("Maria", "Simmons");
//		FavouriteRecipe goulash = new FavouriteRecipe(mary, "Goulash");
//		userRepository.save(mary);
//		favouriteRecipeRepository.save(goulash);
	}

	@Test
	public void getFavouriteRecipesByUserId() {
//		List<FavouriteRecipe> found = favouriteRecipeRepository.findByUser("google-oauth2|111821480876092721989");
//		assertEquals(17, found.size());
	}
}
