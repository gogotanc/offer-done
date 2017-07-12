package org.offer.case56;

import org.junit.Test;
import org.offer.utils.node.Node;

import static org.junit.Assert.*;

/**
 * 面试题 56: 链表中环的入口节点
 * Created by tanc on 2017/7/12.
 */
public class CycleEntryTest {

    @Test
    public void case1() throws Exception {
        Node<Integer> f = new Node<>(6);
        Node<Integer> e = new Node<>(5, f);
        Node<Integer> c = new Node<>(4, e);
        Node<Integer> b = new Node<>(3, c);
        Node<Integer> a = new Node<>(2, b);
        f.next = b;
        Node<Integer> head = new Node<>(1, a);
        Node<Integer> result = CycleEntry.methodOne(head);

        // 1, 2, 3, 4, 5, 6 -> 3

        // 环为 3, 4, 5, 6

        assertNotNull(result);
        assertEquals(3, result.data.intValue());
    }

    @Test
    public void case2() throws Exception {
        Node<Integer> f = new Node<>(6);
        Node<Integer> e = new Node<>(5, f);
        Node<Integer> c = new Node<>(4, e);
        Node<Integer> b = new Node<>(3, c);
        Node<Integer> a = new Node<>(2, b);
        f.next = b;
        Node<Integer> head = new Node<>(1, a);
        Node<Integer> result = CycleEntry.methodTwo(head);

        // 1, 2, 3, 4, 5, 6 -> 3

        // 环为 3, 4, 5, 6

        assertNotNull(result);
        assertEquals(3, result.data.intValue());
    }

}