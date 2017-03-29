package org.offer.case16;

import org.offer.utils.Node;

/**
 * 面试题 16：反转链表
 * Created by tanc on 2017/3/29.
 */
public class ReverseList {

    public static Node<Integer> reverse(Node<Integer> head) {
        if (null == head) {
            return null;
        }
        Node<Integer> prev;
        Node<Integer> temp;

        prev = null;
        temp = head;
        while (temp != null) {
            Node<Integer> next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}
