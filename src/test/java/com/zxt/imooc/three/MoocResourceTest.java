package com.zxt.imooc.three;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.io.IOException;

@RunWith(BlockJUnit4ClassRunner.class)
public class MoocResourceTest extends UnitTestBase {
    public MoocResourceTest(){
        super("classpath:spring-three-for-resource.xml");
    }

    @Test
    public void test() throws IOException {
        MoocResource resource = super.getBean("moocResource");
        resource.resource();
    }

}
