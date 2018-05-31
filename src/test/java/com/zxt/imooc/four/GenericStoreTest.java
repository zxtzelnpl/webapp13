package com.zxt.imooc.four;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class GenericStoreTest extends UnitTestBase {
    public GenericStoreTest(){

    }

    @Test
    public void testGeneric(){
        GenericStore genericStoreTest = super.getBean("genericStoreTest");
    }

}
