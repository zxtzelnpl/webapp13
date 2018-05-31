package com.zxt.imooc.four;

public class GenericIntegerStore extends GenericStore<Integer> {
    public void init(){
        System.out.println("This is init of GenericStore<Integer");
    }

    public void destroy(){
        System.out.println("This is destroy of GenericStore<Integer");
    }
}
