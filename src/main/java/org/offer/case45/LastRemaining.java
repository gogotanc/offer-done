package org.offer.case45;

/**
 * 面试题 45: 圆圈中最后剩下的数字
 * Created by tanc on 2017/7/6.
 */
public class LastRemaining {

    /**
     * 方法一：使用数组实现，通过一个索引循环遍历数组
     */
    public static int methodOne(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = 1;
        }
        // 索引，初始为 -1
        int index = -1;
        // 已出数量
        int count = 0;
        while (true) {
            for (int i = 0; i < m; i++) {
                index++;
                index %= n;
                while (data[index] == 0) {
                    index++;
                    index %= n;
                }
            }
            data[index] = 0;
            count++;
            if (count == n) {
                return index;
            }
        }
    }

    /**
     * 方法二：书上的方法，分析有点难，代码简单，寻找规律来解决
     */
    public static int methodTwo(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        int last = 0;
        for (int i = 2; i < n; i++) {
            last = (last + m) % n;
        }
        return last;
    }
}
