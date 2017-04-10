package org.offer.case05;

import org.offer.utils.node.Node;
import org.offer.utils.Stack;

/**
 * 面试题 5：从尾到头打印链表
 * Created by tanc on 2017/3/20.
 */
public class PrintList {

    /**
     * 顺序打印链表
     *
     * @param head 链表的头节点
     */
    public static <T extends Comparable<? super T>> void order(Node<T> head) {
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
            System.out.print(temp.data);
            System.out.print(" ");
        }
    }

    /**
     * 使用递归实现从尾到头打印链表
     *
     * @param head 链表的头节点
     */
    public static <T extends Comparable<? super T>> void tailByRecursion(Node<T> head) {
        if (null == head || null == head.next) {
            return;
        }
        print(head.next);
    }

    private static <T extends Comparable<? super T>> void print(Node<T> head) {
        if (null == head) {
            return;
        }
        print(head.next);
        System.out.print(head.data);
        System.out.print(" ");
    }

    /**
     * 使用栈实现从尾到头打印链表
     *
     * @param head 链表的头节点
     */
    public static <T extends Comparable<? super T>> void tailByStack(Node<T> head) {
        if (null == head || null == head.next) {
            return;
        }
        Node<T> temp = head;
        Stack<T> stack = new Stack<>();
        while (temp.next != null) {
            temp = temp.next;
            stack.push(temp.data);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
            System.out.print(" ");
        }
    }
}
