package com.zxt.imooc.three;

import org.springframework.beans.factory.BeanNameAware;

public class MoocBeanName implements BeanNameAware{

    @Override
    public void setBeanName(String name) {
        System.out.println("MoocBeanName: "+name);
    }
}
