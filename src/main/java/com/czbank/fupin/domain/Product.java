package com.czbank.fupin.domain;

import java.io.Serializable;
/**
 * @Author Leo
 * @Description //TODO
 * @Date 2019/7/12
 **/
public class Product implements Serializable {

    private int id;
    private String productName;
    private double price;
    //商品简介
    private String info;
    //库存
    private int stock;
    //所属省的id
    private int provinceId;
    //所属县的id
    private int countyId;
    //所属用户的id
    private int ownerId;
    //图片路径
    private String picPath;


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

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public int getCountyId() {
        return countyId;
    }

    public void setCountyId(int countyId) {
        this.countyId = countyId;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
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
