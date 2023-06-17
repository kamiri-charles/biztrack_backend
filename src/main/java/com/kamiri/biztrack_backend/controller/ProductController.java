package com.kamiri.biztrack_backend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kamiri.biztrack_backend.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.kamiri.biztrack_backend.models.Product;
import java.util.UUID;


@RestController
@RequestMapping("/api/products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Get product by UUID
    @GetMapping("/{uuid}")
    public Product getProductByUuid(@PathVariable("uuid") UUID uuid) {
        return productRepository.findByUuid(uuid);
    }
    
}
