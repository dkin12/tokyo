package com.example.springboard.dto.response.common;


import com.example.springboard.dto.response.post.PostListResponse;
import lombok.*;
import org.springframework.data.domain.Page; // [추가] Page 객체 import

import java.util.List;
import java.util.function.Function;


// 페이징을 위한 공통 DTO
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageResponse<T> {

    private List<T> content;
    private int page;
    private int size;
    private long totalElements;
    private long totalPages;


    // Page<Entity> -> PageResponse<DTO> 반환
    // from ( Page<Entity 타입> page, Function<E,DTO 타입 > mapper )
    public static <E,D> PageResponse<D> from (Page<E> page, Function<E,D> mapper) {
        // .map(mapper) -> Entity -> DTO 반환
        // PostListResponse :: from 변환 함수
        List<D> content = page.getContent().stream()
                .map(mapper)
                .toList();
        return PageResponse.<D>builder()
                .content(content)
                .page(page.getNumber())       // 현재 페이지 번호
                .size(page.getSize())         // 페이지 크기
                .totalElements(page.getTotalElements()) // 전체 요소 수
                .totalPages(page.getTotalPages())       // 전체 페이지 수
                .build();
    }


    /*
    public static PageResponse<PostListResponse> fromPostPageResponse(Page<Post> page) {

        List<PostListResponse> content = new ArrayList<>();

        // Page 객체에서 내용을 꺼내 DTO로 변환
        for (Post post : page.getContent()) {
            content.add(PostListResponse.from(post));
        }

        return PageResponse.<PostListResponse>builder()
                .content(content)
                .page(page.getNumber())       // 현재 페이지 번호
                .size(page.getSize())         // 페이지 크기
                .totalElements(page.getTotalElements()) // 전체 요소 수
                .totalPages(page.getTotalPages())       // 전체 페이지 수
                .build();
    }
     */
}


/*
Page 객체 JPA 제공
페이지 설정
.getContent() 실제 데이터 리스트
.getTotalElement() 전체 갯수
.getTotalPages() 전체 페이지 수
.getSize() 페이지 크기
.getNumber() 현재 페이지 번호
 */
