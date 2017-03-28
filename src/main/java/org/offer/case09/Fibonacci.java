package org.offer.case09;

/**
 * 面试题 9：斐波那契数列
 * Created by tanc on 2017/3/28.
 */
public class Fibonacci {

    public static long methodOne(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return methodOne(n - 1) + methodOne(n - 2);
    }

    public static long methodTwo(long n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long first = 0;
        long second = 1;
        long sum = 0;

        for (int i = 2; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }
}
