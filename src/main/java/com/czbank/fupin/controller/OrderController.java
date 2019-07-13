package com.czbank.fupin.controller;

import com.czbank.fupin.domain.Order;
import com.czbank.fupin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: ZhouChaoV
 * @Date: 2019/7/13 07:39
 * @Description:
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/orderSelect")
    @ResponseBody
    public String orderSelect(){
        return null;
    }
    @RequestMapping("/getOrder")
    @ResponseBody
    public Order getOrder(){
        return null;
    }
}
