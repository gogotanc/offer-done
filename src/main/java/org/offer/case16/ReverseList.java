package org.offer.case16;

import org.offer.utils.Node;
import org.offer.utils.Stack;

/**
 * 面试题 16：反转链表
 * Created by tanc on 2017/3/29.
 */
public class ReverseList {

    public static void reverse(Node<Integer> head) {
        Stack<Node<Integer>> stack = new Stack<>();
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
            stack.push(temp);
        }
        head.next = null;
        while (!stack.isEmpty()) {
            temp = stack.pop();
            temp.next = head.next;
            head.next = temp;
        }
    }
}
