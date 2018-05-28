package com.zxt.base;

import org.junit.Test;

public class MyTest {


    @Test
    public void test() {
        try {
            Object o = new Object();
            throw new Exception("yeah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
