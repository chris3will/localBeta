package com.springboot.hotel.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
    @RequestMapping("/register")
    public String RegisterController(){
            return "register";
    }

    @RequestMapping("/")
    public String IndexController(){
        return "index";
    }

    @RequestMapping("/index")
    public String Index2Controller(){
        return "index";
    }
}
