package com.example.controller;

import com.example.domain.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class BlessController {
    @GetMapping("/req")
    public String webView(){
        return "reqWeb";
    }

    // 폼전송 -> 서버 랜더링
    @PostMapping("/form")
    public String handlerView(UserDto user, Model model){
        model.addAttribute("msg", String.format("서버렌더: %s(%d세) 등록 완료",user.getName(),user.getAge()));
    return "reqWeb";
    }
}
