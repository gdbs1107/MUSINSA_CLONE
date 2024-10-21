package com.example.musinsa_clone.domain.member;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Agree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Boolean ageAgree = Boolean.TRUE;

    @Column(nullable = false)
    private Boolean musinsaAgree = Boolean.TRUE;

    @Column(nullable = false)
    private Boolean adAgree;

    @Column(nullable = false)
    private Boolean marketingAgree;



    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;
}
