package com.springboot.hotel.demo.controller;

import com.springboot.hotel.demo.entity.Orders;
import com.springboot.hotel.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    //查询某一个orderId=1的订单
    @RequestMapping("selectOrderById")
    @ResponseBody
    public Orders selectOrderById(){
        String orderId = "1";
        return orderService.selectById(orderId);
    }

    //连表查询，增加了username属性
    @RequestMapping("selectOrderByIds")
    @ResponseBody
    public Orders selectOrderByIds(){
        String orderId = "1";
        return orderService.selectByIds(orderId);
    }
}
