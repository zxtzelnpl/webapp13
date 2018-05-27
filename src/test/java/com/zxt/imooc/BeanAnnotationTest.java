package com.zxt.imooc;

import com.zxt.base.BaseConfig;
import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class BeanAnnotationTest extends UnitTestBase{
    public BeanAnnotationTest(){
        super("classpath*:spring-bean-imooc.xml");
    }

    @Test
    public void testSay(){
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.say("This is a test");
    }

    @Test
    public void testScope(){
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.myHashCode();

        bean = super.getBean("beanAnnotation");
        bean.myHashCode();
    }
}
