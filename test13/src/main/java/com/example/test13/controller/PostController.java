package com.example.test13.controller;

import com.example.test13.domain.Post;
import com.example.test13.dto.request.PostCreateRequest;
import com.example.test13.dto.request.PostUpdateRequest;
import com.example.test13.dto.response.PostListResponse;
import com.example.test13.service.PostService;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/todos")
public class PostController {
    private final PostService postService;
    private final Servlet servlet;


    // 게시글 등록
    @GetMapping
    public ResponseEntity<List<PostListResponse>> getAllPosts() {
        List<PostListResponse> list = postService.findAll().stream()
                .map(post -> PostListResponse.from(post))
                .toList();
        return ResponseEntity.ok(list);
    }

    // 게시글 등록
    @PostMapping
    public ResponseEntity<PostListResponse> createPost(@Valid @RequestBody PostCreateRequest request){
        return ResponseEntity.ok(postService.createPost(request));
    }

    // 게시글 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<List<PostListResponse>> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
    // 게시글 수정
    @PutMapping("/{id}")
    public ResponseEntity<PostListResponse> update(@PathVariable Long id, @Valid @RequestBody PostUpdateRequest request){
        return ResponseEntity.ok(postService.updatePost(id,request));
    }


}
