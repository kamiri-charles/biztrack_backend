package com.kamiri.biztrack_backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity(name = "employees")
public class Employee {

    @Id
    private UUID uuid;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String business_uuid;
    private String salary;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;


    // Constructors
    public Employee() {
    }

    public Employee(UUID uuid, String firstName, String lastName, String business_uuid, String salary, String email,
            String phoneNumber) {
        this.uuid = uuid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.business_uuid = business_uuid;
        this.salary = salary;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBusiness_uuid() {
        return business_uuid;
    }

    public void setBusiness_uuid(String business_uuid) {
        this.business_uuid = business_uuid;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }    
}
