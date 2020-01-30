package com.tavant.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tavant.lms.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
