package com.example.automationOfTravelAgency.service;

import com.example.automationOfTravelAgency.entity.User;

public interface UserService {

    public User save(User user);

    public boolean validate(String user,String password);

    public void update(User user);
}
