package org.offer.case46;

/**
 * 面试题 46: 求 1 + 2 + 3 + ... + n
 * Created by tanc on 2017/7/6.
 */
public class Accumulate {

    private static int sum = 0;

    /**
     * 方法一：使用静态变量和递归实现
     */
    public static int methodOne(int n) {

        sum(n);

        int temp = sum;
        sum = 0;
        return temp;
    }

    private static boolean sum(int n) {
        sum += n;
        return n != 1 && sum(--n);
    }

}
