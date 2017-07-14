package org.offer.case65;

import java.util.LinkedList;

/**
 * 面试题 65: 滑动窗口的最大值
 * Created by tanc on 2017/7/12.
 */
public class MaxInSlidingWindow {

    /**
     * 使用一个双端队列来存放可能的窗口最大值:
     *
     * 1. 滑动一次窗口，进来一个新数字，
     * 2. 先从尾部去掉队列中比该数字小的，
     * 3. 再看看头结点滑出窗口没，
     * 4. j再将该数字加入队列尾部
     * 5. 然后窗口的最大值总是在队列的最前端
     *
     * 队列中存放的是数字在数组中的下标，这样才可以判断数字是否滑出了窗口
     */
    public static void methodOne(int[] data, int k) {

        if (null == data || data.length == 0 || k <= 0) {
            return;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        int index = 0;

        for (; index < k; index++) {
            while (!queue.isEmpty() && data[index] >= data[queue.getLast()]) {
                queue.removeLast();
            }
            queue.addLast(index);
        }

        for (; index < data.length; index++) {

            System.out.println(data[queue.getFirst()]);

            while (!queue.isEmpty() && data[index] >= data[queue.getLast()]) {
                queue.removeLast();
            }

            if (!queue.isEmpty() && queue.getFirst() <= index - k) {
                queue.removeFirst();
            }

            queue.addLast(index);
        }

        System.out.println(data[queue.getFirst()]);
    }
}
