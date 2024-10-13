package com.example.musinsa_clone.test.testRepository;

import com.example.musinsa_clone.test.testEntity.TestProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestProductRepository extends JpaRepository<TestProduct, Long> {
}
