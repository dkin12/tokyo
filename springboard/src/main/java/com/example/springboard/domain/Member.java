package com.example.springboard.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "member",uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;
    @Column(name = "email",nullable = false,length = 255)
    private String email;
    // 암호화된 비밀번호
    @Column(name = "password",nullable = false,length = 255)
    private String password;
    @Column(name = "nickname",nullable = false,length = 50)
    private String nickname;
    @CreationTimestamp
    @Column(name = "created_at",nullable = false,updatable = false)
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "Updated_at")
    private LocalDateTime updatedAt;

    public void updateNickname(String nickname) {
        this.nickname = nickname;
    }

    public void updatePassword(String encodePassword) {
        this.password = encodePassword;
    }
}
