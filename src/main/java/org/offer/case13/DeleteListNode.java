package org.offer.case13;

import org.offer.utils.Node;

/**
 * 面试题 13：在 O(1) 时间删除链表结点
 * Created by tanc on 2017/3/29.
 */
public class DeleteListNode {

    public static <T extends Comparable<? super T>> void delete(Node<T> head, Node<T> node) {
        if (null == head || null == node) {
            return;
        }
        if (node.next == null) {
            deleteTail(head);
            return;
        }

        node.data = node.next.data;
        node.next = node.next.next;
    }

    private static <T extends Comparable<? super T>> void deleteTail(Node<T> head) {
        Node<T> temp = head;
        Node<T> lastTwo = head;
        while (temp.next != null) {
            lastTwo = temp;
            temp = temp.next;
        }
        lastTwo.next = null;
    }
}
