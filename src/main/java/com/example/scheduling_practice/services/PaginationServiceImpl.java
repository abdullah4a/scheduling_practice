package com.example.scheduling_practice.services;

import com.example.scheduling_practice.entities.User;
import com.example.scheduling_practice.repositories.PaginationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class PaginationServiceImpl implements PaginationService {

    @Autowired
    private PaginationRepo paginationRepo;
      public Page<User> sortedListUser() {
          Page<User> page= paginationRepo.findAll(PageRequest.of(2,2));
        return page;
    }
}
