package com.example.practice.demo.helper;

import org.junit.Test;
import org.junit.Before;
import org.junit.*;

public class HelperTest {

    Helper h;

    @Before
    public void setUp(){
        h = new Helper();
    }


    @Test
    public void testHelloWorld(){
        h.helloWorld();
    }

    @Test
    public void testConcatenateMakes(){
        String result = h.concatenateMakes();
        Assert.assertEquals(result, "hello world");
    }

}