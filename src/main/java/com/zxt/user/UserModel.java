package com.zxt.user;

import org.springframework.beans.factory.BeanNameAware;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserModel implements BeanNameAware,Serializable {

    private int userId;
    private String userName;
    private String userPassword;
    private String userSex;
    private String userHome;
    private String userInfo;
    private String userEmail;
    private BigDecimal userMoney;

    private String beanName;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserHome() {
        return userHome;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public BigDecimal getUserMoney() {
        return userMoney;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserHome(String userHome) {
        this.userHome = userHome;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    public void init(){
        System.out.println("init at line 75 of UserModel.java");
    }

    public void destroy(){
        System.out.println("destory at line 79 of UserModel.java");
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", UserName=" + userName
                + ", UserEmail=" + userEmail + "]";
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName has been called at line 90 of UserModel.java");
        this.beanName = name;
    }

    public String getBeanName(){
        return this.beanName;
    }
}