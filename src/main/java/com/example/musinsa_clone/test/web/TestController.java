package com.example.musinsa_clone.test.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }


}
