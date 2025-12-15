package com.example.test12.dto;


import com.example.test12.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// Id, Name, price
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Integer id;
    private String name;
    private Integer price;

    public static ProductDto fromEntity(Product product){
        return ProductDto.builder().id(product.getId()).name(product.getName()).price(product.getPrice()).build();
    }
}
