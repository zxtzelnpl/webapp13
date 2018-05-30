package com.zxt.imooc;

import com.zxt.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.File;

@RunWith(BlockJUnit4ClassRunner.class)
public class ResourceTest extends UnitTestBase {

    public ResourceTest(){

    }

    @Test
    public void test() throws Exception{
        ClassPathXmlApplicationContext ctx = super.getContext();
        Resource template = ctx.getResource("classpath:log4j.properties");

        System.out.println(template);
        System.out.println(template.exists());
        System.out.println(template.contentLength());

        File file = template.getFile();
        System.out.println(file);
        System.out.println(file.toString());
    }
}
