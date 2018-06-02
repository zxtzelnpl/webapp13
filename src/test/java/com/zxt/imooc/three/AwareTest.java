package com.zxt.imooc.three;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AwareTest extends UnitTestBase {
    public AwareTest(){
        super("classpath:spring-three-bean-imooc.xml");
    }

    @Test
    public void testMoocApplicationContext(){
        System.out.println("MoocApplicationContext:"+super.getBean("moocApplicationContext"));
    }

    @Test
    public void testMoocBeanName(){
        System.out.println("MoocBeanName:"+super.getBean("moocBeanName"));
    }
}
