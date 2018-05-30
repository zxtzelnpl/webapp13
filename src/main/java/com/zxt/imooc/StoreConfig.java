package com.zxt.imooc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StoreConfig {


    @Bean(name="store",initMethod="init",destroyMethod = "destroy")
    public StringStore getStringStore(){
        return new StringStore();
    }
}
