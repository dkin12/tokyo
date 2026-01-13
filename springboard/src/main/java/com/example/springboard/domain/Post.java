package com.example.springboard.domain;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "post")
@Getter // @Setter는 안만들어줌
@NoArgsConstructor // 기본 생성자 알아서 만들어주는 거
@AllArgsConstructor
@Builder
public class Post {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    // 회원 1 : 게시글 N
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id",nullable = false)
    private Member member;

    // 제목 필수값
    @Column(name = "title",nullable = false,length = 200)
    private String title;
    // 내용 필수값
    @Lob
    @Column(name = "content",nullable = false)
    private String content;
    // 이미지 DB에 경로만 지정
    @Column(name = "image_url",length = 500)
    private String imageUrl;
    // 조회수 필수값
    @Column(name = "read_count",nullable = false)
    private Integer readCount;
    // 작성일
    // insert 실행 시 DB에 자동으로 현재 시간 주입
    @CreationTimestamp
    @Column(name = "created_at" ,nullable = false, updatable = false )
    private LocalDateTime createdAt;
    // 수정일
    // update 실행 시 자동으로 현재 시간으로 갱신
    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;


    // 조회수에서 글을 읽을 때마다 처리임
    /*
        @PrePersist insert 전
        @PostPersist insert 후
        @PreUpdate update 전
        @PostLoad 엔티티가 DB에 조회된 후
     */

    @PrePersist
    public void perCount(){
        if(readCount==null) readCount = 0;

    }
    // 조회수 증가 메서드
    public void increaseReadCount(){
        this.readCount++;
    }
    public void update(String title,String content,String imageUrl){
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
    }

    public void delete(Long id){

    }

}
