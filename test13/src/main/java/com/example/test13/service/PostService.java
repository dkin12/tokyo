package com.example.test13.service;


import com.example.test13.domain.Post;
import com.example.test13.dto.request.PostCreateRequest;
import com.example.test13.dto.request.PostUpdateRequest;
import com.example.test13.dto.response.PostListResponse;
import com.example.test13.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    // 등록
    @Transactional
    public PostListResponse createPost(PostCreateRequest request) {
        Post post = request.toEntity();
        Post saved = postRepository.save(post);
        return PostListResponse.from(saved);
    }

    // 전체 목록 조회
    public List<Post> findAll() {
        return postRepository.findAll();
    }

    // 수정
    @Transactional
    public PostListResponse updatePost(long id, PostUpdateRequest request) {
        Post post = postRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        post.update(request.getContent());
        return PostListResponse.from(post);
    }

    // 삭제
    @Transactional
    public void deletePost(long id) {
        Post post = postRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        postRepository.deleteById(id);
    }



}
