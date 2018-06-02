package com.zxt.imooc.three;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean,DisposableBean {

    public void start(){
        System.out.println("Bean start.");
    }

    public void stop(){
        System.out.println("Bean stop.");
    }

    public void defaultInit(){
        System.out.println("Bean defaultInit.");
    }

    public void defaultDestroy(){
        System.out.println("Bean defaultDestroy.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy implements from DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("destroy implements from InitializingBean");
    }
}
