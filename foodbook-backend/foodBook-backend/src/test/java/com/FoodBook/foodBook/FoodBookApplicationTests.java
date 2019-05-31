package com.FoodBook.foodBook;

import com.FoodBook.foodBook.models.FavouriteRecipe;
import com.FoodBook.foodBook.repositories.FavouriteRecipeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodBookApplicationTests {

	@Autowired
	FavouriteRecipeRepository favouriteRecipeRepository;

	@Test
	public void contextLoads() {

	}

	@Test
	public void createFavouriteRecipe(){
		FavouriteRecipe goulash = new FavouriteRecipe(1l);
		favouriteRecipeRepository.save(goulash);

	}

}
