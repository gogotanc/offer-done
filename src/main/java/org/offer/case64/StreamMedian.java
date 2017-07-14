package org.offer.case64;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 面试题 64: 数据流中的中位数
 * Created by tanc on 2017/7/12.
 */
public class StreamMedian {

    /**
     * 使用一个最大堆 和 一个最小堆，并保持它们的节点数只差不超过 1
     */
    public static Integer methodOne(List<Integer> stream) {

        Iterator<Integer> it = stream.iterator();
        PriorityQueue<Integer> big = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> small = new PriorityQueue<>(Comparator.naturalOrder());

        while (it.hasNext()) {

            Integer data = it.next();

            if (big.isEmpty() && small.isEmpty()) {
                big.add(data);
            } else {
                Integer temp = big.peek();
                if (temp.compareTo(data) > 0) {
                    big.add(data);
                } else {
                    small.add(data);
                }

            }
            check(big, small);
        }

        Integer result;

        if (big.size() > small.size()) {
            result = big.peek();
        } else if (small.size() > big.size()) {
            result = small.peek();
        } else {
            result = (big.peek() + small.peek()) / 2;
        }

        return result;
    }

    /**
     * 平衡最大堆和最小堆
     * 使最大堆和最小堆的节点数差不大于 1
     */
    private static <E> void check(PriorityQueue<E> big, PriorityQueue<E> small) {
        int bigCount = big.size();
        int smallCount = small.size();

        if (bigCount - smallCount > 1) {
            small.add(big.poll());
        } else if (smallCount - bigCount > 1) {
            big.add(small.poll());
        }
    }
}
