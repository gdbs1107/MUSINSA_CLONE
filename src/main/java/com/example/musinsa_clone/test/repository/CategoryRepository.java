package com.example.musinsa_clone.test.repository;

import com.example.musinsa_clone.test.testEntity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
