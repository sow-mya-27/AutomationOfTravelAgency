package com.example.automationOfTravelAgency.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "userType")
    private String userType;

    public User(){}

    public User(  String userName,String email, String password, String userType) {
        this.username = userName;
        this.password = password;
        this.userType=userType;
    }



}
