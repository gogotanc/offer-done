package org.offer.case34;

/**
 * 面试题 34：丑数
 * Created by tanc on 17-6-9.
 */
public class UglyNumber {

    /**
     * 方法一：遍历
     */
    public static long printUglyNumber(int n) {
        int count = 0;
        int i = 1;
        while (true) {
            if (isUgly(i)) {
                count++;
                if (count == n) {
                    return i;
                }
            }
            i++;
        }
    }

    public static long methodTwo(int n) {
        // 存放丑数序列
        long[] uglyNumbers = new long[n];

        // 第一个丑数为 1
        uglyNumbers[0] = 1;

        int ugly2p = 0;
        int ugly3p = 0;
        int ugly5p = 0;
        int p = 1;

        while (p < n) {
            long num2p = uglyNumbers[ugly2p] * 2;
            long num3p = uglyNumbers[ugly3p] * 3;
            long num5p = uglyNumbers[ugly5p] * 5;
            long min = min(num2p, num3p, num5p);
            uglyNumbers[p++] = min;

            if (num2p == min) {
                ugly2p++;
            }
            if (num3p == min) {
                ugly3p++;
            }
            if (num5p == min) {
                ugly5p++;
            }
        }

        return uglyNumbers[n - 1];
    }

    private static long min(long a, long b, long c) {
        long result = a;
        if (b < result) {
            result = b;
        }
        if (c < result) {
            result = c;
        }
        return result;
    }

    /**
     * 判断一个数是否为丑数
     */
    private static boolean isUgly(long number) {
        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        while (number % 5 == 0) {
            number /= 5;
        }
        return number == 1;
    }
}
