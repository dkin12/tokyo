package com.example.springboard.dto.response.comment;

import com.example.springboard.domain.PostComment;
import com.example.springboard.dto.response.common.MemberResponse;
import com.example.springboard.repository.MemberRepository;
import lombok.*;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostCommentResponse {
    private Long id;
    private String content;
    private MemberResponse author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public static PostCommentResponse from(PostComment comment) {
        return PostCommentResponse.builder()
                .id(comment.getId())
                .author(MemberResponse.from(comment.getMember()))
                .content(comment.getContent())
                .createdAt(comment.getCreatedAt())
                .updatedAt(comment.getUpdatedAt())
                .build();
    }
}
