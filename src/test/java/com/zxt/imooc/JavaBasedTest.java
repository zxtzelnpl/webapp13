package com.zxt.imooc;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class JavaBasedTest extends UnitTestBase{
    public JavaBasedTest(){

    }

    @Test
    public void test(){
        Store store = super.getBean("store");
        System.out.println(store.getClass().getName());
    }
}
