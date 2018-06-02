package com.zxt.imooc.four;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class JsrTest extends UnitTestBase{

    public JsrTest(){

    }

    @Test
    public void testSave(){
        JsrService service = getBean("jsrService");
        service.save();
    }
}
