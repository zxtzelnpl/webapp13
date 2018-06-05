package com.zxt.imooc.five;

public class MoocAspect {

    public void before(){
        System.out.println("Mooc aspect before");
    }

    public void after(){
        System.out.println("Mooc aspect after");
    }

    public void afterReturning(){
        System.out.println("Mooc aspect afterReturning");
    }

    public void afterThrowing(){
        System.out.println("Mooc aspect afterThrowing");
    }
}
