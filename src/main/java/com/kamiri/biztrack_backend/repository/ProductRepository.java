package com.kamiri.biztrack_backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.kamiri.biztrack_backend.models.Product;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    // Custom queries go here
    Product findByUuid(UUID uuid);
    Product findByName(String name);
    Product findByBusinessUuid(String business_uuid);
}
