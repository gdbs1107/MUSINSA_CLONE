package com.example.musinsa_clone.test.web;

import com.example.musinsa_clone.test.service.ProductService;
import com.example.musinsa_clone.test.testEntity.Product;
import com.example.musinsa_clone.test.web.dto.ProductRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest) {
        Product createdProduct = productService.createProduct(productRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdProduct);
    }

}
