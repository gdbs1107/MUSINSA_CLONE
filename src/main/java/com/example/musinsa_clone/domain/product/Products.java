package com.example.musinsa_clone.domain.product;

import com.example.musinsa_clone.domain.enumClass.Gender;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String productName;
    private Integer price;
    private Integer score;
    private Integer stock;
    private String description;
    private LocalDateTime deliveryPeriod;
    private Long productNumber;
    private Gender gender;
    private Integer purchaseCount;
    private Integer productDiscount;
}
