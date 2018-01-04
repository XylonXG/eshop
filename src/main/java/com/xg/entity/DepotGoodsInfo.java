package com.xg.entity;

import java.io.Serializable;

public class DepotGoodsInfo implements Serializable {
    private int id;
    private String goodsNum;
    private String depotNum;
    private String goodsDetailNum;
    private int goodsCount;

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

    public String getDepotNum() {
        return depotNum;
    }

    public void setDepotNum(String depotNum) {
        this.depotNum = depotNum;
    }

    public String getGoodsDetailNum() {
        return goodsDetailNum;
    }

    public void setGoodsDetailNum(String goodsDetailNum) {
        this.goodsDetailNum = goodsDetailNum;
    }

    public int getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(int goodsCount) {
        this.goodsCount = goodsCount;
    }

    @Override
    public String toString() {
        return "DepotGoodsInfo{" +
                "id=" + id +
                ", goodsNum='" + goodsNum + '\'' +
                ", depotNum='" + depotNum + '\'' +
                ", goodsDetailNum='" + goodsDetailNum + '\'' +
                ", goodsCount=" + goodsCount +
                '}';
    }
}
