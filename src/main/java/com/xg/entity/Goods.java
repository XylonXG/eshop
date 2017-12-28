package com.xg.entity;

import java.io.Serializable;

public class Goods implements Serializable {
    private int id;
    private String goodsNum;
    private String goodsName;
    private String goodsCode;
    private String goodsType;
    private String goodsSupplier;
    private String goodsShelfTime;
    private String goodsImgURL;
    private String goodsImgHttpURL;
    private String isGift;
    private String isReturn;
    private String goodsCreateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsSupplier() {
        return goodsSupplier;
    }

    public void setGoodsSupplier(String goodsSupplier) {
        this.goodsSupplier = goodsSupplier;
    }

    public String getGoodsShelfTime() {
        return goodsShelfTime;
    }

    public void setGoodsShelfTime(String goodsShelfTime) {
        this.goodsShelfTime = goodsShelfTime;
    }

    public String getGoodsImgURL() {
        return goodsImgURL;
    }

    public void setGoodsImgURL(String goodsImgURL) {
        this.goodsImgURL = goodsImgURL;
    }

    public String getGoodsImgHttpURL() {
        return goodsImgHttpURL;
    }

    public void setGoodsImgHttpURL(String goodsImgHttpURL) {
        this.goodsImgHttpURL = goodsImgHttpURL;
    }

    public String getIsGift() {
        return isGift;
    }

    public void setIsGift(String isGift) {
        this.isGift = isGift;
    }

    public String getIsReturn() {
        return isReturn;
    }

    public void setIsReturn(String isReturn) {
        this.isReturn = isReturn;
    }

    public String getGoodsCreateTime() {
        return goodsCreateTime;
    }

    public void setGoodsCreateTime(String goodsCreateTime) {
        this.goodsCreateTime = goodsCreateTime;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsNum='" + goodsNum + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsCode='" + goodsCode + '\'' +
                ", goodsType='" + goodsType + '\'' +
                ", goodsSupplier='" + goodsSupplier + '\'' +
                ", goodsShelfTime='" + goodsShelfTime + '\'' +
                ", goodsImgURL='" + goodsImgURL + '\'' +
                ", goodsImgHttpURL='" + goodsImgHttpURL + '\'' +
                ", isGift='" + isGift + '\'' +
                ", isReturn='" + isReturn + '\'' +
                ", goodsCreateTime='" + goodsCreateTime + '\'' +
                '}';
    }
}
