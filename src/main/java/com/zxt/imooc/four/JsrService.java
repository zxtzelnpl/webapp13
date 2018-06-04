package com.zxt.imooc.four;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Service
public class JsrService {

//    @Resource
    private JsrDao jsrDao;

    /*这个地方用Resource有点问题*/
    @Resource
    public void setJsrDao(JsrDao jsrDao){
        this.jsrDao = jsrDao;
    }

    @PostConstruct
    public void init(){
        System.out.println("JsrService init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JsrService destroy");
    }

    public void save() {
        this.jsrDao.save();
    }
}
