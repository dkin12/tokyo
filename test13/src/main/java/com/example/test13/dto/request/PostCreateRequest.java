package com.example.test13.dto.request;

import com.example.test13.domain.Post;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostCreateRequest {


    @NotBlank(message = "내용은 필수입니다.")
    private String content;

    // 요청 DTO -> Post entity 로 변환
    public Post toEntity() {
        return Post.builder()
                .content(content)
                .build();
    }

}
