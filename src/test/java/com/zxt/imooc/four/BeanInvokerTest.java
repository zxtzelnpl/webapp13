package com.zxt.imooc.four;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanInvokerTest extends UnitTestBase{
    public BeanInvokerTest(){
        super("classpath:spring-four-for-bean-imooc.xml");
    }

    @Test
    public void test(){
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
}
