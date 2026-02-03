package com.Swaraj.Swaraj744.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Swaraj.Swaraj744.model.Admin;
import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);
}
