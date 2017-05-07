package org.offer.case29;

import org.offer.utils.exception.IllegalOperationException;

import java.util.Arrays;

/**
 * 面试题 29: 数组中出现次数超过一半的数字
 * Created by tanc on 17-5-7.
 */
public class FindNumber {

    /**
     * 先排序，返回中位数
     */
    public static int moreThanHalfNum(int[] arr) {

        if (null == arr || arr.length == 0) {
            throw new IllegalOperationException("输入数组非法");
        }

        Arrays.sort(arr);
        return arr[arr.length >> 1];
    }

    /**
     * 书中的解法一：基于 partition 函数的 O(n) 算法
     */
    public static int moreThanHalfNumMethodTwo(int[] arr) {
        return 0;
    }

    /**
     * 书中的解法二：根据数组特点找出 O(n) 的算法
     */
    public static int moreThanHalfNumMethodThree(int[] arr) {

        if (null == arr || arr.length == 0) {
            throw new IllegalOperationException("输入数组非法");
        }

        int result = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (result != arr[i]) {
                count--;
            } else {
                count++;
            }
            if (count == 0) {
                result = arr[i];
                count = 1;
            }
        }
        return result;
    }

    private static void partition(int[] arr, int left, int right) {
        int length = right - left + 1;

        if (length <= 3) {
            // todo insert sort
        }

        int center = (left + right) >> 1;
        int first = left;
        int last = right;

        update3Element(arr, first, center, last);

        int temp = arr[right - 1];
        arr[right - 1] = arr[right];
        arr[right] = arr[center];
        arr[center] = temp;

        while (true) {
            while (arr[left] <= arr[last]) {
                left++;
            }
            while (arr[right] >= arr[last]) {
                right++;
            }
            if (left < right) {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else {
                break;
            }
        }

        temp = arr[last];
        arr[last] = arr[left];
        arr[left] = temp;

        partition(arr, first, left - 1);
        partition(arr, left + 1, last);
    }

    private static void update3Element(int[] a, int left, int center, int right) {
        if (a[left] >= a[center]) {
            swap(a, left, center);
        }
        if (a[left] >= a[right]) {
            swap(a, left, right);
        }
        if (a[center] >= a[right]) {
            swap(a, center, right);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
