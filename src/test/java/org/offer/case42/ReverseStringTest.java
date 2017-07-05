package org.offer.case42;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 42
 * 题目一：翻转字符串
 * Created by tanc on 2017/7/5.
 */
public class ReverseStringTest {

    @Test
    public void methodOne() throws Exception {
        String src = "I am a student.";
        String result = ReverseString.methodOne(src);
        assertEquals("student. a am I", result);
    }

    @Test
    public void methodTwo() throws Exception {
        String src = "I am a student.";
        String result = ReverseString.methodTwo(src);
        assertEquals("student. a am I", result);
    }

}