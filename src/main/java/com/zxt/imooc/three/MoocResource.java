package com.zxt.imooc.three;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class MoocResource implements ApplicationContextAware{

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
//        Resource resource =  applicationContext.getResource("classpath:jdbc.properties");
//        Resource resource =  applicationContext.getResource("file:D:\\mysql.js");
        Resource resource =  applicationContext.getResource("url:http://www.dytt8.net/html/gndy/dyzz/index.html");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
