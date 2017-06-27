package org.offer.case38;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 38: 数字在排序数组中出现的次数
 * Created by tanc on 17-6-14.
 */
public class GetNumberOfKTest {

    @Test
    public void case1() throws Exception {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = GetNumberOfK.methodOne(data, 3);
        assertEquals(1, result);
        result = GetNumberOfK.methodTwo(data, 3);
        assertEquals(1, result);
    }

    @Test
    public void case2() throws Exception {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = GetNumberOfK.methodOne(data, 9);
        assertEquals(0, result);
        result = GetNumberOfK.methodTwo(data, 9);
        assertEquals(0, result);
    }

    @Test
    public void case3() throws Exception {
        int[] data = {1, 1, 1, 1, 1, 1, 1, 1};
        int result = GetNumberOfK.methodOne(data, 1);
        assertEquals(8, result);
        result = GetNumberOfK.methodTwo(data, 1);
        assertEquals(8, result);
    }

    @Test
    public void case4() throws Exception {
        int[] data = {1, 2, 4, 5, 6, 7, 8};
        int result = GetNumberOfK.methodOne(data, 3);
        assertEquals(0, result);
        result = GetNumberOfK.methodTwo(data, 3);
        assertEquals(0, result);
    }

    @Test
    public void case5() throws Exception {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = GetNumberOfK.methodOne(data, 8);
        assertEquals(1, result);
        result = GetNumberOfK.methodTwo(data, 8);
        assertEquals(1, result);
    }

    @Test
    public void case6() throws Exception {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = GetNumberOfK.methodOne(data, 1);
        assertEquals(1, result);
        result = GetNumberOfK.methodTwo(data, 1);
        assertEquals(1, result);
    }

}