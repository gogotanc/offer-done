package org.offer.case03;

/**
 * 面试题 3：二维数组的查找
 *
 * 这里直接使用书中的方法实现
 *
 * Created by tanc on 2017/3/19.
 */
public class ArraySearch {

    public static boolean search(int[][] arr, int element) {

        if (null == arr || arr.length == 0) {
            return false;
        }

        int maxY = arr.length;
        int maxX = arr[0].length;

        int y = 0;
        int x = maxX - 1;

        while (x >= 0 && y < maxY) {
            if (element > arr[x][y]) {
                y++;
            } else if (element < arr[x][y]) {
                x--;
            } else {
                return true;
            }
        }
        return false;
    }
}
