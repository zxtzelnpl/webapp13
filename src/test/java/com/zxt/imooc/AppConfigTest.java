package com.zxt.imooc;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class AppConfigTest extends UnitTestBase {

    public AppConfigTest(){
    }

    @Test
    public void testMyDriverManager(){
        MyDriverManager myDriverManager= super.getBean("myDriveManager");
        System.out.println(myDriverManager.getClass().getName());
    }
}
