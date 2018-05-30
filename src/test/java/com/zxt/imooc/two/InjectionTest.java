package com.zxt.imooc.two;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionTest extends UnitTestBase{

    public InjectionTest(){
        super("classpath:spring-bean-imooc-two.xml");
    }

    @Test
    public void testSetter(){
        InjectionService service = super.getBean("injectionServiceImplForSetter");
        service.save("这是要保存的数据");
    }

    @Test
    public void testConstructor(){
        InjectionService service = super.getBean("injectionServiceImpForConstructor");
        service.save("这是要保存的数据");
    }
}
