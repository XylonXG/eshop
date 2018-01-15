package com.xg.entity;

import java.io.Serializable;

public class ShoppingCart implements Serializable {
    private int id;
    private String userNum;
    private String goodsNum;
    private String goodsDetailNum;
    private double salePrice;
    private int buyCount;
    private double totalAmount;
    private String goodsImgHttpURL;
    private String goodsDesc;
    private String goodsDetailImgHttpURL1;


    public String getGoodsDetailImgHttpURL1() {
        return goodsDetailImgHttpURL1;
    }

    public void setGoodsDetailImgHttpURL1(String goodsDetailImgHttpURL1) {
        this.goodsDetailImgHttpURL1 = goodsDetailImgHttpURL1;
    }

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

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsDetailNum() {
        return goodsDetailNum;
    }

    public void setGoodsDetailNum(String goodsDetailNum) {
        this.goodsDetailNum = goodsDetailNum;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getGoodsImgHttpURL() {
        return goodsImgHttpURL;
    }

    public void setGoodsImgHttpURL(String goodsImgHttpURL) {
        this.goodsImgHttpURL = goodsImgHttpURL;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }


    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", userNum='" + userNum + '\'' +
                ", goodsNum='" + goodsNum + '\'' +
                ", goodsDetailNum='" + goodsDetailNum + '\'' +
                ", salePrice=" + salePrice +
                ", buyCount=" + buyCount +
                ", totalAmount=" + totalAmount +
                ", goodsImgHttpURL='" + goodsImgHttpURL + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsDetailImgHttpURL1='" + goodsDetailImgHttpURL1 + '\'' +
                '}';
    }
}
