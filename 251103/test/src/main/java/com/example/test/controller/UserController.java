package com.example.test.controller;


import com.example.test.api.UserRequest;
import com.example.test.api.UserResponse;
import com.example.test.entity.User;
import com.example.test.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test_user")
public class UserController {
    private final UserService userService;
    @PostMapping
    public ResponseEntity<UserResponse> create(@RequestBody @Valid UserRequest req) {
        User user = userService.register(req.getName(),req.getAge());
        return ResponseEntity.ok(UserResponse.form(user));
    }
}
