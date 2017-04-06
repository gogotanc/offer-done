package org.offer.case21;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.offer.utils.Stack;

/**
 * 面试题 21：包含 min 函数的栈
 * Created by tanc on 2017/4/6.
 */
public class StackWithMin<E extends Comparable<? super E>> {

    private Stack<E> stack;
    private Stack<E> minStack;
    private int size;

    public StackWithMin() {
        stack = new Stack<>();
        minStack = new Stack<>();
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(E data) {
        if (null == data) {
            return;
        }
        if (isEmpty()) {
            minStack.push(data);
        } else if (data.compareTo(min()) < 0) {
            minStack.push(data);
        } else {
            minStack.push(min());
        }
        stack.push(data);
        size++;
    }

    public E pop() {
        minStack.pop();
        return stack.pop();
    }

    public E min() {
        return minStack.top();
    }
}
