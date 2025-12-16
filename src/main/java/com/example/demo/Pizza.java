package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells JPA: "Create a table for this class!"
public class Pizza {

    @Id // This is the unique ID (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This makes the ID 1, 2, 3... automatically
    private Long id;

    private String name;
    private Double price;

    // Standard Getters and Setters (Important for JPA!)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}