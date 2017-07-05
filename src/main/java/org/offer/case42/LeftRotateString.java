package org.offer.case42;

/**
 * 面试题 42
 * 题目二：左旋转字符串
 * Created by tanc on 2017/7/5.
 */
public class LeftRotateString {

    /**
     * 方法一：直接剪切字符串成两部分，再重新拼接
     */
    public static String methodOne(String src, int num) {
        int len = src.length();
        num = num % len;
        if (num == 0) {
            return src;
        }
        String a = src.substring(0, num);
        String b = src.substring(num, len);
        return b + a;
    }

    /**
     * 方法二：使用书上的方法，先分别翻转前后两部分，再翻转全部，一共翻转三次，就可以得到结果
     */
    public static String methodTwo(String src, int num) {
        int len = src.length();
        num = num % len;
        if (num == 0) {
            return src;
        }
        char[] chars = src.toCharArray();
        reverse(chars, 0, num - 1);
        reverse(chars, num, chars.length - 1);
        reverse(chars, 0, chars.length - 1);
        return new String(chars);
    }

    /**
     * 翻转部分字符
     */
    private static void reverse(char[] data, int start, int end) {
        while (start < end) {
            char temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            start++;
            end--;
        }
    }
}
