package com.kamiri.biztrack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kamiri.biztrack_backend.models.User;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    // Custom queries go here
    User findByUsername(String username);
    User findByEmail(String email);
    User findByUuid(UUID uuid);
}
