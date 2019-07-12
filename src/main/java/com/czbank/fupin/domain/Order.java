package com.czbank.fupin.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Order
 * @Description
 * @Author Leo
 * @Date 2019/7/12
 **/
public class Order implements Serializable {
    //订单流水号，uuid
    private String id;
    private String productId;
    //订单状态，0：只做记录用的订单；1：存在于购物车的订单；2：支付成功的订单
    private int status;
    //商品数量
    private int productAmount;
    //所属用户的id
    private int userId;
    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
