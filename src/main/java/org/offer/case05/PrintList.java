package org.offer.case05;

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
    public static void order(Node<String> head) {
        Node<String> temp = head;
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
    public static void tailByRecursion(Node<String> head) {
        if (null == head || null == head.next) {
            return;
        }
        print(head.next);
    }

    private static void print(Node<String> head) {
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
    public static void tailByStack(Node<String> head) {
        if (null == head || null == head.next) {
            return;
        }
        Node<String> temp = head;
        Stack<String> stack = new Stack<>();
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
