package com.example.middletest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product") // DB테이블 이름을 명시적으로 연결
public class Product {
    @Id // 기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 칼럼 설정 ( 제약 조건 null 금지, 문자열 길이 50 )
    @Column(nullable = false,length = 50)
    private String name;

    @Column(nullable = false)
    private Integer price;

    public void rename(String name) {
        this.name = name;
    }
    public void reprice(int price) {
        this.price = price;
    }
}




