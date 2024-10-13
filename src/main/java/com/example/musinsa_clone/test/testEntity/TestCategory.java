package com.example.musinsa_clone.test.testEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class TestCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // 상위 카테고리 (Self-referencing Many-to-One 관계)
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private TestCategory parentTestCategory;

    // 하위 카테고리들 (Self-referencing One-to-Many 관계)
    @OneToMany(mappedBy = "parentTestCategory")
    @JsonIgnore // 순환 참조 방지를 위해 추가
    private List<TestCategory> subCategories = new ArrayList<>();

    // 제품과의 관계 (One-to-Many 관계)
    @OneToMany(mappedBy = "category")
    @JsonIgnore // 이 부분 추가
    private List<TestProduct> testProducts = new ArrayList<>();

    // getters, setters
}

