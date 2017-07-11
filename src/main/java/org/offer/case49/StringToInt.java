package org.offer.case49;

import org.offer.utils.exception.IllegalOperationException;

/**
 * 面试题 49: 把字符串转换成整数
 * Created by tanc on 2017/7/11.
 */
public class StringToInt {

    /**
     * 方法一：直接使用 Java 库函数
     */
    public static int methodOne(String string) {
        return Integer.parseInt(string);
    }

    /**
     * 方法二：自己实现
     */
    public static int methodTwo(String string) {
        if (null == string || "".equals(string)) {
            throw new IllegalOperationException("输入非法");
        }
        char[] chars = string.toCharArray();
        int startIndex = 0;
        char symbol = chars[0];
        boolean minus = false;

        // 判断符号位，或者没有符号位
        if (symbol == '-') {
            minus = true;
            startIndex = 1;
        } else if (symbol == '+') {
            startIndex = 1;
        } else if (symbol > '9' || symbol < '0') {
            throw new IllegalOperationException("输入非法");
        }

        int result = 0;
        for (int i = startIndex; i < chars.length; i++) {
            int num = charToInt(chars[i]);
            if (num == -1) {
                throw new IllegalOperationException("输入非法");
            }
            result = result * 10 + num;
            if (result < 0) {
                throw new IllegalOperationException("超过范围了");
            }
        }
        return minus ? -result : result;

    }

    /**
     * char 转换成 int
     */
    private static int charToInt(char c) {
        if (c <= '9' && c >= '0') {
            return c - '0';
        }
        return -1;
    }
}
