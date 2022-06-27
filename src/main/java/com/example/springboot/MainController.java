package com.example.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/coolmarvel")
    @ResponseBody
    public String index() {
        return "안녕하세요 springBoot에 오신것을 환영합니다.";
    }

    @RequestMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}