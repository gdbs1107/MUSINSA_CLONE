package com.example.musinsa_clone.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    //회원가입
    @PostMapping("/join")
    public void join(@RequestBody Member member) {

    }

    //회원정보 수정

    //회원탈퇴

    //회원조회


}
