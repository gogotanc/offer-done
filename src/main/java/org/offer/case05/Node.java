package org.offer.case05;

/**
 * 链表 或 栈 的节点结构
 * Created by tanc on 2017/3/19.
 */
public class Node<E> {

    public E data;
    public Node<E> next;

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
