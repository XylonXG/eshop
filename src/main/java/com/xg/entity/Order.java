package com.xg.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private int id;
    private String username;
    private String orderNum;
    private String userNum;
    private String orderDate;
    private String orderCondition;
    private Double orderTotalMoney;
    private Double orderTrueMoney;
    private Double invoiceMoney;
    private int invoiceID;
    private String userAddress;
    private String userDetailAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderCondition() {
        return orderCondition;
    }

    public void setOrderCondition(String orderCondition) {
        this.orderCondition = orderCondition;
    }

    public Double getOrderTotalMoney() {
        return orderTotalMoney;
    }

    public void setOrderTotalMoney(Double orderTotalMoney) {
        this.orderTotalMoney = orderTotalMoney;
    }

    public Double getOrderTrueMoney() {
        return orderTrueMoney;
    }

    public void setOrderTrueMoney(Double orderTrueMoney) {
        this.orderTrueMoney = orderTrueMoney;
    }

    public Double getInvoiceMoney() {
        return invoiceMoney;
    }

    public void setInvoiceMoney(Double invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserDetailAddress() {
        return userDetailAddress;
    }

    public void setUserDetailAddress(String userDetailAddress) {
        this.userDetailAddress = userDetailAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", userNum='" + userNum + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderCondition='" + orderCondition + '\'' +
                ", orderTotalMoney=" + orderTotalMoney +
                ", orderTrueMoney=" + orderTrueMoney +
                ", invoiceMoney=" + invoiceMoney +
                ", invoiceID=" + invoiceID +
                ", userAddress='" + userAddress + '\'' +
                ", userDetailAddress='" + userDetailAddress + '\'' +
                '}';
    }
}
