package com.czbank.fupin.service;

import com.czbank.fupin.domain.Order;

/**
 * @Author: ZhouChaoV
 * @Date: 2019/7/12 22:52
 * @Description:
 */

public interface OrderService {
    Order orderSelect(String orderId);
    Order getOrder(Order order);
}
