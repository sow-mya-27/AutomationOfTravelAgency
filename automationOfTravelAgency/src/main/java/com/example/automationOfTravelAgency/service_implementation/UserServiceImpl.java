package com.example.automationOfTravelAgency.service_implementation;

import com.example.automationOfTravelAgency.entity.User;
import com.example.automationOfTravelAgency.repository.UserRepository;
import com.example.automationOfTravelAgency.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository=userRepository;
    }


    @Override
    public User save(User user) {
        List<User> user1 = userRepository.getUserByname(user.getUsername().toString());
        if(user1.toArray().length==0){
            return userRepository.save(user);
        }
        return null;
    }

    @Override
    public boolean validate(String username, String password) {
        List<User> user1 = userRepository.getUserByname(username);
        return user1.get(0).getPassword().toString().equals(password);
    }

    @Override
    public void update(User user) {
        List<User> user1 = userRepository.getUserByname(user.getUsername().toString());
        User user2=user1.get(0);
        user2.setPassword(user.getPassword());
        userRepository.save(user2);
    }
}
