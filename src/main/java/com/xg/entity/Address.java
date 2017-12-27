package com.xg.entity;

import java.io.Serializable;

public class Address implements Serializable {
    private int id;
    private String userNum;
    private int provenceID;
    private int cityID;
    private String addressDetail;
    private int isOften;
    private int isUsed;
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

    public int getProvenceID() {
        return provenceID;
    }

    public void setProvenceID(int provenceID) {
        this.provenceID = provenceID;
    }

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public int getIsOften() {
        return isOften;
    }

    public void setIsOften(int isOften) {
        this.isOften = isOften;
    }

    public int getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(int isUsed) {
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
                ", provenceID=" + provenceID +
                ", cityID=" + cityID +
                ", addressDetail='" + addressDetail + '\'' +
                ", isOften=" + isOften +
                ", isUsed=" + isUsed +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
