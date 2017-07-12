package org.offer.case57;

import org.offer.utils.node.Node;

import java.util.Objects;

/**
 * 面试题 57: 删除链表中重复的节点
 * Created by tanc on 2017/7/12.
 */
public class DeleteRepeatNode {

    public static <E> Node<E> methodOne(Node<E> head) {
        if (null == head) {
            return null;
        }
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next;

        while (current.next != null) {
            next = current.next;
            if (next.data.equals(current.data)) {
                while (next != null && Objects.equals(next.data, current.data)) {
                    next = next.next;
                }
                if (null == prev) {
                    head = next;
                } else {
                    prev.next = next;
                }
                current = next;
            } else {
                prev = current;
                current = next;
            }
            if (null == current) {
                break;
            }
        }
        return head;
    }
}
