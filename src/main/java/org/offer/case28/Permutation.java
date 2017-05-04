package org.offer.case28;

import java.util.Arrays;

/**
 * 面试题 28: 字符串的排列
 * Created by tanc on 17-5-4.
 */
public class Permutation {

    public static void permutation(String string) {

        if (null == string) {
            return;
        }

        printPermutation(string.toCharArray(), 0);
    }

    private static void printPermutation(char[] s, int index) {

        if (index >= s.length) {
            System.out.println(Arrays.toString(s));
            return;
        }

        for (int i = index; i < s.length; i++) {
            char temp = s[i];
            s[i] = s[index];
            s[index] = temp;

            printPermutation(s, index + 1);

            s[index] = s[i];
            s[i] = temp;
        }
    }

}
