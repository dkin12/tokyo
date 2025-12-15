package com.example.test12.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // 전역 CORS 설정
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry .addMapping("/**") // 허용 API 경로
                .allowedOrigins("http://localhost:5173") // 리액트 개발 서버 주소
                .allowedMethods("*") // 모든 HTTP 메서드 허용
                .allowedHeaders("*") // 모든 헤더 허용
                .allowCredentials(true); // 쿠키/세션 등의 인증정보 혀용시 필요
    }

}
