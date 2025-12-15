package com.example.test12.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "products")
public class Product {
    @Id
    @SequenceGenerator(
            name = "products_seq_e",
            sequenceName = "products_seq",
            allocationSize = 1
    )
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator = "products_seq")
    private Integer id;

    @Column(nullable = false, length = 200 )
    private String name;

    @Column(nullable = false)
    private Integer price;



    // 수정

    public void update(Product product){
        this.name = product.getName();
        this.price = product.getPrice();
    }

}
