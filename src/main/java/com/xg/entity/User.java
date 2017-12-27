package com.xg.entity;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String userNum;
    private String username;
    private String password;
    private String userType;
    private String userIDcard;
    private String userBirth;
    private String userTrueName;
    private String userRegDate;
    private int userPoints;
    private int userBanlace;
    private String userEamil;
    private int userAddressID;
    private double userMoney;
    private String userPhone;
    private String salt;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserIDcard() {
        return userIDcard;
    }

    public void setUserIDcard(String userIDcard) {
        this.userIDcard = userIDcard;
    }

    public String getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(String userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserTrueName() {
        return userTrueName;
    }

    public void setUserTrueName(String userTrueName) {
        this.userTrueName = userTrueName;
    }

    public String getUserRegDate() {
        return userRegDate;
    }

    public void setUserRegDate(String userRegDate) {
        this.userRegDate = userRegDate;
    }

    public int getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(int userPoints) {
        this.userPoints = userPoints;
    }

    public int getUserBanlace() {
        return userBanlace;
    }

    public void setUserBanlace(int userBanlace) {
        this.userBanlace = userBanlace;
    }

    public String getUserEamil() {
        return userEamil;
    }

    public void setUserEamil(String userEamil) {
        this.userEamil = userEamil;
    }

    public int getUserAddressID() {
        return userAddressID;
    }

    public void setUserAddressID(int userAddressID) {
        this.userAddressID = userAddressID;
    }

    public double getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(double userMoney) {
        this.userMoney = userMoney;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userNum='" + userNum + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userType='" + userType + '\'' +
                ", userIDcard='" + userIDcard + '\'' +
                ", userBirth='" + userBirth + '\'' +
                ", userTrueName='" + userTrueName + '\'' +
                ", userRegDate='" + userRegDate + '\'' +
                ", userPoints=" + userPoints +
                ", userBanlace=" + userBanlace +
                ", userEamil='" + userEamil + '\'' +
                ", userAddressID=" + userAddressID +
                ", userMoney=" + userMoney +
                ", userPhone='" + userPhone + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}
