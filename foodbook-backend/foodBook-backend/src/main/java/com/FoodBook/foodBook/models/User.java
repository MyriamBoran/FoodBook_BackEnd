package com.FoodBook.foodBook.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
public class User {

        @Id
        @Column(name = "id")
        private String id;

        @Column(name="first_name")
        private String firstName;

        @Column(name="last_name")
        private String lastName;

        @OneToMany(mappedBy= "user")
        private List<FavouriteRecipe> favouriteRecipes;


        public User(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.favouriteRecipes = new ArrayList<>();
        }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<FavouriteRecipe> getFavouriteRecipes() {
        return favouriteRecipes;
    }

    public void setFavouriteRecipes(List<FavouriteRecipe> favouriteRecipes) {
        this.favouriteRecipes = favouriteRecipes;
    }
}
