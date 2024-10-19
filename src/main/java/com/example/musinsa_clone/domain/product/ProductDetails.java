package com.example.musinsa_clone.domain.product;

import com.example.musinsa_clone.test.testEntity.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ProductDetails {

    /*무신사는 제품 설명을 대부분 이미지로 제공합니다
    * 그러한 기능을 구현하기 위한 엔티티입니다*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

}
