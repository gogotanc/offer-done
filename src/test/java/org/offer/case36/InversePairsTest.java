package org.offer.case36;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 36： 数组中的逆序对
 * Created by tanc on 17-6-14.
 */
public class InversePairsTest {

    @Test
    public void methodOne() throws Exception {
        int[] data = {7, 5, 6, 4};
        int result = InversePairs.methodOne(data);
        assertEquals(5, result);
    }

    @Test
    public void methodTwo() throws Exception {
        int[] data = {7, 5, 6, 4};
        int result = InversePairs.methodTwo(data);
        assertEquals(5, result);
    }

    @Test
    public void case1() throws Exception {
        int[] data = {1, 2, 3, 4, 5, 6};
        int result = InversePairs.methodOne(data);
        assertEquals(0, result);
        result = InversePairs.methodTwo(data);
        assertEquals(0, result);
    }

    @Test
    public void case2() throws Exception {
        int[] data = {6, 5, 4, 3, 2, 1};
        int result = InversePairs.methodOne(data);
        assertEquals(15, result);
        result = InversePairs.methodTwo(data);
        assertEquals(15, result);
    }

    @Test
    public void case3() throws Exception {
        int[] data = {6, 6, 4, 3, 2, 1};
        int result = InversePairs.methodOne(data);
        assertEquals(14, result);
        result = InversePairs.methodTwo(data);
        assertEquals(14, result);
    }

    @Test
    public void case4() throws Exception {
        int[] data = {6, 1};
        int result = InversePairs.methodOne(data);
        assertEquals(1, result);
        result = InversePairs.methodTwo(data);
        assertEquals(1, result);
    }

    @Test
    public void case5() throws Exception {
        int[] data = {6};
        int result = InversePairs.methodOne(data);
        assertEquals(0, result);
        result = InversePairs.methodTwo(data);
        assertEquals(0, result);
    }
}