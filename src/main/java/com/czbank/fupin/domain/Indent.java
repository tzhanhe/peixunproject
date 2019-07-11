package com.czbank.fupin.domain;

import java.io.Serializable;

public class Indent implements Serializable {
    private String id;
    private String user_id;
    private String indent_time;
    private int status;//标记订单是否下单
    private float price;
    private String product_id;
    private int product_amount;

    public Indent() {
    }

    public Indent(String id, String user_id, String indent_time, int status, float price, String product_id, int product_amount) {
        this.id = id;
        this.user_id = user_id;
        this.indent_time = indent_time;
        this.status = status;
        this.price = price;
        this.product_id = product_id;
        this.product_amount = product_amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getIndent_time() {
        return indent_time;
    }

    public void setIndent_time(String indent_time) {
        this.indent_time = indent_time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public int getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(int product_amount) {
        this.product_amount = product_amount;
    }

    @Override
    public String toString() {
        return "Indent{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", indent_time='" + indent_time + '\'' +
                ", status=" + status +
                ", price=" + price +
                ", product_id='" + product_id + '\'' +
                ", product_amount=" + product_amount +
                '}';
    }
}
