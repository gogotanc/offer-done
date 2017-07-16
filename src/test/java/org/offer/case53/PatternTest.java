package org.offer.case53;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 53: 正则表达式匹配
 * Created by tanc on 2017/7/12.
 */
public class PatternTest {

    @Test
    public void case1() throws Exception {
        boolean result = Pattern.methodOne("aaa", "a.a");
        assertEquals(true, result);
    }

    @Test
    public void case2() throws Exception {
        boolean result = Pattern.methodOne("aaa", "ab*ac*a");
        assertEquals(true, result);
    }

    @Test
    public void case3() throws Exception {
        boolean result = Pattern.methodOne("aaa", "aa.a");
        assertEquals(false, result);
    }

    @Test
    public void case4() throws Exception {
        boolean result = Pattern.methodOne("aaa", "ab*a");
        assertEquals(false, result);
    }

}