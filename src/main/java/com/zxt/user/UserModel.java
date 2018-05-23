package com.zxt.user;

public class UserModel {

    private int userId;
    private String userName;
    private String userPassword;
    private String userSex;
    private String userHome;
    private String userInfo;
    private String userEmail;

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


    public void init(){
        System.out.println("init");
    }

    public void destroy(){
        System.out.println("destory");
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", UserName=" + userName
                + ", UserEmail=" + userEmail + "]";
    }


}