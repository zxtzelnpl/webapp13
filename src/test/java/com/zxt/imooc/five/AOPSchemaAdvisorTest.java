package com.zxt.imooc.five;

import com.zxt.base.UnitTestBase;
import com.zxt.imooc.five.advisors.service.InvokeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AOPSchemaAdvisorTest extends UnitTestBase {

    public AOPSchemaAdvisorTest(){
        super("classpath:spring-five-aop-schema-advisors.xml");
    }

    @Test
    public void testSave(){
        InvokeService service = super.getBean("invokeService");
        service.invoke();

        System.out.println();
        service.invokeException();
    }
}
