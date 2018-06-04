package com.zxt.imooc.four;

public class MyDriverManager {
    private String url;
    private String username;
    private String password;

    public MyDriverManager(String url,String username,String password){
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void say(){
        System.out.println("url:"+url);
        System.out.println("username:"+username);
        System.out.println("password:"+password);
    }
}
