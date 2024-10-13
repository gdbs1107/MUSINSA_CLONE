package com.example.musinsa_clone.test.web;

import com.example.musinsa_clone.test.service.ProductService;
import com.example.musinsa_clone.test.testEntity.TestProduct;
import com.example.musinsa_clone.test.web.dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final ProductService productService;

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }



    // 제품 등록 API
    @PostMapping("/products")
    public ResponseEntity<TestProduct> createProduct(@RequestBody ProductRequest productRequest) {
        TestProduct createdTestProduct = productService.createProduct(productRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTestProduct);
    }

}
