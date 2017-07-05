package org.offer.case42;

/**
 * 面试题 42
 * 题目一：翻转字符串
 * Created by tanc on 2017/7/5.
 */
public class ReverseString {

    /**
     * 方法一：使用 Java 自带的库函数进行处理，先剪切成数组，再倒序拼接
     */
    public static String methodOne(String src) {
        if (null == src || src.length() == 0) {
            return "";
        }
        // 通过空格符剪切成单词数组
        String[] words = src.split(" ");
        StringBuilder builder = new StringBuilder();
        // 倒序拼接成新的字符串
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]).append(" ");
        }
        builder.deleteCharAt(builder.lastIndexOf(" "));
        return builder.toString();
    }

    /**
     * 方法二：使用书上的方法，两次翻转
     */
    public static String methodTwo(String src) {
        char[] chars = src.toCharArray();
        // 翻转整个字符串
        reverse(chars, 0, chars.length - 1);

        int index = 0;
        int start = index;
        int end = index;
        while (index < chars.length) {
            if (chars[index] == ' ') {
                reverse(chars, start, end);
                start = index + 1;
                end = index + 1;
            } else {
                end = index;
                if (index == chars.length - 1) {
                    // 最后一个字符不为空格符
                    reverse(chars, start, end);
                }
            }
            index++;
        }
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
