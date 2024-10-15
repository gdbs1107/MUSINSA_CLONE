package com.example.musinsa_clone.test.testEntity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {

    //실제 엔티티 설계 시에는 훨씬 자세하게 설계하기
    //column 설정과 같은 내부제약조건
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

