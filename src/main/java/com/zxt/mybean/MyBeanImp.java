package com.zxt.mybean;

import com.zxt.user.UserModel;

import java.util.List;

public class MyBeanImp implements MyBean {
    private String name;
    private List<UserModel> list;
    public void setName(String name){
        this.name = name;
    }

    public void setList(List<UserModel> list){
        this.list = list;
    }

    public List<UserModel> getList(){
        return this.list;
    }

    public void sayName(){
        System.out.println("MyBeanImp say:"+name +" at line 23 of MyBeanImp.java");
    }

    public void showList(){
        System.out.println("MyBeanImp has user:"+list.size() +" at line 27 of MyBeanImp.java");
    }
}
