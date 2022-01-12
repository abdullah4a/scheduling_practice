package com.example.scheduling_practice.repositories;

import com.example.scheduling_practice.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaginationRepo extends PagingAndSortingRepository<User, Long> {
}
