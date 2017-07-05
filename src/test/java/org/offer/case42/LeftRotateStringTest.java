package org.offer.case42;

import org.junit.Test;
import org.offer.case42.LeftRotateString;

import static org.junit.Assert.*;

/**
 * 面试题 42
 * 题目二：左旋转字符串
 * Created by tanc on 2017/7/5.
 */
public class LeftRotateStringTest {

    @Test
    public void methodOne() throws Exception {
        String src = "abcdefg";
        String result = LeftRotateString.methodOne(src, 2);
        assertEquals("cdefgab", result);
    }

    @Test
    public void methodTwo() throws Exception {
        String src = "abcdefg";
        String result = LeftRotateString.methodTwo(src, 2);
        assertEquals("cdefgab", result);
    }
}