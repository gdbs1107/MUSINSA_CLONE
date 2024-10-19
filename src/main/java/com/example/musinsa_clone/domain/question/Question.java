package com.example.musinsa_clone.domain.question;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import com.example.musinsa_clone.domain.enumClass.Status;
import com.example.musinsa_clone.domain.member.Member;
import com.example.musinsa_clone.test.testEntity.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Question extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String title;

    @Enumerated(EnumType.STRING)
    private Status status = Status.PUBLIC;

    /* 해당 문의가 비밀글인지 식별 할 수 있는 값 */
    @Column(nullable = false)
    private Boolean isSecret = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;
}
