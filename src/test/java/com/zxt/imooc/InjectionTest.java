package com.zxt.imooc;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionTest extends UnitTestBase{

    public InjectionTest(){
        super("classpath:spring-bean-imooc.xml");
    }

    @Test
    public void testAutowired(){
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("This is autowired");
    }

    @Test
    public void testMultiBean(){
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }
}
