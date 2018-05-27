package com.zxt.imooc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component
public class BeanAnnotation {
    public void say(String arg){
        System.out.println("BeanAnnotation "+arg);
    }

    public void myHashCode(){
        System.out.print("BeanAnnotation:"+this.hashCode());
    }
}
