package org.offer.case41;

/**
 * 面试题 41: 和为 S 的两个数字
 * Created by tanc on 17-6-14.
 */
public class TwoNumberWithSum {

    /**
     * 数组是排序的，所以使用首尾两个指针，将它们的和与 S 比较，然后移动指针
     */
    public static void methodOne(int[] data, int s) {
        if (null == data || data.length == 0) {
            return;
        }
        int start = 0;
        int end = data.length - 1;
        while (start < end) {
            int result = data[start] + data[end];
            if (result < s) {
                start++;
            } else if (result > s) {
                end--;
            } else {
                System.out.println(data[start] + " .. " + data[end]);
                return;
            }
        }
    }
}
