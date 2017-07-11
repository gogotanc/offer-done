package org.offer.case49;

import org.junit.Test;
import org.offer.utils.exception.IllegalOperationException;

import static org.junit.Assert.*;

/**
 * 面试题 50: 把字符串转换成整数
 * Created by tanc on 2017/7/11.
 */
public class StringToIntTest {

    @Test
    public void case1() throws Exception {
        int result = StringToInt.methodOne("-100");
        assertEquals(-100, result);
        result = StringToInt.methodTwo("-100");
        assertEquals(-100, result);
    }

    @Test
    public void case2() throws Exception {
        int result = StringToInt.methodOne("100");
        assertEquals(100, result);
        result = StringToInt.methodTwo("100");
        assertEquals(100, result);
    }

    @Test
    public void case3() throws Exception {
        int result = StringToInt.methodOne("0");
        assertEquals(0, result);
        result = StringToInt.methodTwo("0");
        assertEquals(0, result);
    }

    @Test
    public void case4() throws Exception {
        int maxValue = Integer.MAX_VALUE;
        int result = StringToInt.methodOne(maxValue + "");
        assertEquals(Integer.MAX_VALUE, result);
        result = StringToInt.methodTwo(maxValue + "");
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void case5() throws Exception {
        int minValue = Integer.MIN_VALUE;
        int result = StringToInt.methodOne(minValue + "");
        assertEquals(Integer.MIN_VALUE, result);
        result = StringToInt.methodTwo(minValue + "");
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test(expected = Exception.class)
    public void case6() throws Exception {
        int result = StringToInt.methodOne("");
        assertEquals(Integer.MIN_VALUE, result);
        result = StringToInt.methodTwo("");
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test(expected = Exception.class)
    public void case7() throws Exception {
        int result = StringToInt.methodOne(null);
        assertEquals(Integer.MIN_VALUE, result);
        result = StringToInt.methodTwo(null);
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test(expected = Exception.class)
    public void case8() throws Exception {
        int result = StringToInt.methodOne("234i8");
        assertEquals(Integer.MIN_VALUE, result);
        result = StringToInt.methodTwo("234i8");
        assertEquals(Integer.MIN_VALUE, result);
    }

    @Test(expected = Exception.class)
    public void case9() throws Exception {
        int bigNum = Integer.MAX_VALUE;
        int result = StringToInt.methodOne("1" + bigNum);
        assertEquals(Integer.MIN_VALUE, result);
        result = StringToInt.methodTwo("1" + bigNum);
        assertEquals(Integer.MIN_VALUE, result);
    }

}