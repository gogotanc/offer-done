package org.offer.case13;

import org.junit.Before;
import org.junit.Test;
import org.offer.utils.Node;
import org.offer.case05.PrintList;

/**
 * 面试题 13：在 O(1) 时间删除链表结点
 * Created by tanc on 2017/3/29.
 */
public class DeleteListNodeTest {

    private Node<Integer> head;
    private Node<Integer> node1;
    private Node<Integer> node2;
    private Node<Integer> node3;
    private Node<Integer> node4;

    @Before
    public void init() {
        node1 = new Node<>(1);
        node2 = new Node<>(2, node1);
        node3 = new Node<>(3, node2);
        node4 = new Node<>(4, node3);
        head = new Node<>(null, node4);


//        node1 = new Node<>(1);
//        head = new Node<>(null, node1);

//        head = new Node<>();
    }

    @Test
    public void case1() throws Exception {
        PrintList.order(head);
        System.out.println();
        DeleteListNode.delete(head, node1);
        PrintList.order(head);
    }

    @Test
    public void case2() throws Exception {
        PrintList.order(head);
        System.out.println();
        DeleteListNode.delete(head, node2);
        PrintList.order(head);
    }

    @Test
    public void case3() throws Exception {
        PrintList.order(head);
        System.out.println();
        DeleteListNode.delete(head, node3);
        PrintList.order(head);
    }

    @Test
    public void case4() throws Exception {
        PrintList.order(head);
        System.out.println();
        DeleteListNode.delete(head, node4);
        PrintList.order(head);
    }

    @Test
    public void case5() throws Exception {
        DeleteListNode.delete(null, node4);
    }

    @Test
    public void case6() throws Exception {
        DeleteListNode.delete(null, null);
    }
}