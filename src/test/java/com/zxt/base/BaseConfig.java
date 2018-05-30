package com.zxt.base;

public class BaseConfig {
    public static String files = "classpath:mvc-dispatcher-servlet.xml" +
            ", " + "classpath:applicationContext.xml" +
            ", " + "classpath:spring-mybatis.xml" +
            ", " + "classpath:spring-bean-imooc.xml" +
            ", " + "classpath:spring-test.xml" +
            "";
}
