package org.offer.utils.node;

/**
 * 双向链表节点
 * Created by tanc on 17-5-4.
 */
public class DuplexNode<E> {

    public E data;
    public DuplexNode<E> next;
    public DuplexNode<E> prev;

    public DuplexNode(E data) {
        this(data, null, null);
    }

    public DuplexNode(E data, DuplexNode<E> next) {
        this(data, next, null);
    }

    public DuplexNode(E data, DuplexNode<E> next, DuplexNode<E> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
