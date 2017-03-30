package org.offer.case16;

import org.offer.utils.Node;

/**
 * 面试题 16：反转链表
 * Created by tanc on 2017/3/29.
 */
public class ReverseList {

    public static <T extends Comparable<? super T>> Node<T> reverse(Node<T> head) {
        if (null == head) {
            return null;
        }
        Node<T> prev;
        Node<T> temp;

        prev = null;
        temp = head;
        while (temp != null) {
            Node<T> next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
