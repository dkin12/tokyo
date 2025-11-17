package com.example.test.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "test_user")
public class User {
    @Id// 기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // 칼럼 설정 ( 제약 조건 null 금지, 문자열 길이 50 )
    @Column(nullable = false,length = 50)
    private String name;
    private Integer age;

}
