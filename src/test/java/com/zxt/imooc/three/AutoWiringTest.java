package com.zxt.imooc.three;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AutoWiringTest extends UnitTestBase {
    public AutoWiringTest(){
        super("classpath:spring-three-for-autowire.xml");
    }

    @Test
    public void test(){
        AutoWiringService autoWiringService = super.getBean("autoWiringService");
        autoWiringService.say("This is a test");
    }

}
