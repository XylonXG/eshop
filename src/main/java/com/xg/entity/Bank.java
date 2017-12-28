package com.xg.entity;

import java.io.Serializable;

public class Bank implements Serializable {
    private int id;
    private String userNum;
    private String bankNum;
    private String bankName;
    private String bankOpen;
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

    public String getBankNum() {
        return bankNum;
    }

    public void setBankNum(String bankNum) {
        this.bankNum = bankNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankOpen() {
        return bankOpen;
    }

    public void setBankOpen(String bankOpen) {
        this.bankOpen = bankOpen;
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
        return "Bank{" +
                "id=" + id +
                ", userNum='" + userNum + '\'' +
                ", bankNum='" + bankNum + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankOpen='" + bankOpen + '\'' +
                ", isUsed='" + isUsed + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}
