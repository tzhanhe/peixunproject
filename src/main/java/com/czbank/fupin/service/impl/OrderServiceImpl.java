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
    public Order orderSelect(String orderId){

        return orderMapper.orderSelect(orderId);
    }
    @Override
    /**
    * @Description: 生成订单有订单id和价格属性
    * @Author: ZhouChaoV
    * @Date: 2019/7/13 8:22
    * @Param: [order]
    * @Return: com.czbank.fupin.domain.Order
    * @Exception:
    *
    */
    public Order getOrder(Order order){
        order.setId(OrderId.orderId());
//        order.setProductId(String );
//        orderPrice = 444;//前台传价格
        return order;
    }

}
