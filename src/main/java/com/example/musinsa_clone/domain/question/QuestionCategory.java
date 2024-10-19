package com.example.musinsa_clone.domain.question;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class QuestionCategory extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //문의 유형
    @Column(nullable = false)
    private String questionType;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Question question;
}
