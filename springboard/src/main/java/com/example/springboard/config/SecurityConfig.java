package com.example.springboard.config;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.server.SecurityWebFilterChain;

// 보안 규칙 설정
@Configuration
@RequiredArgsConstructor
public class SecurityConfig {


    private final JwtTokenProvider jwtTokenProvider;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception {
        http.cors(cors -> {})
                .csrf(csrf -> csrf.disable())
                .formLogin(form -> form.disable()) // 바로 뜨는 로그인 안쓰겠다는 뜻
                .httpBasic(basic -> basic.disable()) // 인증을 안쓰겟다 -> api 툴을 사용해서 한 header를 안쓰겠다
                .sessionManagement(sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS))

                .authorizeHttpRequests(
                        auth -> auth
                        // prefilght 사전 요청 허용
                        .requestMatchers( HttpMethod.OPTIONS,"/**").permitAll()
                        // 회원가입, 로그인은 누구나 접근
                        .requestMatchers("/api/auth/signup","/api/auth/login").permitAll()
                         .requestMatchers(HttpMethod.GET, "/api/auth/myinfo").authenticated()
                        // 게시글
                                .requestMatchers(HttpMethod.GET, "/api/posts/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/posts/**").authenticated()
                                .requestMatchers(HttpMethod.DELETE, "/api/posts/**").authenticated()
                                .requestMatchers(HttpMethod.PUT, "/api/posts/**").authenticated()
                        // 댓글
                                .requestMatchers(HttpMethod.GET, "/api/posts/*/comments/**").permitAll()
                                .requestMatchers(HttpMethod.POST, "/api/posts/*/comments/**").authenticated()
                                .requestMatchers(HttpMethod.DELETE, "/api/posts/*/comments/**").authenticated()
                                .requestMatchers(HttpMethod.PUT, "/api/posts/*/comments/**").authenticated()

                                .requestMatchers("/swagger-ui/**", "/swagger-ui.html","/v3/api-docs/**").permitAll()
                        // 그 외 나머지는 모두 허용
                                .anyRequest().permitAll()
                ).addFilterBefore(
                        new JwtTokenFilter(jwtTokenProvider),
                UsernamePasswordAuthenticationFilter.class
                );

        return http.build();
    }
}
