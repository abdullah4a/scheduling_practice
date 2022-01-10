package com.example.scheduling_practice.web;

import com.example.scheduling_practice.entities.User;
import com.example.scheduling_practice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import com.example.scheduling_practice.exception.ExceptionHandler;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> getList() {
        List<User> list = userService.listUsers();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{webId}")
    public User getById(@PathVariable long webId) {
        return userService.getById(webId);
    }

    @PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> postModel(@RequestBody User user) {
        if (user == null) {
            throw new ExceptionHandler();
        } else {
            User model = userService.save(user);
            return ResponseEntity.ok(model);
        }
    }

    @PutMapping("/{webId}")
    public ResponseEntity<User> updateModel(@PathVariable Long webId, @RequestBody User user) {
        User model = null;
        try {
            User response = (userService.getById(webId));
            if (model != null) {
                if (user.equals(response)) {
                    return updateModel(webId,user);
                }
            }
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Not Found", exc);
        }
        return null;
    }

    @DeleteMapping("/{webId}")
    public Boolean deleteModel(@PathVariable Long webId) {
        try {
            return userService.deleteUser(webId);

        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Not Found", exc);
        }
    }
}
