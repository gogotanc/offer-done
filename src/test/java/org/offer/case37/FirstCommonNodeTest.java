package org.offer.case37;

import org.junit.Test;
import org.offer.utils.node.Node;

import static org.junit.Assert.*;

/**
 * 面试题 37：两个链表的第一个公共节点
 * Created by tanc on 17-6-14.
 */
public class FirstCommonNodeTest {

    @Test
    public void case1() throws Exception {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2, n1);
        Node<Integer> n3 = new Node<>(3, n2);
        Node<Integer> n4 = new Node<>(4, n3);
        Node<Integer> n5 = new Node<>(5, n4);
        Node<Integer> n6 = new Node<>(6, n5);
        Node<Integer> n7 = new Node<>(7, n5);
        Node<Integer> l1 = new Node<>(8, n6);
        Node<Integer> l2 = new Node<>(9, n7);
        // l1 : 8 6
        //         \
        //          5 4 3 2 1
        //         /
        // l2 : 9 7
        Node<Integer> result = FirstCommonNode.methodOne(l1, l2);
        assertNotNull(result);
        assertEquals(5, result.data.intValue());
        result = FirstCommonNode.methodTwo(l1, l2);
        assertNotNull(result);
        assertEquals(5, result.data.intValue());
        result = FirstCommonNode.methodThree(l1, l2);
        assertNotNull(result);
        assertEquals(5, result.data.intValue());
    }

    @Test
    public void case2() throws Exception {
        Node<Integer> n1 = new Node<>(1);
        Node<Integer> n2 = new Node<>(2, n1);
        Node<Integer> n3 = new Node<>(3, n2);
        Node<Integer> n4 = new Node<>(4, n3);
        Node<Integer> n5 = new Node<>(5, n4);
        // l1 : 5 4 3 2 1
        // l2 : 5 4 3 2 1
        Node<Integer> result = FirstCommonNode.methodOne(n5, n5);
        assertNotNull(result);
        assertEquals(5, result.data.intValue());
        result = FirstCommonNode.methodTwo(n5, n5);
        assertNotNull(result);
        assertEquals(5, result.data.intValue());
        result = FirstCommonNode.methodThree(n5, n5);
        assertNotNull(result);
        assertEquals(5, result.data.intValue());
    }

    @Test
    public void case3() throws Exception {
        Node<Integer> n1 = new Node<>(1);

        Node<Integer> n3 = new Node<>(3, n1);
        Node<Integer> n5 = new Node<>(5, n3);

        Node<Integer> n2 = new Node<>(2, n1);
        Node<Integer> n4 = new Node<>(4, n2);
        // l1 : 5 3
        //         \
        //          1
        //         /
        // l2 : 4 2
        Node<Integer> result = FirstCommonNode.methodOne(n5, n4);
        assertNotNull(result);
        assertEquals(1, result.data.intValue());
        result = FirstCommonNode.methodTwo(n5, n4);
        assertNotNull(result);
        assertEquals(1, result.data.intValue());
        result = FirstCommonNode.methodThree(n5, n4);
        assertNotNull(result);
        assertEquals(1, result.data.intValue());
    }

}