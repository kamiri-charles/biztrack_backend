package com.kamiri.biztrack_backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity(name = "businesses")
public class Business {

    @Id
    private UUID uuid;
    private String name;
    private UUID owner_uuid;
    private String location_coordinates;
    private Product[] products;

    // Constructors
    public Business() {
    }

    public Business(UUID uuid, String name, UUID owner_uuid, String location_coordinates) {
        this.uuid = uuid;
        this.name = name;
        this.owner_uuid = owner_uuid;
        this.location_coordinates = location_coordinates;
    }


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
    public UUID getOwner_uuid() {
        return owner_uuid;
    }
    public void setOwner_uuid(UUID owner_uuid) {
        this.owner_uuid = owner_uuid;
    }
    public String getLocation_coordinates() {
        return location_coordinates;
    }
    public void setLocation_coordinates(String location_coordinates) {
        this.location_coordinates = location_coordinates;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }    
}