package com.kamiri.biztrack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.kamiri.biztrack_backend.models.Business;
import java.util.UUID;

public interface BusinessRepository extends JpaRepository<Business, UUID> {
    // Custom queries go here
    Business findByUuid(UUID uuid);
    Business[] findByOwnerUuid(UUID owner_uuid);

}
