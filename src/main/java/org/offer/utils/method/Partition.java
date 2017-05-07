package org.offer.utils.method;

import org.offer.utils.exception.IllegalOperationException;

/**
 * Partition 函数
 * Created by tanc on 17-5-7.
 */
public class Partition {

    /**
     * 书中的 partition 函数的实现
     * @return 返回中位数在数组中的位置
     */
    public static int partition(int[] data, int start, int end) {
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
