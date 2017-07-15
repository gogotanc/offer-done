package org.offer.case67;

/**
 * 面试题 67: 机器人的运动范围
 * Created by tanc on 2017/7/12.
 */
public class RobotMove {

    /**
     * 回溯法
     */
    public static int methodOne(int k, int m, int n) {

        if (m <= 0 || n <= 0 || k <= 0) {
            return 0;
        }

        boolean[][] matrix = new boolean[m][n];

        return movingCount(matrix, 0, 0, k);
    }

    /**
     * 判断一个点及其上下左右是否可以进入
     */
    private static int movingCount(boolean[][] matrix, int x, int y, int k) {

        int count = 0;

        if (canEntry(matrix, x, y, k)) {
            matrix[y][x] = true;
            count = 1 + movingCount(matrix, x - 1, y, k)
                      + movingCount(matrix, x + 1, y, k)
                      + movingCount(matrix, x, y - 1, k)
                      + movingCount(matrix, x, y + 1, k);
        }

        return count;
    }

    /**
     * 判断机器人是否可以进入 x,y 点
     */
    private static boolean canEntry(boolean[][] matrix, int x, int y, int k) {

        if (x >= 0 && x < matrix[0].length && y >= 0 && y < matrix.length
                && getDigitSum(x) + getDigitSum(y) <= k
                && !matrix[y][x]) {
            return true;
        }

        return false;
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
