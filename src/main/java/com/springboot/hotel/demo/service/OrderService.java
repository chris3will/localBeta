package com.springboot.hotel.demo.service;

import com.springboot.hotel.demo.dao.OrdersMapper;
import com.springboot.hotel.demo.entity.Orders;
import com.springboot.hotel.demo.entity.OrdersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.List;

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


    public List<Orders> showMyUnpaidOrder() {
        return ordersMapper.showMyUnpaidOrder();
    }

    public List<Orders> showOrders(String username, int statusCode) {
        return ordersMapper.showOrders(username, statusCode);
    }

    public List<Orders> showMyAllOrder(String username) {
        return ordersMapper.showMyAllOrder(username);
    }

    //想进行状态更新的订单有好几种，状态2：已下单未支付，其可以转换为取消0或已支付3；状态3：已支付未入住，其可以转换为取消0或已入住4；之后如果想加状态再添加即可
    //而无论该订单当前处于那个状态，如果新状态为0，则都对应着取消操作，都应该更新订单中的预定日期字段
    //但是可能会遇到不可无理由退款的店铺，这一点可以下一个sprint再加强
    public int updateOrderState(int orderId, int newOrderState) {
        System.out.println("开始更新订单状态了");
        return ordersMapper.updateOrderState(orderId, newOrderState);
    }

    public Orders selectOneByExample(OrdersExample ordersExample) {
        return ordersMapper.selectByExample(ordersExample).get(0);
    }
}

