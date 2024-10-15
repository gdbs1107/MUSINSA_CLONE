package com.example.musinsa_clone.test.web;

import com.example.musinsa_clone.test.service.SizeService;
import com.example.musinsa_clone.test.testEntity.Product;
import com.example.musinsa_clone.test.web.dto.SizeRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sizes")
@RequiredArgsConstructor
public class SizeController {

    private final SizeService sizeService;

    // 상의 사이즈 추가
    @PostMapping("/top/{productId}")
    public ResponseEntity<Product> addTopSize(@PathVariable Long productId, @RequestBody SizeRequest.TopSizeRequest topSizeRequest) {
        Product product = sizeService.addTopSize(productId, topSizeRequest);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }

    // 하의 사이즈 추가
    @PostMapping("/bottom/{productId}")
    public ResponseEntity<Product> addBottomSize(@PathVariable Long productId, @RequestBody SizeRequest.BottomSizeRequest bottomSizeRequest) {
        Product product = sizeService.addBottomSize(productId, bottomSizeRequest);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }

    // 신발 사이즈 추가
    @PostMapping("/shoe/{productId}")
    public ResponseEntity<Product> addShoeSize(@PathVariable Long productId, @RequestBody SizeRequest.ShoeSizeRequest shoeSizeRequest) {
        Product product = sizeService.addShoeSize(productId, shoeSizeRequest);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
}

