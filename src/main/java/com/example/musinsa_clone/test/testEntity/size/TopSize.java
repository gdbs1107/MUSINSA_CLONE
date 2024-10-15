package com.example.musinsa_clone.test.testEntity.size;

import com.example.musinsa_clone.test.testEntity.Product;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class TopSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String chestSize;  // 가슴 사이즈
    private String sleeveLength;  // 소매 길이

    // 제품 연관 관계
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

