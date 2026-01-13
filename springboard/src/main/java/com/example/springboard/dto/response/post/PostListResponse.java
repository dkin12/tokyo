package com.example.springboard.dto.response.post;


import com.example.springboard.domain.Post;
import com.example.springboard.dto.response.common.MemberResponse;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

// 게시글 리스트 응답
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostListResponse {
    private Long id;
    private String title; // 제목
    private MemberResponse author; // 작성자 ( id, nickname )
    private Integer readCount; // 조회수
    private LocalDateTime createdAt; // 작성일


    // Post entity -> 리스트 DTO
    public static PostListResponse from(Post post) {
        return PostListResponse.builder()
                .id(post.getId())
                .title(post.getTitle())
                .author(MemberResponse.from(post.getMember()))
                .readCount(post.getReadCount())
                .createdAt(post.getCreatedAt())
                .build();
    }
}
