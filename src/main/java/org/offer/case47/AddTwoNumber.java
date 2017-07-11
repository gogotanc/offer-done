package org.offer.case47;

/**
 * 面试题 47: 不使用加减乘除做加法
 * Created by tanc on 2017/7/6.
 */
public class AddTwoNumber {

    public static int methodOne(int a, int b) {
        int sum;
        // 进位
        int carry;

        do {
            sum = a ^ b;
            // 1 + 1 产生进位
            carry = (a & b) << 1;

            a = sum;
            b = carry;
        } while (b != 0);
        return sum;
    }
}
