package com.example.scheduling_practice.web;

import com.example.scheduling_practice.entities.User;
import com.example.scheduling_practice.services.PaginationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class PaginationController {
    @Autowired
    public PaginationServiceImpl cService;
    @GetMapping("/page")
    public ResponseEntity<Page<User>> getList() {
        Page<User> page =cService.sortedListUser();
        return ResponseEntity.ok(page);
    }
}
