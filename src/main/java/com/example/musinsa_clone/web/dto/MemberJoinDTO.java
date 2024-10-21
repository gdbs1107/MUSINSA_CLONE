package com.example.musinsa_clone.web.dto;

import com.example.musinsa_clone.domain.enumClass.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public class MemberJoinDTO {

    @Getter
    public static class JoinRequestDTO{

        /* 회원 약관 동의 */
        Boolean ageAgree;
        Boolean musinsaAgree;
        Boolean adAgree;
        Boolean marketingAgree;

        /* 회원 가입 정보 */
        String username;
        String password;
        String name;
        String phoneNumber;
        String email;
        LocalDate birthDate;

        //성별은 추후 수정 예정
        Gender gender;


    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class JoinResponseDTO{

        Long memberId;

    }
}
