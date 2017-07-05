package org.offer.case43;

/**
 * 面试题 43：n 个骰子的点数
 * Created by tanc on 2017/7/5.
 */
public class PrintProbability {

    /**
     * 方法一：使用递归实现
     */
    public static void methodOne(int number) {

        int[] data = new int[5 * number + 1];
        for (int i = 0; i < data.length; i++) {
            data[i] = 0;
        }

        probability(data, number);

        int totalSum = getArrSum(data);

        for (int i = 0; i < data.length; i++) {
            double result = data[i] * 1.0 / totalSum;
            System.out.println(String.format("%d : %1.4f%%", i + number, result));
        }

    }

    private static int getArrSum(int[] data) {
        int sum = 0;
        for (int n : data) {
            sum += n;
        }
        return sum;
    }

    private static void probability(int[] data, int num) {
        for (int i = 1; i <= 6; i++) {
            probability(data, num, num, i);
        }
    }

    private static void probability(int[] data, int totalNum, int currNum, int sum) {
        if (currNum == 1) {
            data[sum - totalNum]++;
        } else {
            for (int i = 1; i <= 6; i++) {
                probability(data, totalNum, currNum - 1, sum + i);
            }
        }
    }

    /**
     * 方法二：使用循环实现，两个数组交替使用
     */
    public static void methodTwo(int number) {
        int len = 6 * number + 1;
        int[][] data = new int[2][len];
        for (int i = 0; i < len; i++) {
            data[0][i] = 0;
            data[1][i] = 0;
        }

        int flag = 0;
        for (int i = 1; i <= 6; i++) {
            data[flag][i] = 1;
        }

        // i 为骰子数
        for (int i = 2; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                data[1 - flag][j] = 0;
            }
            for (int j = i; j <= 6 * i; j++) {
                int sum = 0;
                for (int k = 1; k <= 6; k++) {
                    if (j - k >= 0) {
                        sum += data[flag][j - k];
                    }
                }
                data[1 - flag][j] = sum;
            }
            flag = 1 - flag;
        }

        int totalSum = getArrSum(data[flag]);

        for (int i = number; i < len; i++) {
            double result = data[flag][i] * 1.0 / totalSum;
            System.out.println(String.format("%d : %1.4f%%", i, result));
        }
    }
}
