package org.offer.case30;

import org.offer.utils.exception.IllegalOperationException;

import java.util.Arrays;
import java.util.PriorityQueue;

import static org.offer.utils.method.Partition.partition;

/**
 * 面试题 30: 最小的 k 个数
 * Created by tanc on 17-5-7.
 */
public class GetLeastNumber {

    /**
     * 排序，然后得到最小的 k 个数
     */
    public static void methodOne(int[] data, int k) {

        checkInput(data, k);

        Arrays.sort(data);

        for (int i = 0; i < k; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    /**
     * 书上的解法一： 可以修改数组时， O(n) 的算法
     */
    public static void methodTwo(int[] data, int k) {

        checkInput(data, k);

        int start = 0;
        int end = data.length - 1;
        int index = partition(data, start, end);
        while (index != k - 1) {
            if (index > k - 1) {
                end = index - 1;
                index = partition(data, start, end);
            } else {
                start = index + 1;
                index = partition(data, start, end);
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    /**
     * 解法二： O(n*log(k)) 的算法，适合海量数据
     */
    public static void methodThree(int[] data, int k) {

        checkInput(data, k);

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i : data) {

            if (queue.size() < k) {
                queue.add(i);
            }

            int temp = queue.peek();

            if (temp > i) {
                queue.poll();
                queue.add(i);
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = queue.poll();
        }

        for (int i = 0; i < k; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

    }

    private static void checkInput(int[] data, int k) {
        if (null == data || k < 0 || data.length < k) {
            throw new IllegalOperationException("输入非法");
        }
    }
}
