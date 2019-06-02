package com.FoodBook.foodBook.models;

import javax.persistence.*;

@Entity
@Table(name="favourite_recipes")
public class FavouriteRecipe {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name="name")
    private String name;

    public FavouriteRecipe(User user, String name){
        this.id = id;
        this.user = user;
        this.name = name;
    }

    public FavouriteRecipe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
