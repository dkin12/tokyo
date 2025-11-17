package com.example.test.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;

@Getter

public class UserRequest {
    @NotBlank(message = "이름 필수")
    @Size(max = 50, message = "이름은 최대 50자까지만 가능합니다.")
    private String name;

    private Integer age;
}
