package com.product.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;

    @Column(nullable = false)
    private boolean isDeleted = false;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
