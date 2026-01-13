package com.example.springboard.repository;

import com.example.springboard.domain.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
    // 제목과 내용에 키워드 포함 검색
    Page<Post> findByTitleContainingIgnoreCaseOrContentContaining(
            String title,
            String content,
            Pageable pageable // 페이지 번호 , 페이지 크기, 페이지 정렬
            // Pageable.of(0첫페이지,10페이지안의,Sort.by("id").descending())

    );
}

/*
    매서드 이름 규칙에 맞춰 만ㄷ르면 자동으로 쿼리를 만들어 줌
    findBy + 필드명 + 조건 (+연결조건 +  필드명 + 조건 ... )
    FindBy 찾음
    Title title 필드로 검색
    Containing 특정 문자열이 포함된 데이터 검색
    IgnoreCase 대소문자 구분 없음
    Or 혹은
    content 엔터티의 content 필드
*/