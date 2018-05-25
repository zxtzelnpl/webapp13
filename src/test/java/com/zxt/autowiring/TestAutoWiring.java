package com.zxt.autowiring;

import com.zxt.base.BaseConfig;
import com.zxt.base.UnitTestBase;
import com.zxt.user.UserControllerBack;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase {


    public TestAutoWiring() {
        super(BaseConfig.files);
    }

    @Test
    public void test() {

        UserControllerBack userControllerBack = super.getBean("userControllerBack");
        Class UserControllerBackCopy = userControllerBack.getClass();

//        AutoWiringService service = super.getBean("autoWiringService");
//        service.say(" this is a test");
    }
}
