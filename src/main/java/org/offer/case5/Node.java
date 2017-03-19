package org.offer.case5;

/**
 * 面试题 5：从尾到头打印链表
 * Created by tanc on 2017/3/19.
 */
public class Node<E> {

    E data;
    Node<E> next;

    public Node() {
        this(null, null);
    }

    public Node(E data) {
        this(data, null);
    }

    public Node(E data, Node<E> next) {
        this.data = data;
        this.next = next;
    }
}
