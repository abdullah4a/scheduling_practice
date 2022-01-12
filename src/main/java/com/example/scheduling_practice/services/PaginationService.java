package com.example.scheduling_practice.services;

import com.example.scheduling_practice.entities.User;
import org.springframework.data.domain.Page;

public interface PaginationService {
    Page<User> sortedListUser();
}
