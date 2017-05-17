package org.offer.case31;

import org.offer.utils.exception.IllegalOperationException;

/**
 * 面试题 31： 连续子数组的最大和
 * Created by tanc on 17-5-17.
 */
public class SumOfSubarray {

    /**
     * 解法一：使用规律进行处理
     */
    public static int greatestSumOfSubarrayMethodOne(int[] data) {
        checkInput(data);

        int sum = data[0];
        int max = sum;
        for (int i = 1; i < data.length; i++) {
            sum += data[i];
            if (sum < data[i]) {
                sum = data[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }

    private static void checkInput(int[] data) {
        if (null == data || data.length < 1) {
            throw new IllegalOperationException("输入非法。");
        }
    }
}
