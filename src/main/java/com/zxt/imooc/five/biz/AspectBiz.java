package com.zxt.imooc.five.biz;

import java.io.IOException;

public class AspectBiz {

    public void biz(){
        System.out.println("AspectBiz biz.");
//        throw new Error("abc");
    }

    public void init(String bizName,int times){
        System.out.println("AspectBiz init: "+bizName+ " " + times);
    }
}
