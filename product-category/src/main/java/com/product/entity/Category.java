package com.product.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(nullable = false)
    private boolean isDeleted = false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
