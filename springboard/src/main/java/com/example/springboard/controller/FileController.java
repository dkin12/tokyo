package com.example.springboard.controller;

/*
    이미지 업로등 용 API
    프론트에서 파일 업로드 -> URL 만 받음
    게시글 작성 시 imageUrl 에 전달
 */

import com.example.springboard.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@RequestMapping("/api/files")
@RequiredArgsConstructor
public class FileController {
    private final FileService fileService;

    @PostMapping("/image")
    public Map<String,String> uploadImage(@RequestParam("file") MultipartFile file) {
        // {"imageUrl":"/im
        String imageUrl = fileService.saveImage(file);
        return Map.of("imageUrl", imageUrl);
    }
}
