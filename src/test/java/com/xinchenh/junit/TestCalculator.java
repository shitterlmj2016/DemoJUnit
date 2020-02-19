package com.xinchenh.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator c;
    //测试之前做的事情
    @Before
    public void setUp(){
        c = new Calculator();
    }
    @Test
    public void testAdd(){
        assertEquals(5,c.add(2,3));
    }

    @After
    public void after(){
        c = null;
    }
}
