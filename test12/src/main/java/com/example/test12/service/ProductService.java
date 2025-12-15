package com.example.test12.service;


import com.example.test12.dto.ProductDto;
import com.example.test12.entity.Product;
import com.example.test12.responsitory.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductService {

    private final ProductRepository repo;


    @Transactional
    public Product register(ProductDto dto) {
        Product product = Product.builder().name(dto.getName()).price(dto.getPrice()).build();
        return repo.save(product);
    }


    // 전체 목록 조회
    public List<Product> findAll() {
        return repo.findAll();
    }

    // 삭제
    @Transactional
    public void delete(int id){
        Product product = repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"없는 번호입니다."));
        repo.delete(product);
    }



}
