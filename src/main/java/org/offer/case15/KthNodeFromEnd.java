package org.offer.case15;

import org.offer.utils.Node;

/**
 * 面试题 15：链表中倒数第 K 个结点
 * Created by tanc on 2017/3/29.
 */
public class KthNodeFromEnd {

    public static Node<?> get(Node<?> head, int k) {

        if (null == head || k <= 0 || head.next == null) {
            return null;
        }

        Node<?> kthFromEnd = head.next;
        Node<?> temp = head.next;

        for (int i = 1; i < k; i++) {
            if (temp.next != null) {
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
