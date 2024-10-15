package com.example.musinsa_clone.test.repository;

import com.example.musinsa_clone.test.testEntity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
