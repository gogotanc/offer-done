package org.offer.case07;

import org.offer.utils.Stack;

/**
 * 面试题 7：用两个栈实现队列
 * Created by tanc on 2017/3/28.
 */
public class QueueByStack<E extends Comparable<? super E>> {

    private Stack<E> in;
    private Stack<E> out;
    private int size;

    public QueueByStack() {
        in = new Stack<>();
        out = new Stack<>();
        size = 0;
    }

    public void appendTail(E data) {
        in.push(data);
        size++;
    }

    public E deleteHead() {

        if (isEmpty()) {
            throw new RuntimeException("队列为空。");
        }

        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        size--;

        return out.pop();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
