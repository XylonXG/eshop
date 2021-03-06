package com.xg.entity;

import java.io.Serializable;

public class Address implements Serializable {
    private int id;
    private String userNum;
    private String province;
    private String city;
    private String addressDetail;
    private String isOften;
    private String isUsed;
    private String createDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String provence) {
        this.province = provence;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getIsOften() {
        return isOften;
    }

    public void setIsOften(String isOften) {
        this.isOften = isOften;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", userNum='" + userNum + '\'' +
                ", provence='" + province + '\'' +
                ", city='" + city + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", isOften='" + isOften + '\'' +
                ", isUsed='" + isUsed + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
