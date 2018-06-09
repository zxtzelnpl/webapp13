package com.zxt.imooc.six;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AOPAPITest extends UnitTestBase {

    public AOPAPITest(){
        super("classpath:spring-six.xml");
    }

    @Test
    public void testSave(){
        BizLogic logic = super.getBean("bizLogicImpl");
        logic.save();
    }
}
