package com.example.musinsa_clone.domain.order;

import com.example.musinsa_clone.domain.baseEntity.BaseEntity;
import com.example.musinsa_clone.domain.member.Member;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Orders extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /* 자세한 필드를 채울 예정, 주문은 아직 제작중입니다*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;
}
