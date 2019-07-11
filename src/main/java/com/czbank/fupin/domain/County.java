package com.czbank.fupin.domain;

import java.io.Serializable;

public class County implements Serializable {
    private String id;
    private String name;
    private String province;

    public County() {
    }

    public County(String id, String name, String province) {
        this.id = id;
        this.name = name;
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "County{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
