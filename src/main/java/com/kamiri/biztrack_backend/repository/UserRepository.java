package com.kamiri.biztrack_backend.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.kamiri.biztrack_backend.models.User;
import java.util.UUID;


@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    // Custom queries go here
}
