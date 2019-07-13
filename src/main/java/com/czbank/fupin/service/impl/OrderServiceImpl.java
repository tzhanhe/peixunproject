package com.czbank.fupin.service.impl;

import com.czbank.fupin.domain.Order;
import com.czbank.fupin.mapper.OrderMapper;
import com.czbank.fupin.service.OrderService;

import com.czbank.fupin.utils.OrderId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ZhouChaoV
 * @Date: 2019/7/12 22:52
 * @Description:
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;


    @Override
    public Order orderSelectById(String id) {
        return orderMapper.orderSelectById(id);
    }

    @Override
    public List<Order> orderSelectByIds(String ids) {
        return null;
    }

    @Override
    public int orderInsert(Order order) {
        return orderMapper.orderInsert(order);
    }

    @Override
    public int orderDelete(String id) {
        return orderMapper.orderDelete(id);
    }
}
