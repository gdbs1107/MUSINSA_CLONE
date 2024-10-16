package com.example.musinsa_clone.domain;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import com.example.musinsa_clone.domain.enumClass.Grade;
import com.example.musinsa_clone.domain.enumClass.Role;
import com.example.musinsa_clone.domain.enumClass.SocialType;
import com.example.musinsa_clone.test.testEntity.Product;
import jakarta.persistence.*;
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

    @Enumerated(EnumType.STRING)
    private Role role;

    private int phoneNumber;

    private String email;

    private LocalDate birthDate;

    private int gradePoint;

    @Enumerated(EnumType.STRING)
    private Grade grade;

    private int moneyPoint;

    @Enumerated(EnumType.STRING)
    private SocialType socialType;
}
