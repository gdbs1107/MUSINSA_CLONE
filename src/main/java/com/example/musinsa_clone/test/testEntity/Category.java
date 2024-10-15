package com.example.musinsa_clone.test.testEntity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // 카테고리 이름

    // 상위 카테고리 (1차 카테고리)
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parentCategory;

    // 하위 카테고리 (2차 카테고리들)
    @OneToMany(mappedBy = "parentCategory")
    private List<Category> subCategories = new ArrayList<>();
}

