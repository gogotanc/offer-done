package org.offer.case15;

import org.offer.utils.Node;

/**
 * 面试题 15：链表中倒数第 K 个结点
 * Created by tanc on 2017/3/29.
 */
public class KthNodeFromEnd {

    public static Node<?> get(Node<?> head, int k) {

        if (null == head || k <= 0) {
            return null;
        }

        Node<?> kthFromEnd = head;
        Node<?> temp = head;

        for (int i = 0; i < k - 1; i++) {
            if (temp != null) {
                temp = temp.next;
            } else {
                return null;
            }
        }

        while (temp.next != null) {
            kthFromEnd = kthFromEnd.next;
            temp = temp.next;
        }

        return kthFromEnd;
    }
}
