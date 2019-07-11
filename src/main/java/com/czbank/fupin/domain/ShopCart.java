package com.czbank.fupin.domain;

import java.io.Serializable;

public class ShopCart implements Serializable {
    private String id;
    private int amount;
    private  String product_id;
    private String user_id;

    public ShopCart() {

    }

    public ShopCart(String id, int amount, String product_id, String user_id) {
        this.id = id;
        this.amount = amount;
        this.product_id = product_id;
        this.user_id = user_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public String getProduct_id() {
        return product_id;
    }

    public String getUser_id() {
        return user_id;
    }

    @Override
    public String toString() {
        return "ShopCart{" +
                "id='" + id + '\'' +
                ", amount=" + amount +
                ", product_id='" + product_id + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
