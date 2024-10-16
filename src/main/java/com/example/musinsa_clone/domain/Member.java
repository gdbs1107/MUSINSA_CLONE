package com.example.musinsa_clone.domain;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import com.example.musinsa_clone.test.testEntity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    private String password;

    private String name;

    private Role role;

    private int phoneNumber;

    private String email;

    private LocalDate birthDate;

    private int gradePoint;

    private Grade grade;

    private int moneyPoint;

    private SocialType socialType;
}
