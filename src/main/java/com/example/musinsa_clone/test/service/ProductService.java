package com.example.musinsa_clone.test.service;

import com.example.musinsa_clone.test.testEntity.Category;
import com.example.musinsa_clone.test.testEntity.Product;
import com.example.musinsa_clone.test.testRepository.CategoryRepository;
import com.example.musinsa_clone.test.testRepository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    public Product createProduct(ProductRequest productRequest) {
        // 카테고리 ID를 이용하여 카테고리 찾기
        Category category = categoryRepository.findById(productRequest.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid category ID"));

        // 새로운 제품 생성 및 카테고리 설정
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        product.setCategory(category);

        // 제품 저장
        return productRepository.save(product);
    }
}

