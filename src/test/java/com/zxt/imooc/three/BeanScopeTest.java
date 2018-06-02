package com.zxt.imooc.three;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanScopeTest extends UnitTestBase {
    public BeanScopeTest(){
        super("classpath:spring-three-bean-imooc.xml");
    }

    @Test
    public void testSay1(){
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        beanScope = super.getBean("beanScope");
        beanScope.say();
    }

    /*上一个Test和下一个Test的hashCode是不一样的，每次测试后会销毁容器*/
    @Test
    public void testSay2(){
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        beanScope = super.getBean("beanScope");
        beanScope.say();
    }
}
