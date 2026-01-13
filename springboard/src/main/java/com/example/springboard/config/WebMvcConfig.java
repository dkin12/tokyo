package com.example.springboard.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${file.upload-dir}")
    private String fileUploadDir;


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
//        Path uploadPath = Paths.get(fileUploadDir).toAbsolutePath();
//        registry.addResourceHandler("/images/**")
//                .addResourceLocations("file:"+ fileUploadDir + "/");

        Path uploadPath = Paths.get(fileUploadDir).toAbsolutePath().normalize();
        String uploads = "file:" + uploadPath.toString() +"/";
        registry.addResourceHandler("/images/**")
                .addResourceLocations(uploads);

    }

    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:5173","https://tokyo-board-two.vercel.app")
                .allowedHeaders("*")
                .allowedMethods("*")
                .allowCredentials(true);
    }
}



