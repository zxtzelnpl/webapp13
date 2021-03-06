package com.zxt.imooc.four;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class JsrTest extends UnitTestBase{

    public JsrTest(){
        super("classpath*:spring-four-for-bean-imooc.xml");
    }

    @Test
    public void testSave(){
        JsrService service = getBean("jsrService");
        JsrDao dao = getBean("jsrDao");
        System.out.println(service.getClass().getName());
        System.out.println(dao.getClass().getName());
        dao.save();
        service.save();
    }
}
