package com.xg.entity;

import java.io.Serializable;

public class Depot implements Serializable {
    private int id;
    private String depotNum;
    private String depotName;
    private String depotAddress;
    private String isUsed;
    private String createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepotNum() {
        return depotNum;
    }

    public void setDepotNum(String depotNum) {
        this.depotNum = depotNum;
    }

    public String getDepotName() {
        return depotName;
    }

    public void setDepotName(String depotName) {
        this.depotName = depotName;
    }

    public String getDepotAddress() {
        return depotAddress;
    }

    public void setDepotAddress(String depotAddress) {
        this.depotAddress = depotAddress;
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
        return "Depot{" +
                "id=" + id +
                ", depotNum='" + depotNum + '\'' +
                ", depotName='" + depotName + '\'' +
                ", depotAddress='" + depotAddress + '\'' +
                ", isUsed='" + isUsed + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
