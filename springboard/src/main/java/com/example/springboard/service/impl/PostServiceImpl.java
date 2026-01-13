package com.example.springboard.service.impl;

import com.example.springboard.domain.Member;
import com.example.springboard.domain.Post;
import com.example.springboard.dto.request.post.PostCreateRequest;
import com.example.springboard.dto.request.post.PostUpdateRequest;
import com.example.springboard.dto.response.common.PageResponse;
import com.example.springboard.dto.response.post.PostDetailResponse;
import com.example.springboard.dto.response.post.PostListResponse;
import com.example.springboard.repository.MemberRepository;
import com.example.springboard.repository.PostCommentRepository;
import com.example.springboard.repository.PostRepository;
import com.example.springboard.service.FileService;
import com.example.springboard.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

@Service // [필수] 스프링 빈 등록
@RequiredArgsConstructor
@Transactional
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final FileService fileService;
    private final MemberRepository memberRepository;
    private final PostCommentRepository postCommentRepository;

    private void loginCheck (Long memberId){
        if(memberId == null){
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "로그인이 필요합니다.");
        }
    }

    // 게시글 작성
    @Override
    public PostDetailResponse createPost(Long memberId, PostCreateRequest request) {
        loginCheck(memberId);

        Member member = memberRepository.findById(memberId).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.UNAUTHORIZED,"로그인이 필요합니다."));

        // 게시글 생성 dto -> entity 반환
        Post post = request.toEntity(member);
        // 저장
        Post saved = postRepository.save(post);
        // 저장된 entity -> response dto 변환
        return PostDetailResponse.from(saved);
    }

    // 게시글 목록 조회

    @Override
    @Transactional(readOnly = true)// 쓰기 작업이므로 readOnly = false (기본값)
    public PageResponse<PostListResponse> getPostList(int page, int size, String keyword) {
        // Pageable 생성
        Pageable pageable = PageRequest.of(page, size, Sort.by(Sort.Direction.DESC, "id"));

        // 검색 및 조회
        Page<Post> postPage = findPostPage(keyword, pageable);
        // postPage DTO 변환 -> 변환
        return PageResponse.from(postPage,PostListResponse::from);
    }

    // (내부 메서드) 검색 조건에 따른 조회
    private Page<Post> findPostPage(String keyword, Pageable pageable) {
        if (keyword == null || keyword.isBlank()) {
            return postRepository.findAll(pageable);
        }
        return postRepository.findByTitleContainingIgnoreCaseOrContentContaining(keyword, keyword, pageable);
    }

    // 게시글 상세 조회
    @Override
    public PostDetailResponse getPostDetail(Long id) {
        // id 조회
        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post with id " + id + " not found"));
        // 조회수
        post.increaseReadCount();
        // DTO 변환해 반환
        return PostDetailResponse.from(post);
    }

    // 게시글 수정
    @Override
    public PostDetailResponse updatePost(Long memberId,Long id, PostUpdateRequest request) {
        loginCheck(memberId);
        // id 조회
        Post post = postRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Post with id " + id + " not found"));
        if(!post.getMember().getId().equals(memberId)){
            throw new ResponseStatusException(HttpStatus.FORBIDDEN,"게시글 수정 권한이 없습니다.");
        }
        // 업데이트
        post.update(request.getTitle(),request.getContent(), request.getImageUrl());
        // 반환
        return PostDetailResponse.from(post);
    }

    // 게시글 삭제
    @Override
    public void deletePost(Long memberId,Long id) {
        loginCheck(memberId);
        // id 조회
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "게시글 찾을 수 없음"));

        if(!post.getMember().getId().equals(memberId)){
            throw new ResponseStatusException(HttpStatus.FORBIDDEN,"게시글 삭제 권한이 없습니다.");
        }

        //  댓글 먼저 삭제
        postCommentRepository.deleteByPostId(id);
        fileService.deleteImage(post.getImageUrl());
        postRepository.delete(post);
    }
}