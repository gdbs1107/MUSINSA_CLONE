package com.example.musinsa_clone.domain.member;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Delivery extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /* 시/도 */
    @Column(nullable = false)
    private String province;

    /* 시/군/구 */
    @Column(nullable = false)
    private String city;

    /* 읍/면/동 */
    @Column(nullable = false)
    private String town;

    /* 상세주소 */
    @Column(nullable = false)
    private String details;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

}
