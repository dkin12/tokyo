package com.example.middletest.service;


import com.example.middletest.Repository.ProductRepository;
import com.example.middletest.dto.ProductDto;
import com.example.middletest.entity.Product;
import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor // 상수로 선언된 객체는 자동으로 생성자를 만들어 줌
public class ProductService {
    public final ProductRepository repo;


    // 등록
    @Transactional
    public Product register(String name, Integer price) {
        Product product = Product.builder().name(name).price(price).build();
        return repo.save(product); 
    }

    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return repo.findAll();
    }

    @Transactional(readOnly = true)
    public Product findById(int id) {
        return repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        // 없으면 404 Not found 예외 발생
    }

    @Transactional
    public void delete(int id) {
        Product Product = repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        repo.delete(Product);

    }


    @Transactional
    public void rename(int id,  String name) {
        Product Product = repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        Product.rename(name);
    }


    @Transactional
    public void reprice(int id, Integer price) {
        Product product = repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        product.reprice(price);
    }
    @Transactional
    public Product updateContent(int id, ProductDto dto) {
        Product product = repo.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        if (dto.getName() == null || dto.getName().isBlank()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "물품명은 필수입니다.");
        }
        if(dto.getPrice() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"가격은 필수입니다.");
        }
        rename(id, dto.getName());
        reprice(id, dto.getPrice());
        return product;

    }

}
