package com.example.automationOfTravelAgency.repository;

import com.example.automationOfTravelAgency.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value = "select * from users where username = ?",
            nativeQuery = true)
    List<User> getUserByname(String name);
}
