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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @Column(nullable = false)
    private int phoneNumber;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private LocalDate birthDate;

    //회원 등급 산정을 위한 포인트
    @Column(nullable = false)
    private int gradePoint;

    //회원 등급 -> 등급별 할인률이 상이함
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Grade grade;

    //적립금
    @Column(nullable = false)
    private int moneyPoint;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SocialType socialType;
}
