package com.Swaraj.Swaraj744.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Swaraj.Swaraj744.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}

