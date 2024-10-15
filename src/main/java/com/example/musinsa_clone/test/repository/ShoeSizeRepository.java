package com.example.musinsa_clone.test.repository;

import com.example.musinsa_clone.test.testEntity.size.ShoeSize;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeSizeRepository extends JpaRepository<ShoeSize, Long> {
}
