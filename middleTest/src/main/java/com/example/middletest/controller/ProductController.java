package com.example.middletest.controller;

import com.example.middletest.dto.ProductDto;
import com.example.middletest.entity.Product;
import com.example.middletest.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;

    // JSON 등록
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto dto) {
        Product saved = service.register(dto.getName(),dto.getPrice());
        return ResponseEntity.ok(ProductDto.fromEntity(saved));
    }


    // 전체 조회
    @GetMapping
    public ResponseEntity<List<ProductDto>> getProductList() {
        List<ProductDto> list = service.findAll().stream()
                .map(product -> ProductDto.fromEntity(product))
                .toList();
        return ResponseEntity.ok(list);
    }

    // 개별 조회
    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable int id) {
        Product product = service.findById(id);
        return ResponseEntity.ok(ProductDto.fromEntity(product));
    }

    // 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    // 수정
    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> updateProduct(@PathVariable int id, @RequestBody ProductDto dto) {
        Product updated = service.updateContent(id, dto);
        return ResponseEntity.ok(ProductDto.fromEntity(updated));
    }

}