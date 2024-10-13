package com.example.musinsa_clone.test.service;

import com.example.musinsa_clone.test.testEntity.TestCategory;
import com.example.musinsa_clone.test.testEntity.TestProduct;
import com.example.musinsa_clone.test.testRepository.TestCategoryRepository;
import com.example.musinsa_clone.test.testRepository.TestProductRepository;
import com.example.musinsa_clone.test.web.dto.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final TestProductRepository testProductRepository;
    private final TestCategoryRepository testCategoryRepository;

    @Autowired
    public ProductService(TestProductRepository testProductRepository, TestCategoryRepository testCategoryRepository) {
        this.testProductRepository = testProductRepository;
        this.testCategoryRepository = testCategoryRepository;
    }

    public TestProduct createProduct(ProductRequest productRequest) {
        // 카테고리 ID를 이용하여 카테고리 찾기
        TestCategory testCategory = testCategoryRepository.findById(productRequest.getCategoryId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid category ID"));

        // 새로운 제품 생성 및 카테고리 설정
        TestProduct testProduct = new TestProduct();
        testProduct.setName(productRequest.getName());
        testProduct.setDescription(productRequest.getDescription());
        testProduct.setPrice(productRequest.getPrice());
        testProduct.setTestCategory(testCategory);

        // 제품 저장
        return testProductRepository.save(testProduct);
    }
}

