package org.offer.case20;

/**
 * 面试题 20：顺时针打印矩阵
 * Created by tanc on 2017/4/6.
 */
public class PrintMatrix {

    public static <T> void printInCircle(T[][] arr) {

        if (null == arr) {
            return;
        }

        int rows = arr.length;
        int cols = arr[0].length;

        int maxX = cols - 1;
        int maxY = rows - 1;

        int start = 0;

        while (cols > start * 2 && rows > start * 2) {
            printInCircle(arr, maxX, maxY, start);
            start++;
        }

    }

    private static <T> void printInCircle(T[][] arr, int x, int y, int start) {

        int endX = x - start;
        int endY = y - start;

        // 从左到右打印
        for (int i = start; i <= endX; i++ ) {
            printItem(arr[start][i]);
        }

        // 从上到下
        if (start < endY) {
            for (int i = start + 1; i <= endY; i++) {
                printItem(arr[i][endX]);
            }
        }

        // 从右到左
        if (start < endX && start < endY) {
            for (int i = endX - 1; i >= start; i--) {
                printItem(arr[endY][i]);
            }
        }

        // 从下到上
        if (start + 1 < endY && start < endX) {
            for (int i = endY - 1; i > start; i--) {
                printItem(arr[i][start]);
            }
        }
    }

    private static <T> void printItem(T item) {
        System.out.print(item);
        System.out.print(",");
    }
}
