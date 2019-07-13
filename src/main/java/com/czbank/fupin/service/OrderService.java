package com.czbank.fupin.service;

import com.czbank.fupin.domain.Order;

import java.util.List;

/**
 * @Author: ZhouChaoV
 * @Date: 2019/7/12 22:52
 * @Description: 订单处理
 */

public interface OrderService {
    /**
     * @Author Leo
     * @Description //TODO 
     * @Date 2019/7/13
     * @Param [id]
     * @return com.czbank.fupin.domain.Order
     **/
    Order orderSelectById(String id);
    /**
     * @Author Leo
     * @Description //TODO 
     * @Date 2019/7/13
     * @Param [ids]
     * @return java.util.List<com.czbank.fupin.domain.Order>
     **/
    List<Order> orderSelectByIds(String ids);
    int orderInsert(Order order);
    int orderDelete(String id);
}
