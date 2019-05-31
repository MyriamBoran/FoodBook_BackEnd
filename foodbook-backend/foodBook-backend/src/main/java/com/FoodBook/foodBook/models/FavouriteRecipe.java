package com.FoodBook.foodBook.models;

import javax.persistence.*;

@Entity
@Table(name="favourite_recipes")
public class FavouriteRecipe {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="user_id")
    private Long user_id;

    public FavouriteRecipe(Long user_id){
        this.id = id;
        this.user_id = user_id;
    }

    public FavouriteRecipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
}
