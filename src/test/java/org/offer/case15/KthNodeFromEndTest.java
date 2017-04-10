package org.offer.case15;

import org.junit.Before;
import org.junit.Test;
import org.offer.utils.node.Node;
import org.offer.utils.SinglyLinkedList;

import static org.junit.Assert.*;

/**
 * 面试题 15：链表中倒数第 K 个结点
 * Created by tanc on 2017/3/29.
 */
public class KthNodeFromEndTest {

    private SinglyLinkedList<Integer> list;

    @Before
    public void before() {
        list = new SinglyLinkedList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
    }

    @Test
    public void case1() throws Exception {
        Node result = KthNodeFromEnd.get(list.getHead(), 4);
        assertEquals(4, result.data);
    }

    @Test
    public void case2() throws Exception {
        Node result = KthNodeFromEnd.get(list.getHead(), 0);
        assertEquals(null, result);
    }

    @Test
    public void case3() throws Exception {
        Node result = KthNodeFromEnd.get(list.getHead(), 7);
        assertEquals(null, result);
    }
}