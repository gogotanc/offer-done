package org.offer.case32;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 32：从 1 到 n 整数中 1 出现的次数
 * Created by tanc on 17-6-6.
 */
public class CountOneTest {

    @Test
    public void methodOne() throws Exception {
        int result = CountOne.methodOne(5);
        assertEquals(1, result);
        result = CountOne.methodOne(10);
        assertEquals(2, result);
        result = CountOne.methodOne(55);
        assertEquals(16, result);
        result = CountOne.methodOne(99);
        assertEquals(20, result);
    }

    @Test
    public void methodTwo() throws Exception {
        int result = CountOne.methodTwo(5);
        assertEquals(1, result);
        result = CountOne.methodTwo(10);
        assertEquals(2, result);
        result = CountOne.methodTwo(55);
        assertEquals(16, result);
        result = CountOne.methodTwo(99);
        assertEquals(20, result);
    }

    @Test
    public void case1() throws Exception {
        int result = CountOne.methodOne(0);
        assertEquals(0, result);
        result = CountOne.methodOne(1);
        assertEquals(1, result);
    }

    @Test
    public void case2() throws Exception {
        int result = CountOne.methodOne(10000);
        assertEquals(4001, result);
    }

    @Test
    public void case3() throws Exception {
        int result = CountOne.methodTwo(10000);
        assertEquals(4001, result);
    }

    @Test
    public void case4() throws Exception {
        int result = CountOne.methodTwo(0);
        assertEquals(0, result);
        result = CountOne.methodTwo(1);
        assertEquals(1, result);
    }

    @Test
    public void case9() throws Exception {
        int result = CountOne.methodOne(10000);
        System.out.println(result);
    }
}