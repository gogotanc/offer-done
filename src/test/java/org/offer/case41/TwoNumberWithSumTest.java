package org.offer.case41;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 面试题 41: 和为 S 的两个数字 VS 和为 S 的连续正数序列
 * Created by tanc on 17-6-14.
 */
public class TwoNumberWithSumTest {

    @Test
    public void methodOne() throws Exception {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 10, 23, 34, 37};
        TwoNumberWithSum.methodOne(data, 16);
    }

}