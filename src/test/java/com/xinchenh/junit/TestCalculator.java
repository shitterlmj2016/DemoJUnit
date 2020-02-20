package com.xinchenh.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class TestCalculator {

    Calculator c;
    //Mock 一个service
    //CalculatorService service = Mockito.mock(CalculatorService.class)；

    //替代方法
    @Mock
    CalculatorService service;

    //声明搭配mockito使用Junit, 不然@mock会出错
    @Rule public MockitoRule rule = MockitoJUnit.rule();


    //测试之前做的事情
    @Before
    public void setUp() {
        c = new Calculator(service);
    }

    @Test
    public void testPerform(){
        when(service.add(2, 3)).thenReturn(5);
        assertEquals(10,c.perform(2,3));
    }

    @Test
    public void testHardCodedPerform(){
        when(service.add(2, 3)).thenReturn(5);
        assertEquals(10,c.hardCodedPerform(2,3));
        //verify if the service has been called
        verify(service).add(2,3);
    }

    //测试之后做的事
    @After
    public void after(){
        c = null;
    }
}
