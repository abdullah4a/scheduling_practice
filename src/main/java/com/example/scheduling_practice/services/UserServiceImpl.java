package com.example.scheduling_practice.services;

import com.example.scheduling_practice.entities.User;
import com.example.scheduling_practice.exception.ExceptionHandler;
import com.example.scheduling_practice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long webId) {
        Optional<User> optionalUser = userRepository.findById(webId);
        if (optionalUser.isPresent()) {
            return optionalUser.get();
        } else
            throw new ExceptionHandler("User Not Found");
    }

    @Override
    public User save(User user) {
        User model = userRepository.saveAndFlush(user);
        if (model != null) {
            return model;
        } else
            throw new ExceptionHandler("User Not Saved");
    }

    @Override
    public User updateModel(Long webId, User user) {
        Optional<User> optionalUser = userRepository.findById(webId);
        if (optionalUser.isPresent()) {
            User model = optionalUser.get();
            model = userRepository.saveAndFlush(model);
            return model;
        } else {
            return save(user);
        }

    }

    @Override
    public Boolean deleteUser(Long webId) {
        userRepository.deleteById(webId);
        boolean id = userRepository.existsById(webId);
        return !id;
    }


}
