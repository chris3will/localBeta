package com.springboot.hotel.demo.dao.extend;

import com.springboot.hotel.demo.entity.Orders;

public interface OrdersMapperBeExtended {
    Orders selectByIds(Integer orderId);
}
