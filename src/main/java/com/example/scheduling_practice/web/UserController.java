package com.example.scheduling_practice.web;

import com.example.scheduling_practice.entities.User;
import com.example.scheduling_practice.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.example.scheduling_practice.exception.ExceptionHandler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> getList() {
        List<User> list = userService.listUsers();
//        return new ResponseEntity<List<User>>(list, HttpStatus.OK);
        return ResponseEntity.ok(list);
    }
    @GetMapping("/webId")
    public User getById(@PathVariable long webId){
        return userService.getById(webId);
    }

    @PostMapping("/")
    public User postModel(@RequestBody User user) {
        return user;
    }

    @PutMapping("/{webId}")
    public User updateModel(@PathVariable Long webId, @RequestBody User user) {
        User model = null;
        try {
            User response = (userService.getById(webId));
            if (model != null) {
                if (user.equals(response)) {
                    /*
                    * TODO Business Logic Pending
                    */
                    return user;
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
            User response = (userService.getById(webId));
            return true;
        } catch (ExceptionHandler exc) {
            throw new ExceptionHandler("Not Found", exc);
        }
    }
}
