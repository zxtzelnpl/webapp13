package com.zxt.imooc.six;

public class BizLogicImpl implements BizLogic {
    public String save(){
        System.out.println("BizLogicImpl:Logic save.");
        return "Logic save.";
//        throw new RuntimeException();
    }
}
