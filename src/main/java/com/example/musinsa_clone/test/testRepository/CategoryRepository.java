package com.example.musinsa_clone.test.testRepository;

import com.example.musinsa_clone.test.testEntity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
