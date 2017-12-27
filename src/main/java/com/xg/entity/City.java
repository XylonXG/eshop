package com.xg.entity;

import java.io.Serializable;

public class City implements Serializable {
    private int id;
    private int province_id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvince_id() {
        return province_id;
    }

    public void setProvince_id(int province_id) {
        this.province_id = province_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", province_id=" + province_id +
                ", name='" + name + '\'' +
                '}';
    }
}
