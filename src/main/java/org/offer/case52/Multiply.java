package org.offer.case52;

/**
 * 面试题 52: 构建乘积数组
 * Created by tanc on 2017/7/12.
 */
public class Multiply {

    /**
     * 把 B 看成一个矩阵来构建
     * c[i] = a[0] * ... * a[i - 1]
     * d[i] = a[i + 1] * ... * a[n - 1]
     * b[i] = c[i] * d[i]
     */
    public static int[] methodOne(int[] A) {
        if (null == A || A.length == 0) {
            return null;
        }

        int len = A.length;
        // c
        int[] c = new int[len];
        c[0] = 1;
        for (int i = 1; i < len; i++) {
            c[i] = c[i - 1] * A[i - 1];
        }

        // d
        int[] d = new int[len];
        d[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            d[i] = d[i + 1] * A[i + 1];
        }

        // b
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = c[i] * d[i];
        }
        return result;
    }
}
