package com.zxt.imooc.three;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanLifeCycleTest extends UnitTestBase {
    public BeanLifeCycleTest(){
        super("classpath:spring-three-bean-imooc.xml");
    }

    @Test
    public void test(){
        BeanLifeCycle beanLifeCycle = super.getBean("beanLifeCycle");
    }

}
