package com.FoodBook.foodBook.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="favourite_recipes")
public class FavouriteRecipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @ManyToOne
//    @JsonIgnoreProperties
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name="recipe_uri", nullable = false)
    private String recipeUri;

    @Column(name="name")
    private String name;



    public FavouriteRecipe(User user, String name, String recipeUri){
        this.user = user;
        this.name = name;
        this.recipeUri = recipeUri;
    }

    public FavouriteRecipe() {
    }


    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRecipeUri() {
        return recipeUri;
    }

    public void setRecipeUri(String recipeUri) {
        this.recipeUri = recipeUri;
    }
}
