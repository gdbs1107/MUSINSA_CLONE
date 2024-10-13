package com.example.musinsa_clone.test.testEntity;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TestEntity extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
