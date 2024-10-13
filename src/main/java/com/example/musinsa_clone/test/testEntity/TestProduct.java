package com.example.musinsa_clone.test.testEntity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TestProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private Double price;

    // 카테고리와의 관계 (Many-to-One 관계)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private TestCategory testCategory;

    // getters, setters
}
