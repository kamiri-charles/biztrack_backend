package com.kamiri.biztrack_backend.models;

import jakarta.persistence.Id;
import java.util.UUID;

public class Product {

    @Id
    private UUID uuid;
    private String name;
    private String description;
    private String price;
    private String quantity;
    private String business_uuid;
    private String date_created;
    private String date_updated;


    // Constructors
    public Product() {
    }

    public Product(UUID uuid, String name, String description, String price, String quantity, String business_uuid,
            String date_created, String date_updated) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.business_uuid = business_uuid;
        this.date_created = date_created;
        this.date_updated = date_updated;
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
    public String getBusiness_uuid() {
        return business_uuid;
    }
    public void setBusiness_uuid(String business_uuid) {
        this.business_uuid = business_uuid;
    }
    public String getDate_created() {
        return date_created;
    }
    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }
    public String getDate_updated() {
        return date_updated;
    }
    public void setDate_updated(String date_updated) {
        this.date_updated = date_updated;
    }

    
}
