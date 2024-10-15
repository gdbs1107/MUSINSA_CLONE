package com.example.musinsa_clone.test.service;

import com.example.musinsa_clone.test.repository.CategoryRepository;
import com.example.musinsa_clone.test.repository.ProductRepository;
import com.example.musinsa_clone.test.testEntity.Category;
import com.example.musinsa_clone.test.testEntity.Product;
import com.example.musinsa_clone.test.web.dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public Product createProduct(ProductRequest productRequest) {
        // 2차 카테고리 찾기
        Category category = categoryRepository.findById(productRequest.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid category ID"));


        // 제품 생성
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        product.setCategory(category);

        return productRepository.save(product);
    }
}

