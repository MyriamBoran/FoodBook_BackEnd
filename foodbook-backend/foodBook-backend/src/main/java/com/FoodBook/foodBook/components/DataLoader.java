package com.FoodBook.foodBook.components;

import com.FoodBook.foodBook.repositories.FavouriteRecipeRepository;
import com.FoodBook.foodBook.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FavouriteRecipeRepository favouriteRecipeRepository;

//    add recipe repository to be filled by API request?

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
//        API request here?
    }


}
