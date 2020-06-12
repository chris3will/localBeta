package com.springboot.hotel.demo;

import com.springboot.hotel.demo.dao.UserMapper;
import com.springboot.hotel.demo.entity.User;
import com.springboot.hotel.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@SpringBootTest
class WczTest {
    @Autowired
    UserService userService;
    @Test
    void addUser(){
        for(int i=0;i<10;i++){
            User user = new User();
            user.setId(i+100);
            user.setUsername("用户名"+i);
            user.setPassword("password");
            user.setEmail("test@d.com");
            user.setIdentity("1");
            user.setLastlogintime(new Date());
            userService.addUser(user);
        }
    }
    @Autowired
    UserMapper userMapper=null;
    @Test
    void findUserByEmail(){
        List<User> users = userMapper.selectByEmail("test@d.com");
        if(users!=null){
            for (User user : users) {
                System.out.println(user);
            }
        }else{
            System.out.println("未找到该邮箱注册的账号");
        }
    }
    @Test
    void findUserByUsername(){
        List<User> users = userMapper.selectByUsername("urltest");
        if(users!=null){
            for (User user : users) {
                System.out.println(user);
            }
        }else{
            System.out.println("未找到该用户名注册的账号");
        }
    }

    @Test
    void findUserByUsernameAndEmail(){
        List<User> users = userMapper.selectByUsernameAndEmail("urltest","111@33.com");
        if(users!=null){
            for (User user : users) {
                System.out.println(user);
            }
        }else{
            System.out.println("未找到该用户名注册的账号");
        }
    }

}
