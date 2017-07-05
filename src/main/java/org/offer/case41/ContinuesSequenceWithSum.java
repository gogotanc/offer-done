package org.offer.case41;

/**
 * 面试题 41
 * 题目二 和为 S 的连续正数序列
 * Created by tanc on 17-6-14.
 */
public class ContinuesSequenceWithSum {

    /**
     * 借鉴题目一的思想，有两个指针，将他们的和与 s 进行比较，然后移动指针
     */
    public static void methodOne(int s) {
        int small = 1;
        int big = 2;

        while (small < (s + 1) / 2) {
            int result = sumOfSequence(small, big);
            if (result < s) {
                big++;
            } else if (result > s) {
                small++;
            } else {
                printSequence(small, big);
                small++;
            }
        }
    }

    private static int sumOfSequence(int small, int big) {
        int sum = 0;
        for (int i = small; i <= big; i++) {
            sum += i;
        }
        return sum;
    }

    private static void printSequence(int small, int big) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = small; i <= big; i++) {
            builder.append(i).append(",");
        }
        builder.deleteCharAt(builder.lastIndexOf(","));
        builder.append("]");
        System.out.println(builder.toString());
    }
}
