package com.czbank.fupin.domain;

import java.io.Serializable;
/**
 * @Author Leo
 * @Description //TODO
 * @Date 2019/7/12
 **/
public class County implements Serializable {
    private int id;
    //县名称
    private String countyName;
    //省id
    private int provinceId;

    public County() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public String toString() {
        return "County{" +
                "id='" + id + '\'' +
                ", countyName='" + countyName + '\'' +
                ", provinceId='" + provinceId + '\'' +
                '}';
    }
}
