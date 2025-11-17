package com.example.controller;

import com.example.domain.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class BlessApiController {

    //
    @GetMapping("/user")
    public Map<String, Object> getUserParam(
            @RequestParam String name,
            @RequestParam int age

    ){
        return Map.of("type", "@RequestParam","name", name, "age", age);
    }

    // @ModelAttribute x-ww-form-urlencoded
    @PostMapping("/form") // /api/form 으로 접속
    public Map<String, Object> postModel(@ModelAttribute UserDto user) {
        return Map.of("type", "@ModelAttribute", "name", user.getName(), "age", user.getAge());
    }
    // @RequestBody(Json)
    @PostMapping("/reqbody")
    public Map<String, Object> UserReqBody(@RequestBody UserDto user) {
        return Map.of("type", "@RequestBody", "name", user.getName(), "age", user.getAge());
    }
}

