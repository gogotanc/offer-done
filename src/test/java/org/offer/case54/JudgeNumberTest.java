package org.offer.case54;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 54: 表示数值的字符串
 * Created by tanc on 2017/7/16.
 */
public class JudgeNumberTest {

    @Test
    public void case1() throws Exception {
        assertEquals(true, JudgeNumber.methodOne("123.45E+6"));
    }

    @Test
    public void case2() throws Exception {
        assertEquals(true, JudgeNumber.methodOne("100"));
    }

    @Test
    public void case3() throws Exception {
        assertEquals(true, JudgeNumber.methodOne("5e2"));
    }

    @Test
    public void case4() throws Exception {
        assertEquals(true, JudgeNumber.methodOne("3.1416"));
    }

    @Test
    public void case5() throws Exception {
        assertEquals(true, JudgeNumber.methodOne("-.123"));
    }

    @Test
    public void case6() throws Exception {
        assertEquals(true, JudgeNumber.methodOne("-1E-16"));
        assertEquals(true, JudgeNumber.methodOne("1.797634234E+308"));
    }

    @Test
    public void case7() throws Exception {
        assertEquals(false, JudgeNumber.methodOne("+-30"));
    }

    @Test
    public void case8() throws Exception {
        assertEquals(false, JudgeNumber.methodOne("1.2.3"));
    }
}