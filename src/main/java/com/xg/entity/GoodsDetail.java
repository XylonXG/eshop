package com.xg.entity;

import java.io.Serializable;

public class GoodsDetail implements Serializable {
    private int id;
    private String goodDetailNum;
    private String goodsNum;
    private String goodsDesc;
    private String goodsDetailImgURL1;
    private String goodsDetailImgURL2;
    private String goodsDetailImgURL3;
    private String goodsDetailImgHttpURL1;
    private String goodsDetailImgHttpURL2;
    private String goodsDetailImgHttpURL3;
    private String goodsOriginalPrice;
    private String goodsSalePrice;
    private String isUsed;
    private String goodsCreateTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodDetailNum() {
        return goodDetailNum;
    }

    public void setGoodDetailNum(String goodDetailNum) {
        this.goodDetailNum = goodDetailNum;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsDetailImgURL1() {
        return goodsDetailImgURL1;
    }

    public void setGoodsDetailImgURL1(String goodsDetailImgURL1) {
        this.goodsDetailImgURL1 = goodsDetailImgURL1;
    }

    public String getGoodsDetailImgURL2() {
        return goodsDetailImgURL2;
    }

    public void setGoodsDetailImgURL2(String goodsDetailImgURL2) {
        this.goodsDetailImgURL2 = goodsDetailImgURL2;
    }

    public String getGoodsDetailImgURL3() {
        return goodsDetailImgURL3;
    }

    public void setGoodsDetailImgURL3(String goodsDetailImgURL3) {
        this.goodsDetailImgURL3 = goodsDetailImgURL3;
    }

    public String getGoodsDetailImgHttpURL1() {
        return goodsDetailImgHttpURL1;
    }

    public void setGoodsDetailImgHttpURL1(String goodsDetailImgHttpURL1) {
        this.goodsDetailImgHttpURL1 = goodsDetailImgHttpURL1;
    }

    public String getGoodsDetailImgHttpURL2() {
        return goodsDetailImgHttpURL2;
    }

    public void setGoodsDetailImgHttpURL2(String goodsDetailImgHttpURL2) {
        this.goodsDetailImgHttpURL2 = goodsDetailImgHttpURL2;
    }

    public String getGoodsDetailImgHttpURL3() {
        return goodsDetailImgHttpURL3;
    }

    public void setGoodsDetailImgHttpURL3(String goodsDetailImgHttpURL3) {
        this.goodsDetailImgHttpURL3 = goodsDetailImgHttpURL3;
    }

    public String getGoodsOriginalPrice() {
        return goodsOriginalPrice;
    }

    public void setGoodsOriginalPrice(String goodsOriginalPrice) {
        this.goodsOriginalPrice = goodsOriginalPrice;
    }

    public String getGoodsSalePrice() {
        return goodsSalePrice;
    }

    public void setGoodsSalePrice(String goodsSalePrice) {
        this.goodsSalePrice = goodsSalePrice;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public String getGoodsCreateTime() {
        return goodsCreateTime;
    }

    public void setGoodsCreateTime(String goodsCreateTime) {
        this.goodsCreateTime = goodsCreateTime;
    }

    @Override
    public String toString() {
        return "GoodsDetail{" +
                "id=" + id +
                ", goodDetailNum='" + goodDetailNum + '\'' +
                ", goodsNum='" + goodsNum + '\'' +
                ", goodsDesc='" + goodsDesc + '\'' +
                ", goodsDetailImgURL1='" + goodsDetailImgURL1 + '\'' +
                ", goodsDetailImgURL2='" + goodsDetailImgURL2 + '\'' +
                ", goodsDetailImgURL3='" + goodsDetailImgURL3 + '\'' +
                ", goodsDetailImgHttpURL1='" + goodsDetailImgHttpURL1 + '\'' +
                ", goodsDetailImgHttpURL2='" + goodsDetailImgHttpURL2 + '\'' +
                ", goodsDetailImgHttpURL3='" + goodsDetailImgHttpURL3 + '\'' +
                ", goodsOriginalPrice='" + goodsOriginalPrice + '\'' +
                ", goodsSalePrice='" + goodsSalePrice + '\'' +
                ", isUsed='" + isUsed + '\'' +
                ", goodsCreateTime='" + goodsCreateTime + '\'' +
                '}';
    }
}
