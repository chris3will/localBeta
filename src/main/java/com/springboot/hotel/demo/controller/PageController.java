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
    public String LoginController(){
        return "login";
    }

    @RequestMapping("/index")
    public String IndexController(){ return "index"; }

    @RequestMapping("/hotel_search")
    public String HotelSearchController() { return "hotel_search";}


    //春测试
    @RequestMapping("/pureTest")
    public String pureTest() {return "pureTest";}
}
