package org.offer.case51;

/**
 * 面试题 51: 数组中重复的数字
 * Created by tanc on 2017/7/11.
 */
public class Duplication {

    /**
     * 方法一：观察规律，使用书上第三种方法实现。
     * 数组中数字都在 0 ~ n - 1 的范围，将每个数字放入自己大小的下标中，就可以发现重复的数字。
     *
     * @return -1 表示输入非法
     */
    public static int methodOne(int[] arr) {
        if (null == arr || arr.length == 0) {
            return -1;
        }
        int index = 0;
        while (index < arr.length) {
            int num = arr[index];
            if (num == index) {
                index++;
            } else if (num >= arr.length) {
                // 数字没在 0 ~ n - 1 的范围内
                return -1;
            } else {
                int data = arr[num];
                if (data == num) {
                    return data;
                }
                arr[num] = num;
                arr[index] = data;
            }
        }
        return -1;
    }

    /*
     * 还有其他方法:
     * 1. 先排序，然后寻找重复数字
     * 2. 使用 hash
     */
}
