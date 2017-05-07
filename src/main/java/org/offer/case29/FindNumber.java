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
        int result = arr[arr.length >> 1];
        if (!checkMoreThanHalf(arr, result)) {
            throw new IllegalOperationException("没有出现次数超过数组长度一半的数字");
        }
        return result;
    }

    /**
     * 书中的解法一：基于 partition 函数的 O(n) 算法
     */
    public static int moreThanHalfNumMethodTwo(int[] arr) {

        if (null == arr || arr.length == 0) {
            throw new IllegalOperationException("输入数组非法");
        }

        int center = arr.length >> 1;
        int start = 0;
        int end = arr.length - 1;
        int index = partition(arr, start, end);
        while (index != center) {
            if (index > center) {
                end = index - 1;
                index = partition(arr, start, end);
            } else {
                start = index + 1;
                index = partition(arr, start, end);
            }
        }
        int result = arr[center];
        if (!checkMoreThanHalf(arr, result)) {
            throw new IllegalOperationException("没有出现次数超过数组长度一半的数字");
        }
        return result;
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
        if (!checkMoreThanHalf(arr, result)) {
            throw new IllegalOperationException("没有出现次数超过数组长度一半的数字");
        }
        return result;
    }

    /**
     * 检查结果是否为出现次数超过数组一半的数字
     */
    private static boolean checkMoreThanHalf(int[] arr, int result) {
        int count = 0;
        int threshold = arr.length >> 1;
        for (int i : arr) {
            if (i == result) {
                count++;
            }
        }
        return count > threshold;
    }

    /**
     * 书中的 partition 函数的实现
     * @return 返回中位数在数组中的位置
     */
    private static int partition(int[] data, int start, int end) {
        if (null == data || start < 0 || end >= data.length || (end - start + 1) <= 0) {
            throw new IllegalOperationException("数组输入非法");
        }
        // 这里选择 pivot 不是随机，直接选择了中间的数
        int pivot = ( start + end ) >> 1;
        swap(data, pivot, end);
        int small = start - 1;
        int index;
        for (index = start; index < end; index++) {
            if (data[index] < data[end]) {
                small++;
                if (index != small) {
                    swap(data, index, small);
                }
            }
        }
        small++;
        swap(data, small, end);
        return small;
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
