package com.example.demo.services;

import com.example.demo.init.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    private final  UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public void createUser(User user){

        userRepository.save(user);

    }

}