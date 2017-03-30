package org.offer.utils;

/**
 * 链表 或 栈 的节点结构
 * Created by tanc on 2017/3/19.
 */
public class Node<E extends Comparable<? super E>> {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node<?> node = (Node<?>) o;

        if (data != null ? !data.equals(node.data) : node.data != null) return false;
        return next != null ? next.equals(node.next) : node.next == null;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
