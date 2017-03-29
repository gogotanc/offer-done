package org.offer.case14;

/**
 * 面试题 14：调整数组顺序使奇数位于偶数前面
 * Created by tanc on 2017/3/29.
 */
public class ReorderOddEven {

    public static void reorder(int[] num) {

        if (null == num || num.length == 0) {
            return;
        }

        int front = 0;
        int tail = num.length - 1;

        while (front < tail) {
            while (front < tail && (num[front] & 1) == 1) {
                front++;
            }
            while (front < tail && (num[tail] & 1) == 0) {
                tail--;
            }
            if (front < tail) {
                int temp = num[front];
                num[front] = num[tail];
                num[tail] = temp;
            }
        }
    }
}
