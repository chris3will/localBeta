package com.springboot.hotel.demo.service;

import com.springboot.hotel.demo.dao.OrdersMapper;
import com.springboot.hotel.demo.entity.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrdersMapper ordersMapper;


    public Orders selectById(String orderId) {
        return ordersMapper.selectByPrimaryKey(Integer.valueOf(orderId));
    }

    //联表查询
    public Orders selectByIds(String orderId) {
        return ordersMapper.selectByIds(Integer.valueOf(orderId));
    }


}

