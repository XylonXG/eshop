package com.xg.entity;

import java.io.Serializable;

public class GoodsType implements Serializable {
    private int id;
    private String goodTypeNum;
    private String goodsTypeName;
    private String isUsed;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodTypeNum() {
        return goodTypeNum;
    }

    public void setGoodTypeNum(String goodTypeNum) {
        this.goodTypeNum = goodTypeNum;
    }

    public String getGoodsTypeName() {
        return goodsTypeName;
    }

    public void setGoodsTypeName(String goodsTypeName) {
        this.goodsTypeName = goodsTypeName;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "id=" + id +
                ", goodTypeNum='" + goodTypeNum + '\'' +
                ", goodsTypeName='" + goodsTypeName + '\'' +
                ", isUsed='" + isUsed + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
