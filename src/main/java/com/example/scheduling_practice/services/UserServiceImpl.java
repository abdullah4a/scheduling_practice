package com.example.scheduling_practice.services;

import com.example.scheduling_practice.entities.User;
import com.example.scheduling_practice.exception.ExceptionHandler;
import com.example.scheduling_practice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getById(long webId) {
        Optional<User> optionalUser=userRepository.findById(webId);
        if (optionalUser.isPresent()){
            return optionalUser.get();
        }
        else
            throw new ExceptionHandler("User Not Found");
    }

}
