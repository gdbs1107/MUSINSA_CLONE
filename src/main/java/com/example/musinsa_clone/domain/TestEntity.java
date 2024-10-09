package com.example.musinsa_clone.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class TestEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
