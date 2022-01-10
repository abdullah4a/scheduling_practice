package com.example.scheduling_practice.repositories;

import com.example.scheduling_practice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
