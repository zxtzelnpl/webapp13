package com.zxt.imooc.five;

import com.zxt.base.UnitTestBase;
import com.zxt.imooc.five.biz.AspectBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AOPSchemaAdviceTest extends UnitTestBase{

    public AOPSchemaAdviceTest(){
        super("classpath:spring-five-for-imooc.xml");
    }

    @Test
    public void testBiz() throws Exception
    {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }

    @Test
    public void testInit(){
        AspectBiz biz = super.getBean("aspectBiz");
        biz.init("mooc",8);
    }
}
