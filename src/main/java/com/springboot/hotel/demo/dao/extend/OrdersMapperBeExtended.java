package com.springboot.hotel.demo.dao.extend;

import com.springboot.hotel.demo.entity.Orders;

import java.util.List;

public interface OrdersMapperBeExtended {
    Orders selectByIds(Integer orderId);

    List<Orders> showMyUnpaidOrder();

    //打印该用户的特定状态订单
    List<Orders> showOrders(String username, int statusCode);

    //打印该用户的所有订单
    List<Orders> showMyAllOrder(String username);

    int updateOrderState(int orderId, int newOrderState);
}
