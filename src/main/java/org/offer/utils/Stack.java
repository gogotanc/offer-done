package org.offer.utils;

/**
 * 栈
 * Created by tanc on 2017/3/20.
 */
public class Stack<E> {

    private Node<E> top;
    private int size;

    public Stack() {
        top = new Node<>();
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E data) {
        top.next = new Node<>(data, top.next);
        size++;
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        Node<E> temp = top.next;
        top.next = temp.next;
        temp.next = null;
        size--;
        return temp.data;
    }
}
