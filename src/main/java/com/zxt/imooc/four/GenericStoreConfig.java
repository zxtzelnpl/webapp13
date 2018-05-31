package com.zxt.imooc.four;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GenericStoreConfig {

    @Autowired
    @Qualifier("getStringStore")
    private GenericStore<String> s1;

    @Autowired
    @Qualifier("getIntegerStore")
    private GenericStore<Integer> s2;

    @Bean
    @Qualifier("getStringStore")
    public GenericStringStore getStringStore(){
        return new GenericStringStore();
    }

    @Bean
    @Qualifier("getIntegerStore")
    public GenericIntegerStore getIntegerStore(){
        return new GenericIntegerStore();
    }

    @Bean(name = "genericStoreTest")
    public GenericStore genericStoreTest(){
        System.out.println("s1: "+s1.getClass().getName());
        System.out.println("s2: "+s2.getClass().getName());
        return new GenericStore();
    }
}
