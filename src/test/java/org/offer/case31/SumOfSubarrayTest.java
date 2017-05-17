package org.offer.case31;

import org.junit.Test;
import org.offer.utils.exception.IllegalOperationException;

import static org.junit.Assert.*;

/**
 * 面试题 31： 连续子数组的最大和
 * Created by tanc on 17-5-17.
 */
public class SumOfSubarrayTest {

    @Test
    public void case1() throws Exception {
        int[] data = new int[]{1, -2, 3, 10, -4, 7, 2, -5};
        assertEquals(18, SumOfSubarray.greatestSumOfSubarrayMethodOne(data));
    }

    @Test
    public void case2() throws Exception {
        int[] data = new int[]{-1, -2, -3, -4, -5, -6};
        assertEquals(-1, SumOfSubarray.greatestSumOfSubarrayMethodOne(data));
    }

    @Test
    public void case3() throws Exception {
        int[] data = new int[]{1, 2, 3, 4, 5, 6};
        assertEquals(21, SumOfSubarray.greatestSumOfSubarrayMethodOne(data));
    }

    @Test(expected = IllegalOperationException.class)
    public void case4() throws Exception {
        int[] data = new int[]{};
        assertEquals(21, SumOfSubarray.greatestSumOfSubarrayMethodOne(data));
    }

    @Test(expected = IllegalOperationException.class)
    public void case5() throws Exception {
        int[] data = null;
        assertEquals(21, SumOfSubarray.greatestSumOfSubarrayMethodOne(data));
    }
}