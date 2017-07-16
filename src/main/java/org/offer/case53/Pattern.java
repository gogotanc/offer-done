package org.offer.case53;

/**
 * 面试题 53: 正则表达式匹配
 * Created by tanc on 2017/7/12.
 */
public class Pattern {

    /**
     * 需要分多种情况来分析
     *
     * 1. location + 1 为 "*" 时，且当前匹配，有两种情况:
     *      1. index + 1，location 不动
     *      2. index 不动，location + 2
     *
     * 2. location + 1 为 "*"，且当前不匹配，有一种情况：
     *      1. index 不动，location + 2；
     *
     * 3. location + 1 不为 "*" 时：
     *      1. pattern 为 "." 时，直接比较下一位
     *      2. pattern 匹配，直接下一位
     *      3. pattern 不匹配，返回 false
     */
    public static boolean methodOne(String str, String pattern) {
        return match(str.toCharArray(), 0, pattern.toCharArray(), 0);
    }

    /**
     * @param src 待匹配字符串
     * @param index 当前待匹配字符下标
     * @param pattern 表达式
     * @param location 当前表达式位置
     */
    private static boolean match(char[] src, int index, char[] pattern, int location) {

        if (index < 0 || index >= src.length || location < 0 || location >= pattern.length) {
            return false;
        }

        if (index == src.length - 1 && location == pattern.length - 1) {
            return true;
        }
        if (index != src.length - 1 && location == pattern.length - 1) {
            return false;
        }

        char a = src[index];
        char b = pattern[location];

        if (location + 1 < pattern.length && pattern[location + 1] == '*') {
            if (a == b || (b == '.' && index < src.length)) {
                return match(src, index + 1, pattern, location + 2)
                        || match(src, index + 1, pattern, location)
                        || match(src, index, pattern, location + 2);
            } else {
                return match(src, index, pattern, location + 2);
            }
        }

        if (a == b || (b == '.' && index < src.length)) {
            return match(src, index + 1, pattern, location + 1);

        }

        return false;
    }

}
