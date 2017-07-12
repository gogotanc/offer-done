package org.offer.case57;

import org.junit.Test;
import org.offer.utils.node.Node;

import static org.junit.Assert.*;

/**
 * 面试题 57: 删除链表中重复的节点
 * Created by tanc on 2017/7/12.
 */
public class DeleteRepeatNodeTest {

    @Test
    public void case1() throws Exception {

        Node<Integer> f = new Node<>(5);
        Node<Integer> e = new Node<>(5, f);
        Node<Integer> c = new Node<>(4, e);
        Node<Integer> b = new Node<>(2, c);
        Node<Integer> a = new Node<>(1, b);
        Node<Integer> head = new Node<>(1, a);

        Node<Integer> result = DeleteRepeatNode.methodOne(head);

        printList(result);
        // 2 4
    }

    private static <E> void printList(Node<E> head) {
        while (head != null) {
            System.out.print(head.data);
            System.out.print(" ");
            head = head.next;
        }
    }

}