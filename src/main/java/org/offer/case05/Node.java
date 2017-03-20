package org.offer.case05;

/**
 * 链表的节点结构
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
