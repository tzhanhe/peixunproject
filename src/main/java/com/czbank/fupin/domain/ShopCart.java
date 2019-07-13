package com.czbank.fupin.domain;

import java.io.Serializable;

public class ShopCart implements Serializable {
    private int id;
    //订单id
    private String orderId;
    //用户id
    private int userId;

    public ShopCart() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
