package com.example.test12.controller;


import com.example.test12.dto.ProductDto;
import com.example.test12.entity.Product;
import com.example.test12.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
// CORS 우회 방법
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDto>> findAll(){
        List<ProductDto> list =  productService.findAll().stream().map(product -> ProductDto.fromEntity(product)).toList();
        return ResponseEntity.ok(list);

    }

    @PostMapping
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto dto){
        Product saved = productService.register(dto);
        return ResponseEntity.ok(ProductDto.fromEntity(saved));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ProductDto> deleteById(@PathVariable int id){
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
