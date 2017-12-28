package com.xg.entity;

import java.io.Serializable;

public class GoodsSupplier implements Serializable {
    private int id;
    private String goodsSupplierNum;
    private String goodsSupplierName;
    private String goodsSupplierCompany;
    private String goodsSupplierCompanyAddress;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsSupplierNum() {
        return goodsSupplierNum;
    }

    public void setGoodsSupplierNum(String goodsSupplierNum) {
        this.goodsSupplierNum = goodsSupplierNum;
    }

    public String getGoodsSupplierName() {
        return goodsSupplierName;
    }

    public void setGoodsSupplierName(String goodsSupplierName) {
        this.goodsSupplierName = goodsSupplierName;
    }

    public String getGoodsSupplierCompany() {
        return goodsSupplierCompany;
    }

    public void setGoodsSupplierCompany(String goodsSupplierCompany) {
        this.goodsSupplierCompany = goodsSupplierCompany;
    }

    public String getGoodsSupplierCompanyAddress() {
        return goodsSupplierCompanyAddress;
    }

    public void setGoodsSupplierCompanyAddress(String goodsSupplierCompanyAddress) {
        this.goodsSupplierCompanyAddress = goodsSupplierCompanyAddress;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GoodsSupplier{" +
                "id=" + id +
                ", goodsSupplierNum='" + goodsSupplierNum + '\'' +
                ", goodsSupplierName='" + goodsSupplierName + '\'' +
                ", goodsSupplierCompany='" + goodsSupplierCompany + '\'' +
                ", goodsSupplierCompanyAddress='" + goodsSupplierCompanyAddress + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
