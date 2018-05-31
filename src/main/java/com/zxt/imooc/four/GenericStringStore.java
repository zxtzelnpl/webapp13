package com.zxt.imooc.four;

public class GenericStringStore extends GenericStore<String> {
    public void init(){
        System.out.println("This is init of GenericStore<String>");
    }

    public void destroy(){
        System.out.println("This is destroy of GenericStore<String>");
    }
}
