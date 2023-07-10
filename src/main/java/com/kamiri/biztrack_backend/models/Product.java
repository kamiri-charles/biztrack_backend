package com.kamiri.biztrack_backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;


@Entity(name = "products")
public class Product {

    @Id
    private UUID uuid;
    private String name;
    private String description;
    private String price;
    private String quantity;

    // Constructors
    public Product() {
    }

    public Product(UUID uuid, String name, String description, String price, String quantity) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public UUID getUuid() {
        return uuid;
    }
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}