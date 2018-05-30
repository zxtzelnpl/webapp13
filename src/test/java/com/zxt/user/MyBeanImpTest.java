package com.zxt.user;

import com.zxt.mybean.MyBeanImp;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyBeanImpTest {
    @BeforeClass
    public static void before(){
        System.out.println("BeforeClass");
    }

    @Test
    public void checkMyBean(){
        ApplicationContext  context = new ClassPathXmlApplicationContext("spring-application-context.xml");
        MyBeanImp myBeanImp = (MyBeanImp)context.getBean("myBeanImp");
        myBeanImp.sayName();
        myBeanImp.showList();
        System.out.println(myBeanImp.hashCode());
    }
}
