package com.czbank.fupin.domain;

import java.io.Serializable;
/**
 * @Author Leo
 * @Description //TODO
 * @Date 2019/7/12
 **/
public class Province implements Serializable {
    private int id;
    //省名
    private String provinceName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public String toString() {
        return "Province{" + "id='" + id + '\'' + ", name='" + provinceName + '\'' + '}';
    }
}
