package org.offer.case56;

import org.offer.utils.node.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * 面试题 56: 链表中环的入口节点
 * Created by tanc on 2017/7/12.
 */
public class CycleEntry {

    /**
     * 方法一：书上的方法
     * 先找到环中的节点数目，然后使用快慢指针，相交的节点即为入口节点
     */
    public static <E> Node<E> methodOne(Node<E> head) {

        if (null == head) {
            return null;
        }

        int count = count(head);
        if (0 == count) {
            return null;
        }

        Node<E> fast = head;
        Node<E> slow = head;
        for (int i = 0; i < count; i++) {
            fast = fast.next;
        }

        while (true) {
            fast = fast.next;
            slow = slow.next;
            if (fast.data.equals(slow.data)) {
                return fast;
            }
        }
    }

    /**
     * 求环的节点数量
     */
    private static <E> int count(Node<E> head) {
        boolean hasCycle = false;
        int count = 0;
        Node<E> fast = head;
        Node<E> slow = head;
        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (hasCycle) {
                count++;
                if (fast.data.equals(slow.data)) {
                    return count;
                }
            }
            if (fast.data.equals(slow.data)) {
                if (!hasCycle) {
                    hasCycle = true;
                }
            }
        }
        return 0;
    }

    /**
     * 方法二：使用 hash
     */
    public static <E> Node<E> methodTwo(Node<E> head) {
        Map<Node<E>, Integer> hashMap = new HashMap<>();
        while (head != null) {
            Integer count = hashMap.get(head);
            if (null == count) {
                hashMap.put(head, 1);
            } else {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
