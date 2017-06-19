package org.offer.case38;

/**
 * 面试题 38: 数字在排序数组中出现的次数
 * Created by tanc on 17-6-14.
 */
public class GetNumberOfK {

    /**
     * 方法一：直接遍历
     */
    public static int methodOne(int[] data, int k) {
        if (null == data || data.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i : data) {
            if (k == i) {
                count++;
            }
        }
        return count;
    }

    /**
     * 方法二：二分查找
     */
    public static int methodTwo(int[] data, int k) {
        if (null == data || data.length == 0) {
            return 0;
        }

        int leftIndex = findLeft(data, 0, data.length - 1, k);
        if (leftIndex == -1) {
            // data 数组中没有 k
            return 0;
        }
        int rightIndex = findRight(data, 0, data.length - 1, k);
        return rightIndex - leftIndex + 1;
    }

    // 找开始的位置
    private static int findLeft(int[] data, int start, int end, int k) {
        if (start == end) {
            if (data[start] == k) {
                return start;
            } else {
                return -1;
            }
        }
        int middle = (end - start + 1) / 2;
        if (data[middle] > k) {
            return findLeft(data, start, middle, k);
        } else if (data[middle] == k) {
            return 0;
        } else {
            return findLeft(data, middle, end, k);
        }
    }

    // 找结束的位置
    private static int findRight(int[] data, int start, int end, int k) {
        return 0;
    }
}
