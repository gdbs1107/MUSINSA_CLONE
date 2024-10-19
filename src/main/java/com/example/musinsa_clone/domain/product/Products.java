package com.example.musinsa_clone.domain.product;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import com.example.musinsa_clone.domain.brand.Brand;
import com.example.musinsa_clone.domain.enumClass.Gender;
import com.example.musinsa_clone.test.testEntity.Category;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Products extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer score;

    @Column(nullable = false)
    private Integer stock;

    //제품에 대한 간단한 설명 -> 자세한 설명은 브랜드 측에서 제작한 이미지로 대체
    @Column(nullable = false)
    private String description;

    //배송기간
    @Column(nullable = false)
    private LocalDateTime deliveryPeriod;

    @Column(nullable = false)
    private Long productNumber;

    @Column(nullable = false)
    private Gender gender;

    //구매횟수
    private Integer purchaseCount = 0;

    //제품 자체 할인률
    private Integer productDiscount = 0;

    // 카테고리 연관 관계 (2차 카테고리와 매핑)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ProductCategory_id")
    private ProductCategory productCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
