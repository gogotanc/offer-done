package org.offer.case29;

import org.offer.utils.exception.IllegalOperationException;

import java.util.Arrays;

import static org.offer.utils.method.Partition.partition;

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
}
