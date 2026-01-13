package com.example.springboard.dto.request.post;


import com.example.springboard.domain.Member;
import com.example.springboard.domain.Post;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

// 게시글 작성 DTO
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostCreateRequest {

    @NotBlank(message = "제목은 필수입니다.")
    @Size(max = 200, message = "제목은 200자 이하로 작성")
    private String title;

    @NotBlank(message = "내용은 필수입니다.")
    private String content;
    private String imageUrl;

    // 요청 DTO -> Post entity 로 변환
    public Post toEntity(Member member) {
        return Post.builder()
                .member(member) // 작성자
                .title(title)
                .content(content)
                .imageUrl(imageUrl).build();
    }

}
