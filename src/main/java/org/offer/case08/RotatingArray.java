package org.offer.case08;

/**
 * 面试题 8：旋转数组的最小数字
 * Created by tanc on 2017/3/28.
 */
public class RotatingArray {

    public static int min(int[] arr) {

        if (arr.length == 0) {
            throw new RuntimeException("数组为空");
        }

        int front = 0;
        int end = arr.length - 1;
        int mid = arr.length / 2;

        while (arr[front] >= arr[end]) {
            if (front + 1 == end) {
                return arr[end];
            }
            if (arr[front] == arr[mid] && arr[front] == arr[end]) {
                return findMin(arr);
            }
            if (arr[front] <= arr[mid]) {
                front = mid;
            } else if (arr[mid] <= arr[end]) {
                end = mid;
            }
            mid = (front + end) / 2;
        }
        return arr[front];
    }

    public static int findMin(int[] arr) {
        if (arr.length == 0) {
            throw new RuntimeException("数组为空");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
