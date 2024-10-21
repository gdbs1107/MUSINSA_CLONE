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

    /* 14세 이상 동의
    * 필수 값 */
    @Column(nullable = false)
    private Boolean ageAgree = Boolean.TRUE;

    /* 무신사 이용약관 동의
     * 필수 값 */
    @Column(nullable = false)
    private Boolean musinsaAgree = Boolean.TRUE;

    /* 광고 동의
     * 선택 값 */
    @Column(nullable = false)
    private Boolean adAgree;

    /* 마케팅 광고 동의
     * 선택 값 */
    @Column(nullable = false)
    private Boolean marketingAgree;



    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "member_id")
    private Member member;
}
