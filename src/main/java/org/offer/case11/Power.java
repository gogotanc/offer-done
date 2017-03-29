package org.offer.case11;

/**
 * 面试题 11：数值的整数次方
 * Created by tanc on 2017/3/29.
 */
public class Power {

    public static double methodOne(double base, int exponent) {
        if (exponent == 0) {
            return 1.0;
        } else if (exponent > 0) {
            return powerMethodTwo(base, exponent);
        } else {
            if (Double.compare(base, 0.0) == 0) {
                throw new RuntimeException("非法输入");
            }
            return 1.0 / powerMethodTwo(base, 0 - exponent);
        }
    }

    private static double powerMethodOne(double base, int exponent) {
        double result = 1.0;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

    private static double powerMethodTwo(double base, int exponent) {
        if (exponent == 0) {
            return 0;
        } else if (exponent == 1) {
            return base;
        }

        // 使用移位代替除 2 运算
        double result = powerMethodTwo(base, exponent >> 1);
        result *= result;

        // exponent % 2 != 0
        // 使用位运算代替取余运算
        if ((exponent & 1) == 1) {
            result *= base;
        }

        return result;
    }
}
