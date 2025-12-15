package com.example.test13.dto.response;


import com.example.test13.domain.Post;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostListResponse {
    private Long id;
    private String content;
    private LocalDateTime createdAt;

    public static PostListResponse from(Post post) {
        return PostListResponse.builder().id(post.getId()).content(post.getContent()).createdAt(post.getCreatedAt()).build();
    }

}
