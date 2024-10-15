package com.example.musinsa_clone.test.service;

import com.example.musinsa_clone.test.repository.BottomSizeRepository;
import com.example.musinsa_clone.test.repository.ProductRepository;
import com.example.musinsa_clone.test.repository.ShoeSizeRepository;
import com.example.musinsa_clone.test.repository.TopSizeRepository;
import com.example.musinsa_clone.test.testEntity.Product;
import com.example.musinsa_clone.test.testEntity.size.BottomSize;
import com.example.musinsa_clone.test.testEntity.size.ShoeSize;
import com.example.musinsa_clone.test.testEntity.size.TopSize;
import com.example.musinsa_clone.test.web.dto.SizeRequest;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SizeService {

    //실제로 서비스 만들때엔 각 제품의 카테고리와 입력 사이즈의 카테고리가 일치하는지 검증하는 로직
    //*********반드시 필요함*********

    private final ProductRepository productRepository;
    private final TopSizeRepository topSizeRepository;
    private final BottomSizeRepository bottomSizeRepository;
    private final ShoeSizeRepository shoeSizeRepository;

    @Autowired
    public SizeService(ProductRepository productRepository,
                       TopSizeRepository topSizeRepository,
                       BottomSizeRepository bottomSizeRepository,
                       ShoeSizeRepository shoeSizeRepository) {
        this.productRepository = productRepository;
        this.topSizeRepository = topSizeRepository;
        this.bottomSizeRepository = bottomSizeRepository;
        this.shoeSizeRepository = shoeSizeRepository;
    }

    @Transactional
    public Product addTopSize(Long productId, SizeRequest.TopSizeRequest topSizeRequest) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));

        //빌더 패턴으로 바꾸고
        TopSize topSize = new TopSize();
        topSize.setChestSize(topSizeRequest.getChestSize());
        topSize.setSleeveLength(topSizeRequest.getSleeveLength());
        topSize.setProduct(product);

        topSizeRepository.save(topSize);
        return product;
    }

    @Transactional
    public Product addBottomSize(Long productId, SizeRequest.BottomSizeRequest bottomSizeRequest) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));

        BottomSize bottomSize = new BottomSize();
        bottomSize.setWaistSize(bottomSizeRequest.getWaistSize());
        bottomSize.setInseamLength(bottomSizeRequest.getInseamLength());
        bottomSize.setProduct(product);

        bottomSizeRepository.save(bottomSize);
        return product;
    }

    @Transactional
    public Product addShoeSize(Long productId, SizeRequest.ShoeSizeRequest shoeSizeRequest) {
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid product ID"));

        ShoeSize shoeSize = new ShoeSize();
        shoeSize.setShoeSize(shoeSizeRequest.getShoeSize());
        shoeSize.setProduct(product);

        shoeSizeRepository.save(shoeSize);
        return product;
    }
}

