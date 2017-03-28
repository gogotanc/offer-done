package org.offer.case07;

import org.junit.Test;

/**
 * 面试题 7：用两个栈实现队列
 * Created by tanc on 2017/3/28.
 */
public class QueueByStackTest {

    @Test
    public void push() throws Exception {

        QueueByStack<Integer> queue = new QueueByStack<>();

        queue.appendTail(1);
        queue.appendTail(2);
        queue.appendTail(3);
        queue.appendTail(4);
        queue.appendTail(5);

        System.out.println("queue's size is " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println(queue.deleteHead());
        }
    }

    @Test
    public void empty() throws Exception {
        QueueByStack<Integer> queue = new QueueByStack<>();
        if (!queue.isEmpty()) {
            queue.deleteHead();
        }
    }
}