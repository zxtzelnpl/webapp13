package com.zxt.imooc.four;

import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:spring-four-for-import-resource.xml")
public class ScopeLesson {

    @Bean(name="storeForTestScope",initMethod="init",destroyMethod = "destroy")
    @Scope(value="prototype")
    public Store stringStore(){
        return new StringStore();
    }
}
