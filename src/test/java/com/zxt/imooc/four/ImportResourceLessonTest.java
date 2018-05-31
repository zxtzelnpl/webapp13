package com.zxt.imooc.four;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class ImportResourceLessonTest extends UnitTestBase {

    public ImportResourceLessonTest(){
        super();
    }

    @Test
    public void testMyDriverManager(){
        MyDriverManager myDriverManager= super.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getName());
    }
}
