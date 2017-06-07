package org.offer.case32;

/**
 * 面试题 32：从 1 到 n 整数中 1 出现的次数
 * Created by tanc on 17-6-6.
 */
public class CountOne {

    /**
     * 方法一：直接遍历
     */
    public static int methodOne(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += countOne(i);
        }
        return result;
    }

    /**
     * 一个数字中 1 的个数
     */
    private static int countOne(int n) {
        int result = 0;
        int num = n;
        while (num > 0) {
            if (num % 10 == 1) {
                result++;
            }
            num /= 10;
        }
        return result;
    }

    /**
     * 方法二：寻找规律得出的方法
     */
    public static int methodTwo(int n) {
        if (n < 0) {
            throw new RuntimeException("输入非法");
        }
        char[] data = String.valueOf(n).toCharArray();
        return count(data, 0);
    }

    private static int count(char[] data, int offset) {
        int length = data.length - offset;
        int first = parseInt(data[offset]);

        if (length == 1 && first == 0) {
            return 0;
        } else if (length == 1 && first > 0) {
            return 1;
        }

        // 去掉最高位，剩下的位数
        int bits = length - 1;
        int result = 0;
        // 最高位为 0 的情况不用管
        if (first == 1) {
            int count = parseInt(data, offset + 1);
            result += count + 1;
        } else if (first > 1) {
            result += powerBase10(bits);
        }
        // 全排列
        result += first * bits * powerBase10(bits - 1);
        // 递归求次高位
        result += count(data, offset + 1);
        return result;
    }

    private static int parseInt(char[] data, int offset) {
        int length = data.length - offset;
        char[] result = new char[length];
        System.arraycopy(data, offset, result, 0, length);
        return Integer.parseInt(new String(result));
    }

    private static int parseInt(char data) {
        return data - '0';
    }

    private static int powerBase10(int n) {
        int base = 10;
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= base;
        }
        return result;
    }
}
