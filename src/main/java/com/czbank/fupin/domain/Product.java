package com.czbank.fupin.domain;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String productName;
    private double price;
    private String info;
    private int stock;
    private int ownerId;

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public String getInfo() {
        return info;
    }

    public int getStock() {
        return stock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + productName + '\'' +
                ", price=" + price +
                ", intro='" + info + '\'' +
                ", stock=" + stock +
                '}';
    }
}
