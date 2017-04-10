package org.offer.utils;

import org.junit.Test;
import org.offer.utils.node.BinaryTreeNode;
import org.offer.utils.node.Node;

import static org.junit.Assert.*;

/**
 * 结点测试
 * Created by tanc on 2017/3/30.
 */
public class NodeTest {

    @Test
    public void case1() {
        Node<Integer> node = new Node<>(1);
        Node<Integer> node2 = new Node<>(1);
        assertEquals(true, node.data.equals(node2.data));
    }

    @Test
    public void case2() {
        BinaryTreeNode<Integer> node = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(1);
        assertEquals(true, node.data.equals(node2.data));
    }
}