package com.example.musinsa_clone.test.testEntity.size;

import com.example.musinsa_clone.test.testEntity.Product;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BottomSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String waistSize;  // 허리 사이즈
    private String inseamLength;  // 안쪽 다리 길이

    // 제품 연관 관계
    @OneToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
