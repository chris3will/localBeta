package com.springboot.hotel.demo;

import com.springboot.hotel.demo.dao.OrdersMapper;
import com.springboot.hotel.demo.dao.UserMapper;
import com.springboot.hotel.demo.entity.User;
import com.springboot.hotel.demo.entity.UserExample;
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

    //添加
    @Test
    void addUser(){
        for(int i=0;i<10;i++){
            User user = new User();
            user.setId(i+100);
            user.setUsername("用户名"+i);
            user.setPassword("password");
            user.setEmail("test@d.com");
            user.setIdentity("1");
            user.setRegisterdate(new Date());
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

    //测试更新
    @Test
    void updateUserLastLoginTime(){
        UserExample userExample= new UserExample();
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        if(users.size()>=1){
            for (User user : users) {
                System.out.println(new Date());
                System.out.println(user);
                user.setLastlogintime(new Date());
                System.out.println(userMapper.updateLastLoginTime(user));
                break;
            }
        }
        System.out.println("更新测试结束");
    }

    @Autowired
    OrdersMapper ordersMapper;

    //测试订单状态更新
    @Test
    void updateOrderStateTest(){
        ordersMapper.updateOrderState(1,2);
    }

}
