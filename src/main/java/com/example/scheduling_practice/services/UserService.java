package com.example.scheduling_practice.services;

import com.example.scheduling_practice.entities.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    User getById(long webId);
}
