package org.offer.case53;

/**
 * 面试题 53: 正则表达式匹配
 * Created by tanc on 2017/7/12.
 */
public class Pattern {

    public static boolean methodOne(String str, String pattern) {
        return match(str.toCharArray(), 0, pattern.toCharArray(), 0);
    }

    private static boolean match(char[] src, int index, char[] pattern, int location) {

        if (index == src.length - 1 && location == src.length - 1) {
            return true;
        }
        if (index != src.length - 1 && location == src.length - 1) {
            return false;
        }

        char a = src[index];
        char b = pattern[location];

        if (pattern[location + 1] == '*') {
            if (a == b || (b == '.' && index != src.length - 1)) {
                return match(src, index + 1, pattern, location + 2)
                        || match(src, index + 1, pattern, location)
                        || match(src, index, pattern, location + 2);
            } else {
                return match(src, index, pattern, location + 2);
            }
        }

        if (a == b || (b == '.' && index != src.length - 1)) {
            return match(src, index + 1, pattern, location + 1);

        }

        return false;
    }

    private static boolean mm(char[] src, int index, char[] pattern, int location) {

        boolean result = true;

        while (index < src.length && location < pattern.length) {
            char a = src[index];
            char b = pattern[location];

            if (b == '.') {
                index++;
                location++;
            } else if (b == '*') {
                location++;
            } else if (a == b) {
                if (location + 1 >= pattern.length) {
                    break;
                }
                char next = pattern[location + 1];
                if (next == '*') {
                    while (a == b) {
                        a = src[++index];
                    }
                    location++;
                } else {
                    location++;
                    index++;
                }
            } else {
                if (location + 1 >= pattern.length) {
                    break;
                }
                char next = pattern[location + 1];
                if (next == '*') {
                    location += 2;
                } else {
                    result = false;
                }
            }
        }

        if (index == src.length - 1 && location == src.length - 1) {
            result = true;
        }

        if (index != src.length - 1 && location == src.length - 1) {
            result = false;
        }

        return result;
    }
}
