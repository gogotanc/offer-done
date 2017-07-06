package org.offer.case44;

import java.util.Arrays;

/**
 * 面试题 44: 扑克牌的顺子
 * Created by tanc on 2017/7/6.
 */
public class IsContinuous {

    /**
     * 先将数组排序
     * 计算数组中 0 的个数，也就是大小王的个数
     * 再计算非 0 的相邻数字之间的差
     * 如果差小于或等于 0 的个数，则会是顺子
     */
    public static boolean methodOne(int[] data) {
        Arrays.sort(data);
        int numOfZero = countZero(data);
        int diff = countDiff(data);
        return -1 != diff && diff <= numOfZero;
    }

    /**
     * 计算 0 的个数
     */
    private static int countZero(int[] data) {
        int count = 0;
        for (int n : data) {
            if (n == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * 计算非 0 数字之间的差，出现相邻数字相等的情况返回 -1，即出现了对子，肯定就不会是顺子了。
     */
    private static int countDiff(int[] data) {
        int indexOfFirstNotZero = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                indexOfFirstNotZero = i;
                break;
            }
        }
        int diff = 0;
        int num = data[indexOfFirstNotZero];
        for (int i = indexOfFirstNotZero + 1; i < data.length; i++) {
            int temp = data[i] - num;
            if (temp == 0) {
                return -1;
            }
            diff += temp - 1;
            num = data[i];
        }
        return diff;
    }
}
