package com.example.springboard.dto.response.common;


import com.example.springboard.domain.Member;
import jakarta.validation.constraints.Size;
import lombok.*;

/*
게시글, 댓글 작성자 공통 정보 dto
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberResponse {
    private Long id;
    private String nickname;

    // entity -> 작성자 dto
    @Size(min = 1, max = 100)
    public static MemberResponse from(Member member) {
        if(member == null ) return null; // 탈퇴 회원 확인
        return MemberResponse.builder()
                .id(member.getId())
                .nickname(member.getNickname())
                .build();
    }
}
