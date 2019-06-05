package com.FoodBook.foodBook.repositories.UserRepository;

import com.FoodBook.foodBook.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
}
