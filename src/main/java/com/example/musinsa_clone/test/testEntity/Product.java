package com.example.musinsa_clone.test.testEntity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;

    // 카테고리 연관 관계 (2차 카테고리와 매핑)
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}

