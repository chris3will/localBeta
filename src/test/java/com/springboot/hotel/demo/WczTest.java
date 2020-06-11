package com.springboot.hotel.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootTest
class WczTest {

    @Test
    @RequestMapping("/ind")
    public String IndexTest() {
        return "hello";
    }

}
