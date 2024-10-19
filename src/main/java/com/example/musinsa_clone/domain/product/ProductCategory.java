package com.example.musinsa_clone.domain.product;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import com.example.musinsa_clone.test.testEntity.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ProductCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name; // 카테고리 이름

    // 상위 카테고리 (1차 카테고리)
    @ManyToOne
    @JoinColumn(name = "parentCategory_id")
    private ProductCategory parentCategory;

    // 하위 카테고리 (2차 카테고리들)
    @OneToMany(mappedBy = "parentCategory")
    @JsonIgnore
    private List<ProductCategory> subCategories = new ArrayList<>();
}
