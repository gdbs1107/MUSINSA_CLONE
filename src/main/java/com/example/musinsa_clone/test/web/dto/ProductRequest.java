package com.example.musinsa_clone.test.web.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private Double price;
    private Long categoryId; // 2차 카테고리 ID

}
